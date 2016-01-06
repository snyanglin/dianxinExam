package Test;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	System.out.println("ÇëÊäÈëÄúµÄÃÜÂë£º");
	Scanner sc = new Scanner(System.in);
	int lengthKey=0;
	int count=0;
	int pre17=0;
	String key=sc.nextLine();
	byte[] b=key.getBytes();
	lengthKey=b.length;
	if(lengthKey!=18){
		System.out.println("1");
	}else{
		for(int i=0;i<17;i++){
			if((48<=b[i])&&(b[i]<=57)){
				pre17++;
			}
		}
		if(pre17!=17){
			System.out.println("2");
		}else{
			if((b[17]==120)||((48<=b[17])&&(b[17]<=57))){
				String year=key.substring(6, 10);
				int yy=Integer.parseInt(year);
				if((yy<1900)||(yy>2020)){
					System.out.println("4");
				}else{

					String mouth=key.substring(10, 12);
					int mm=Integer.parseInt(mouth);
					if((mm<1)||(mm>12)){
						System.out.println("5");	
					}else{

						String day=key.substring(12, 14);
						int dd=Integer.parseInt(day);
						if(mm!=2){
							if((mm==1)||(mm==3)||(mm==5)||(mm==7)||(mm==8)||(mm==10)||(mm==12)){
								if(dd!=31){
									System.out.println("6");
								}
							}
							if((mm==4)||(mm==6)||(mm==9)||(mm==11)){
								if(dd!=30){
									System.out.println("6");
								}
							}
						}else{
							if((yy%400)!=0){
								if(((yy%4)==0)&&((yy%100)!=0)){
									if(dd!=29){
										System.out.println("7");
								}
								}
								}else{
									if(dd!=29){
										System.out.println("7");
									}
								}
						}
						
					}
				}
			}else{
				System.out.println("3");
			}
			
			
			
		}
		System.out.println("true");
	}
	
}
}

