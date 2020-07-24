import java.util.*;

/*
	Staircase Pattern
	     #
	    ##
	   ###
      ####
	 #####
	######
*/

class StaircasePattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n, i, j, k;
		n = sc.nextInt();

		// For traversing each output line
		for(i = 0; i < n; i++)
        {
        	// For printing spaces
            for(j = 0; j < n-1-i; j++)
            {
                System.out.print(" ");
            }
            // For printing hash
            for(k = 0; k < n-j; k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
	}
}