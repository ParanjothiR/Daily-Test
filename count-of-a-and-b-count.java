import java.util.*;
public class Main {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String m=sc.next();
		int l=m.length();
		int count=0;
		for(int i=0;i<l;i++){
		    if(m.charAt(i)=='a'){
		        count++;
		        if(i==l-1 || m.charAt(i+1)=='b'){
		            System.out.print(count+""+"a");
		            count=0;
		        }
		    }
		    if(m.charAt(i)=='b'){
		        count++;
		        if(i==l-1 || m.charAt(i+1)=='a'){
		            System.out.print(count+""+"b");
		            count=0;
		        }
		    }
		}

	}
}