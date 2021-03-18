package TaxiPark;

import TaxiPark.car_types.BrandType;
import TaxiPark.car_types.CarBodyType;
import TaxiPark.car_types.ServiceType;

public class Car {
    private int speed;
    private double fuelConsumption;
    private CarBodyType carBody;
    private String number;
    private String model;
    private BrandType brand;
    private ServiceType serviceType;
    private int issueYear;
//power reserve
    public Car(int speed, double fuelConsumption, CarBodyType carBody, //сделать класс обертку --> уменьшить кол. вход. параметров
               String number, String model,
               BrandType brand, ServiceType serviceType, int issueYear) {
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.carBody = carBody;
        this.number = number;
        this.model = model;
        this.brand = brand;
        this.serviceType = serviceType;
        this.issueYear = issueYear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public CarBodyType getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBodyType carBody) {
        this.carBody = carBody;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BrandType getBrand() {
        return brand;
    }

    public void setBrand(BrandType brand) {
        this.brand = brand;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }


    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }
}
