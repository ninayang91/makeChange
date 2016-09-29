import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Main {
	
	public static void main(String[] args){
		System.out.println(makeChange(11));
	
	}
	public static int makeChange(int n){
		return makeChange(n,25);
	}
	
	public static int makeChange(int n, int d){
		int nextd=0;
		switch(d){
		case 25:
			nextd=10;
			break;
		case 10:
			nextd=5;
			break;
		case 5:
			nextd=1;
			break;
		case 1:
			return 1;
		
		}
		
		int ways=0;
		
		for(int i=0;i*d<=n;i++){
			ways += makeChange(n-i*d, nextd);
		}
		return ways;
	}



}
