import java.util.*;
class AllException 
{ 
    public static void main(String args[]) 
    { 
        try { 
		//Array
		    //int a[] = new int[5]; 
            //a[6] = 9;
			//String
            String p = "This is like chipping "; // length is 22 
            char k = p.charAt(24); // accessing 25th element 
            System.out.println(k);
            //Arithemetic
			int l = 30, m = 0; 
            int n = l/m;  // cannot divide by zero 
            System.out.println ("Result = " + n);
			//null value
			String b = null;  
            System.out.println(b.charAt(0)); 			
        } 
        catch(StringIndexOutOfBoundsException e)
		{ 
            System.out.println("StringIndexOutOfBoundsException"); 
        } 
		catch(ArrayIndexOutOfBoundsException e)
		{ 
            System.out.println ("Array Index is Out Of Bounds");
		} 
		
		catch(NullPointerException e)
		{ 
            System.out.println("NullPointerException.."); 
        } 
} 
}