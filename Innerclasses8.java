package assistedprojectsPhase1;
class clg{
    String student="sushmitha";
    // nested class
    class dept{

        // members of nested class
        double section;
        String students;

        String getCache(){
            return student;
        }
    }

    // nested protected class
    protected class CSE{

        // members of protected nested class
        double rollnumber;
        String student;

        double getClockSpeed(){
            return 534.8;
        }
    }
}

public class Innerclasses8 {
	public static void main(String[] args) {

        // create object of Outer class CPU
        clg cpu = new clg();

       // create an object of inner class Processor using outer class
        clg.dept processor = cpu.new dept();

        // create an object of inner class RAM using outer class CPU
        clg.CSE ram = cpu.new CSE();
        
        System.out.println("NAME of the student = " + processor.getCache());
        System.out.println("Department of clg = " + ram.getClockSpeed());
    }
}


		
	


