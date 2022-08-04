package com.fabio.englishapi.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_verbs")
public class Verb implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String infinitive;
    private String past;
    private String participle;
    private String portuguese;

    public Verb(){}

    public Verb(Long id, String type, String infinitive, String past, String participle, String portuguese) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Verb verb = (Verb) o;
        return Objects.equals(id, verb.id) && Objects.equals(type, verb.type) && Objects.equals(infinitive, verb.infinitive) && Objects.equals(past, verb.past) && Objects.equals(participle, verb.participle) && Objects.equals(portuguese, verb.portuguese);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, infinitive, past, participle, portuguese);
    }
}
