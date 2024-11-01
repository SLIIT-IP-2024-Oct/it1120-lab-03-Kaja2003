import java.util.Scanner;
	public class IT24103816Lab3Q1B{
		public static void main(String[]args){
		double PricePerKilo,NoKilo,TotalAmount,LastPrice;
		double TheDiscount=10.0/100.0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the price of 1kg of rice:");
		PricePerKilo=input.nextDouble();
		System.out.print("Enter the number of kilograms you want to buy:");
		NoKilo=input.nextDouble();
		
		TotalAmount=NoKilo*PricePerKilo;
		LastPrice=TotalAmount-(TotalAmount*TheDiscount);
		
		
		System.out.println("The total amount with 10% Discount is:"+LastPrice);
		}
	}