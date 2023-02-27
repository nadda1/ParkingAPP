package ParkingApp;

import java.time.LocalTime;
import java.util.ArrayList;

public class parkOut {
    public int totalFees;
    ArrayList<slots> list =new ArrayList<>();



    public parkOut(){}
    public void exit(vehicle c,card ticket ){
        setDeparture(c,ticket);
        calculateTime(c);
        calculateFees(c);
    }


    int hours;

    public void setDeparture(vehicle car,card ticket){

        // set the Departure time of the vehicle and free the slot
        LocalTime DepartureTime;
        DepartureTime = java.time.LocalTime.now();
        car.setDepartureTime(DepartureTime);
        slots particular_slot =ticket.getSlot();
        makeSlotAvailable(particular_slot);

    }
    public void makeSlotAvailable(slots slot)
    {
        list=Owner.getFloor();
        for (int i = 0; i < list.size(); i++)
        {

            if (slot.getPosition()==i)
            {

                slot = list.get(i);
                slot.release();
            }
        }
    }

    public int calculateTime(vehicle car){
        // get the parking duration
        LocalTime start=car.getArrivalTime();
        LocalTime end =car.getDepartureTime();
        hours=end.getHour()- start.getHour();
        return hours;

    }
    public void calculateFees(vehicle car){
        // calculate fees
        int fees =0;
        car.setFees(fees);
        // if less than one hour then the fees will be 5
        if (hours==0){
            fees=5;
        }
        else{
            //otherwise calculate the fees
            fees=calculateTime(car)*5;
        }

        car.setFees(fees);
       totalFees=totalFees + fees;


        System.out.println("your fees = "+fees); ;

    }
    public int GetTotalFees(){
        return totalFees;
    }

}
