package One;

import java.util.Scanner;

public class one {
public static void main(String[] args) {
	       //创建键盘录入对象
			Scanner sc = new Scanner(System.in);
			
			//控制键盘录入数据
			System.out.println("请输入两个数据：第一个：");
			int one = sc.nextInt(); 
			int two=sc.nextInt();
			if(one>two){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
}
}
