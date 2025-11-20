package com.example.HotelInfoService.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "HotelMicroservice")
public class HotelEntity {
    HotelEntity(){

    }
    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   public  String hotelId;
   public String hotelname;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String location;
}
