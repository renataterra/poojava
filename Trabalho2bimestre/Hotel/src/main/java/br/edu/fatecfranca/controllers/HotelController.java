package br.edu.fatecfranca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.entities.Hotel;
import br.edu.fatecfranca.repositories.HotelRepository;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {
	@Autowired
	HotelRepository injecao;
	
	@GetMapping
	public List<Hotel> getHoteis() {
		return injecao.findAll();
	}
	
	@PostMapping
	public Hotel addHotel(@RequestBody Hotel hotel) {
		return injecao.save(hotel);
	}
	
	@DeleteMapping
	public boolean deleteHotel(@PathVariable Long id) {
		injecao.deleteById(id);
		return true;
	}
	
	@PutMapping
	public Hotel update(@RequestBody Hotel hotel) {
		return injecao.save(hotel);
	}
}
