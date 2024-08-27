package jv.triersistemas.desafio_dados.dto;

import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DadosDto {
	private Random generator = new Random();
	private Integer lados = generator.nextInt(6) + 1;
}