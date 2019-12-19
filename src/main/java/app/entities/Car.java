package app.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Car {
    private String make;
    private String model1;
    private String year;
    private String engine;
    private String transmision;
    private String color;
    private String vin;
    private String miles;
    private String dateSubmitted;
    private String price;
    private static final String path = "/Users/oleksandrhuliai/Desktop/cars.txt";


    public Car(String make, String model1, String year, String engine, String transmision, String color, String vin, String miles, String dateSubmitted, String price) {
        this.make = make;
        this.model1 = model1;
        this.year = year;
        this.engine = engine;
        this.transmision = transmision;
        this.color = color;
        this.vin = vin;
        this.miles = miles;
        this.dateSubmitted = dateSubmitted;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel1() {
        return model1;
    }

    public String getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmision() {
        return transmision;
    }

    public String getColor() {
        return color;
    }

    public String getVin() {
        return vin;
    }

    public String getMiles() {
        return miles;
    }

    public String getDateSubmitted() {
        return dateSubmitted;
    }

    public String getPrice() {
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel1(String model1) {
        this.model1 = model1;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public void setDateSubmitted(String dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String s = this.make+" "+this.model1+" "+this.year+" "+this.engine+" "+this.transmision+" "+this.color+" "+this.vin+" "+this.miles+" "+this.dateSubmitted+" "+this.price;
        return s;

    }
public static ArrayList<Car> readFromFile() throws IOException {
        ArrayList<Car> cars = new ArrayList<Car>();

    String line;
    BufferedReader reader = new BufferedReader(new FileReader(path));
    while((line=reader.readLine())!=null)
    {

        String[] parsedLine = line.split(",");




        cars.add(new Car(parsedLine[0],parsedLine[1],parsedLine[2],parsedLine[3],parsedLine[4],parsedLine[5],parsedLine[6],parsedLine[7],parsedLine[8],parsedLine[9]));



    }







    return cars;


}

}
