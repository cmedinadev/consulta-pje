package dev.cmedina.consultapje;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dev.cmedina.consultapje.listener.RequestDataListener;
import dev.cmedina.consultapje.model.ConsultaComunicacao;
import dev.cmedina.consultapje.model.FiltroComunicacao;

public class RequestComunicacao {
		 
	private RequestDataListener listener;

	
	public void loadRecords(FiltroComunicacao filtro) {
		int itensPorPagina = 100;
		int pagina = 1;
		ConsultaComunicacao result = getConsultaComunicacao(filtro, pagina, itensPorPagina);
		listener.onDataLoaded(result);
		System.out.println("loaded page " + pagina + " - records: " + result.getCount());
		while (result.getCount() ==  itensPorPagina) {
			result = getConsultaComunicacao(filtro, ++pagina, itensPorPagina);
			listener.onDataLoaded(result);
			System.out.println("loaded page " + pagina + " - records: " + result.getCount());
		}
		listener.onDataEnd();
	}
	
	private ConsultaComunicacao getConsultaComunicacao(FiltroComunicacao filtro, int pagina, int itensPorPagina) {
		
		
		Client client = ClientBuilder.newClient();
		Response response = null;
		try {
			
	        WebTarget webTarget = client.target("https://comunicaapi.pje.jus.br/api/v1/comunicacao")
	        		.queryParam("pagina", pagina).queryParam("itensPorPagina", itensPorPagina);
	        
	        for (String key : filtro.getParams().keySet()) {
	        	if (!Objects.isNull(filtro.getParams().get(key))) {
	        		webTarget = webTarget.queryParam(key, filtro.getParams().get(key));		
	        	}
	        }
	        
	        AsyncInvoker asyncInvoker = webTarget.request(MediaType.APPLICATION_JSON).async();
	        Future<Response> responseFuture = asyncInvoker.get();
	        System.out.println("Request is being processed asynchronously.");
	        response = responseFuture.get();
	        System.out.println("Response: " + response);
	        ConsultaComunicacao resultado = response.readEntity(ConsultaComunicacao.class);
	        response.close();
        	
	        return resultado;
	        
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			client.close();
		}
		
	}

	public void setListener(RequestDataListener requestDataListener) {
		this.listener = requestDataListener;
	}
	
}
