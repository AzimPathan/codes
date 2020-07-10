import java.util.*;

class NumberOfNegativeSumArrays
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter no. of elements : ");
        n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int negSAs= 0, currSum = 0;
        for(int i = 0; i < n; i++)
        {
            currSum = a[i];
            if(currSum < 0)
                negSAs++;
            for(int j = i+1; j < n; j++)
            {
                currSum += a[j];
                if(currSum < 0)
                    negSAs++;
            }
        }
        System.out.println("Number of negative subarrays : " + negSAs);
	}
}