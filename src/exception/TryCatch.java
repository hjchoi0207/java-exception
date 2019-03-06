package exception;

public class TryCatch {

	public static void main(String[] args) {
		int i=10;
		int r = 0;
		int j=0;
		
		int[] arr = {0,1,2};
		
		System.out.println("Exception Before");
		
		try {
			arr[3] =10;
			//r = i/j;
		}
		catch(Exception e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("msg : " + msg);
		}
		
		System.out.println("Exception After");
		
	}

}
