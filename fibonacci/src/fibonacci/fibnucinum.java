package fibonacci;

public class fibnucinum {

	public static void main(String[] args) {
		
		  int f1 = 0, f2 = 1, i; 
		  int n=12;
	      
	        
	      
	        for (i = 1; i <= n; i++) 
	        { 
	            System.out.print(f2+" "); 
	            int next = f1 + f2; 
	            f1 = f2; 
	            f2 = next; 
	        } 
	    } 

	}


