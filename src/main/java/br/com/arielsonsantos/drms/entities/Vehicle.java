package br.com.arielsonsantos.drms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.arielsonsantos.drms.enums.VehicleStatus;

@Entity
public class Vehicle implements DRMSEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String licensePlate;
    private String model;
    private Short modelYear;
    private String manufacturer;
    private String color;
    private @ManyToOne VehicleType type;
    private VehicleStatus status;
    
    public Vehicle() {
	}
	
	public Vehicle(final String licensePlate, final String model, final Short modelYear, final String manufacturer, final String color, final VehicleType type, final VehicleStatus status) {
		this.licensePlate = licensePlate;
		this.model = model;
		this.modelYear = modelYear;
		this.manufacturer = manufacturer;
		this.color = color;
		this.type = type;
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(final String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

	public Short getModelYear() {
		return modelYear;
	}

	public void setModelYear(final Short modelYear) {
		this.modelYear = modelYear;
	}

    public void setModel(final String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
		return color;
	}

	public void setColor(final String color) {
		this.color = color;
	}

	public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(final VehicleStatus status) {
        this.status = status;
    }
}
