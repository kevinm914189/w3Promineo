package w3Promineo;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1 
  	  int num1 = -75;
  	  int num2 = 100;
  	  int num3 = 60;
		System.out.println("1. " + returnSum(num1, num2, num3));

		
		//2 
		String userWord = "stop";
		int numTimes = 3;
		System.out.println("2. " + repeatWord(userWord,numTimes));

		
		//3
		int num31 = 333;
        if (((num31 % 3) == 0) && ((num31 % 5) == 0)) {
            System.out.println("FizzBuzz");
        } else if ((num31 % 3) == 0){
            System.out.println("3. " + "Fizz");
        } else if ((num31 % 5) == 0){
            System.out.println("Buzz");
        } else {
            System.out.println("Hello world!");
        }
        
        
        //4
        int a = 10;
        int b = 10;
        int c = 10;
        System.out.println("4. " + returnSum4(a,b,c));
        
        
        //5
        double product1 = 19.99;
        double product2 = 22.00;
        double product3 = 4.55;
        double taxRate = .07;
		System.out.println("5. " + "Your order total is: $" + String.format("%,.2f", orderTotal(product1, product2, product3, taxRate)));
        
		
		//6
		int a6 = 5;
		int b6 = 4;
		int c6 = 3;
		int d6 = 2;
		int e6 = 1;
		int[] mainArray = createArray(a6, b6, c6, d6, e6);
		System.out.println("6. " + "The third number in your array is: " + mainArray[2]);
		
		
		//7
		int digits = 10;
		int sumAll = sumOfDigits(digits);
		System.out.println("7. " + "The sum of all digits for the value " + digits + " is " + sumAll + ".");
		
		
		
		//8
		String password = "thisshouldwork!";
        boolean meetsRequirement = passwordChecker(password);
		if (meetsRequirement) {
		    System.out.println("8. " + password + " meets the requirements.");
		} else {
		    System.out.println(password + " does not meet the requirements.");
		}
		
		
		//9
		String[] names;
		names = new String[5];
		names[0] = "Jose";
		names[1] = "James";
		names[2] = "Roberto";
		names[3] = "Theodore";
		names[4] = "Fr3d";
		
		int avgLength = avgNameLength(names);
		System.out.println("9. " + "The average name length is " + avgLength + ".");
		
		
		//10
		int length = 4;
		int width = 4;
		int perimeter = rectanglePerimeter(length, width);
		System.out.println("10. " + "The rectangle has a perimeter of " + perimeter + ".");
		

}
	
	
//---------------------------------------------------------------------------

	 //1 method
	
     static int returnSum(int num1, int num2, int num3) {
  		return num1 + num2 + num3;
     }
     
     
     //2 method
 	static String repeatWord(String userWord, int numTimes) {
	String conc = "";
        for (int i = 0; i < numTimes; i++){
            conc += userWord;
        }
        return conc;
	}
 	
 	
     //3 has no relevant method

     //4 method
    static int returnSum4(int x, int y, int z){
    	int answer = x + y + z;
        return answer;
    }
     
    
     //5 method
    	static double orderTotal(double product1, double product2, double product3, double taxRate) {
            double i = (product1 + product2 + product3);
            double j = i * taxRate;
            return i + j;   	
            }
    	
    	
    //6 method
    	static int[] createArray(int a6, int b6, int c6, int d6, int e6) {
    		int[] i6 = new int[5];
    		i6[0] = a6;
    		i6[1] = b6;
    		i6[2] = c6;
    		i6[3] = d6;
    		i6[4] = e6;
    	    return i6;	
    	}
    	
    	
    //7 method
    	static int sumOfDigits(int digits) {
    		int a7 = 0;
    		while(digits > 0) {
    			a7 += digits % 10;
    			digits /= 10;
    		}
    		return a7;
    	}
    	
    	
    //8 method
    	static boolean passwordChecker(String password) {
    		if (password.length() >= 8 && 
    			    (password.contains("!") || password.contains("$") || password.contains("%") || password.contains("&"))) {
    			         return true;
    			     } else {
    			return false;
    			     }
    	}
    	
    	
    //9 method
    	static int avgNameLength(String[] names) {
            String j = "";
            for(int i = 0; i < names.length; i++){
                j += names[i];
            }
             return(j.length() / 5);
    	}
    	
    	
    //10 method
    	public static int rectanglePerimeter(int length, int width){
    	    return((length * 2) + (width * 2));
    	}


}

