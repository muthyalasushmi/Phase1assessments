package assistedprojectsPhase1;
public class Thread13{
  public static void main(String[] args){
	  Thread1 a1=new Thread1();
	  a1.start();
  }
  }
class Thread1 extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("thread creation mechanism");
		}
	}
}