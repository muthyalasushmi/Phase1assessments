package assistedprojectsPhase1;

public class StringBuffering9 {

	public static void main(String[] args) {
	  StringBuffer sb=new StringBuffer("Hii "); 
		
		sb.append("friend");        //now original string is changed  
		System.out.println(sb);   //prints Hello Java  
		
		sb.insert(1,"frd");     //now original string is changed  
		System.out.println(sb);  
		
		sb.replace(1,3,"frds");  
		System.out.println(sb);
		
		sb.delete(1,3);  
		System.out.println(sb);
		
		sb.reverse();  
		System.out.println(sb);
		
		System.out.println(sb.charAt(3));
		
		StringBuilder ss = new StringBuilder("best");
		
		System.out.println(">>>>>>>"+ ss);
		ss.append("friend");
		System.out.println(">>>>>>>"+ ss);
		System.out.println(ss.length());
		System.out.println(ss.charAt(6));
		System.out.println(ss.reverse());
		
		
	}

}
