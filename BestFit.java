package ParkingApp;
import java.time.LocalTime;
import java.util.ArrayList;
public class BestFit implements configuration{
    private ArrayList<slots> floor=null;
    BestFit(){

        floor=Owner.getFloor();

    }

    @Override
    public card ParkIn(vehicle car) {
        slots Given_slot=null;
        for(int i=0; i<floor.size();i++){
            //compare each slot of the array of slots with the dimensions of the vehicle to find a suitable slot
            if(car.getDepth()==floor.get(i).getDepth()&&car.getWidth()== floor.get(i).getWidth()
                    && floor.get(i).GetStatus()){
                Given_slot=floor.get(i);

            }

        }
        // if there is a suitable slot execute the following
        if(Given_slot!=null)
        {
            // set the arrival time
            car.setArrivalTime(LocalTime.now());
            // make a card for every car that enters the system
            card ticket=new card(car,Given_slot);
            // after that we make the slot busy to prevent any other car from taking it
            makeSlot_unAvailable(ticket);
            System.out.println("This is your slot ");
            // Display the Info of the given slot
            Given_slot.DisplaySlot();
            return ticket;
        }
        else{
            // otherwise there is no slot suitable for this vehicle
            System.out.println("Sorry there is no suitable slot !");
            return null;
        }
    }
    public void makeSlot_unAvailable(card ticket)
    {
        for (int i = 0; i < floor.size(); i++)
        {
            int slotNumber = floor.get(i).getPosition();

            if (ticket.getSlot().getPosition() == slotNumber)
            {
                slots slot;
                slot = floor.get(i);
                slot.occupy();
            }
        }
    }


}
