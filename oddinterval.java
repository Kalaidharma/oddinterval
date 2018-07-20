import java.util.Scanner;
public class oddinterval {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,n1,n2,a;
		n1=sc.nextInt();
		n2=sc.nextInt();
		//int arr[]=new int[50];
		for(i=n1+1;i<n2;i++){
			if(i%2!=0){
				a=i;
				System.out.println(a);
			}
		}
	}
}
