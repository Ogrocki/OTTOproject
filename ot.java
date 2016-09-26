import java.util.Scanner;
import java.util.ArrayList;
public class ot
{
	public static class Waypoint {
		//object that holds waypoints and their penalty
		private int x;
		private int y;
		private int p;
		public Waypoint(int xx, int yy, int pp){
			x=xx;
			y=yy;
			p=pp;
		}
		public void printWaypoint(){
			System.out.println("X:"+x);
			System.out.println("Y:"+y);
			System.out.println("P:"+p);
		}
		public double calcTravelTime(Waypoint destination){
			return 2*Math.sqrt((destination.x-x)*(destination.x-x)+(destination.y-y)*(destination.y-y));
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
        int x=0; int y=0; int p=0; //pre-init values incase of incorrect input
        int robotx=0, roboty=0;
        while(i!=0){ 
        	ArrayList<Waypoint> list = new ArrayList<Waypoint>();
        	for(int ii=0; ii<i; ii++){ //runs for set amount of test cases
        		x= scan.nextInt();
        		y= scan.nextInt();
        		p= scan.nextInt();
        		Waypoint Waypoint =new Waypoint(x,y,p);
        		Waypoint.printWaypoint();
        		list.add(Waypoint);
        		
        	}
        	//TODO: ADD CALULATION OF BEST DISTANCES
        	
        	i=scan.nextInt();
        }
    }
}