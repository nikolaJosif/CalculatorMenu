package Calculator;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Scanner;



public class CalculatorMenu {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList <String> menu = new ArrayList<String>();
		
			System.out.println("If you want basic mathematical operations,"
				+ " type B, if you want more complicated ones, press C. ");
		
		char type = scan.next().charAt(0);
		char slovo = Character.toLowerCase(type);
		
		if(slovo == 'b' ) {
			
			System.out.println("Enter first number. ");
			int nb1 = scan.nextInt();
			System.out.println("Enter second number. ");
			int nb2 = scan.nextInt();
			
			System.out.println("This is a menu. "
					+ "Please enter the sequence number of the action "
					+ "you want the program to process for you. ");
			
			menu.add("1 - Addition");
			menu.add("2 - Subtraction");
			menu.add("3 - Multiplication");
			menu.add("4 - Division");
			
			
			for (Object o : menu) {
				System.out.println(o);
			}
			
			int result;
			int calculator = scan.nextInt();
			
			switch(calculator) {
			
			case 1:
				result = nb1 + nb2;
				System.out.println(nb1 + " + " + nb2 + " = " + result);
				break;
			case 2:
				result = nb1 - nb2;
				System.out.println(nb1 + " - " + nb2 + " = " + result);
				break;
			case 3:
				result = nb1 * nb2;
				System.out.println(nb1 + " * " + nb2 + " = " + result);
				break;
			case 4:
				result = nb1 / nb2;
				
				if (nb1 == 0 || nb2 == 0) {
					
					System.out.println("Immposible to devide with 0. ");
					
				} 
				
				else {
					
					result = nb1 / nb2;
					int modulusResult = nb1 % nb2;
					System.out.println(nb1 + " / " + nb2 + " = " + result + "\n" + 
					"Modulus of this divisions is: " + modulusResult );
				}
				break;
				
				
			default:
				System.out.println("The selected number has no function, "
						+ "please select a number offered in the menu.");
				
			}
			
		} else if(slovo == 'c') {
			
			 System.out.println("In this case you will be able to use and manipulate arrays.");
			 System.out.println("Please enter the length of the array. ");
			int duzinaNiza = scan.nextInt();
			int[] niz = new int[duzinaNiza]; 
			
			System.out.println("This is a menu. "
					+ "Please enter the sequence number of the action "
					+ "you want the program to process for you. ");
			
			menu.add("1 - Middle value ");
			menu.add("2 - Even numbers");
			menu.add("3 - Odd numbers");
			menu.add("4 - The smallest number");
			menu.add("5 - The largest number");
			menu.add("6 - Sort Array");
			
			for (Object o: menu) {
				System.out.println(o);
			}
			
			int calculator = scan.nextInt();
			
			switch (calculator) {
			
			case 1:
				
				int sum = 0;
				for (int i = 0; i < niz.length; i++) {
					System.out.println("Enter array values. ");
					niz[i] = scan.nextInt();
					sum += niz[i];
				}
				
				double mv =  ((0.1 + sum) / duzinaNiza);
				System.out.println("The middle value is: " + mv);
				
				break;
				
			case 2: 
				int brojac = 0;
				for (int i = 0; i < niz.length; i++) {
					System.out.println("Enter arry values. ");
					niz[i] = scan.nextInt();

						if(niz[i]%2 == 0) {
							brojac++;		
						}					
				}
				System.out.println("Number of even nuber is: " + brojac);
				break;
				
			case 3:
				int brojac1 = 0;
				for (int i = 0; i<niz.length; i++) {
					System.out.println("Enter arry values. ");
					niz[i] = scan.nextInt();
					
					if (niz[i]%2 != 0) {
						brojac1++;
					}
				}
				System.out.println("Number of odd numbers are: " + brojac1);
				break;
				
			case 4:
				
				double najmanjiBroj = Double.MAX_VALUE;
				for (int i = 0; i<niz.length; i++) {
					System.out.println("Enter arry values. ");
					niz[i] = scan.nextInt();
					
					if (niz[i]<najmanjiBroj) {
						najmanjiBroj = niz[i];
					} 
				}
				System.out.println("Najmanji broj u nizu je: " + najmanjiBroj);
				break;
				
			case 5:
				
				double najveciBroj = Double.MIN_VALUE;
				for (int i = 0; i<niz.length; i++) {
					System.out.println("Enter arry values. ");
					niz[i] = scan.nextInt();
					
					if(niz[i]>najveciBroj) {
						najveciBroj = niz[i];
				}
		}
				System.out.println("The largest number in array is: " + najveciBroj);
				break;
				
			case 6:
				for(int i = 0; i<niz.length; i++) {
					System.out.println("Enter array values. ");
					niz[i] = scan.nextInt();
				}
				System.out.println("The original array is: ");
				
				for (int arr : niz) {
					System.out.println(arr + " ");
				}
				Arrays.sort(niz);
				System.out.println("The sorted arry is: ");
				for (int arr : niz) {
					System.out.println(arr + " ");
				}
				break;
				
				default :
					System.out.println("The selected number has no function, "
							+ "please select a number offered in the menu.");
			}
		} else {
			System.out.println("This character is unavalible, please try again.");
		}
		scan.close();	
	}

}
