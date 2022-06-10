package que1;
import java.util.Scanner;

class Pizza{
	 String pizzabase;
	 int price;
	 
	 Pizza()
	 {
		 this.pizzabase="Pita";
		 this.price = price;
	 }
	
		public void display()
		{
			System.out.println("pizzabase ="+pizzabase);
		}
	 
}

class ChickenPizza1 extends Pizza
{
	String topping;
	
	ChickenPizza1()
	{	
		super();
	    super.price=200;
		this.topping ="Chicken Topping";
	}
	
	 public void display() 
	{    super.display();
		System.out.println("You have choosen Pizza with "+ topping+" for: Rs."+ super.price );
		System.out.println("Thank you ! Visit Again....");
	}

}
	
class MuttonPizza1 extends Pizza
{
	String flavouredtopping;
	
	MuttonPizza1()
	{    super();
		super.price=300;
		 this.flavouredtopping="Mutton topping";
	}

	
	 public void display() 
	{   
		 Pizza p = new Pizza();
		 p.display();
		System.out.println("You have choosen Pizza with "+ flavouredtopping+" for: Rs."+ super.price );
		System.out.println("Thank you ! Visit Again....");
	}
}
public class PizzaHut {
	public static void main(String[] args) 
	{
      Pizza p = new Pizza();
		ChickenPizza1 c = new ChickenPizza1();
		MuttonPizza1 m = new MuttonPizza1();
		int ch;
		do {
			Scanner s= new Scanner(System.in);
		System.out.println("Prizes of Chickenpizzza : RS 200and MuttonPizza:RS.300");
		System.out.println("Please select choice \t 1) ChickenPizza \t 2) MuttonPizza:");
		ch =s.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println("FOR CHICKEN-PIZZA");
			c.display();
			break;
		}
		case 2:
		{

			System.out.println("FOR MUTTON-PIZZA");
			m.display();
			break;
		}
		default:
		{
			System.out.println("Invalid choice!!");
			break;
		}
		}
		}while(ch>3);
		
		
		}
		
}