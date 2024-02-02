package DrawingPatterns;

import java.util.Iterator;

public class ButterflyStarPatterns {
	
	//Butterfly star pattern
	/*           *
	 * *       * *
	 * * *   * * *
	 * * * * * * *
	 * * *   * * *
	 * *       * *
	 *           *
	 */
	
	public static void bflyShape(int n) {
		int i, j;
 
        // outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
 
            // inner loop to print spaces
            int spaces = 2 * (n - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
 
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
 
            System.out.println();
        }
 
        // outer loop to handle lower part
        for (i = n; i >= 1; i--) {
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
 
            // inner loop to print spaces
            int spaces = 2 * (n - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
 
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
 
            System.out.println();
        }
	}

	/*
	 * *****
	 * *****
	 * *****
	 * *****
	 * *****
	 * 
	 * */
	
	public static void squareFilledStars(int n) {
		int i,j;
		for (i = 1; i <=n; i++) {
			for (j = 1;  j<= n ; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	/*right aligned arrow edge
	 * 1
	 * 22
	 * 333
	 * 4444
	 * 55555
	 * 55555
	 * 4444
	 * 333
	 * 22
	 * 1
	 * *****
	 * */
	public static void rightHalfPyramid(int n) {
		int i, j ;
		for(i = 1; i<=n; i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		//System.out.println("****************");
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	/*
	 * 55555
	 * 4444
	 * 333
	 * 22
	 * 1
	 * 
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * 
	 * */
	
	public static void leftAlignedDNumbers(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
	/* right aligned numbers
	 * . . . 1
	 * . . 2 2
	 * . 3 3 3
	 * 4 4 4 4
	 * 
	 * */
	
	public static void rightAlignedNumbers(int n) {
		int i, j, k;
		for(i=1; i<=n; i++) {
			for(j=1; j <= n-i;j++) {
				System.out.print("."+" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	/*reverse left aligned numbers
	 * 5 5 5 5 5
	 * 4 4 4 4
	 * 3 3 3
	 * 2 2
	 * 1
	 *   
	 * */
	public static void reverseleftAlignedNumbers(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "+(n-i)+" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" . ");
			}
			System.out.println();
		}
	}
	
	/*
	 * reverse triangular numbers
	 *  5 5 5 5 5
	 *   4 4 4 4
	 *    3 3 3
	 *     2 2
	 *      1
	 * */
	public static void reverseTriangularNumbers(int n) {
		for (int i = n; i > 0	; i--) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bflyShape(5);System.out.println();
		squareFilledStars(5);System.out.println();
		rightHalfPyramid(5);System.out.println();
		leftAlignedDNumbers(5);System.out.println();
		rightAlignedNumbers(5);System.out.println();
		reverseleftAlignedNumbers(5);System.out.println();
		reverseTriangularNumbers(5);System.out.println();
	}

}
