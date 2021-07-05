package hotelsystem;
 class SingleRoom extends Room{
      public SingleRoom(int roomNumber,boolean reserved){
        super(roomNumber,reserved);
    }
    public double getPrice(){
        return 200.00;
    }
}