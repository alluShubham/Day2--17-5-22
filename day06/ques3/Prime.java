package com.masai.day06.ques3;



public class Prime {
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and
		int k=0;
		int[] A= new int[4];
	
	
		for (int i = 0; i < inputArray.length; i++) {
			int count =0;
			
			for (int j = 1; j <= (inputArray[i]); j++) {
				if(inputArray[i]%j==0)
				{
					
//					System.out.println(inputArray[i]);
					count++;
				}
				
			}
			if(count==2) {
				System.out.println("prime : " + inputArray[i] );
				A[k]=inputArray[i];
				k++;
			}
			
		}
		return A;
		//determine each element whether it is prime or not
		//create a second array of int
		//if any number is prime inside the inputArray then add that number inside the second
		//array
		//and return the second array
		//if no prime number is found then return the empty array.
		}

	public static void main(String[] args) {
		Prime p1= new Prime();
		//Create the object of Main class
		//on the object of Main class call the findAndReturnPrimeNumbers method
		//by supplying the following array as the parameter
		int[] arr = {10,12,5,50,11,14,15};
		int[] arr1 =p1.findAndReturnPrimeNumbers(arr);
		
//		System.out.println(arr1[0]);
		//print each element from the returned array of findAndReturnPrimeNumbers method
		//if findAndReturnPrimeNumbers method returns an empty array then print the following
		// "Prime number not found in the supplied Array"
//		for (int i = 0; i < arr1.length; i++) {
//			if(arr1[i]!=0)
//			{
//				System.out.println("Prime no." + arr1[i]);
//			}
//		}
	}

}
