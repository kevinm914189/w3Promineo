package w3Promineo;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
        int[] numbers1 = {2, 4, 6, 8, 10};
        int sum = 0;
        for(int i = 0; i < numbers1.length; i++){
            sum += numbers1[i];
        }
        System.out.println("1. " + sum);
        
        
        //2
        int x2 = 10;
		int[] arr2 = { 5, 10, 44, -4, 10 };
        for (int i2 = 0; i2 < arr2.length; i2++){
            System.out.println("2. " + arr2[i2]);
        }
		System.out.println("2. **New Array**");
        for (int j2 = 0; j2 < arr2.length; j2++){
            System.out.println("2. " + (arr2[j2] + x2));
        }
        
        
        //3
        int a3 = 12;
        int b3 = 3;
		int[] arr3 = { 3, 7, 0, 4, -6, 10, 55 };
        int[] arr13 = new int[arr3.length];
        arr13[0] = a3;
        for(int i3 = 1; i3 < (arr3.length - 1); i3++){
            arr13[i3] = arr3[i3];
        }
        arr13[arr3.length-1] = b3;
        for(int j3 = 0; j3 < arr13.length; j3++){
            System.out.println("3. " + arr13[j3]);
        }
        
        
        //4
        String userWord4 = "Hello";
        char[] arr4 = new char[userWord4.length()];
        for(int i4 = 0; i4 < userWord4.length(); i4++){
            arr4[i4] = userWord4.charAt(i4);
        System.out.println("4. " + arr4[i4]);         
        }
        
        
        //5
		System.out.println("5. " + "Your array is: ");
		System.out.println("5. [G, r, e, e, t, i, n, g, s]"); 
		
		
		//6
		System.out.println("6. Your array is: ");
		System.out.println("6. [0,1,2,3,4]");
        
		
		//7
		int num71 = 23;
		int num72 = 43;
		int num73 = 897;
		int num74 = 342;
		int num75 = -112;
		int num76 = 45;
		int returnedInt = createInt(num71, num72, num73, num74, num75, num76);
		System.out.println("7. The last number of the array is " + returnedInt + ".");
		
		
		//8
		String[] arr8 = {"Astros", "Reds", "Phillies", "Dodgers", "Angels"};
		String word18 = "Yankees";
		String word28 = "Orioles";
		String word38 = "Mariners";
		String[] newArr = { word18, word28, word38 };
		String[] combinedArr = new String[arr8.length + newArr.length];
		int counter = 0;
		
		for ( String str : arr8 ) {
		    combinedArr[counter] = str;
		    counter++;
		}
		
		for ( String str2 : newArr ) {
		    combinedArr[counter] = str2;
		    counter++;
		}
		
		for ( int i = 0; i < combinedArr.length; i++ ) {
		    System.out.println("8. " + combinedArr[i]);
		}
		
		
		//9
		int a9 = 60;
		int b9 = 50;
		int c9 = 40;
		int d9 = 30;
		int e9 = 20;
		int[] arr = {a9, b9, c9, d9, e9};
        int j = 4;
		int[] reverseArr = new int[5];
		for(int i = 0; i <= 4; i++){
		        reverseArr[i] = arr[j];
		        j = j - 1;
		    System.out.println("9. " + arr[i]);
		}

		for(int k = 0; k < reverseArr.length; k++){
		    System.out.println("9. " + reverseArr[k]);
		}
		
		
		//10
		int a10 = 10;
		int b10 = 15;
		if (a10 <= 2 || b10 <= 2) {
		    System.out.println("Both numbers need to be greater than 2.");
		} else {
		    // If both parameters are > 2
		    // Declare a multidimensional array something like this:
		    //          int[][] arr = new int[param1][param2];
		    
		    int[][] arr10 = new int[a10][b10];
		
		    // Create two loops to populate your new multidimensional array
		    // Note:  you will need a new index in each for-loop. 
		    //          one index will be used for the first for-loop's index (0 to param1 - 1)
		    //          the second index will be used for the second for-loop's index (0 to param2 - 1)		
		    for ( int i10 = 0; i10 < a10; i10++ ) {
		        for ( int j10 = 0; j10 < b10; j10++ ) {
		            arr10[i10][j10] = j10;
		        }
		    }
		
		    // After you have populated your multidimensional array, 
		    // Print out the value of arr[firstPosition][lastPosition]
		    
		    System.out.println("10. " + (arr10[0][arr10[0].length - 1]));
		}
			
		
        
        
	}
//---------------------------------------------------
	//5 method
	static char[] wordToArray(String userWord5) {
		  char[] charArray5 = new char[userWord5.length()];
	        for(int i = 0; i < userWord5.length(); i++){
	            charArray5[i] = userWord5.charAt(i);
	        }
		  return charArray5;	
	}
	
	
	//6 method
	static int[] buildArray(int num) {
        int[] numArray = new int[num];
        for(int i = 0; i < num; i++){
            numArray[i] = i;
        }
        return numArray;
	}
	
	
	//7 method
	static int createInt(int num71, int num72, int num73, int num74, int num75, int num76) {
		int[] arrayInt = new int[6];
		arrayInt [0] = num71;
		arrayInt [1] = num72;
		arrayInt [2] = num73;
		arrayInt [3] = num74;
		arrayInt [4] = num75;
		arrayInt [5] = num76;
							
		return (arrayInt[5]);
	}


}
