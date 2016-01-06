package Two;

import java.util.Scanner;

public class Two {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入一个字符串：");
	String str=sc.nextLine();
	System.out.println(str);
	System.out.println("请输入要查找的字符：");
	String c=sc.nextLine();
	char[] t=c.toCharArray();
	char t1=t[0];
	int m=str.indexOf(t1)+1;
	if(m>0){
	System.out.println("第一次出现的字符在第    "+m+"  位");
	}else{
		System.out.println("在字符串中位找到该字符！");
	}
}
}
