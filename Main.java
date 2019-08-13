import java.text.ParseException;

public class Main 
{
	public static void main(String[] args) throws ParseException 
	{
		String studentList="zaheer|10-8-2000,raju-|11-03-2000,anna|21-04-2001,balu|13-05-2002,samar|20-05-2000,nithila|17-10-2004";
		System.out.println(ProgramCode.getMonth(studentList));		
	}
}
