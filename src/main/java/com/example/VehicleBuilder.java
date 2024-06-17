package com.example;

public interface VehicleBuilder {
    VehicleBuilder marca(String marca);
    VehicleBuilder modelo(String modelo);
    VehicleBuilder placa(String placa);
    VehicleBuilder color(String color);
    VehicleBuilder precio(double precio);
    VehicleBuilder tipoCombustible(String tipoCombustible);
}
