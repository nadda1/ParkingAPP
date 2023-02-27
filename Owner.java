package ParkingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Owner {


    private configuration config;
    private static ArrayList<slots> floor;




    public ArrayList<slots> Build(){
        Garage garage=new Garage();
        Scanner in =new Scanner(System.in) ;
        System.out.println("Enter the maximum size of slots ");
        int size;
        size=in.nextInt();
        floor=garage.GarageFloor(size);
        return floor ;
    }

    public static ArrayList<slots> getFloor(){
        return floor;
    }


    public card setFirstConfig(vehicle car ){
        // select the configurations with first object to use the implementation in the park in function that are inside
        // the first
        config =new first();
        return config.ParkIn(car);

    }
    //implement the park in function that are inside the best fit class
    public card setBestFit(vehicle car){
        config =new BestFit();
        return config.ParkIn(car);


    }


}
