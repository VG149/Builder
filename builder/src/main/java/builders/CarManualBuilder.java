/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builders;

import cars.CarType;
import cars.Manual;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 *
 * @author FATEC ZONA LESTE
 */
/**
 * Diferente de outros padrões criacionais, Builders podem construir produtos sem relação,
 * que não tem interface comum
 * 
 *
 * nesse caso construimos um usuario manual para o carro, usando os mesmos passos para construir um carro
 *isso permite produzir manualmente para modelos especificos
 **/
public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }

}