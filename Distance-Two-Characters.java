
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String m=sc.nextLine();
	    char s=sc.next().charAt(0);
	    char t=sc.next().charAt(0);
	    int l=m.length();
	    int y=0;
	    int min=10001;
	    for(int i=0;i<l;i++){
	        if(m.charAt(i)==s){
	            for(int j=i+1;j<l;j++){
	                if(m.charAt(j)==s){
	                    i=j-1;
	                    break;
	                }else if(m.charAt(j)==t){
	                    y=Math.abs((i+1)-j);
	                    if(min>y){
	                        min=y;
	                    }
	                    break;
	                }else{
	                    continue;
	                }
	                
	            }
	        }else{
	            continue;
	        }
	    }
	    System.out.print(min);
	}
}
