import java.util.*; 
public class GeneratePalindrome {

	public static String getValidPalindrome(int b,int c,int d) {

		//Method designed with sole intention of generating valid palindrome with given numeric Set
		String special= "$#_";
		String alpha ="abcdefghijklmnopqrstuvwxyz";
		String numeric ="0123456789";
		String out="";
		String temp="";
		String finalOutput="";
		Random rd = new Random(); 
		StringBuilder salpha = new StringBuilder(b);
		StringBuilder snum = new StringBuilder(c);
		StringBuilder sspec = new StringBuilder(d);



		for (int i = 0; i < (b%2==0?b/2:b/2+1); i++) {

			salpha.append(alpha.charAt(rd.nextInt(alpha.length())));

		}



		for (int i = 0; i < (c%2==0?c/2:c/2+1); i++) {

			snum.append(numeric.charAt(rd.nextInt(numeric.length())));

		}

		

		for (int i = 0; i < (d%2==0?d/2:d/2+1); i++) {

		    sspec.append(special.charAt(rd.nextInt(special.length())));

		}

		

		if(c%2!=0)

		{

			out = salpha.append(sspec).append(snum).toString();
			temp=out.substring(0, out.length()-1);

		}

		

		else if (b%2!=0) 

		{

			out = sspec.append(snum).append(salpha).toString();
			temp=out.substring(0, out.length()-1);

		}	else if (d%2!=0) {

			out = salpha.append(snum).append(sspec).toString();
			temp=out.substring(0, out.length()-1);

		}

			

		else

			out = salpha.append(snum).append(sspec).toString();

		

		



		

		if(temp!="")

		{

			StringBuilder tempRev=new StringBuilder(temp);

			finalOutput = out+tempRev.reverse().toString();

			

		}

		else {

			StringBuilder tempRev=new StringBuilder(out);

			finalOutput= out+tempRev.reverse().toString();

		}

		return finalOutput;

		

	}

public static void main(String args[]) 

{ 

	Scanner sc= new Scanner(System.in);   

 try {

	System.out.print("Enter w: ");  

	int w= sc.nextInt();

	

	if (w<=0 || w>20) {

		System.out.println("Invalid range");

		System.exit(0);

	}

	System.out.print("Enter x: ");  



	int x= sc.nextInt();  

	if (x<=0 || x>w) {

		System.out.println("Invalid range");

		System.exit(0);

	}

	

	

	System.out.print("Enter y: "); 

	int y= sc.nextInt();

	if (y<=0 || y>w) {

		System.out.println("Invalid range");

		System.exit(0);

	}

	System.out.print("Enter z: "); 

	int z= sc.nextInt();

	if (z<=0 || z>w) {

		System.out.println("Invalid range");

		System.exit(0);

	}

	

	int test=0;



	test=x%2+y%2+z%2;

	

	//Check if input is valid

	if( w != x+y+z )

	{

		System.out.println("Wrong Input!!");

		System.exit(0);

		

		

	}

	//To check if more than one character in palindrome is odd. If true then this cannot be a valid inputs for palindrome

	if(test>1)

		System.out.println("Invalid Palindrome");

	else

	{

	

		System.out.println("Valid Palindrome - "+getValidPalindrome(x,y,z));

	}

  }

 catch(InputMismatchException e1){

	 System.out.println("Wrong Input!!");

	 

 }

  catch(Exception e){

	  e.printStackTrace();

	}
    

} 



}

