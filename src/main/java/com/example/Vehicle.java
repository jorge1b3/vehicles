package com.example;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Vehicle {
    private String marca;
    private String modelo;
    private String tipoVehiculo;
    private String color;
    private String placa;
    private String tipoCombustible;
	private double precio;
    private int cantidadPasajeros; 
}

