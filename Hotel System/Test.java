package hotelsystem;
public class Test {
    public static void main(String[]args){
        Room [] r = new Room[6];
        for(int i=0;i<3;i++){
            r[i] = new SingleRoom(i+1,false);
        }
        for(int i=3;i<6;i++){
            r[i] = new DoubleRoom(i+1,false);
        }
        Hotel h=new Hotel("h1",20000.00,r);
        
        
    }
}
