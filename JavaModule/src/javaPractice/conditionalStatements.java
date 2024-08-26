package javaPractice;

public class conditionalStatements {

	public static void main(String[] args) {
		int age=4;
		if(age<18)
		{
			System.out.println("you are minor");
		}
		else if((age>18)&&(age<60))
		{
			System.out.println("you are major");
		}
			else
			{
				System.out.println("you are senior citizen");
			}
		}
	}


