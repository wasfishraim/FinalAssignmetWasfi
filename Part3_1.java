package programming;
import java.util.*;

public class Part3_1 {
	public static void main(String[] args) {
	    int conterOfMarks;
	    int totalofsum = 0;
	    int totalofclasses=0;
	    int numOfCourses;
		float  avgOfSemester,totalavg=0;
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number Semester");
		numOfCourses=scanner.nextInt();
		
		for(int j=0;j<numOfCourses;j++)		
		{
		 System.out.println("Enter number of subjects ");
		 conterOfMarks=scanner.nextInt();
			
		 int marks[] = new int[conterOfMarks];
         totalofclasses+=conterOfMarks;
		        
	   for(int i=0; i<conterOfMarks; i++) { 
			System.out.print("Enter Subjects  " +(i+1));
			marks[i]=scanner.nextInt();
			System.out.println();
		   
		           if(marks[i]<35) {
		        	   marks[i]=35;
		        	   
		           }
		           if(marks[i] >= 100) {
		        	   marks[i]=100;
		        	   
		           }
		           sum = sum + marks[i];
	}
		       
		       totalofsum= sum+totalofsum ;
		       avgOfSemester=(sum/conterOfMarks)/25;
		        System.out.println("The student Grade is:  :"+ avgOfSemester);
		        avgOfSemester=0;
		        sum=0;

		        

		}
		totalavg=totalofsum/totalofclasses;
		
		
		 scanner.close();
		 System.out.println("the GBA'S IS : " +totalavg/25);
		        
		        

		  
		    }
}
