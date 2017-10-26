package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
//		try
//		{
//			
//		}
//		catch()
//		{
//			
//		}
		
		try {
			//throw new IndexOutOfBoundsException(); //Prinuditelna wyzywa Error:"IndexOutOfBoundsException"
			System.out.println("blabla");
			
			//int i = 1;
			//int j = 10;
			Dog jake = new Dog();
			Dog graf;
			
			int dogage = jake.getAge(2017);
			
			System.out.println(dogage);
			
//			//Punkt 4
//			graf = create_dog();
//			System.out.println(graf);
//			//Punkt 4
			
//			int i = 1;
//			System.out.println("What do now?");
//			System.out.println(i + ") Add new object");
//			i++;
//			System.out.println(i + ") Print all object list");
//			i++;
//			System.out.println(i + ") Save selected object as file");
//			i++;
//			System.out.println(i + ") Exit");
//			i++;
//			
//			Scanner sc = new Scanner(System.in);
//			
//			int choice = sc.nextInt();
//			
//			while(choice < 1 || choice > 4)
//			{
//				System.out.println("Invalid choice, please choose an existing option...");
//				choice = sc.nextInt();
//			}
			Scanner sc = new Scanner(System.in);
			int choice = get_choice(sc);
			
			while (choice != 4)
			{
				switch (choice)
				{
				case 1:
					//Create object
					System.out.println(create_dog(sc));
					break;
				case 2:
					//Print list
					break;
				case 3:
					//Save as file
					break;
				}
				choice = get_choice(sc);
			}
			//sc.close();
			System.exit(0);
			//sc.close();
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block

			System.out.println("Oops");
			e.printStackTrace();
		}
	}
	
	private static Dog create_dog(Scanner sc)
	{
		String breed = "";
		String gender = ""; 
		String name = "";
		int birth = 0;
		int weight = 0;
		Dog ret_dog;
		
		
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your dogs breed?");
//		if(sc.hasNext())
//		{
			breed = sc.nextLine();
			while(breed.isEmpty())
			{
				System.out.println("NO INPUT!!!!! :C");
				System.out.println("PLEASE INPUT");
				breed = sc.nextLine();
			}
			System.out.println("What is your dogs gender?");
			gender = sc.nextLine();
			System.out.println("What is your dogs name?");
			name = sc.nextLine();
			System.out.println("What is your dogs year of birth?");
			birth = sc.nextInt();
			System.out.println("What is your dogs weight?");
			weight = sc.nextInt();
//		}
//		else 
//		{
//			//read garbage
//			sc.nextLine();
//			
//			breed = sc.nextLine();
//			while(breed.isEmpty())
//			{
//				System.out.println("NO INPUT!!!!! :C");
//				System.out.println("PLEASE INPUT");
//				breed = sc.nextLine();
//			}
//			System.out.println("What is your dogs gender?");
//			gender = sc.nextLine();
//			System.out.println("What is your dogs name?");
//			name = sc.nextLine();
//			System.out.println("What is your dogs year of birth?");
//			birth = sc.nextInt();
//			System.out.println("What is your dogs weight?");
//			weight = sc.nextInt();
//		}
		//sc.close();
		
		if(!breed.isEmpty() && !gender.isEmpty() && !name.isEmpty() && birth != 0 && weight != 0)
			ret_dog = new Dog(breed, gender, name, birth, weight);
		else
			ret_dog = new Dog();
		
		return ret_dog;
	}
	
	private static int get_choice(Scanner sc)
	{
		int i = 1;
		System.out.println("What do now?");
		System.out.println(i + ") Add new object");
		i++;
		System.out.println(i + ") Print all object list");
		i++;
		System.out.println(i + ") Save selected object as file");
		i++;
		System.out.println(i + ") Exit");
		i++;
		
		//Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		while(choice < 1 && choice > 4)
		{
			System.out.println("Invalid choice, please choose an existing option...");
			choice = sc.nextInt();
		}
		//sc.nextLine();
		//sc.close();
		
		return choice;
	}

}
