package com.andre.tdd.model;

import java.time.LocalDate;

public class DeliveryModel {
    private String id;
    private String compradorName;
    private LocalDate dataCompra;
    private LocalDate dataEntrega;
    private int numeroDePacotes;

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

    public int getNumeroDePacotes() {
        return this.numeroDePacotes;
    }

    public void setNumeroDePacotes(int numeroDePacotes) {
        this.numeroDePacotes = numeroDePacotes;
    }

    public DeliveryModel(String id, String compradorName, LocalDate dataCompra, LocalDate dataEntrega, int numeroDePacotes) {
        this.id = id;
        this.compradorName = compradorName;
        this.dataCompra = dataCompra;
        this.dataEntrega = dataEntrega;
        this.numeroDePacotes = numeroDePacotes;
    }

    public DeliveryModel() {
    }

}    