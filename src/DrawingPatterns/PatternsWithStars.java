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
	public static void rightAlignedStarPattern(int n) {
		for (int i = n; i >=1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diamondShapewithStars(5);System.out.println();
		butterflywithstars(5);System.out.println();
		leftAlignedStarPattern(5);System.out.println();
		rightAlignedStarPattern(5);


	}



}
