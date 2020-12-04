package exercice;

public class Exercise03 {

	int x,y,z;
	
	public Exercise03(){
		
	}
    public Exercise03(int xx, int yy, int zz){
		this.x=xx;
		this.y=yy;
		this.z=zz;
	}
    public static void main(String[] args) {
    	
    	Exercise03 a = new Exercise03 (1,1,1);
    	Exercise03 b = new Exercise03 (1,1,1);
    	Exercise03 c = new Exercise03 (1,1,1);
 
        System.out.println(a.toString());
        
   }
    
    @Override
	public
    String toString() {
    	return "Exercise03 [x=" +x+ " , y=" +y+ " , z=" +z+"]";
    	
    }

   
}
