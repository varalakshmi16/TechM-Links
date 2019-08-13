import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class ProgramCode 
{
	public static String getMonth(String studentsList){
		
		// Write a program to accept a list of students with DOB as CSV values and perform the following tasks.
		// Find the younger student and return his month of Birth
			//Hint : Map , SimpleDateFormat ,StringTokenizer

	
		
		String str1,str3;
		String str2;
		SimpleDateFormat newDateFormat;
		Date myDate=new Date();
		Map<String,String> tree2=new TreeMap<String,String>();
		StringTokenizer tokendate;
		StringTokenizer token=new StringTokenizer(studentsList,",");
		while(token.hasMoreTokens()){
			
			str1=token.nextToken();
			tokendate=new StringTokenizer(str1,"|");
			while(tokendate.hasMoreTokens()){
					str2=tokendate.nextToken();	
					str3=tokendate.nextToken();
					try {
						Date d=new SimpleDateFormat("dd-MM-yyyy").parse(str3);
						if(d.before(myDate))
						{
							myDate=d;		
						}
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					try {
						Date d=new SimpleDateFormat("dd-MM-yyyy").parse(str3);
						if(d.after(myDate))
						{
							myDate=d;		
						}
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
			}
		}
		String r=new SimpleDateFormat("MMMM").format(myDate);
		return r;
		
	}}