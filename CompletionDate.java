import java.util.Calendar; 
import java.util.Scanner; 
  
public class CompletionDate 
{ 
    public static void main(String[] args) 
    { 
        Calendar cal = Calendar.getInstance(); 
        Scanner sc = new Scanner(System.in); 
  
        // Current Date 
        System.out.println("Today's date is: " + 
                           cal.getTime()); 
  
        // Number of days to add 
        System.out.println("Enter number of days to complete the task: "); 
        int days = sc.nextInt(); 
  
        // Adding the days 
        cal.add(Calendar.DATE, days); 
  
        // Estimated Date 
        System.out.println("Estimated Completion Date and Time is: " + 
                           cal.getTime()); 
    } 
}