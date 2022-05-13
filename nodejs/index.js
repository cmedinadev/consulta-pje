const axios = require('axios');
const pdf = require('./generate-pdf');

const url = 'https://comunicaapi.pje.jus.br/api/v1/comunicacao';

const params = new URLSearchParams();
params.append("siglaTribunal", "TRF2"); 
params.append("dataDisponibilizacaoInicio", "2022-04-25");
params.append("dataDisponibilizacaoFim", "2022-04-25");
params.append("pagina", "1");
params.append("itensPorPagina", "10");

axios
  .get(url + '?' + params.toString())
  .then(res => {
    if (res.status == 200) {
        pdf.createPDF();
        for (const pub of res.data.items) {
            pdf.writePublicacao(pub);
        }
        pdf.savePDF();
    }
  })
  .catch(error => {
    console.error(error);
  });


