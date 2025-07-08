package com.cars;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class Main {
    static public void main(String[] args) {
Scanner input = new Scanner(System.in);


        Collection<Car> cars = new ArrayList<Car>();
        System.out.println("Good Day Welcome!!!");
        System.out.println("(1) Capture vehicle details\n"+
                "(2) View vehicle report\n"+
                "(3) Exit");

        int menuOption = input.nextInt();

        while ((menuOption == 1) || (menuOption == 2)){

            Car CarObj = new Car();
            int year;
            int mileage;
            String make;
            String model;
            String plateNum;
            String vimNum;

            System.out.println("Enter make");
            make = input.next();

            System.out.println("Enter model");
            model = input.next();

            System.out.println("Enter vim");
            vimNum = input.next();
            while (!(vimNum.length() == 17)) {
                System.out.println("Enter vim number make sure its 17 char long");
                vimNum = input.next();

                System.out.println("Please Enter (1) for old format licence number, and (2) for new format number");
                int plateChoice = input.nextInt();
                if (plateChoice == 1) {
                    System.out.println("Enter plate number e.g aab333");
                    plateNum = input.next();
                }else if (plateChoice == 2) {
                    System.out.println("Enter plate number e.g aab333");
                    plateNum = input.next();


                }
            }
            }



        }






    }


