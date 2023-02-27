package ParkingApp;
import java.time.LocalTime;
import java.util.ArrayList;


public class Main {

    static public void main (String arg[]){

        Garage g=new Garage();
        vehicle first=new vehicle("KIA" ,2012,120,160,"123");
        OwnerInfo Owner=OwnerInfo.getInstance("Mostafa","1200");;
        Owner Garage_operator= new Owner();
        Garage_operator.Build();
        card ticket= Garage_operator.setFirstConfig(first);
        System.out.println("before park out ");
        g.DisplayAvailable();


        parkOut park=new parkOut();
        park.exit(first,ticket);

        g.DisplayAvailable();
        vehicle car2=new vehicle("BMW",2019,125,140,"134");
        card ticket2 =Garage_operator.setBestFit(car2);
        if(ticket2!=null){
            park.exit(car2,ticket2);
        }
        else {
            System.out.println("operation can not be done ");
        }


        int number=card.getTotalVehicle();
        System.out.println("total number of vehicles "+number);

        int income=park.GetTotalFees();
        System.out.println("the total income for the system "+income);







    }

}
