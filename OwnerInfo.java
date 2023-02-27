package ParkingApp;

public class OwnerInfo {
    private static OwnerInfo owner;
    private String name;
    private String ID;

    private OwnerInfo(String name ,String ID) {
        this.name = name;
        this.ID=ID;
    }
    public static OwnerInfo getInstance(String name,String ID)
    {
        if (owner== null)
            owner= new OwnerInfo(name,ID);

        return owner;
    }

}
