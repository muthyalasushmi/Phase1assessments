package assistedprojectsPhase1;
//...........default constructor..........
class EmpInfo{
	int id=534;
	String name="sushmi";

void display() {
	System.out.println(id+" "+name);
	}
}

//.................parameterized constructor......
class Std{
	String name;
	int id;
	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(+id+" "+name);
	}
    }

public class Constructer5 {
	

	public static void main(String[] args) {
		EmpInfo emp1=new EmpInfo();

		emp1.display();
		
		
		Std std1=new Std(2,"Alex");
		Std std2=new Std(10,"Annie");
		std1.display();
		std2.display();

		}
	    }


