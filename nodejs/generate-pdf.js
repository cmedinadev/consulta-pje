const PDFKit = require('pdfkit');
const fs = require('fs');

const properties = ['numero_processo', 'nomeOrgao', 'data_disponibilizacao', 'tipoComunicacao', 'meio', 'destinatarios', 'destinatarioadvogados', 'texto'];
const labels = ['Processo', 'Órgão', 'Data de disponibilização', 'Tipo de Comunicação', 'Meio', 'Parte', 'Advogado', 'Conteúdo'];

let pdf = null;

exports.createPDF = function() {
    pdf = new PDFKit();
    pdf.text('Diário do Tribunal Regional Federal da 2a Região - DJN');
    pdf.text('\n\n');
}

exports.writePublicacao = function(data) {

    pdf.text(';;Publicação');

    let i = 0;
    for (const prop of properties) {
        if (prop === 'destinatarios') {
            for (const destinatario of data[prop]) {
                pdf.text("\n" + labels[i] + ': ' + destinatario.nome);
            }
        } else if (prop === 'destinatarioadvogados') {
            for (const destinatarioAdv of data[prop]) {
                pdf.text("\n" + labels[i] + ': ' + destinatarioAdv.advogado.nome + " - OAB " + destinatarioAdv.advogado.uf_oab);
            }

        } else if (prop === 'texto') {
            const texto = data[prop].replace(/\r\n/g, '\n');
            pdf.text('\nConteúdo:');
            pdf.text(texto);
        } else if (prop === 'meio') {
            pdf.text("\n" + labels[i] + ': ' + (data[prop] == 'D' ? 'Diário Eletrônico de Justiça Nacional' : 'Plataforma de Editais'));
        } else {  
            pdf.text("\n" + labels[i] + ': ' + data[prop]);
        }
        i++;
    }
    pdf.text('\n\n');
}

exports.savePDF = function() {
    pdf.pipe(fs.createWriteStream('output.pdf'));
    pdf.end();
}
