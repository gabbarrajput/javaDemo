public class FizzBuzz{

  public static void main(String []args){
      
    for (int i = 1; i <= 100; i++) 
    {
      boolean divBy3 = i % 3 == 0;
      boolean divBy5 = i % 5 == 0;
      
      if (divBy3 && divBy5) 
      {
          System.out.println("FizzBuzz"); 
      } 
      else if (divBy3) 
      {
          System.out.println("Fizz"); 
      } 
      else if (divBy5) 
      {
          System.out.println("Buzz"); 
      } 
      else 
      {
          System.out.println(i);  
      }
    }
  }
}