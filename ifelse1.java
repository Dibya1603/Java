
public class ifelse1 {

	public static void main(String[] args) {

		int age = 17;
		if (age>=18 && age < 60)
		{
			if(age>=20 && age<30)
			{
				System.out .println("you're in 20's");
			}
			else if(age>=30 && age<40)
			{
				System.out.println("you're in 30's");
			}
			else if(age>=40 && age<50)
			{
				System.out.println("you're in 40's");
			}
			else if(age>=50 && age<60)
			{
				System.out.println("you're in 50's");
			}
			else
			{
				System.out.println("you're in adult");
			}
			
		}
		    else if(age>=60)
		    {
		    
		    	System.out.println("you're an old man");
		    }
		    else if (age>=16 && age<18)
		    {
		    	System.out.println("you're a teen ager");
		    }
		    else
		    {
		    	System.out.println("you're a kid");
		    }
			

			}
		

	}


