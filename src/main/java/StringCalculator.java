
public class StringCalculator {
   public static int add(final String numbers) {
      int returnValue = 0;
      String[] numbersArray = numbers.split(",|\n"); 
      int num;
      for (String number : numbersArray) {
    	  
         if (!number.trim().isEmpty()) {
        	 
        	 num = Integer.parseInt(number.trim());
        	 
        	 if (num < 0)
        	 {
        		throw new IllegalArgumentException("number can't be negative"); 
        	 }
        	 else if (num <= 1000)
        	 {
        		 returnValue += num;
        	 }
         }
      }
      return returnValue;
   }
}