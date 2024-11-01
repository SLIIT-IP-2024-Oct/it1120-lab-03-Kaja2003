import java.util.Scanner;
	public class IT24103816Lab3Q4{
	public static void main(String[]args){
	int number,dight1,dight2,dight3,dight4,dight5;
Scanner input=new Scanner(System.in);
System.out.print("Enter a five-dight number:");
number=input.nextInt();

dight1=number/10000;
number=number%10000;

dight2=number/1000;
number=number%1000;

dight3=number/100;
number=number%100;

dight4=number/10;
number=number%10;

dight5=number;

System.out.print(+dight1);
System.out.print(" "+dight2);
System.out.print(" "+dight3);
System.out.print(" "+dight4);
System.out.print(" "+dight5);
}
}

		