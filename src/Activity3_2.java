import java.util.Scanner;

public class Activity3_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.print ("\n\n\tRegular Hours Worked: ");
		double hours = sc.nextDouble();
		System.out.print ("\n\tOvertime: ");
		double ot = sc.nextDouble();
		System.out.print ("\n\tTotal Sales: ");
		double tsales = sc.nextDouble();

		double wage = 7.25, op = 1.5, tsal=hours*wage, top=op*(ot*wage);

		System.out.print ("\n\n\t\tRegular Salary: $" + tsal);
		System.out.print ("\n\n\t\tOvertime Pay: $" + top);

		if ((tsales>=1.00)&&(tsales<=99.99)) {

			double comm = tsales*0.5;
			System.out.print ("\n\n\t\tCommission: $" + comm + "\n\n");
			System.out.print ("\n\n\t\tTotal Salary: $" + (tsal+top+comm) + "\n\n");
			
		}
		else if ((tsales>=100.00)&&(tsales<=299.99)) {

			double comm = tsales*0.10;
			System.out.print ("\n\n\t\tCommission: $" + comm + "\n\n");
			System.out.print ("\n\n\t\tTotal Salary: $" + (tsal+top+comm) + "\n\n");
			
		}
		else if (tsales>=300.00) {

			double comm = tsales*0.15;
			System.out.print ("\n\n\t\tCommission: $" + comm + "\n\n");
			System.out.print ("\n\n\t\tTotal Salary: $" + (tsal+top+comm) + "\n\n");
			
		}
		else{

			double comm = 0;
			System.out.print ("\n\n\t\tCommission: $" + comm + "\n\n");
			System.out.print ("\n\n\t\tTotal Salary: $" + (tsal+top+comm) + "\n\n");
		}
	}
}