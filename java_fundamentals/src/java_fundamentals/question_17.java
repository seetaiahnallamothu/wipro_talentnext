package java_fundamentals;

import java.util.Scanner;

public class question_17 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int sum=0;
	    while(num!=0){
	      int rem=num%10;
	      sum+=rem;
	      num/=10;
	    }
	    System.out.println(sum);
	  }
}
