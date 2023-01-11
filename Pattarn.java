1).Pattarn no 1

		*****
		*****
		*****
		*****
		*****

package Pattarn;

public class pattarn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}

2).Pattarn no 2

	*****
	**** 
	***  
	**   
	*    

package Pattarn;

public class pattarn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j+i<=4)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}

3).Pattarn no 3

	*    
	**   
	***  
	**** 
	*****
	
	package Pattarn;

public class pattarn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i<=0)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

4).Pattarn no 4

	*    
	**   
	***  
	**** 
	*****
	**** 
	***  
	**   
	*    
	
	package Pattarn;

public class pattarn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i<=0 && j+i<=8)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}


5).Pattarn no 5

	*****
	**** 
	***  
	**   
	*    
	**   
	***  
	**** 
	*****

package Pattarn;

public class pattarn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i<=-4 || j+i<=4)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

6).Pattarn no 6

		*
	   **
	  ***
	 ****
	*****
	
	package Pattarn;


public class pattarn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j <jrange; j++) {
				if(j+i>=4)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		

	}

}

7).Pattarn no 7

	*****
	 ****
	  ***
	   **
		*
		
		package Pattarn;

public class pattarn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i>=0)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

8).Pattarn no 8

		*
	   **
	  ***
	 ****
	*****
	 ****
	  ***
	   **
		*
		
package Pattarn;

public class pattarn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if((j+i>=4 && j-i>=-4))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}


9).Pattarn no 9

		* 
	   * * 
	  * * * 
	 * * * * 
	* * * * * 
package Pattarn;

public class pattarn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j <jrange; j++) {
				if(j+i>=4)
					System.out.print("* ");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		


	}

}

10).Pattarn no 10
		*    
	   ***   
	  *****  
	 ******* 
	*********
	
	package Pattarn;

public class pattarn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=9;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j <jrange; j++) {
				if(j+i>=4 && j-i<=4)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		


	}

}


11).Pattarn no 11

	* * * * * 
	 * * * * 
	  * * * 
	   * * 
		* 
     
package Pattarn;

public class pattarn11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 9;
		int jrange = 5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if (j - i >= 0 )
					System.out.print("* ");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

	

	}

}
	 
12).Pattarn no 12

	*********
	 ******* 
	  *****  
	   ***   
		*  

package Pattarn;

public class pattarn12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=9;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j <jrange; j++) {
				if(j+i<=8 && j-i>=0)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		


	}

}


13).Pattarn no 13

	* * * * * 
	 * * * * 
	  * * * 
	   * * 
		* 

package Pattarn;

public class pattarn13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i>=0)
					System.out.print("* ");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

14).Pattarn no 14

	*****
	 ****
	  ***
	   **
		*
	   **
	  ***
	 ****
	*****

package Pattarn;

public class pattarn14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i>=0 || j+i>=8)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

15).Pattarn no 15

	*****    
	 ****    
	  ***    
	   **    
		*    
		**   
		***  
		**** 
		*****
		
package Pattarn;

public class pattarn15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i>=0 && j<=4  || j-i<=0 && j>=4)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}		


16).Pattarn no 16

	*********
	 ******* 
	  *****  
	   ***   
		*    
	   ***   
	  *****  
	 ******* 
	*********

package Pattarn;

public class pattarn16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if((j-i>=0 && j+i<=8) || (j+i>=8 && j-i<=0))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}



	}

}

17).Pattarn no 17

	* * * * * 
	 * * * * 
	  * * * 
	   * * 
		* 
	   * * 
	  * * * 
	 * * * * 
	* * * * * 
	
	package Pattarn;

public class pattarn17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 9;
		int jrange = 5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if (j - i >= 0 || j + i >= 8)
					System.out.print("* ");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

	}

}

18).Pattarn no 18

		* 
	   * * 
	  * * * 
	 * * * * 
	* * * * * 
	 * * * * 
	  * * * 
	   * * 
		* 
		
package Pattarn;

public class pattarn18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 9;
		int jrange = 5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if (j + i >= 4 && j - i >= -4)
					System.out.print("* ");
				else
					System.out.print(" ");

			}
			System.out.println();
		}

	


	}

}
		
19).Pattarn no 19

		*    
	   ***   
	  *****  
	 ******* 
	*********
	 ******* 
	  *****  
	   ***   
		*   

package Pattarn;

public class pattarn19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j <jrange; j++) {
				if((j+i>=4 && j-i<=4 ) && (j-i>=-4 && j+i<=12))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		

	}

}

20).Pattarn no 20

	**********
	****  ****
	***    ***
	**      **
	*        *
	**      **
	***    ***
	****  ****
	**********

package Pattarn;

public class pattarn20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=10;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j+i<=4 || j-i>=5 || j+i>=13 || j-i<=-4)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

21).Pattarn no 21

		*****
	   ***** 
	  *****  
	 *****   
	*****    

package Pattarn;

public class pattarn21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=9;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j <jrange; j++) {
				if(j+i>=4 && j+i<=8)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		

	}

}

22).Pattarn no 22

	*****    
	 *****   
	  *****  
	   ***** 
		*****

package Pattarn;


public class pattarn22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 9;

		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if (j - i >= 0 && j - i <= 4)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}
	}

}

23).Pattarn no 23

	*****    
	 *****   
	  *****  
	   ***** 
		*****
	   ***** 
	  *****  
	 *****   
	*****    
	
package Pattarn;

public class pattarn23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j <jrange; j++) {
				if((j-i>=0 && j-i<=4 && i<=4) || (j+i>=8 && j+i<=12 && i>=4))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		


	}

}

24).Pattarn no 24

	    *****
	   ***** 
	  *****  
	 *****   
	*****    
	 *****   
	  *****  
	   ***** 
		*****
		
package Pattarn;

public class pattarn24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if((j+i>=4 && j+i<=8 && i<5) || (j-i>=-4 && j-i<=0 && i>4))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
	
25).Pattarn no 25

	*        
	***      
	*****    
	*******  
	*********

package Pattarn;

public class pattarn25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 9;
		int jrange = 9;
		int cnt = 1;
		for (int i = 0; i < irange; i=i+2) {
			for (int j = 0; j < jrange; j++) {
				if (j-i<=0)
				
		
					System.out.print("*");
				
				else
					System.out.print(" ");
			}
			System.out.println();
		}

}

}	

26).Pattarn no 26

	* *        
	** **      
	*** ***    
	**** ****  
	***** *****

package Pattarn;

public class pattarn26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 11;
		int jrange = 11;
		int cnt = 1;
		for (int i = 2; i < irange; i=i+2) {
			for (int j = 0; j < jrange; j++) {
				if (j-i<=0)
				{
					if(j*2==i)
						System.out.print(" ");
					else
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

27).Pattarn no 27

	*    **********    *
	**   ****  ****   **
	***  ***    ***  ***
	**** **      ** ****
	******        ******
	
package Pattarn;

public class pattarn27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 20;
		int cnt = 1;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if ((j-i<=0) || (j+i<=9 && j>4) || (j-i>=10 && j<15) || (j+i>=19))
				
		
					System.out.print("*");
				
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}
	
28).Pattarn no 28

	*       *
	**     **
	***   ***
	**** ****
	*********
	**** ****
	***   ***
	**     **
	*       *
	
package Pattarn;

public class pattarn28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		for (int i = 0; i < irange; i++) {		  		
			for (int j = 0; j < jrange; j++) {
				if((j+i>=8 && j-i>=0) || (j-i<=0 && j+i<=8))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

29).Pattarn no 29

	*        *
	**      **
	***    ***
	****  ****
	**********
	
package Pattarn;

public class pattarn28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=10;
		for (int i = 0; i < irange; i++) {		  		
			for (int j = 0; j < jrange; j++) {
				if(j-i<=0 || j+i>=9)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}
	
30).Pattarn no 30

	  *  
	  *  
	*****
	  *  
	  * 

package Pattarn;

public class pattarn30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(i==2 || j==2)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

31).Pattarn no 31

	*****
	*  * 
	* *  
	**   
	*    

package Pattarn;

public class pattarn31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if (j==0 || i==0 || j+i==4) {
					System.out.print("*");

				} else
					System.out.print(" ");

			}
			System.out.println();
		}

	}

}

32).Pattarn no 32

	*****
	 *  *
	  * *
	   **
		*

package Pattarn;

public class pattarn32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if (i==0 || j==4 || j-i==0) {
					System.out.print("*");

				} else
					System.out.print(" ");

			}
			System.out.println();
		}
	}

}

33).Pattarn no 33

		*    
	   * *   
	  *   *  
	 *     * 
	*********

package Pattarn;

public class pattarn33{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int irange=5;
int jrange=9;
for (int i = 0; i < irange; i++) {
	for (int j = 0; j < jrange; j++) {
		if(i==4 || j+i==4 || j-i==4)
			System.out.print("*");
		else
			System.out.print(" ");
	}
	System.out.println();
}
	}

}	

34).Pattarn no 34

	*********
	 *     * 
	  *   *  
	   * *   
		*    
	
package Pattarn;

public class pattarn34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=9;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(i==0 || j-i==0 || j+i==8)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}



	}

}
	
35).Pattarn no 35

		*    
	   * *   
	  *   *  
	 *     * 
	*       *
	 *     * 
	  *   *  
	   * *   
		*    
		
package Pattarn;

public class pattarn35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 9;
		int jrange = 9;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if (j + i == 4 || j - i == 4 || j + i == 12 || j - i == -4)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}

	}

}

36).Pattarn no 36

	*    
	**   
	* *  
	*  * 
	*   *
	*  * 
	* *  
	**   
	*    
	
package Pattarn;

public class pattarn36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==0 || j-i==0 || j+i==8)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}



	}

}
	
37).Pattarn no 37

		*
	   **
	  * *
	 *  *
	*   *
	 *  *
	  * *
	   **
		*

package Pattarn;

public class pattarn37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=5;
		for (int i = 0; i < irange; i++) {		  		
			for (int j = 0; j < jrange; j++) {
				if(j+i==4 || j==4 || j-i==-4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

38).Pattarn no 38

		*****
	   *   * 
	  *   *  
	 *   *   
	*****    

package Pattarn;

public class pattarn39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=9;
		for (int i = 0; i < irange; i++) {		  		
			for (int j = 0; j < jrange; j++) {
				if((i==0 && j>=4) || (i==4 && j<=4) || (j+i==4) || j+i==8)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}	

39).Pattarn no 39
	
	*****    
	 *   *   
	  *   *  
	   *   * 
		*****	

package Pattarn;

public class pattarn39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=9;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if((i==0 && j<=4) || (j-i==4) || (i==4 && j>=4) || (j-i==0))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

40).Pattarn no 40

	*****
	 * * 
	  *  
	 * * 
	*****

package Pattarn;

public class pattarn103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i==0 || j+i==4 ||i==0 ||i==4)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

41).Pattarn no 41

	 ** ** 
	*  *  *
	 *   * 
	  * *  
	   *   
	   
package Pattarn;

public class pattarn41 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange = 5;
		int jrange = 7;
		for (int i = 0; i < irange; i++) 
		{
			for (int j = 0; j < jrange; j++)
			{
				if ((i==0 && j!=0 && j!=3 && j!=6) || (j-i==-1) ||(j+i==7) || (i==1 && j!=1 && j!=2 && j!=4 && j!=5))
						System.out.print("*");	
				else
					System.out.print(" ");

			}
			System.out.println();
			
		}

	}

}	   

42).Pattarn no 42

	   ***     ***    
	  *****   *****   
	 ******* *******  
	***************** 
	***************** 
	 ***************  
	  *************   
	   ***********    
		*********     
		 *******      
		  *****       
		   ***        
			*               
package Pattarn;

public class pattarn42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=13;
		int jrange=18;
	for (int i = 0; i < irange; i++) {
		for (int j = 0; j < jrange; j++) {
			if(j-i<=-5 || j+i<=2 || j+i>=21 || j-i>=14 || (j-i>=6 && j+i<=10))
				System.out.print(" ");
			else
				System.out.print("*");
			
		}
		System.out.println();
	}


	}

}

43).Pattarn no 43


	 *** 
	*   *
	*   *
	*****
	*   *
	*   *
	*   *

package Pattarn;

public class pattarn43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if((j==0&&i>0) ||(j==4&&i>0) || i==3 ||(i==0 && j>0 && j<4))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}

44).Pattarn no 44

	**** 
	*   *
	*   *
	**** 
	*   *
	*   *
	**** 

package Pattarn;

public class pattarn44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if((j==0&&i>0) ||(i==3 && j<4) ||(i==0 && j<4) || (i==6 && j<4) 
						||(j+i==9) || (j-i==3)||(j+i==6 && i<3)|| (j-i==0&&i>3))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

45).Pattarn no 45
		
	 ****
	*    
	*    
	*    
	*    
	 ****

package Pattarn;

public class pattarn45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=6;
		int jrange=5;
		for (int i = 0; i < irange; i++) {		  		
			for (int j = 0; j < jrange; j++) {
				if((j==0 && i!=0 && i!=5) || (i==0 && j!=0) || (i==5 && j!=0))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

46).Pattarn no 46

	**** 
	*   *
	*   *
	*   *
	*   *
	*   *
	**** 

package Pattarn;

public class pattarn46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==0 || (i==0 && j<4) || (i==6 && j<4) || (j==4 && i!=0 && i!=6))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}

47).Pattarn no 47

	*****
	*    
	*    
	*****
	*    
	*    
	*****

package Pattarn;

public class pattarn47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==0 || i==0 ||i==3 || i==6)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}


48).Pattarn no 48

	*****
	*    
	*    
	*****
	*    
	*    
	*    

package Pattarn;

public class pattarn48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==0 || i==0 ||i==3)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}

49).Pattarn no 49

	***** 
	*     
	*     
	*  ***
	*   * 
	*   * 
	***** 

package Pattarn;

public class pattarn49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=6;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==0 || (i==0&&j<5) ||(i==6 && j<5) || (j==4 && i>2) ||(i==3 && j>2))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

50).Pattarn no 50

	*   *
	*   *
	*   *
	*****
	*   *
	*   *
	*   *

package Pattarn;

public class pattarn50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==0 || j==4 || i==3)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

51).Pattarn no 51


	*****
	  *  
	  *  
	  *  
	  *  
	  *  
	*****

package Pattarn;

public class pattarn51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==2 || i==0 || i==6)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

52).Pattarn no 52

	*****
	  *  
	  *  
	  *  
	  *  
	* *  
	***  

package Pattarn;

public class pattarn52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==2 || i==0 || (i==6 && j<3) || (j==0 && i>4))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

53).Pattarn no 53

	*   *
	*  * 
	* *  
	**   
	* *  
	*  * 
	*   *

package Pattarn;

public class pattarn53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==0 || j+i==4 || j-i==-2)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}

54).Pattarn no 54

	*    
	*    
	*    
	*    
	*    
	*    
	*****

package Pattarn;

public class pattarn54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==0 || i==6)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

55).Pattarn no 55

	*     *
	**   **
	* * * *
	*  *  *
	*     *
	*     *
	*     *

package Pattarn;

public class pattarn55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=7;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==0 || j==6 || (j-i==0 && i<4) || (j+i==6 && i<4))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}

56).Pattarn no 56
	
	*     *
	**    *
	* *   *
	*  *  *
	*   * *
	*    **
	*     *

package Pattarn;

public class pattarn56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=7;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==0 || j==6 || j-i==0)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

57).Pattarn no 57

	 *** 
	*   *
	*   *
	*   *
	*   *
	*   *
	 *** 

package Pattarn;

public class pattarn57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {		  		
			for (int j = 0; j < jrange; j++) {
				if((j==0 && i>0 && i<6) ||  (j==4 && i>0 && i<6) || (i==0 && j>0 && j<4) ||(i==6 && j>0 && j<4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}

58).Pattarn no 58

	 *** 
	*   *
	*   *
	**** 
	*    
	*    
	*    

package Pattarn;

public class pattarn58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if((j==0 && i>0) || (i==3 && j<4) || (j==4 && i>0 && i<3) || (i==0 && j>0 && j<4))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

59).Pattarn no 59

	 *** 
	*   *
	*   *
	*   *
	**  *
	 *** 
	   * 

package Pattarn;

public class pattarn59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if((i==0 && j>0 && j<4) || (j==0 && i>0 && i<5) || (j==4 && i>0 && i<5) || (i==5 && j>0 && j<4) || (j-i==-3))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}
	
60).Pattarn no 60

	 *** 
	*   *
	*   *
	**** 
	*   *
	*   *
	*   *

package Pattarn;

public class pattarn60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if((j==0&&i>0) ||(i==0 && j>0 && j<4)||(i==3&&j<4)||(j==4 && i>0 && i<3) ||(j==4 && i>3))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}



	}

}

61).Pattarn no 61

	*****
	*    
	*    
	*****
		*
		*
	*****

package Pattarn;

public class pattarn61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if((i==0) || (i==3)||(i==6)||(j==0&&i<4)||(j==4&&i>3))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

62).Pattarn no 62

	*****
	  *  
	  *  
	  *  
	  *  
	  *  
	  *  

package Pattarn;

public class pattarn62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j==2||i==0)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

63).Pattarn no 63

	*   *
	*   *
	*   *
	*   *
	*   *
	*   *
	 *** 

package Pattarn;

public class pattarn63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=5;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if((j==0&&i<6)||(j==4&&i<6)||(i==6&&j>0&&j<4))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}

64).Pattarn no 64

	*           *
	 *         * 
	  *       *  
	   *     *   
		*   *    
		 * *     
		  *      

package Pattarn;

public class pattarn64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=13;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j-i==0||j+i==12)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}


	}

}

65).Pattarn no 65

	*  *  *
	* * * *
	**   **
	*     *

package Pattarn;

public class pattarn65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=4;
		int jrange=7;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if((j==0||j==6||j-i==3||j+i==3))
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}

}

66).Pattarn no 66

	*     *
	 *   * 
	  * *  
	   *   
	  * *  
	 *   * 
	*     *

package Pattarn;

public class pattarn66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=7;
		//char cnt='A';
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if(j+i==6 || j-i==0)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}

67).Pattarn no 67

	*     *
	 *   * 
	  * *  
	   *   
	   *   
	   *   
	   *   

package Pattarn;

public class pattarn67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=7;
		//char cnt='A';
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if((j+i==6&&i<4)|| (j-i==0&&i<4)||(j==3&&i>3))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}

68).Pattarn no 68

	*******
		 * 
		*  
	   *   
	  *    
	 *     
	*******

package Pattarn;

public class pattarn68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=7;
		for (int i = 0; i < irange; i++) {
			for (int j = 0; j <jrange; j++) {
				if(i==0 || i==6 || j+i==6)
				{
					System.out.print("*");
					
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		

	}

}
	