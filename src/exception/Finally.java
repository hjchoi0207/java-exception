package exception;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		int i,j;
		Scanner scanner = new Scanner(System.in);
				
		int[] Arr = {1,2,3,4,5};
		
		System.out.println("Before Exception");
		
		try {//예외가 발생 할 것들을 넣어주고 catch
			System.out.println("input i :");
			i = scanner.nextInt();
			System.out.println("input j :");
			j =scanner.nextInt();
			
			for(int k=0;k<Arr.length +1;k++) {
				System.out.println(Arr[k]);
			}
			
			System.out.println("never exec"); //실행되지 않음
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Always exec");
		}
		System.out.println("After Exception");
	}

}
