Alphabate Pattarns

01) Pattarn 1

	A    
	AB   
	ABC  
	ABCD 
	ABCDE

package Pattarn;

public class pattarn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		char cnt='A';
		for (int i = 0; i < irange; i++) {
			char cnt2=cnt;
			for (int j = 0; j <jrange; j++) {
				if(j-i<=0)
				{
					System.out.print(cnt2++);
					
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
			
		}
		


	}

}

02) Pattarn 2

	A    
	BB   
	CCC  
	DDDD 
	EEEEE

package Pattarn;

public class pattarn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		char cnt='A';
		for (int i = 0; i < irange; i++) {
			char cnt2=cnt;
			for (int j = 0; j <jrange; j++) {
				if(j-i<=0)
				{
					System.out.print(cnt2);
					
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
			cnt++;
		}
		


	}

}

03) Pattarn 3

	A    
	BB   
	CCC  
	DDDD 
	EEEEE
	DDDD 
	CCC  
	BB   
	A    

package Pattarn;

public class pattarn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 9;
		int jrange = 5;
		char cnt = 'A';
		char cnt3 = 'D';
		for (int i = 0; i < irange; i++) {
			char cnt2 = cnt;
			char cnt4 = cnt3;
			for (int j = 0; j < jrange; j++) {
				if (j - i <= 0 && j + i <= 8) {
					if (i <= 4)
						System.out.print(cnt2);
					else
						System.out.print(cnt4);

				} else
					System.out.print(" ");

			}
			cnt++;
			if (i > 4) {
				cnt3--;

			}
			System.out.println();

		}

	}

}

04) Pattarn 4

	A    
	AB   
	ABC  
	ABCD 
	ABCDE
	ABCD 
	ABC  
	AB   
	A    

package Pattarn;

public class pattarn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 9;
		int jrange = 5;
		char cnt = 'A';
		for (int i = 0; i < irange; i++) {
			char cnt2 = cnt;
			for (int j = 0; j < jrange; j++) {
				if (j - i <= 0 && j+i <= 8) {
					System.out.print(cnt2++);
					
					
					
				} else
					System.out.print(" ");
				

			}
			System.out.println();
			
			

		}

	}

}

05) Pattarn 5

	ABCDEF
	ABCDE 
	ABCD  
	ABC   
	AB    
	A     
	A     
	AB    
	ABC   
	ABCD  
	ABCDE 
	ABCDEF

package Pattarn;

public class pattarn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=12;
		int jrange=6;
		char cnt=65;
		for (int i = 0; i < irange; i++) {
			char cnt2=cnt;
			for (int j = 0; j < jrange; j++) {
				if(j+i<=5 || j-i<=-6)
				{
					System.out.print(cnt2);
				cnt2++;
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		
		}


	}

}

06) Pattarn 6

	FEDCBA
	EDCBA 
	DCBA  
	CBA   
	BA    
	A     
	A     
	BA    
	CBA   
	DCBA  
	EDCBA 
	FEDCBA

package Pattarn;

public class pattarn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 12;
		int jrange = 6;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if (j + i <= 5 || j - i <= -6) {
					if (j + i <= 5)
						System.out.print((char) (70 - j - i));
					else if (j - i <= -6)
						System.out.print((char) (59 - j + i));
				} else
					System.out.print(" ");

			}
			System.out.println();

		}

	}

}

07) Pattarn 7

		 A 
		A B 
	   A B C 
	  A B C D 
	 A B C D E 
	A B C D E F 

package Pattarn;

public class pattarn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=6;
		int jrange=6;
		for (int i = 0; i < irange; i++) {
			char count=65;
			for (int j = 0; j < jrange; j++) {
				if(j+i>=5)
				{
					System.out.print(count + " ");
				count++;
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}

08) Pattarn 8

	FEDCBA
	FEDCB 
	FEDC  
	FED   
	FE    
	F     

package Pattarn;

public class pattarn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 6;
		int jrange = 6;
		char cnt = 70;
		for (int i = 0; i < irange; i++) {
			char cnt2 = cnt;
			for (int j = 0; j < jrange; j++) {
				if (j + i <= 5) {
					System.out.print(cnt2);
					cnt2--;
				} else
					System.out.print(" ");

			}
			System.out.println();

		}

	}

}

09) Pattarn 9

	F
	FE
	FED
	FEDC
	FEDCB
	FEDCBA

package Pattarn;

public class pattarn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 6;
		int jrange = 6;
		char cnt = 70;
		for (int i = 0; i < irange; i++) {
			char cnt2 = cnt;
			for (int j = 0; j < jrange; j++) {
				if (j - i <= 0) {
					System.out.print(cnt2);
					cnt2--;
				}

			}
			System.out.println();

		}

	}

}	

10) Pattarn 10

	ABCDEF
	ABCDE 
	ABCD  
	ABC   
	AB    
	A  

package Pattarn;

public class pattarn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=6;
		int jrange=6;
		char cnt=65;
		for (int i = 0; i < irange; i++) {
			char cnt2=cnt;
			for (int j = 0; j < jrange; j++) {
				if(j+i<=5)
				{
					System.out.print(cnt2);
					//we can use 65+j in sysout statement without using counter. and after that doing typecasting
				cnt2++;
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		
		}


	}

}	

11) Pattarn 11

	A     
	BC    
	DEF   
	GHIJ  
	KLMNO 
	PQRSTU

package Pattarn;

public class pattarn11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=6;
		int jrange=6;
		char cnt=65;
		for (int i = 0; i < irange; i++) {
			char cnt2=cnt;
			for (int j = 0; j < jrange; j++) {
				if(j-i<=0)
				{
					System.out.print(cnt2);
				cnt2++;
				cnt=cnt2;
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
			//cnt++;
		
		}


	}

}

12) Pattarn 12

	A     
	BA    
	CBA   
	DCBA  
	EDCBA 
	FEDCBA

package Pattarn;

public class pattarn12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 6;
		int jrange = 6;
		char count = 65;
		for (int i = 0; i < irange; i++) {
			char count2 = count;
			for (int j = 0; j < jrange; j++) {
				if (j - i <= 0) {
					System.out.print(count2);
					count2--;
				} else
					System.out.print(" ");

			}
			System.out.println();
			count++;
		}

	}

}

13) Pattarn 13

	A     
	BG    
	CHM   
	DINS  
	EJOTY 
	FKPUZ_
	
package Pattarn;

public class pattarn13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 6;
		int jrange = 6;
		char cnt = 65;
		for (int i = 0; i < irange; i++) 
		{
			char cnt2 = cnt;
			for (int j = 0; j < jrange; j++) 
			{
				if (j - i <= 0) 
				{
					System.out.print(cnt2);
					for (int k = 0; k < 5; k++) 
					{
						cnt2++;
					}
				} 
				else
					System.out.print(" ");

			}
			System.out.println();
			cnt++;
		}

	}

}
	
14) Pattarn 14
		
	A        
	ABA      
	ABCBA    
	ABCDCBA  
	ABCDEDCBA

package Pattarn;

public class pattarn14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 9;
		int jrange = 9;
		for (int i = 0; i < irange; i=i+2) {
			char ch='A';
			for (int j = 0; j < jrange; j++) {
				if(j-i<=0) {
					System.out.print(ch);
					if(j*2<i)
						ch++;
					else
						ch--;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

15) Pattarn 15
	
		A    
	   ABA   
	  ABCBA  
	 ABCDCBA 
	ABCDEDCBA	
	
package Pattarn;

public class pattarn15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 9;
		for (int i = 0; i < irange; i++) {
			char ch='A';
			for (int j = 0; j < jrange; j++) {
				if(j+i>=4 && j-i<=4) {
					System.out.print(ch);
					if(j<4)
						ch++;
					else
						ch--;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}	

16) Pattarn 16

	OXXXXX
	XOXXXX
	XXOXXX
	XXXOXX
	XXXXOX
	XXXXXO
	
package Pattarn;

public class pattarn16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 6;
		int jrange = 6;
		for (int i = 0; i < irange; i++) {
			
			for (int j = 0; j < jrange; j++) {
				if(j-i==0) {
					System.out.print("O");
				}
				else
					System.out.print("X");
			}
			System.out.println();
		}


	}

}
	
17) Pattarn 17

	A   A
	 A A 
	  A  
	 A A 
	A   A

package Pattarn;

public class pattarn17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 5;
		for (int i = 0; i < irange; i++) {
			
			for (int j = 0; j < jrange; j++) {
				if(j-i==0 || j+i==4) {
					System.out.print("A");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

18) pattarn 18

	ABBBA
	BABAB
	BBABB
	BABAB
	ABBBA

package Pattarn;

public class pattarn18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int irange=5;
			int jrange=5;
			char cnt='A';
			for (int i = 0; i < irange; i++) {
				for (int j = 0; j < jrange; j++) {
					if(j+i==4 || j-i==0)
					System.out.print(cnt);
					else
						System.out.print("B");
				}
				System.out.println();
			}


	}

}

19) pattarn 19

	PPPPP
	P   P
	P   P
	P   P
	PPPPP

package Pattarn;

public class pattarn19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==0||j==4||i==0||i==4)
				System.out.print("P");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

20) pattarn 20

	PPPPP
	PQQQP
	PQQQP
	PQQQP
	PPPPP

package Pattarn;

public class pattarn20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==0||j==4||i==0||i==4)
				System.out.print("P");
				else
					System.out.print("Q");
			}
			System.out.println();
		}


	}

}
