package Two;

import java.util.Scanner;

public class Two {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("������һ���ַ�����");
	String str=sc.nextLine();
	System.out.println(str);
	System.out.println("������Ҫ���ҵ��ַ���");
	String c=sc.nextLine();
	char[] t=c.toCharArray();
	char t1=t[0];
	int m=str.indexOf(t1)+1;
	if(m>0){
	System.out.println("��һ�γ��ֵ��ַ��ڵ�    "+m+"  λ");
	}else{
		System.out.println("���ַ�����λ�ҵ����ַ���");
	}
}
}
