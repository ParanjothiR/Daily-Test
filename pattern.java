import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=n;
		int c=0;
		for(int i=0;i<n;i++){
		    for(int j=0;j<k;j++){
		        if(i==0){
		            System.out.print("* ");
		        }else if(i<n-1){
		            if(j<i){
		                System.out.print("- ");
		            }else if(i==j || j==k-1){
		                System.out.print("* ");
		            }else{
		                c++;
		                System.out.print(c+" ");
		            }
		        }else{
		            if(j<n-1){
		                    System.out.print("- ");
		            }else{
		                System.out.print("* ");
		            }
		        }
		    }
		    System.out.println();
		    k++;
		}

	}
}