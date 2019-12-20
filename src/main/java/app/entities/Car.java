package app.entities;

import java.io.*;
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
    private String image;

    private static final String path = "/Users/oleksandrhuliai/Desktop/cars.txt";


    public Car(String make, String model1, String year, String engine, String transmision, String color, String vin, String miles, String dateSubmitted, String price,String image) {
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
        this.image = image;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        String s = this.make+" "+this.model1+" "+this.year+" "+this.engine+" "+this.transmision+" "+this.color+" "+this.vin+" "+this.miles+" "+this.dateSubmitted+" "+this.price+" "+this.image;
        return s;

    }
    public String toString2() {
        String s1 = this.make+","+this.model1+","+this.year+","+this.engine+","+this.transmision+","+this.color+","+this.vin+","+this.miles+","+this.dateSubmitted+","+this.price+","+this.image;
        return s1;

    }
public static ArrayList<Car> readFromFile() throws IOException {
        ArrayList<Car> cars = new ArrayList<Car>();

    String line;
    BufferedReader reader = new BufferedReader(new FileReader(path));
    while((line=reader.readLine())!=null)
    {

        String[] parsedLine = line.split(",");




        cars.add(new Car(parsedLine[0],parsedLine[1],parsedLine[2],parsedLine[3],parsedLine[4],parsedLine[5],parsedLine[6],parsedLine[7],parsedLine[8],parsedLine[9],parsedLine[10]));



    }







    return cars;


}
    public void saveToFile(){
        String fileName = path;
        try {

            FileWriter Write= new FileWriter(fileName,true);
            BufferedWriter bw = new BufferedWriter(Write);
            bw.write(toString2());
            bw.newLine();
            bw.close();

        }
        catch(IOException e){
            System.out.println("Error writing to file");
        }
    }

}
