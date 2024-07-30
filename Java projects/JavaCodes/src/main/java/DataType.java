
public class DataType {
	
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int a= 10;  
       char s= 's';  
       float number = 3.2f;
       double number1 = 5.5;
       Boolean b = true;  
       System.out.println("Integer:" +a+ "\nCharacter:" +s);  
       System.out.println("\nFloat:" +number+ "\nDouble:" +number1+ "\nBoolean:" +b);  
       
       int i=243;
       long l=i; ///implicit=widening
       System.out.println("l:" +l);
       int j=120;
       byte k=(byte)j; //explicitly=narrowing
       System.out.println("k:" +k);
       
       
       
    

	}

}
