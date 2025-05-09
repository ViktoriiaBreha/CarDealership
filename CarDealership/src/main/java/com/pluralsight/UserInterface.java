package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {

    }

    public void display (){
        Scanner scanner = new Scanner(System.in);
        init();

        boolean run = true;
        while (run){
            displayMenuOptions();

            System.out.println("Enter your choice: ");
            int choice1 = scanner.nextInt();
            scanner.nextLine();

            switch (choice1){
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehicleRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    run=false;
                    System.exit(0);
                    break;

            }


        }

    }
    private void init(){
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership=fileManager.getDealership();
    }
    public void displayMenuOptions(){
        System.out.println("*****Welcome to the Dealership!!!*****");
        System.out.println(" ");
        System.out.println("***Our Options***");
        System.out.println("1 - Find vehicles within a price range");
        System.out.println("2 - Find vehicles by make / model");
        System.out.println("3 - Find vehicles by year range");
        System.out.println("4 - Find vehicles by color");
        System.out.println("5 - Find vehicles by mileage range");
        System.out.println("6 - Find vehicles by type (car, truck, SUV, van)");
        System.out.println("7 - List ALL vehicles");
        System.out.println("8 - Add a vehicle");
        System.out.println("9 - Remove a vehicle");
        System.out.println("0 - Quit");
    }

    public void displayVehicles(ArrayList<Vehicle> vehicles){
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
    }
    public void processGetByPriceRequest(){}
    public void processGetByMakeModelRequest(){}
    public void processGetByYearRequest(){}
    public void processGetByColorRequest(){}
    public void processGetByMileageRequest(){}
    public void processGetByVehicleTypeRequest(){}
    public void processGetAllVehicleRequest(){}
    public void processAddVehicleRequest(){}
    public void processRemoveVehicleRequest(){}


}
