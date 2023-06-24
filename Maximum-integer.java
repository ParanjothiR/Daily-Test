import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k[]=new int[n];
		int min=-1;
		int sum=0;
		int count=0;
		for(int i=0;i<n;i++){
		    k[i]=sc.nextInt();
		    if(k[i]>min){
		        min=k[i];
		    }
		    
		}
		for(int i=0;i<n;i++){
		    int h=k[i]*m;
		    if(h<=min){
		        count++;
		    }
		}
		if(count>=n-1){
		    System.out.print(min);
		}else{
		    System.out.print("-1");
		}
		

	}
}