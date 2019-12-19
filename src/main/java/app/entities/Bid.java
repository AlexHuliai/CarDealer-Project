package app.entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bid {
    private String bidPrice;
    private static final String path12 = "/Users/oleksandrhuliai/Desktop/bids";
    private String vin;

    public String getBidPrice() {
        return bidPrice;
    }



    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }


    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Bid(String bidPrice, String vin) {
        this.bidPrice = bidPrice;

        this.vin = vin;
    }
    public String toString(){

             String s1 =   this.vin+" "+this.bidPrice;
        return s1;
    }

        public void saveToFile(){
            String fileName1 = path12+".txt";
            try {

                FileWriter Write1= new FileWriter(fileName1,true);
                BufferedWriter bw1 = new BufferedWriter(Write1);
                bw1.write(toString());
                bw1.newLine();
                bw1.close();

            }
            catch(IOException e){
                System.out.println("Error writing to file");
            }
        }
    }

