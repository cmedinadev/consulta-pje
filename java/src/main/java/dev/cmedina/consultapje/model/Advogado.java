
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
    "id",
    "nome",
    "numero_oab",
    "uf_oab"
})
@Generated("jsonschema2pojo")
public class Advogado {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("numero_oab")
    private String numeroOab;
    @JsonProperty("uf_oab")
    private String ufOab;
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

    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    @JsonProperty("numero_oab")
    public String getNumeroOab() {
        return numeroOab;
    }

    @JsonProperty("numero_oab")
    public void setNumeroOab(String numeroOab) {
        this.numeroOab = numeroOab;
    }

    @JsonProperty("uf_oab")
    public String getUfOab() {
        return ufOab;
    }

    @JsonProperty("uf_oab")
    public void setUfOab(String ufOab) {
        this.ufOab = ufOab;
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
