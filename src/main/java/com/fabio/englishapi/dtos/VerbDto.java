package com.fabio.englishapi.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class VerbDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    @NotNull(message = "The type cannot be null.")
    private String type;
    @NotNull(message = "The type cannot be null.")
    @Size(min = 2, max = 30, message = "The infinitve field must be between 2 and 30 caracters.")
    private String infinitive;
    @NotNull(message = "The past cannot be null.")
    @Size(min = 2, max = 30, message = "The past field must be between 2 and 30 caracters.")
    private String past;
    @NotNull(message = "The participle cannot be null.")
    @Size(min = 2, max = 30, message = "The participle field must be between 2 and 30 caracters.")
    private String participle;
    @Size(min = 2, max = 30, message = "The portuguese field must be between 2 and 30 caracters.")
    private String portuguese;

    public VerbDto(){}

    public VerbDto(Long id, String type, String infinitive, String past, String participle, String portuguese) {
        this.id = id;
        this.type = type;
        this.infinitive = infinitive;
        this.past = past;
        this.participle = participle;
        this.portuguese = portuguese;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfinitive() {
        return infinitive;
    }

    public void setInfinitive(String infinitive) {
        this.infinitive = infinitive;
    }

    public String getPast() {
        return past;
    }

    public void setPast(String past) {
        this.past = past;
    }

    public String getParticiple() {
        return participle;
    }

    public void setParticiple(String participle) {
        this.participle = participle;
    }

    public String getPortuguese() {
        return portuguese;
    }

    public void setPortuguese(String portuguese) {
        this.portuguese = portuguese;
    }
}
