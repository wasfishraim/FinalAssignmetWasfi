package programming;

public class wasfi_pro2 {
	    public static void main(String[] args) 
	    { //Object oriented programming 
	        person p1 = new person();
	        p1.create(20, "wasfi", "wasfi@gmail.com", 'm',"0799929394"); 
	        
	        
	    }
	}

	//Object oriented programming 
	class person { 
		
		int id; 
	    String name; 
	    String email; 
	    char gender; 
	    String mob ;
	     
	  
	    public void create(int id, String name, String email, char gender, String string) 
	    { 
	        this.id = id; 
	        this.name = name; 
	        this.email = email; 
	        this.gender = gender; 
	        this.mob = string; 
	        System.out.println("your account has been created"); 
	        
	    } 
	    
	    

	    
	    
	    //Functional programming
	    public void traverseArray(int arr []) {
			
	    	for (int i = 0; i < arr.length; i++) {
	    	 System.out.print(arr[i] + " ");
	    			}
	    		}
	    
	    
	    //procedural programming
	   	 
	   private  void display(String text) {
	    	 System.out.println(text);
	    	 }
	    		

	    void printText(String text) {
		 System.out.println(text);
		 }
	    
	    
	    
	    
	    
			}




