package ParkingApp;

public class card {
    private String Id;
    private slots slot;
    private int slotNumber;
    static int totalVehicle =0;

    card(vehicle v,slots s){
        totalVehicle++;
        Id=v.getID();
        slot=s;
        slotNumber=s.getPosition();
    }

    public String getId() {
        return Id;
    }


    public slots getSlot() {
        return slot;
    }
    public static int getTotalVehicle() {
        return totalVehicle;
    }
}
