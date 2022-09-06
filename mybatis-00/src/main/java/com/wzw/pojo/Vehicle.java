package com.wzw.pojo;

public class Vehicle {
    private int vid;
    private String plate;
    private String VIN;
    private String brand;
    private String make;
    private String color;
    private String serve_type;
    private int seat_number;
    private String condition;
    private int year;
    private Boolean is_binded;

    public Vehicle() {
    }

    public Vehicle(String plate, String VIN, String brand, String make, String color, String serve_type, int seat_number, String condition, int year, Boolean is_binded) {
        this.vid = (int)(Math.random() * 1000000);
        this.plate = plate;
        this.VIN = VIN;
        this.brand = brand;
        this.make = make;
        this.color = color;
        this.serve_type = serve_type;
        this.seat_number = seat_number;
        this.condition = condition;
        this.year = year;
        this.is_binded = is_binded;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getServe_type() {
        return serve_type;
    }

    public void setServe_type(String serve_type) {
        this.serve_type = serve_type;
    }

    public int getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(int seat_number) {
        this.seat_number = seat_number;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Boolean getIs_binded() {
        return is_binded;
    }

    public void setIs_binded(Boolean is_binded) {
        this.is_binded = is_binded;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vid=" + vid +
                ", plate='" + plate + '\'' +
                ", VIN='" + VIN + '\'' +
                ", brand='" + brand + '\'' +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", serve_type='" + serve_type + '\'' +
                ", seat_number=" + seat_number +
                ", condition='" + condition + '\'' +
                ", year=" + year +
                ", is_binded=" + is_binded +
                '}';
    }
}
