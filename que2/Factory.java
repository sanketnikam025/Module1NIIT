package que2;
import java.util.Scanner;

class FourWheeler{
	String name;
	int cc;
	int safety;
	int price;
	FourWheeler(String n,int c,int sft,int p){
		this.name=n;
		this.cc=c;
		this.safety=sft;
		this.price=p;
	}
	void VehicleException() {
		System.out.println("Enter Available cc: ");
		Scanner s=new Scanner(System.in);
		int carcc=s.nextInt();
		if(carcc<1000||carcc>4000) {
			System.out.println("It is a two wheeler,not four wheeler");
		}
	}
	void display()  {
		System.out.println(name+" "+cc+" "+safety+" "+price);
	}
	void UnsafetyException() {
		System.out.println("Enter safety value: ");
		Scanner s=new Scanner(System.in);
		int sftvvl=s.nextInt();
		if(sftvvl!=5) {
			System.out.println("Sorry,Invalid safety features");
		}
		
	}
}
public class Factory {

	public static void main(String[] args) {
		FourWheeler c1=new FourWheeler("Honda City",1200,5,1500000);
		c1.display();
		c1.VehicleException();
		c1.UnsafetyException();
		FourWheeler c2=new FourWheeler("Hyundai Verna",1500,5,1400000);
		c2.display();
		c2.VehicleException();
		c2.UnsafetyException();
		FourWheeler c3=new FourWheeler("Honda Jazz",900,4,500000);
		c3.display();
		c3.VehicleException();
		c3.UnsafetyException();
		FourWheeler c4=new FourWheeler("Maruti Ciaz",1300,6,1000000);
		c4.display();
		c4.VehicleException();
		c4.UnsafetyException();
	}
}