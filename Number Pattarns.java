Number Pattarns

1.

	1    
	12   
	123  
	1234 
	12345

package Pattarn;

public class pattarn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 5;
		for (int i = 0; i < irange; i++) 
		{
			int cnt=1;
			for (int j = 0; j < jrange; j++)
			{
				if (j-i<=0)
						System.out.print(cnt++);	
				else
					System.out.print(" ");

			}
			System.out.println();
			
		}


	}

}

2.

	5    
	54   
	543  
	5432 
	54321

package Pattarn;

public class pattarn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		int cnt=5;
		for (int i = 0; i < irange; i++) {
			int cnt2=cnt;
			for (int j = 0; j < jrange; j++) {
				if(j-i<=0)
					System.out.print(cnt2--);
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}



	}

}

Pattarn no 3.

	12345
	2345 
	345  
	45   
	5    

package Pattarn;

public class pattarn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 5;
		int cnt=1;
		for (int i = 0; i < irange; i++) 
		{
			int cnt2=cnt;
			for (int j = 0; j < jrange; j++)
			{
				if (j+i<=4)
						System.out.print(cnt2++);	
				else
					System.out.print(" ");

			}
			System.out.println();
			cnt++;
			
		}


	}

}

Pattarn no 4.

	12345
	2345 
	345  
	45   
	5    
	5    
	45   
	345  
	2345 
	12345

package Pattarn;

public class pattarn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 10;
		int jrange = 5;
		int cnt = 1;
		int cnt3 = 5;
		for (int i = 0; i < irange; i++) {
			int cnt2 = cnt;
			int cnt4 = cnt3;
			for (int j = 0; j < jrange; j++) {
				if (j + i <= 4 || j - i <= -5) {
					if (i < 4)
						System.out.print(cnt2++);
					else
						System.out.print(cnt4++);
				} else
					System.out.print(" ");

			}
			cnt++;
			if (i > 4)
				cnt3--;

			System.out.println();
		}

	}

}

Pattarn no 5.

		5 
	   4 5 
	  3 4 5 
	 2 3 4 5 
	1 2 3 4 5 

package Pattarn;

public class pattarn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 5;
		int cnt=5;
		for (int i = 0; i < irange; i++) 
		{
			int cnt2=cnt;
			for (int j = 0; j < jrange; j++)
			{
				if (j+i>=4)
						System.out.print(cnt2+++" ");	
				else
					System.out.print(" ");

			}
			System.out.println();
			cnt--;
			
		}



	}

}

Pattarn no 6.

		1 
	   2 2 
	  3 3 3 
	 4 4 4 4 
	5 5 5 5 5 
	
package Pattarn;

public class pattarn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j+i>=4)
					System.out.print(count +" ");
				else
					System.out.print(" ");
				
			}
			System.out.println();
			count++;
		}

	}

}

Pattarn no 7.

	1
	12
	123
	1234
	12345
	123456
	1234567
	12345678
	123456789	

package Pattarn;

public class pattarn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i<=0)
					System.out.print(j+1);
			}
			System.out.println();
		}

	}

}

Pattarn no 8.
	
	1        
	22       
	333      
	4444     
	55555    
	666666   
	7777777  
	88888888 
	999999999	
	
package Pattarn;

public class pattarn8 {

 public static void main(String[] args) {
		// TODO Auto-generated method stub
int irange=9;
int jrange=9;
int count=1;
for (int i = 0; i < irange; i++) {
	for (int j = 0; j < jrange; j++) {
		if(j-i<=0)
		{
			System.out.print(count);
		}
		else
			System.out.print(" ");
		
	}
	System.out.println();
	count++;
}
	}

}
	
	
Pattarn no 9.
	
	9        
	98       
	987      
	9876     
	98765    
	987654   
	9876543  
	98765432 
	987654321

package Pattarn;

public class pattarn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i<=0)
					System.out.print(9-j);
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}	

Pattarn no 10.

	9        
	88       
	777      
	6666     
	55555    
	444444   
	3333333  
	22222222 
	111111111

package Pattarn;

public class pattarn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 9;
		int jrange = 9;
		int cnt = 9;
		for (int i = 0; i < irange; i++) {
			int cnt2 = cnt;
			for (int j = 0; j < jrange; j++) {
				if (j - i <= 0)
					System.out.print(cnt2);
				else
					System.out.print(" ");
			}
			System.out.println();
			cnt--;
		}
	}

}

Pattarn no 11.

			1
		   12
		  123
		 1234
		12345
	   123456
	  1234567
	 12345678
	123456789

package Pattarn;

public class pattarn11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		int cnt=1;
		for (int i = 0; i < irange; i++) {
			int cnt2=cnt;
			for (int j = 0; j < jrange; j++) {
				if(j+i>=8)
					System.out.print(cnt2++);
				// we can use j+i-7 at the cnt++ without counter only use equation.
				else
					System.out.print(" ");
			}
			System.out.println();
		}



	}

}

Pattarn no 12.

	000111222333444555666777888999
	000111222333444555666777888999
	000111222333444555666777888999
	000111222333444555666777888999
	000111222333444555666777888999

package Pattarn;

public class pattarn12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=10;
		for (int i = 0; i < irange; i++) {
			int cnt=0;
		
			for (int j = 0; j < jrange; j++) {
				for(int k= 0;k<3;k++)
				{
					System.out.print(cnt); // we can print here j also 
					// means in System.out.print(j);  statement we can write j
				}
				cnt++;
			}
			System.out.println();

	}
	}

}

Pattarn no 13.

		1 
	   2 2 
	  3 3 3 
	 4 4 4 4 
	5 5 5 5 5 
	 4 4 4 4 
	  3 3 3 
	   2 2 
		1 


package Pattarn;

public class pattarn13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 9;
		int jrange = 5;

		int cnt1=0;
		for (int i = 0; i < irange; i++)
		{
			cnt1++;
			int cnt2=cnt1;


			for (int j = 0; j < jrange; j++)
			{
				if (j + i >= 4 && j - i >= -4) 
				{
					if (j + i >= 4)
						System.out.print(cnt2+" ");
					//else if (j - i >= -4 )
						//System.out.print(" ");
				}
				else
					System.out.print(" ");


			}

			if (i > 3)
				//for (int k = 0; k < 2; k++)
				//	cnt1--;
				cnt1-=2;
			 
			
			System.out.println();

		}

	}

}

Pattarn no 14.

			1 
		   2 2 
		  3 3 3 
		 4 4 4 4 
		5 5 5 5 5 
	   6 6 6 6 6 6 
	  7 7 7 7 7 7 7 
	 8 8 8 8 8 8 8 8 
	9 9 9 9 9 9 9 9 9 

package Pattarn;

public class pattarn14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		int cnt=1;
		for (int i = 0; i < irange; i++) {
			int cnt2=cnt;
			for (int j = 0; j < jrange; j++) {
				if(j+i>=8)
					System.out.print(cnt2 + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
			cnt++;		
		}

	}

}

Pattarn no 15.

		    1 
		   1 2 
		  1 2 3 
		 1 2 3 4 
		1 2 3 4 5 
	   1 2 3 4 5 6 
	  1 2 3 4 5 6 7 
	 1 2 3 4 5 6 7 8 
	1 2 3 4 5 6 7 8 9 
	
package Pattarn;

public class pattarn15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		int cnt=1;
		for (int i = 0; i < irange; i++) {
			int cnt2=cnt;
			for (int j = 0; j < jrange; j++) {
				if(j+i>=8)
					System.out.print(cnt2++ + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
				
		}

	}

}

Pattarn no 16.
	
	9 9 9 9 9 9 9 9 9 
	 8 8 8 8 8 8 8 8 
	  7 7 7 7 7 7 7 
	   6 6 6 6 6 6 
		5 5 5 5 5 
		 4 4 4 4 
		  3 3 3 
		   2 2 
			1 

package Pattarn;

public class pattarn16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		int cnt=9;
		for (int i = 0; i < irange; i++) {
			int cnt2=cnt;
			for (int j = 0; j < jrange; j++) {
				if(j-i>=0)
					System.out.print(cnt2 + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
				cnt--;
		}


	}

}

Pattarn no 17.

	1    
	12   
	123  
	1234 
	12345
	1234 
	123  
	12   
	1    

package Pattarn;

public class pattarn18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=5;
		int cnt=1;
		for (int i = 0; i < irange; i++) {
			int cnt2=cnt;
			for (int j = 0; j < jrange; j++) {
				if(j-i<=0 && j+i<=8)
					System.out.print(cnt2++);
				else
					System.out.print(" ");
			}
			System.out.println();
				
		}


	}

}

Pattarn no 18.

		1 
	   1 2 
	  1 2 3 
	 1 2 3 4 
	1 2 3 4 5 
	
package Pattarn;

public class pattarn18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 5;
		for (int i = 0; i < irange; i++) {
			int cnt = 1;
			for (int j = 0; j < jrange; j++) {
				if (j + i >= 4)
					System.out.print(cnt++ + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
	
Pattarn no 19.

	1     
	2 3    
	4 5 6   
	7 8 9 10  
	11 12 13 14 15 

package Pattarn;

public class pattarn19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		int cnt=1;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i<=0)
					System.out.print(cnt++ + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

Pattarn no 20.

	12345
	1234 
	123  
	12   
	1    
	12   
	123  
	1234 
	12345

package Pattarn;

public class pattarn20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=5;
		int cnt=1;
		for (int i = 0; i < irange; i++) {
			int cnt2=cnt;
			for (int j = 0; j < jrange; j++) {
				if(j+i<=4 || j-i<=-4)
					System.out.print(cnt2++); // without counter sysout only j+i
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

Pattarn no 21.

	12345
	 1234
	  123
	   12
		1
	   12
	  123
	 1234
	12345

package Pattarn;

public class pattarn21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=5;
		int cnt=1;
		for (int i = 0; i < irange; i++) {
			int cnt2=cnt;
			for (int j = 0; j < jrange; j++) {
				if(j+i>=8 || j-i>=0)
					System.out.print(cnt2++); // without counter sysout only j+i
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

Pattarn no 22.

	1 2 3 4 5 
	 2 3 4 5 
	  3 4 5 
	   4 5 
		5 
	   4 5 
	  3 4 5 
	 2 3 4 5 
	1 2 3 4 5 

package Pattarn;

public class pattarn22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=5;
		int cnt=1;
	int	cnt3=4;
		for (int i = 0; i < irange; i++) {
			int cnt2=cnt;
			int cnt4=cnt3;
			for (int j = 0; j < jrange; j++) {
				if(j-i>=0 || j+i>=8) {
					if(i<=4)
					System.out.print(cnt2+++" "); 
					else
						System.out.print(cnt4+++" ");
					}
				else
					System.out.print(" ");
			}
			cnt++;
			if(i>4)
				cnt3--;
			System.out.println();
		}

	}

}

Pattarn no 23.

	1        
	121      
	12321    
	1234321  
	123454321

package Pattarn;

public class pattarn23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 9;
		int jrange = 9;
		int mid = 0;
		for (int i = 0; i < irange; i=i+ 2) 
		{
			int cnt = 1;
			for (int j = 0; j < jrange; j++)
			{
				if (j - i <= 0)
				{
					if (j < mid) //we can use j<i/2 also at the place of mid.
						System.out.print(cnt++);
					else
						System.out.print(cnt--);
				} 
				else
					System.out.print(" ");

			}
			mid++;
			System.out.println();
			
		}


	}

}

Pattarn no 24.

		1    
	   121   
	  12321  
	 1234321 
	123454321

package Pattarn;

//j+i-3
	// 5-j+i


public class pattarn24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=9;
		
	for (int i = 0; i < irange; i++) {
		int cnt=1;
		for (int j = 0; j < jrange; j++) {
			if(j+i>=4 && j-i<=4)
			{
				System.out.print(cnt);
				if(j<4)
					cnt++;
				else
					cnt--;
				
			}
			else
				System.out.print(" ");
		}
		System.out.println();
	}

	}

}

Pattarn no 25.

	1     
	2 6    
	3 7 10   
	4 8 11 13  
	5 9 12 14 15 

package Pattarn;

public class pattarn25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 5;
		int cnt = 1;
		for (int i = 0; i < irange; i++) {
			int cnt2 = cnt;
			int diff = 4;
			for (int j = 0; j < jrange; j++) {
				if (j - i <= 0)
					System.out.print(cnt2 + " ");
				else
					System.out.print(" ");
				cnt2 = cnt2 + diff;
				diff--;

			}
			cnt++;
			System.out.println();
		}

	}
}

Pattarn no 26.

	1        1
	12      21
	123    321
	1234  4321
	1234554321

package Pattarn;

public class pattarn26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 10;
		int cnt = 1;
		int cnt3 = 1;
		for (int i = 0; i < irange; i++) {
			int cnt2 = cnt;
			int cnt4 = cnt3;
			for (int j = 0; j < jrange; j++) {
				if (j - i <= 0 || j + i >= 9) {
					if (j < 5)

						System.out.print(cnt2++);
					else if (j >= 4)
						System.out.print(cnt4--);
				} else
					System.out.print(" ");

			}
			cnt3++;
			System.out.println();
		}

	}

}

Pattarn no 27.

	1        1
	22      22
	333    333
	4444  4444
	5555555555

package Pattarn;

public class pattarn27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 10;
		int cnt = 1;
		for (int i = 0; i < irange; i++) {
			int cnt2 = cnt;
			for (int j = 0; j < jrange; j++) {
				if (j - i <= 0 || j + i >= 9) {

					System.out.print(cnt2);

				} else
					System.out.print(" ");

			}
			cnt++;
			System.out.println();
		}

	}

}

Pattarn no 28.

	1        1
	12      12
	123    123
	1234  1234
	1234512345

package Pattarn;

public class pattarn28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 10;
		int cnt = 1;
		int cnt3 = 1;
		for (int i = 0; i < irange; i++) {
			int cnt2 = cnt;
			int cnt4 = cnt3;
			for (int j = 0; j < jrange; j++) {
				if (j - i <= 0 || j + i >= 9) {
					if (j < 5)

						System.out.print(cnt2++);
					else if (j >= 4)
						System.out.print(cnt4++);
				} else
					System.out.print(" ");

			}
			
			System.out.println();
		}

	}

}

Pattarn no 29.

	10101
	10101
	10101
	10101
	10101

package Pattarn;

public class pattarn29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
					if(j%2==0)
					System.out.print("1");
				
				else
					System.out.print("0");
			
			}
			System.out.println();
		}


	}

}

Pattarn no 30.

	1    
	10   
	101  
	1010 
	10101

package Pattarn;

public class pattarn30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i<=0)
				{
					if(j%2==0)
					System.out.print("1");
				
				else
					System.out.print("0");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}


pattarn no 31.

	10101
	01010
	10101
	01010
	10101

package Pattarn;

public class pattarn31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if((j+i)%2==0)
					System.out.print("1");
				else
					System.out.print("0");
				
			}
			System.out.println();
		}


	}

}

pattarn no 32.

	1    
	01   
	101  
	0101 
	10101

package Pattarn;

public class pattarn32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i<=0)
				{
					if((j+i)%2==0)
					System.out.print("1");
				
				else
					System.out.print("0");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}

pattarn no 33.

	10000
	01000
	00100
	00010
	00001

package Pattarn;

public class pattarn33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i==0)
				{
					System.out.print(1);
				}
				else
					System.out.print("0");
			}
			System.out.println();
		}


	}

}

pattarn no 34.

	10000
	02000
	00300
	00040
	00005

package Pattarn;

public class pattarn34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i==0)
				{
					System.out.print(1+i);
				}
				else
					System.out.print("0");
			}
			System.out.println();
		}

	}

}

pattarn no 35.

	11111
	11122
	11333
	14444
	55555

package Pattarn;

public class pattarn35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		int cnt=1;
		
		for (int i = 0; i < irange; i++) {		  		
			for (int j = 0; j < jrange; j++) {
				if(j+i>=4)
					System.out.print(cnt); //without counter 1+j
				else
					System.out.print("1");
			}
			System.out.println();
			cnt++;
		}

	}

}

pattarn no 36.

	55555
	45444
	34533
	23452
	12345

package Pattarn;

public class pattarn36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		int cnt=65;
		for (int i = 0; i < irange; i++) {
			int cnt2=cnt;
			for (int j = 0; j < jrange; j++) {
				if(j-i<=0)
				{
					System.out.print(5-i+j);
				}
				else
					System.out.print(5-i);
			}
			System.out.println();
		}

	}

}

pattarn no 37.

	55555
	54444
	54333
	54322
	54321

package Pattarn;

public class pattarn37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		int cnt=5;
	for (int i = 0; i < irange; i++) {
		int cnt2=cnt;
		for (int j = 0; j < jrange; j++) {
			if(j-i>=0 || j-i<=0) {
				if(j-i>=0)
				System.out.print(cnt2); // without counter we can use 5-j and 5-i
				else
					System.out.print(5-j);
			}
			
		}
		cnt--;
		System.out.println();
	}


	}

}
