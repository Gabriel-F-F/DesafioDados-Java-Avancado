package jv.triersistemas.desafio_dados.service.impl;

import org.springframework.stereotype.Service;

import jv.triersistemas.desafio_dados.dto.DadosDto;
import jv.triersistemas.desafio_dados.service.DadosService;

@Service
public class DadosServiceImpl implements DadosService {
	
	private Integer quantidadeDados;
	private Integer aposta;
	
	@Override
	public void valorDeCadaDado(int quantidadeDados) {

		String msg = null;
		int soma = 0;

		for (int i = 0; i < quantidadeDados; i++) {
			DadosDto dado = new DadosDto();
			soma += dado.getLados();
			msg += "Dado " + (i + 1) + ": valor sorteado " + dado.getLados() + "\n";
		}
		System.out.println(msg);
		System.out.println("\nSoma: " + soma);
	}
}