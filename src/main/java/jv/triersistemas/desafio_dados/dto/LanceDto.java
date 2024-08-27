package jv.triersistemas.desafio_dados.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LanceDto {
	private Integer quantidadeDados;
	private Integer aposta;

	public String verificaQuantidadeDados() {
		if (quantidadeDados < 1 || quantidadeDados > 4) {
			return "Número de dados inválidos!";
		}
		return null;
	}

	public String verificaAposta() {
		if (aposta > (quantidadeDados * 6)) {
			return "Número de aposta inválidos!";
		}
		return null;
	}
}
