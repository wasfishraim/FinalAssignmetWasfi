package programming;
import java.nio.channels.NonReadableChannelException;
import java.util.Arrays;
import java.util.Random;
public class Part1 {

	//================================================================//
	//
	
	public static void linearSearch(int valueToSearch ,int arr [] ) {
	//Start Search using for loop and this for Depends its work on length of array
		for (int i = 0; i < arr.length; i++) {
	//compare if Value of Index and valueToSearch is equal 
			if (arr[i] == valueToSearch) {
	//if equal Print (Value is found !)	 
				System.out.println("Value is found !");
    //Print index of Value  
				System.out.println("Index of " + valueToSearch + " is: " + i);
	//Stop Search
				return;
			}
		}
	//if not found print (is not found) 
		System.out.println(valueToSearch + " is not found!!");
	}
	

	
//==================================================================================//
	
	public static void Binarysearch(int[] arr, int element) {
		//you must sort array before start because the Binary search is not work without sort array
		 Arrays.sort(arr);
		 //declare first index
		 int first = 0;
		 //declare last index the last index in array
	     int last = arr.length-1;
	     //We use the first and last to find the  mid
	     int elementPos = -1;
	     //start search with while 
        while (first <= last) {
        //declare mid using first index and last index 
	        int mid = (first + last) / 2;
	    //compare if Value of mid and element is equal 
	        if (element == arr[mid]) {
	    //the elementPos must be changed because after while the compare with -1  	
	            elementPos = mid;
	    //Print IS found  
	            System.out.println("Value is found !");
	    //Print position of element  
				System.out.println("Index of " + element + " is: " + elementPos);
	    //stop while because the element is found  
	            break;
	        } 
	     // compare if element is less than mid Value  
	        else if (element < arr[mid]) {
	     // the last equal (mid -1) because the element in first part   
	        	last = mid-1;
	        } 
	     // compare if element is greater than mid Value  
	        else if (element > arr[mid]) {
	      // the last equal (mid +1) because the element in second part  
	        	first = mid+1;
	        }
        }
        //compare if not found the not fond in code equal -1
        if(elementPos==-1)
        System.out.println("Value is not found !");
	
}
	
	
	
	public static void main(String[] args) {
	//call random class in java to create array with random Values 
		Random random=new Random();
		//create array size of array 1000 
		 int[] intArray = new int[1000];
		 //get random Values using for loop  
		 for(int i=0; i<intArray.length;i++) {
		int randomElement = random.nextInt(1000)+1;
		// get random Values and put in array  
             intArray[i]=randomElement;
        //Print value 
             System.out.println(intArray[i]);
		 }
		 
		 
		 
		 Part1.linearSearch(222, intArray);
		 
		 Part1.Binarysearch(intArray,222);
		

	
	
	}
}
