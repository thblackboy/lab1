import java.util.Arrays;
import java.util.Scanner;
class PrCisla{
	int[] arr = new int [10];
	int SIZE =10;
	int k=-1;
	
	void addnum(int n){
		k++;
		if(k>=SIZE){
			SIZE*=2;
			int[] arr2=new int[SIZE];
			arr2=Arrays.copyOf(arr,SIZE);
			arr=arr2;
		}
		arr[k]=n;
		System.out.println(n);
	}

	void checknum(int n){
		boolean chk=true;
		for (int i=1;i<=k;i++) 
			if(n%arr[i]==0){
				chk=false;
				break;
			}

		if(chk)
			addnum(n);
	}
}

public class Primes{

	public static void main (String[] args)
	{
		PrCisla nums = new PrCisla();
		Scanner in = new Scanner(System.in);
		int lastnum = in.nextInt();
		for(int i=1;i<lastnum;i++)
			nums.checknum(i);
	}

}