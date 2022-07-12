package variables;

public class Narrowing1
{ 
    public static void main(String[] args) 
    { 
      double d = 120.04;  
      long l = (long)d;   
      int i = (int)l;  
      System.out.println("Double value "+d); 
      System.out.println("Long value "+l);  
      System.out.println("Int value "+i);  
      
     byte b =123;
     byte c=23;
     byte e= (byte)(b+c);
     System.out.println(e);
    }  
}
