package com.tnsif.exceptionhandling;

public class NestedTry {
	public static void check() {
		String str = "tns";
		int arr[] = null;
		int y = 6;
		try {//outer try
			//int z = y / 0;
			try {
				System.out.println(arr[0]);
				System.out.println(str.charAt(y));
			} catch (StringIndexOutOfBoundsException e) {//inner catch
				System.out.println("exception caught" + e.getMessage());
			} catch (NullPointerException e) {//inner catch
				System.out.println("exception caught" + e.getMessage());
			    //System.exit(0);//if we write this method inside the catch block then the finally block wont be executed 
			}
			finally {
				System.out.println("executed whether exception occurs or not");
				
			}
		} catch (ArithmeticException e) {//outer catch
			System.out.println("exception caught" + e.getMessage());
		}
		
	}
}
