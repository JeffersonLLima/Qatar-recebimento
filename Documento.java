package com.exemplo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Documento {

    @Id
    private String mawb;
    private String data;
    private String hora;
    private double peso;
    private String origem;
    private String destino;
    private String status;

    // Getters e Setters
    public String getMawb() {
        return mawb;
    }

    public void setMawb(String mawb) {
        this.mawb = mawb;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
