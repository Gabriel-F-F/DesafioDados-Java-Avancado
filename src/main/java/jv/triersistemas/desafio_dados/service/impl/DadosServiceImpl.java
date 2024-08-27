package jv.triersistemas.desafio_dados.service.impl;

import org.springframework.stereotype.Service;

import jv.triersistemas.desafio_dados.dto.DadosDto;
import jv.triersistemas.desafio_dados.service.DadosService;

@Service
public class DadosServiceImpl implements DadosService {

	private static Double soma = 0.0;

	@Override
	public String valorDeCadaDado(Integer quantidadeDados, Integer aposta) {

		String msg = "";
		
		if (quantidadeDados < 1 || quantidadeDados > 4) {
			return "Número de dados inválidos!";
		}

		if (aposta > (quantidadeDados * 6)) {
			return "Número de aposta inválidos!";
		}
		
		for (int i = 0; i < quantidadeDados; i++) {
			
			DadosDto dado = new DadosDto();
			soma += dado.getLados();
			msg += "Dado " + (i + 1) + ": valor sorteado " + dado.getLados() + "\n";
		}
		msg += "\nSoma: " + soma;
		msg += String.format("%nPercentual em relação ao sorteio: %.2f%%", ((soma / aposta) * 100));
		return msg;
	}
}