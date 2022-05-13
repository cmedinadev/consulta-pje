package dev.cmedina.consultapje;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import dev.cmedina.consultapje.listener.RequestDataListener;
import dev.cmedina.consultapje.model.ConsultaComunicacao;
import dev.cmedina.consultapje.model.FiltroComunicacao;
import dev.cmedina.consultapje.model.Item;

public class PDFGenerator {
	
	Font font = FontFactory.getFont(FontFactory.HELVETICA, 11, BaseColor.BLACK);

	Document document = new Document();	
	
	public void gerarPDFComunicaoes() {
		
		FiltroComunicacao filtro = FiltroComunicacao.builder().siglaTribunal("TRF2")
			.dataDisponibilizacaoInicio("2022-04-25")
			.dataDisponibilizacaoFim("2022-04-25")
			.build();
		
		try {
			createPDF();
		} catch (FileNotFoundException | DocumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		RequestComunicacao request = new RequestComunicacao();
		
		request.setListener(new RequestDataListener() {
			
			@Override
			public void onDataLoaded(ConsultaComunicacao data) {
					data.getItems().forEach(item -> {
						try {
							writePDF(item);
						} catch (DocumentException e) {
							e.printStackTrace();
						}
					});
			}
			
			@Override
			public void onDataEnd() {
				closePDF();
			}
		});
		
		request.loadRecords(filtro);
		
		System.out.println("end");
		
		
	}
	
	private void createPDF() throws FileNotFoundException, DocumentException {
		
		PdfWriter.getInstance(document, new FileOutputStream("/Users/cmedina/iTextHelloWorld.pdf"));
		document.open();
	}
	
	private void writePDF(Item item) throws DocumentException {

		document.newPage();
		
		Paragraph title = new Paragraph("Diário do Tribunal Regional Federal da 2a Região - DJN", FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.BLACK));
		title.setAlignment(Paragraph.ALIGN_CENTER);
		document.add(title);
		
		text("\n\n");
		
		//text(";;Publicação");
		
		text("Processo: " + item.getNumeroProcesso());
		text("Órgão: " + item.getNomeOrgao());
		text("Data de disponibilização: " + item.getDatadisponibilizacao());
		text("Tipo de Comunicação: " + item.getTipoComunicacao());
		text("Meio: " + item.getMeiocompleto());
		
		item.getDestinatarios().forEach(parte -> {
			text("Parte: " + parte.getNome());	
		});
		
		item.getDestinatarioadvogados().forEach(adv -> {
			text("Advogado: " + adv.getAdvogado().getNome() + " - " + adv.getAdvogado().getUfOab() + " " + adv.getAdvogado().getNumeroOab());	
		});
		
		text("\nConteúdo:\n");
		
		text(item.getTexto().replaceAll("\r\n", "\n"));
		
	}
	
	private void closePDF() {
		if (document.isOpen())
			document.close();
	}
	
	private void text(String str)  {
		Paragraph para = new Paragraph(str, font);
        try {
			document.add(para);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
