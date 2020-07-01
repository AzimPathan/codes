import java.util.*;

class LargestSumHourglass
{
	public static void main(String[] args)
	{
		// int[][] a = {
		// 		{-1, -1, 0, -9, -2, -2},
		// 		{-2, -1, -6, -8, -2, -5},
		// 		{-1, -1, -1, -2, -3, -4},
		// 		{-1, -9, -2, -4, -4, -5},
		// 		{-7, -3, -3, -2, -9, -9},
		// 		{-1, -3, -1, -2, -4, -5}
		// 	};

		int [][] a = new int[6][6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6*6 matrix : ");
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}		

		// Print hourglass
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<6; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		int sum=0, largestSum=0;

		// Find largest hourglass
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
			 	sum +=	a[i][j] + a[i][j+1] + a[i][j+2] +
				 		a[i+1][j+1] +
				 		a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
				System.out.print(a[i][j] + " ");
				System.out.println("\tSum : " + sum);
				if(i==0 && j==0)
					largestSum = sum;
				if(sum > largestSum)
					largestSum = sum;
				sum = 0;
			}
			System.out.println("Largest sum : " + largestSum);
			System.out.println();
		}
	}
}