package ParkingApp;
import java.util.*;
public class Garage {
    Scanner in =new Scanner(System.in) ;


    private ArrayList<slots> listOfSlots ;
    public Garage () {}


    public ArrayList<slots> GarageFloor(int size ) {


        //build the floor of the garage (imagine that every place to park is a slot and the floor is array of slots
        ArrayList<slots> listOfSlots = new ArrayList<>();

        for (int i = 0; i < size ; i++) {


            int width=0;
            int depth=0;
            System.out.println("Enter the width of the slot in location "+ i);
            width=in.nextInt();
            System.out.println("Enter the depth of the slot in location "+i);
            depth=in.nextInt();
            slots slot = new slots(true, i, width, depth);
            listOfSlots.add(slot);

        }
        return listOfSlots;


    }

    public ArrayList<slots> getListOfSlots() {
        return listOfSlots;

    }



    public void DisplayAvailable(){

        // Display all slots with the status true (the empty slots )
        listOfSlots=Owner.getFloor();
        for(int i=0; i <  listOfSlots.size(); i++)
        {

            if(listOfSlots.get(i).GetStatus()) {

                System.out.println("Available slot in location  " + i );
                listOfSlots.get(i).DisplaySlot();
                System.out.println();
            }
            else{
                System.out.println("All slots are not available ");
            }
        }
    }





}
