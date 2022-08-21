import java.time.LocalDate;
import java.util.Scanner; 

public class calday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in) ;
		System.out.println("enter the date in the form o DD/MM/YYYY");
		int date = scan.nextInt(); 
		int month =scan.nextInt(); 
		int year = scan.nextInt();
		LocalDate ldn= LocalDate.now(); 
		
		System.out.println("todays date is "+ldn);
		/*finday(date,month,year);*/
	
