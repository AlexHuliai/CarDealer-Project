package app.entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Transaction {
    private String firstName;
    private String lastName;
    private String datePurchased;
    private String pricePaid;
    private String vin;
    private static final String path1 = "/Users/oleksandrhuliai/Desktop/transaction";
    ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
    public Transaction() {

    }

    public Transaction(String firstName, String lastName, String datePurchased,String pricePaid,String vin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.datePurchased = datePurchased;
        this.pricePaid = pricePaid;
        this.vin = vin;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDatePurchased() {
        return datePurchased;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDatePurchased(String datePurchased) {
        this.datePurchased = datePurchased;
    }

    public String getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(String pricePaid) {
        this.pricePaid = pricePaid;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String toString() {

             String s =  this.firstName+" "+this.lastName+" "+this.pricePaid+" "+this.datePurchased+" "+this.vin;
         return s;
    }
    public void saveToFile(){
        String fileName = path1+".txt";
        try {

            FileWriter Write= new FileWriter(fileName,true);
            BufferedWriter bw = new BufferedWriter(Write);
            bw.write(toString());
            bw.newLine();
            bw.close();

        }
        catch(IOException e){
            System.out.println("Error writing to file");
        }
    }


}
