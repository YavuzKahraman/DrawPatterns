package DrawingPatterns;

public class PatternsWithStars {
	
/*
	*
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 
 * */
	public static void diamondShapewithStars(int n) {
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n-1; i >=1 ; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*butterfly shape
	 * 
	 *             *
	 * *         * *
	 * * *     * * *
	 * * * * * * * *
	 * * *     * * *
	 * *         * *
	 *             * 
	 * 
	 * */
	
	public static void butterflywithstars(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 2*(n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n-1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 2*(n-i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
	/*
	 * *
	 * * *
	 * * * * 
	 * * * * *
	 * * * * * */
	public static void leftAlignedStarPattern(int n) {
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	/* * * * * * *
	 * * * * * *
	 * * * * *
	 * * * *
	 * * *
	 * *
	 */
	public static void leftAlignedDecStarPattern(int n) {
		for (int i = n; i >=1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	/*
	  	----*
		---**
		--***
		-****
	 	*****
	 */
	public static void rightAlignedincStarPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("-");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	
	******
	 *****
	  ****
	   ***
	    **
	     *
	*/
	public static void reverseHalfPyramidDecreasewithStars(int n) {
		for (int i = n; i >=1; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
/*
 	*    
   * * 
  * * * 
 * * * * 
* * * * *

*/
	public static void triangleStarIncPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n-i; j >=1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
/* reverse star triangle

 * * * * *
  * * * *
   * * *
    * *   
     *
*/
	public static void reverseTriangleStars(int n) {
		for (int i = n; i >=1; i--) {
			for (int j = 1; j <= n- i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
/* Diamond	
 	 *    
    * * 
   * * * 
  * * * * 
 * * * * *
  * * * *
   * * *
    * *   
     *
*/
	public static void diamondStarsShape(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n-1; i >= 1; i--) {
			for (int j = 1; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
/*
 1 2 3 4 5
  2 3 4 5
   3 4 5
    4 5
     5 
 */
	public static void triangularNumberReverse(int n) {
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <=n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
/* timecounterwithNumbers

1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
    5 6 
   4 5 6 
  3 4 5 6 
 2 3 4 5 6 
1 2 3 4 5 6
 
 */
	
	public static void timeCounterwithNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		for (int i = n-1; i >=1; i--) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <=n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
/*  hollow triangle

        *
       * *
      *   *
     *     *
    * * * * *
*/
	public static void hollowTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <=n; j++) { // option: j<n
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				if (j == 1 || i== n || j== (2*i-1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diamondShapewithStars(5);System.out.println();
		butterflywithstars(5);System.out.println();
		leftAlignedStarPattern(5);System.out.println();
		leftAlignedDecStarPattern(5); System.out.println();
		rightAlignedincStarPattern(5); System.out.println();
		reverseHalfPyramidDecreasewithStars(5);System.out.println();
		triangleStarIncPattern(5);System.out.println();
		reverseTriangleStars(5);System.out.println();System.out.println();
		diamondStarsShape(5);System.out.println();
		triangularNumberReverse(5);System.out.println();
		timeCounterwithNumbers(6);System.out.println();
		hollowTriangle(6);System.out.println();


	}



}
