import java.util.Scanner;
	public class IT24103816Lab3Q1A{
		public static void main(String[]args){
		double PricePerKilo,NoKilo,TotalAmount;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the price of 1kg of rice:");
		PricePerKilo=input.nextDouble();
		System.out.print("Enter the number of kilograms you want to buy:");
		NoKilo=input.nextDouble();
		
		TotalAmount=NoKilo*PricePerKilo;
		
		System.out.println("The total amount is:"+TotalAmount);
		}
	}
		
		
		