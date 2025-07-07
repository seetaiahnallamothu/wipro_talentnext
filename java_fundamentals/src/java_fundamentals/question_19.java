package java_fundamentals;

import java.util.Scanner;

public class question_19 {
	 public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    int num=sc.nextInt();
		    int rev=0;
		    while (num!=0) {
		      int rem=num%10;
		      rev=rev*10+rem;
		      num/=10;
		    }
		    System.out.println(rev);
		  }
}
