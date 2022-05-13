
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
    "comunicacao_id",
    "advogado_id",
    "created_at",
    "updated_at",
    "advogado"
})
@Generated("jsonschema2pojo")
public class Destinatarioadvogado {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("comunicacao_id")
    private Integer comunicacaoId;
    @JsonProperty("advogado_id")
    private Integer advogadoId;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("advogado")
    private Advogado advogado;
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

    @JsonProperty("comunicacao_id")
    public Integer getComunicacaoId() {
        return comunicacaoId;
    }

    @JsonProperty("comunicacao_id")
    public void setComunicacaoId(Integer comunicacaoId) {
        this.comunicacaoId = comunicacaoId;
    }

    @JsonProperty("advogado_id")
    public Integer getAdvogadoId() {
        return advogadoId;
    }

    @JsonProperty("advogado_id")
    public void setAdvogadoId(Integer advogadoId) {
        this.advogadoId = advogadoId;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("advogado")
    public Advogado getAdvogado() {
        return advogado;
    }

    @JsonProperty("advogado")
    public void setAdvogado(Advogado advogado) {
        this.advogado = advogado;
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
