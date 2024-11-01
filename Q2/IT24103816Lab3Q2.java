import java.util.Scanner;
	public class IT24103816Lab3Q2{
		public static void main(String[]args){
		double Salary,OTamount,OThours,OThourlyRate,TotalSalary;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the monthly salary:");
		Salary=input.nextDouble();
		System.out.print("Enter the number of OT hours:");
		OThours=input.nextDouble();
		System.out.print("Enter the OT hourly rate:");
		OThourlyRate=input.nextDouble();
		OTamount=OThours*OThourlyRate;
		TotalSalary=Salary+OTamount;
	System.out.println("The total salary including OT is:"+TotalSalary);
	}
}