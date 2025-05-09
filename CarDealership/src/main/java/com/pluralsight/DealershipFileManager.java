package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class DealershipFileManager {
    private static Dealership dealership;
    public Dealership getDealership () {
        try{
            FileReader fileReader = new FileReader("src/main/resources/WorkshopFiles/inventory.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String line = " ";
 //           String[] parts = line.split(Pattern.quote("|"));
  //          String name = parts [0];
   //         String address = parts[1];
 //           String phone = parts[2];
//            dealership.

            while((line = bufReader.readLine())!=null){
                if (line.startsWith("D")){
                    continue;
                }

                String[] parts = line.split(Pattern.quote("|"));
                int vin = Integer.parseInt(parts[0]);
                int year = Integer.parseInt(parts[1]);
                String make = parts[2];
                String model = parts [3];
                String type = parts [4];
                String color = parts [5];
                int odometer = Integer.parseInt(parts[6]);
                double price = Double.parseDouble(parts[7]);

                dealership.addVehicle(new Vehicle(vin,year, make, model, type, color, odometer, price));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return dealership;
    }

    public void saveDealership (Dealership dealership){

    }
}
