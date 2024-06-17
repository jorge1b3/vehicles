package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true, chain = true)
public class CarroBuilder implements VehicleBuilder{
	private String marca;
	private String modelo;
	private String tipoVehiculo;
	private String color;
	private String placa;
	private String tipoCombustible;
	private double precio;
	private int cantidadPasajeros;

	public CarroBuilder() {
		this.tipoVehiculo = "Carro";
		this.cantidadPasajeros = 5;
	}

	public Vehicle build(){
		return new Vehicle(marca, modelo, tipoVehiculo, color, placa,tipoCombustible, precio, cantidadPasajeros);
	}
}
