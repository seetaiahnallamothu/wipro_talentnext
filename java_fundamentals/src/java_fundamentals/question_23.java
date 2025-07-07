package java_fundamentals;

public class question_23 {
	public static void main(String[] args) {
		int[] arr= {2,4,5,6,7,10,9,20,15};
		int tar=15;
		System.out.println(find(arr,tar));
	}
	static int find(int[] arr,int tar) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==tar) {
				return i;
			}
		}
		return -1;
	}
}
