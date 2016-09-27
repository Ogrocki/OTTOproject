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
			//test function for quickly viewing waypoints
			System.out.println("X:"+x);
			System.out.println("Y:"+y);
			System.out.println("P:"+p);
		}
		public double calcBestTime(Waypoint destination){
			//calulation fuction for getting double value from two locations or the penalty if thats less
			double travelTime= (0.5*Math.sqrt((destination.x-x)*(destination.x-x)+(destination.y-y)*(destination.y-y)))+10;
			if(travelTime>destination.p) return destination.p;
			else return travelTime;
		}
		public double calcTravelTime(Waypoint destination){
			return (0.5*Math.sqrt((destination.x-x)*(destination.x-x)+(destination.y-y)*(destination.y-y)))+10;
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
        int x=0; int y=0; int p=0; //pre-init values incase of incorrect input
        int robotx=0, roboty=0;
        while(i!=0){ 
        	ArrayList<Waypoint> list = new ArrayList<Waypoint>();
        	Waypoint Waypoint0 =new Waypoint(0,0,1000000);
        	list.add(Waypoint0);
        	for(int ii=0; ii<i; ii++){ //runs for set amount of test cases
        		x= scan.nextInt();
        		y= scan.nextInt();
        		p= scan.nextInt();
        		Waypoint Waypoint =new Waypoint(x,y,p);
        		Waypoint.printWaypoint();
        		list.add(Waypoint);   		
        	}
        	Waypoint Waypoint00 =new Waypoint(100,100,1000000);
        	list.add(Waypoint00);
        	//System.out.printf("%.3f", Waypoint0.calcBestTime(list.get(0))+list.get(0).calcBestTime(Waypoint1));
        	System.out.println(minTravelTime(0,list,0));
        	i=scan.nextInt();
        }
    }
    public static double minTravelTime(double total, ArrayList<Waypoint> list, int counter){
    	//TODO THIS SYSTEM
    	return 0.0;
    }
}