package q5_constructor;

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class ParameterizedConstructor {
public static void main(String[] args) {

	Std std1=new Std(4,"Sam");
	Std std2=new Std(6,"Amit");
	std1.display();
	std2.display();
		}
}