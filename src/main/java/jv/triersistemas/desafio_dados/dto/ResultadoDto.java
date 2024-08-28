package jv.triersistemas.desafio_dados.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResultadoDto {
	private String mensagemDado = "";
	private String mensagemPercentual = "";
	private Double soma = 0.0;
}