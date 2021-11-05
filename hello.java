

import java.util.Scanner;


public class hello {
   
	public static void main(String[] args) {
	Scanner giris = new Scanner(System.in);
	double s1,s2,s3,kok1,kok2,delta;
	
	System.out.println("s1: ");
	s1=giris.nextDouble();
	
	System.out.println("s2: ");
    s2=giris.nextDouble();
    
    System.out.println("s3: ");
    s3=giris.nextDouble();
    
    delta= s2 * s2 - 4 * s1 * s3;
       
    if (delta < 0) {
    	System.out.println("Reel Kök Yok.. \n");
    }
    else if (delta == 0) {
    	kok1 =-s2 / (2*s1);
    	System.out.println("kok1*kok2=" + kok1);
    }
    else {
    	kok1 = (-s2 + Math.sqrt(delta)) / (2 * s1);
    	kok2 = (-s2 - Math.sqrt(delta)) / (2 * s1);
    	
    	System.out.println("kok1=" + kok1);
    	System.out.println("kok2=" + kok2);
    			
    }

	}

}
