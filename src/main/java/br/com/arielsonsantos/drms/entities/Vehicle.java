package br.com.arielsonsantos.drms.entities;

import br.com.arielsonsantos.drms.enums.VehicleStatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue
    private Long id;
    private String licensePlate;
    private String model;
    private String manufacturer;
    private VehicleStatus status;

    protected Vehicle() {
    }

    public Vehicle(String licensePlate, String model, String manufacturer, VehicleStatus status) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.manufacturer = manufacturer;
        this.status = status;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
}
