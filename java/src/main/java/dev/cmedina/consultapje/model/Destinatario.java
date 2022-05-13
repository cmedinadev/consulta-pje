
package dev.cmedina.consultapje.model;

import java.util.HashMap;
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
    "nome",
    "polo",
    "comunicacao_id"
})
@Generated("jsonschema2pojo")
public class Destinatario {

    @JsonProperty("nome")
    private String nome;
    @JsonProperty("polo")
    private String polo;
    @JsonProperty("comunicacao_id")
    private Integer comunicacaoId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty("polo")
    public String getPolo() {
        return polo;
    }

    @JsonProperty("polo")
    public void setPolo(String polo) {
        this.polo = polo;
    }

    @JsonProperty("comunicacao_id")
    public Integer getComunicacaoId() {
        return comunicacaoId;
    }

    @JsonProperty("comunicacao_id")
    public void setComunicacaoId(Integer comunicacaoId) {
        this.comunicacaoId = comunicacaoId;
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
