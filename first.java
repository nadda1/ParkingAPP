package ParkingApp;
import java.time.LocalTime;
import java.util.ArrayList;
public class first implements configuration{
    private ArrayList<slots> floor=null;
    private slots slot;




    first(){

        floor=Owner.getFloor();

    }

    @Override
    public card ParkIn(vehicle car) {
        Garage list=new Garage();

        // search for the first available slot
        slots Given_slot=IsAvailable();
        if(Given_slot!=null)
        {
            // set the arrival time
            car.setArrivalTime(LocalTime.now());
            card ticket=new card(car,Given_slot);
            // make the slot unavailable (make its status false)
            makeSlot_unAvailable(ticket);
            System.out.println("This is your slot ");

            Given_slot.DisplaySlot();
            return ticket;
        }
        else{
            System.out.println("Sorry the Parking is full !");
            return null;
        }
    }
    public slots IsAvailable()
    {


        for(int i = 0; i <floor.size(); i++)
        {
            slots slot ;
            slot =floor.get(i);
            // if there is a suitable slot return it otherwise return null
            if(slot.GetStatus())
            {
                return slot;
            }
        }
        return null;
    }


    public void makeSlot_unAvailable(card ticket)
    {
        for (int i = 0; i < floor.size(); i++)
        {
            int slotNumber = floor.get(i).getPosition();

            if (ticket.getSlot().getPosition() == slotNumber)
            {

                slot = floor.get(i);
                slot.occupy();
            }
        }
    }


}
