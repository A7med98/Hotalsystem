package hotelsystem;
abstract class Room {
    public int roomNumber;
    public boolean reserved;
    public Room(int roomNumber,boolean reserved){
        this.roomNumber=roomNumber;
        this.reserved=reserved;
    }
    public void setRoomNumber(int roomNumber){
        this.roomNumber=roomNumber;
    }
    public boolean getReserved(){
        return reserved;
    }
    public void setReserved(boolean reserved){
        this.reserved=reserved;
    }
    public abstract double getPrice(); 
    
}
