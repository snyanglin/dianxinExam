package Five;

import java.util.Scanner;

public class Five {
public static void main(String[] args) {
	
		System.out.println("ÇëÊäÈëÄúµÄÃÜÂë£º");
		Scanner sc = new Scanner(System.in);
		int lengthKey=0;
		int count=0;
		int x=0;
		int y=0;
		int z=0;
		int m=0;
		String key=sc.nextLine();
		byte[] b=key.getBytes();
		lengthKey=b.length;
		if((lengthKey<8)||(lengthKey>16)){
			System.out.println("false ");
		}
		else{
		for(int i=0;i<lengthKey;i++){
			if((b[i]==126)||(b[i]==33)||(b[i]==64)||(b[i]==35)||(b[i]==36)||(b[i]==37)||(b[i]==94)||((48<=b[i])&&(b[i]<=57))||((97<=b[i])&&(b[i]<=122))||(65<=b[i])&&(b[i]<=90)){
				count++;
				if((b[i]==126)||(b[i]==33)||(b[i]==64)||(b[i]==35)||(b[i]==36)||(b[i]==37)||(b[i]==94)){
					x++;
				}
				if(((48<=b[i])&&(b[i]<=57))){
					y++;
				}
				if(((97<=b[i])&&(b[i]<=122))){
					z++;
				}
				if((65<=b[i])&&(b[i]<=90)){
					m++;
				}
			}
			
		}
		if(((x>0)&&(y>0)&&(z>0))||((y>0)&&(z>0)&&(m>0))||((x>0)&&(y>0)&&(m>0))){
			System.out.println("true");
		}else{
			
					System.out.println("false");
			
			
		}
		
		
		}
	}
}
