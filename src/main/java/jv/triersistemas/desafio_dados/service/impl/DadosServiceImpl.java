package jv.triersistemas.desafio_dados.service.impl;

import org.springframework.stereotype.Service;

import jv.triersistemas.desafio_dados.dto.DadosDto;
import jv.triersistemas.desafio_dados.dto.ResultadoDto;
import jv.triersistemas.desafio_dados.service.DadosService;

@Service
public class DadosServiceImpl implements DadosService {

//	private static Double soma = 0.0;

	@Override
	public String valorDeCadaDado(Integer quantidadeDados, Integer aposta) {

		ResultadoDto resultado = new ResultadoDto();
		
		if (quantidadeDados < 1 || quantidadeDados > 4) {
			return "Número de dados inválidos!";
		}

		if ((aposta > (quantidadeDados * 6)) || (aposta < quantidadeDados)) {
			return "Número de aposta inválidos!";
		}

		for (int i = 0; i < quantidadeDados; i ++) {
			DadosDto dado = new DadosDto();
			resultado.setSoma((double) dado.getLados() + resultado.getSoma());
			resultado.setMensagemDado(resultado.getMensagemDado() + "Dado " + (i + 1) + ": valor sorteado " + dado.getLados() + "\n");
			resultado.setMensagemPercentual(String.format("%nPercentual em relação ao sorteio: %.2f%%", ((resultado.getSoma() / aposta) * 100)));
		}
		return resultado.getMensagemDado() + "\n" +  resultado.getSoma() + "\n" + resultado.getMensagemPercentual();
	}
}