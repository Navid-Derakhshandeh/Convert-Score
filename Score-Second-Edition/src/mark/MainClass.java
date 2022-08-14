package mark;

import java.util.Scanner;

public class MainClass 
{

	public static void main(String[] args) 
	{
				System.out.println("What's your score");
				Scanner reader = new Scanner(System.in);
				int score = reader.nextInt();
				
				char grade = 'G';
				
				if(score <= 50)
				{
					grade = 'F';
					System.out.println("Your score is F");
					
				}
				else if(score <= 55)
				{
					grade = 'D';
					System.out.println("Your score is D");
				}
				else if(score <= 60)
				{
					grade = 'C';
					System.out.println("Your score is C-");
				}
				else if(score <= 65)
				{
					grade = 'C';
					System.out.println("Your score is C");
				}
				else if(score <= 70)
				{
					grade = 'C';
					System.out.println("Your score is C+");
				}
				else if(score <= 75)
				{
					grade = 'B';
					System.out.println("Your score is B-");
				}
				else if(score <= 80)
				{
					grade = 'B';
					System.out.println("Your score is B");
				}
				else if(score <= 85) 
				{
					grade = 'B';
					System.out.println("Your score is B+");
				}
				else if(score <= 90)
				{
					grade = 'A';
					System.out.println("Your score is A-");
				}
				else if(score <= 95)
				{
					grade = 'A';
					System.out.println("Your score is A");
				}
				else if(score <= 100)
				{
					grade = 'A';
					System.out.println("Your score is A+");
				}
				else if(score > 100)
				{
					System.out.println("Your score isn't in range");
				}
				
				Scanner reader1 = new Scanner(System.in);
				char comment = reader1.next().charAt(0);
			    if(comment == 'A')
				{
			    	System.out.println("Excellent");
				}
			    if(comment == 'B')
			    {
			    	System.out.println("Well done");
			    }
			    if(comment == 'C')
			    {
			    	System.out.println("Needs more work.");
			    }
			    if(comment == 'D')
			    {
			    	System.out.println("You have passed the exam");
			    }
			    if(comment == 'F')
			    {
			    	System.out.println("You have failed the exam");
			    }

	}

}
