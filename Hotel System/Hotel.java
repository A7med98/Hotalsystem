package hotelsystem;
public class Hotel {
    String name;
    double income;
    Room[] rooms;
    public Hotel(String name,double income,Room[] rooms){
        this.name=name;
        this.income=income;
        for(int i=0;i<rooms.length;i++){
        this.rooms.equals(rooms[i]);
        }
    }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public double getIncome(){
            return income;
        }
        public void setIncome(double income){
            this.income=income;
        }
        public Room[] getRooms(){
            return rooms;
        }
        public void setRooms(Room[] rooms){
            for(int i=0;i<rooms.length;i++){
            this.rooms[i]=rooms[i];
            }
        }
        public boolean isFull(){
            int count=0;
            for(int i=0;i<rooms.length;i++){
                if(rooms[i].getReserved()==true){
                    count++;
                }
            }
            if(count==rooms.length){
                return true;
            }
            return false;
        }
        public boolean reserveRoom(Room room,int days){
            if(room.getReserved()==false){
                room.setReserved(true);
                income=income+(days*room.getPrice());
                return true;
            }
            return false;
        }
}

