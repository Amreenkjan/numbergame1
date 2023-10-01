
	import java.util.Scanner;
	 class numbergame {
		 public int generate(int max,int min) {
			 
			 return(int)(Math.random() + (max-min +1)+min);
			 
		 }

	}
	/**
	* main
	*/
	public class main{
		
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			numbergame ng=new numbergame();
			int totalattempts=0;
			int win = 0;
			
			while(true) {
				System.out.println("enter the maximum number");
				int max=sc.nextInt();
				System.out.println("enter the minimum number");
				int min=sc.nextInt();
				sc.nextLine();
				
				int cnum=ng.generate(max, min);
				//System.out.println(cnum);
				int attempts= 0;
				
			while(true) {
				System.out.println("guess a number between"+max+" and "+min);
				int gnum=sc.nextInt();
				attempts++;
				
				if(gnum > cnum) {
					System.out.println("its greater");
				}else if(max<min) {
					System.out.println("its smaller");
				}else {
					System.out.println("correct guess");
					win++;
					break;
				}
				}
			totalattempts+= attempts;
			System.out.println("attempts ="+attempts);
			System.out.println("wins="+win);
			 
			double winrate=(double)win/totalattempts+100;
	
			
			System.out.printf("your winrate is "+ winrate);
			
			System.out.println("Do you want to play again(yes/no)");
			String playagain=sc.next();
			
			
			if(!playagain.equalsIgnoreCase("yes")) {
				sc.close();
				
				System.exit(0);
			}
			sc.nextLine();
			}	}
			}
		
		//I think the code is done
	//lets test


