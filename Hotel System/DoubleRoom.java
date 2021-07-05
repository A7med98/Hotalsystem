package hotelsystem;
public class DoubleRoom extends Room {
     public DoubleRoom(int roomNumber,boolean reserved){
        super(roomNumber,reserved);
    }
    public double getPrice(){
        return 300.00;
    }
}
