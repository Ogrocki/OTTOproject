import java.util.Scanner;

public class ot
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int x=0; int y=0; int p=0; //pre-init values for incorrect input
        while(i!=0){    
        	for(int ii=0; ii<i; ii++){ //runs for set amount of test cases
        		x= scan.nextInt();
        		y= scan.nextInt();
        		p= scan.nextInt();
        	}
        i=scan.nextInt();
        }
	}
}