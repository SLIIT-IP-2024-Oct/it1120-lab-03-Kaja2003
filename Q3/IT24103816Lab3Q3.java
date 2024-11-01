import java.util.Scanner;
	public class IT24103816Lab3Q3{
		public static void main(String[]args){
		//initialization of variables
		int amount=0;
		int count5000=0;
		int count1000=0;
		int count500=0;
		int count200=0;
		int count100=0;
		int count50=0;
		int count20=0;
		int count10=0;
		int count05=0;
		int count02=0;
		int count01=0;
		
		Scanner input=new Scanner(System.in);//To read the input
		System.out.print("Enter the Rupee amount:");
		amount=input.nextInt();
		
		count5000=amount/5000; //calculate the note of 5000
		amount=amount%5000;
		
		count1000=amount/1000;
		amount=amount%1000;
		
		count500=amount/500;
		amount=amount%500;
		
		count200=amount%200;
		amount=amount%200;
		
		count100=amount/100;
		amount=amount%100;
		
		count50=amount/50;
		amount=amount%50;
		
		count20=amount/20;
		amount=amount%20;
		
		count10=amount/10;
		amount=amount%10;
		
		count05=amount/05;
		amount=amount%05;
		
		count02=amount/02;
		amount=amount%02;
		
		count01=amount/01;
		amount=amount%1;
		
		System.out.println("5000notes:"+count5000);
		System.out.println("1000notes:"+count1000);
		System.out.println("500notes:"+count500);
		System.out.println("200notes:"+count200);
		System.out.println("100notes:"+count100);
		System.out.println("50notes:"+count50);
		System.out.println("20notes:"+count20);
		System.out.println("10notes:"+count10);
		System.out.println("05notes:"+count05);
		System.out.println("02notes:"+count02);
		System.out.println("01notes:"+count01);
		}
		}
		