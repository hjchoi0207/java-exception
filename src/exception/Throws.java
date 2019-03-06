package exception;

public class Throws {

	public static void main(String[] args) {
		
		Throws lecture = new Throws();
		
		try {
			lecture.first();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void first() throws Exception{
		second();
	}
	
	public void second() throws Exception{
		third();
	}
	
	public void third() throws Exception{
		System.out.println(10/0);
	}

}
