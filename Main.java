import java.util.*;
import java.io.IOException;
import java.lang.*;

class Main{

	public static void askPin() throws IOException{
		int pinCode = 0;
		int tries = 0;
		while(pinCode != 0001 && tries < 3){
			Scanner pin = new Scanner(System.in);
			System.out.print("Please insert your pincode: ");
			pinCode = pin.nextInt();
			System.out.println(System.lineSeparator().repeat(150));
			tries++;
			System.out.println(tries);
			if(pinCode == 0001){
				System.out.println(System.lineSeparator().repeat(150));
				System.out.println("Succes!");
				try{
					Thread.sleep(2000);
				}
				catch(InterruptedException e){

				}
				System.out.println(System.lineSeparator().repeat(150));
				System.out.println("Succes!");
				break;
			}
		}

	}
	public static void main(String[] args) throws IOException{
		System.out.println(System.lineSeparator().repeat(150));
		askPin();
	}
}
