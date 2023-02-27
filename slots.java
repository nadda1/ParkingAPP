package ParkingApp;

public class slots {

    private   boolean status;
    private int position;
    private int width;
    private int depth ;
    public slots(boolean status, int position, int width, int depth) {
        this.status = status;
        this.position = position;
        this.width = width;
        this.depth = depth;
    }


    public void occupy(){
        status=false;
    }
    public void release(){
        status=true;

    }
    public void DisplaySlot(){
        System.out.println("slot's width => "+this.width);
        System.out.println("slot's depth => "+this.depth);
        System.out.println("slot's position =>"+this.position);

    }
    public boolean GetStatus() {
        return status;
    }

    public int getPosition() {
        return position;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }
}
