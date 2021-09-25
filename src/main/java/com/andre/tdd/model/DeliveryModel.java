package com.andre.tdd.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DeliveryModel {
    @Id
    private String id;
    private String compradorName;
    private LocalDate dataCompra;
    private LocalDate dataEntrega;
    private int qtdPacotes;


    public DeliveryModel(String id, String compradorName, LocalDate dataCompra, LocalDate dataEntrega, int qtdPacotes) {
        this.id = id;
        this.compradorName = compradorName;
        this.dataCompra = dataCompra;
        this.dataEntrega = dataEntrega;
        this.qtdPacotes = qtdPacotes;
    }
    public int getQtdPacotes() {
        return this.qtdPacotes;
    }

    public void setQtdPacotes(int qtdPacotes) {
        this.qtdPacotes = qtdPacotes;
    }





    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompradorName() {
        return this.compradorName;
    }

    public void setCompradorName(String compradorName) {
        this.compradorName = compradorName;
    }

    public LocalDate getDataCompra() {
        return this.dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public LocalDate getDataEntrega() {
        return this.dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }







}    