package com.oca8.tests.chapter2;

public class Chapter2RQ4 {
    /*4. What change would allow the following code snippet to compile? (Choose all that apply)
3: long x = 10;
4: int y = 2 * x;
A. No change; it compiles as is.
B. Cast x on line 4 to int.
C. Change the data type of x on line 3 to short.
D. Cast 2 * x on line 4 to int.
E. Change the data type of y on line 4 to short.
F. Change the data type of y on line 4 to long.

answer : B, C, D, F. The code will not compile as is, so option A is not correct. The value 2 * x
is automatically promoted to long and cannot be automatically stored in y, which is
in an int value. Options B, C, and D solve this problem by reducing the long value to
int. Option E does not solve the problem and actually makes it worse by attempting
to place the value in a smaller data type. Option F solves the problem by increasing the
data type of the assignment so that long is allowed.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = 10;
	    int y = 2 * x;
	}

}
