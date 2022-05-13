package dev.cmedina.consultapje.model;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class FiltroComunicacao {

	private String siglaTribunal;
	private String dataDisponibilizacaoInicio;
	private String dataDisponibilizacaoFim;
	
	public Map<String, Object> getParams() {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("siglaTribunal", siglaTribunal);
		params.put("dataDisponibilizacaoInicio", dataDisponibilizacaoInicio);
		params.put("dataDisponibilizacaoFim", dataDisponibilizacaoFim);
		return params;
	}
	
}
