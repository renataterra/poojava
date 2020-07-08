function cadastra() {
    // recupera os valores do usuário
    var hotel = new Object() // cria um objeto
    hotel.nome = document.getElementById("nome").value
    hotel.capacidade = Number(document.getElementById("capacidade").value)
    hotel.estrelas = Number(document.getElementById("estrelas").value)
        // para atualização
    hotel.id = (document.getElementById("id").value)
        // consumir a API para inserção = POST
    var request = new XMLHttpRequest() // objeto de requisição
        // abre a requisição
    request.open('POST', 'http://localhost:8080/api/hotel', true)
        // ao carregar
    request.onload = function() { // programação funcional
            if (request.status >= 200 && request.status < 400) {
                console.log('Conectou na API')
            } else {
                console.log('Não conectou na API')
            }
        }
        // configura o cabeçalho da requisição
    request.setRequestHeader('Content-Type', 'application/json')
        // envia dos dados para inserção
        // converte objeto em JSON
    request.send(JSON.stringify(hotel))
    alert('Hotel inserida com sucesso')
    location.reload() // chama onload do body
}

function consulta() {
    // cria um objeto de requisição
    var request = new XMLHttpRequest()
        // abre a conexão
    request.open('GET', 'http://localhost:8080/api/hotel', true)
        // ao carregar
    request.onload = function() {
        if (request.status >= 200 && request.status < 400) {
            console.log('Carregou com sucesso')
                // recupera os dados - as hoteis
            var hoteis = JSON.parse(this.response) // converte de JSON para objeto
                // criar as linhas da tabela
                // recupera a tabela
            var tabela = document.getElementById('tabela')
            hoteis.forEach(hotel => {

                // cria a linha da tabela
                var linha = document.createElement('tr')
                    // adiciona linha na tabela
                tabela.appendChild(linha)
                    // cria as células da tabela
                var cel1 = document.createElement('td')
                cel1.textContent = hotel.nome
                var cel2 = document.createElement('td')
                cel2.textContent = hotel.capacidade
                var cel3 = document.createElement('td')
                cel3.textContent = hotel.estrelas

                var cel4 = document.createElement('td')
                var imagemRemove = document.createElement('img')
                imagemRemove.setAttribute('src', 'remove.png')
                imagemRemove.setAttribute('onclick', `remove(${hotel.id})`)

                var cel5 = document.createElement('td')
                var imagemAtualiza = document.createElement('img')
                imagemAtualiza.setAttribute('src', 'atualiza.png')
                imagemAtualiza.setAttribute('onclick', `atualiza(${JSON.stringify(hotel)})`)

                // coloca as células dentro da linha
                linha.appendChild(cel1)
                linha.appendChild(cel2)
                linha.appendChild(cel3)
                linha.appendChild(cel4)
                linha.appendChild(cel5)
                cel5.appendChild(imagemRemove)
                cel6.appendChild(imagemAtualiza)
            })

        } else {
            console.log('Problema ao carregar')
        }
    }
    request.send()
}

function remove(id) {
    var request = new XMLHttpRequest()
    request.open('DELETE', `http://localhost:8080/api/hotel/${id}`, true)
    request.onload = function() {
        if (request.status >= 200 && request.status < 400) {
            console.log('Carregou')
        } else {
            console.log('Não carregou')
        }
    }
    request.send()
    alert('Remoção realizada com sucesso')
    location.reload() // atualiza a página
}

function atualiza(hotel) {
    // copiar o conteúdo da linha para as caixas de texto do cadastro
    document.getElementById('nome').value = hotel.nome
    document.getElementById('capacidade').value = hotel.capacidade
    document.getElementById('estrelas').value = hotel.estrelas

    document.getElementById('id').value = hotel.id
}