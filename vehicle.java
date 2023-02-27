
package ParkingApp;
import java.time.LocalTime;
public class vehicle {

     private String modelName ;
     private int modelYear;
     private int  width;
     private int depth;
    private String  ID;
    private LocalTime arrivalTime;
    private LocalTime DepartureTime;
    private int fees ;

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getID() {
        return ID;
    }


    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        DepartureTime = departureTime;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }
    public boolean checkID(){return true;}



    public vehicle(){

    }
    public vehicle(String modelName, int modelYear,int width, int depth,String ID) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.width = width;
        this.depth = depth;
        this.ID = ID;

    }
//    public void setInfo(String modelName, int modelYear, int width, int depth, String ID){
//        this.modelName = modelName;
//        this.modelYear = modelYear;
//        this.width = width;
//        this.depth = depth;
//        this.ID = ID;
//    }




}
