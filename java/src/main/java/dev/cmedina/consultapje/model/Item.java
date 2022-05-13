
package dev.cmedina.consultapje.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "data_disponibilizacao",
    "siglaTribunal",
    "tipoComunicacao",
    "nomeOrgao",
    "texto",
    "numero_processo",
    "meio",
    "link",
    "tipoDocumento",
    "nomeClasse",
    "codigoClasse",
    "numeroComunicacao",
    "ativo",
    "hash",
    "datadisponibilizacao",
    "meiocompleto",
    "numeroprocessocommascara",
    "destinatarios",
    "destinatarioadvogados"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("data_disponibilizacao")
    private String dataDisponibilizacao;
    @JsonProperty("siglaTribunal")
    private String siglaTribunal;
    @JsonProperty("tipoComunicacao")
    private String tipoComunicacao;
    @JsonProperty("nomeOrgao")
    private String nomeOrgao;
    @JsonProperty("texto")
    private String texto;
    @JsonProperty("numero_processo")
    private String numeroProcesso;
    @JsonProperty("meio")
    private String meio;
    @JsonProperty("link")
    private String link;
    @JsonProperty("tipoDocumento")
    private String tipoDocumento;
    @JsonProperty("nomeClasse")
    private String nomeClasse;
    @JsonProperty("codigoClasse")
    private String codigoClasse;
    @JsonProperty("numeroComunicacao")
    private Integer numeroComunicacao;
    @JsonProperty("ativo")
    private Boolean ativo;
    @JsonProperty("hash")
    private String hash;
    @JsonProperty("datadisponibilizacao")
    private String datadisponibilizacao;
    @JsonProperty("meiocompleto")
    private String meiocompleto;
    @JsonProperty("numeroprocessocommascara")
    private String numeroprocessocommascara;
    @JsonProperty("destinatarios")
    private List<Destinatario> destinatarios = null;
    @JsonProperty("destinatarioadvogados")
    private List<Destinatarioadvogado> destinatarioadvogados = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("data_disponibilizacao")
    public String getDataDisponibilizacao() {
        return dataDisponibilizacao;
    }

    @JsonProperty("data_disponibilizacao")
    public void setDataDisponibilizacao(String dataDisponibilizacao) {
        this.dataDisponibilizacao = dataDisponibilizacao;
    }

    @JsonProperty("siglaTribunal")
    public String getSiglaTribunal() {
        return siglaTribunal;
    }

    @JsonProperty("siglaTribunal")
    public void setSiglaTribunal(String siglaTribunal) {
        this.siglaTribunal = siglaTribunal;
    }

    @JsonProperty("tipoComunicacao")
    public String getTipoComunicacao() {
        return tipoComunicacao;
    }

    @JsonProperty("tipoComunicacao")
    public void setTipoComunicacao(String tipoComunicacao) {
        this.tipoComunicacao = tipoComunicacao;
    }

    @JsonProperty("nomeOrgao")
    public String getNomeOrgao() {
        return nomeOrgao;
    }

    @JsonProperty("nomeOrgao")
    public void setNomeOrgao(String nomeOrgao) {
        this.nomeOrgao = nomeOrgao;
    }

    @JsonProperty("texto")
    public String getTexto() {
        return texto;
    }

    @JsonProperty("texto")
    public void setTexto(String texto) {
        this.texto = texto;
    }

    @JsonProperty("numero_processo")
    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    @JsonProperty("numero_processo")
    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    @JsonProperty("meio")
    public String getMeio() {
        return meio;
    }

    @JsonProperty("meio")
    public void setMeio(String meio) {
        this.meio = meio;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("tipoDocumento")
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    @JsonProperty("tipoDocumento")
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @JsonProperty("nomeClasse")
    public String getNomeClasse() {
        return nomeClasse;
    }

    @JsonProperty("nomeClasse")
    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    @JsonProperty("codigoClasse")
    public String getCodigoClasse() {
        return codigoClasse;
    }

    @JsonProperty("codigoClasse")
    public void setCodigoClasse(String codigoClasse) {
        this.codigoClasse = codigoClasse;
    }

    @JsonProperty("numeroComunicacao")
    public Integer getNumeroComunicacao() {
        return numeroComunicacao;
    }

    @JsonProperty("numeroComunicacao")
    public void setNumeroComunicacao(Integer numeroComunicacao) {
        this.numeroComunicacao = numeroComunicacao;
    }

    @JsonProperty("ativo")
    public Boolean getAtivo() {
        return ativo;
    }

    @JsonProperty("ativo")
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    @JsonProperty("datadisponibilizacao")
    public String getDatadisponibilizacao() {
        return datadisponibilizacao;
    }

    @JsonProperty("datadisponibilizacao")
    public void setDatadisponibilizacao(String datadisponibilizacao) {
        this.datadisponibilizacao = datadisponibilizacao;
    }

    @JsonProperty("meiocompleto")
    public String getMeiocompleto() {
        return meiocompleto;
    }

    @JsonProperty("meiocompleto")
    public void setMeiocompleto(String meiocompleto) {
        this.meiocompleto = meiocompleto;
    }

    @JsonProperty("numeroprocessocommascara")
    public String getNumeroprocessocommascara() {
        return numeroprocessocommascara;
    }

    @JsonProperty("numeroprocessocommascara")
    public void setNumeroprocessocommascara(String numeroprocessocommascara) {
        this.numeroprocessocommascara = numeroprocessocommascara;
    }

    @JsonProperty("destinatarios")
    public List<Destinatario> getDestinatarios() {
        return destinatarios;
    }

    @JsonProperty("destinatarios")
    public void setDestinatarios(List<Destinatario> destinatarios) {
        this.destinatarios = destinatarios;
    }

    @JsonProperty("destinatarioadvogados")
    public List<Destinatarioadvogado> getDestinatarioadvogados() {
        return destinatarioadvogados;
    }

    @JsonProperty("destinatarioadvogados")
    public void setDestinatarioadvogados(List<Destinatarioadvogado> destinatarioadvogados) {
        this.destinatarioadvogados = destinatarioadvogados;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
