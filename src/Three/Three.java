package Three;

import java.util.Scanner;

public class Three {
public static void main(String[] args) {
	System.out.println("������5������");
	int[] arr=new int[5];
	int  sum=0;
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<5;i++){
		arr[i] = sc.nextInt();
		
	}
	for(int j=0;j<5;j++){
		sum=sum+arr[j];
	}
	System.out.println("����5�������ĺ��ǣ�  "+sum);
}
}
