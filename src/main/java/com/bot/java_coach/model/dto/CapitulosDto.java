package com.bot.java_coach.model.dto;

public class CapitulosDto {
    private int id_capitulo;
    private int numero_Capitulo;
    private String nombre_Capitulo;
    private int id_nivel;



    public CapitulosDto(int id_capitulo, int numero_Capitulo, String nombre_Capitulo, int id_nivel){
        this.id_capitulo = id_capitulo;
        this.numero_Capitulo = numero_Capitulo;
        this.nombre_Capitulo = nombre_Capitulo;
        this.id_nivel = id_nivel;

    }

    public int getId_capitulo() {
        return id_capitulo;
    }

    public void setId_capitulo(int id_capitulo) {
        this.id_capitulo = id_capitulo;
    }

    public int getNumero_Capitulo() {
        return numero_Capitulo;
    }

    public void setNumero_Capitulo(int numero_Capitulo) {
        this.numero_Capitulo = numero_Capitulo;
    }

    public String getNombre_Capitulo() {
        return nombre_Capitulo;
    }

    public void setNombre_Capitulo(String nombre_Capitulo) {
        this.nombre_Capitulo = nombre_Capitulo;
    }

    public int getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(int id_nivel) {
        this.id_nivel = id_nivel;
    }
}
