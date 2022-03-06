package assistedprojectsPhase1;
public class methods4 {
	int calculate(int a,int b)
    {
    System.out.println("Addition of two numbers : "+(a+b));
    return a+b;
   }

float calculate(int r) 
{
    System.out.println("Area of Circle : "+(3.14*r*r));
    return 3.14F*r*r;
}
int calculate (int l,long b)
{
	System.out.println("area of rectangle "+(l*b));
	return (int) (l*b);
	
}
	public static void main(String[] args) {
		methods4 ob=new methods4();
	     ob.calculate(122,122);
	     ob.calculate(10);
	     ob.calculate(5,12314L);
	}

}
