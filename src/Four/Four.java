package Four;

import java.util.Scanner;

public class Four {
public static void main(String[] args) {
	System.out.println("ÇëÊäÈë5ÕûÊı£º");
	int[] arr=new int[5];
	int t;
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<5;i++){
		arr[i] = sc.nextInt();
	}
	for(int n=0;n<5;n++){
		for(int m=n+1;m<5;m++){
			if(arr[n]<arr[m]){
				t=arr[m];
				arr[m]=arr[n];
				arr[n]=t;
				
			}
		}
	}
	for(int in:arr){
		System.out.println(in);
	}
}
}
