package jv.triersistemas.desafio_dados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jv.triersistemas.desafio_dados.service.DadosService;

@RestController
@RequestMapping("/dados")
public class DesafioDadosController {

	@Autowired
	private DadosService dadosService;
		
	@GetMapping("/{quantidadeDados}/{aposta}")
	public String postLance(@PathVariable Integer quantidadeDados, @PathVariable Integer aposta) {
		return dadosService.valorDeCadaDado(quantidadeDados, aposta);
	}
}