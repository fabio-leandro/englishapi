package com.fabio.englishapi.entities.enums;

public enum VerbType {

    IRREGULAR(1,"Irregular"),
    REGULAR(2,"Regular");

    private int cod;
    private String description;

    private VerbType(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public static VerbType toEnum(Integer id){

        if(id == null) return null;

        for (VerbType c: VerbType.values()){
            if (id.equals(c.getCod())) return c;
        }

        throw new IllegalArgumentException("Id invalid "+id);

    }
}
