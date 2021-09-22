package com.andre.tdd.model;

import java.time.LocalDate;

public class DeliveryModel {
    private String id;
    private String reserveName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int numberGuests;

    public DeliveryModel(String id, String reserveName, LocalDate checIn, LocalDate checkOut, int numberGuests){
        this.id = id;
        this.reserveName = reserveName;
        this.checkIn = checIn;
        this.checkOut = checkOut;
        this.numberGuests = numberGuests;
        
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getReserveName() {
        return this.reserveName;
    }

    public void setReserveName(String reserveName) {
        this.reserveName = reserveName;
    }

    public LocalDate getCheckIn() {
        return this.checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return this.checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public int getNumberGuests() {
        return this.numberGuests;
    }

    public void setNumberGuests(int numberGuests) {
        this.numberGuests = numberGuests;
    }
    



}
