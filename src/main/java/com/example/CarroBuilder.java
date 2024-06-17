package com.example;


public class CarroBuilder implements VehicleBuilder{
	private String marca;
	private String modelo;
	private String tipoVehiculo;
	private String color;
	private String placa;
	private double precio;
	private String tipoCombustible;
	private Integer cantidadPasajeros;

	public CarroBuilder() {
		this.tipoVehiculo = "Carro";
		this.cantidadPasajeros = 5;
	}

	@Override
	public VehicleBuilder marca(String marca) {
		this.marca = marca;
	}

    @Override
	public VehicleBuilder modelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public VehicleBuilder placa(String placa) {
		this.placa = placa;
	}

	@Override
	public VehicleBuilder color(String color) {
		this.color = color;
	}

	@Override
	public VehicleBuilder precio(double precio) {
		this.precio = precio;
	}

	@Override
	public VehicleBuilder tipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

}
