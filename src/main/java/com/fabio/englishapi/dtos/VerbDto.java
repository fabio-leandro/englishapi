package com.fabio.englishapi.dtos;

import java.io.Serializable;

public class VerbDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String type;
    private String infinitive;
    private String past;
    private String participle;
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
