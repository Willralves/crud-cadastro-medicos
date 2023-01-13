package br.com.estudo.api.medico;

import br.com.estudo.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
		
		@NotNull
		Long id, 
		
		String nome, 
		
		String telefone, 
		
		DadosEndereco endereco) {

}
