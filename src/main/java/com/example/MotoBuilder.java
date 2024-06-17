package com.example;

import lombok.Getter;
import lombok.Setter;
import


@Getter
@Setter
@As
public class MotoBuilder implements VehicleBuilder {
	private String marca;
	private String modelo;
	private String tipoVehiculo;
	private String color;
	private String placa;
	private double precio;
	private String tipoCombustible;
	private Integer cantidadPasajeros;

	public MotoBuilder() {
		this.tipoVehiculo = "Motocicleta";
		this.cantidadPasajeros = 2;
	}

    @Override
	public VehicleBuilder marca(String marca) {
		this.marca = marca;
		return this;
	}

    @Override
	public VehicleBuilder modelo(String modelo) {
		this.modelo = modelo;
		return this;
	}
	
	@Override
	public VehicleBuilder placa(String placa) {
		this.placa = placa;
		return this;
	}

	@Override
	public VehicleBuilder color(String color) {
		this.color = color;
		return this;
	}

	@Override
	public VehicleBuilder precio(double precio) {
		this.precio = precio;
		return this;
	}

	@Override
	public VehicleBuilder tipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
		return this;
	}
}