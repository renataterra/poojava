function cadastra() {
    // recupera os valores do usuário
    var bike = new Object() // cria um objeto
    bike.marca = document.getElementById("marca").value
    bike.modelo = document.getElementById("modelo").value
    bike.aro = Number(document.getElementById("aro").value)
    bike.quadro = Number(document.getElementById("quadro").value)
        // para atualização
    bike.id = (document.getElementById("id").value)
        // consumir a API para inserção = POST
    var request = new XMLHttpRequest() // objeto de requisição
        // abre a requisição
    request.open('POST', 'http://localhost:8080/api/bike', true)
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
    request.send(JSON.stringify(bike))
    alert('Bike inserida com sucesso')
    location.reload() // chama onload do body
}

function consulta() {
    // cria um objeto de requisição
    var request = new XMLHttpRequest()
        // abre a conexão
    request.open('GET', 'http://localhost:8080/api/bike', true)
        // ao carregar
    request.onload = function() {
        if (request.status >= 200 && request.status < 400) {
            console.log('Carregou com sucesso')
                // recupera os dados - as bikes
            var bikes = JSON.parse(this.response) // converte de JSON para objeto
                // criar as linhas da tabela
                // recupera a tabela
            var tabela = document.getElementById('tabela')
            bikes.forEach(bike => {
                // cria a linha da tabela
                var linha = document.createElement('tr')
                    // adiciona linha na tabela
                tabela.appendChild(linha)
                    // cria as células da tabela
                var cel1 = document.createElement('td')
                cel1.textContent = bike.marca
                var cel2 = document.createElement('td')
                cel2.textContent = bike.modelo
                var cel3 = document.createElement('td')
                cel3.textContent = bike.aro
                var cel4 = document.createElement('td')
                cel4.textContent = bike.quadro

                var cel5 = document.createElement('td')
                var imagemRemove = document.createElement('img')
                imagemRemove.setAttribute('src', 'remove.png')
                imagemRemove.setAttribute('onclick', `remove(${bike.id})`)

                var cel6 = document.createElement('td')
                var imagemAtualiza = document.createElement('img')
                imagemAtualiza.setAttribute('src', 'atualiza.png')
                imagemAtualiza.setAttribute('onclick', `atualiza(${JSON.stringify(bike)})`)

                // coloca as células dentro da linha
                linha.appendChild(cel1)
                linha.appendChild(cel2)
                linha.appendChild(cel3)
                linha.appendChild(cel4)
                linha.appendChild(cel5)
                linha.appendChild(cel6)
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
    request.open('DELETE', `http://localhost:8080/api/bike/${id}`, true)
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

function atualiza(bike) {
    // copiar o conteúdo da linha para as caixas de texto do cadastro
    document.getElementById('marca').value = bike.marca
    document.getElementById('modelo').value = bike.modelo
    document.getElementById('aro').value = bike.aro
    document.getElementById('quadro').value = bike.quadro

    document.getElementById('id').value = bike.id
}