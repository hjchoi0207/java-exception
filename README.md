## Exception

Exception(예외처리)이란 프로그램에 문제가 있을 때 프로그램 전체가 멈추는것을 막는 것이다 그리고 이것은 Error와는 다르게 
사용자(즉s/w)가 대처할 수 있다 또한 반드시 예외처리가 필요한 예외처리를 **CheckedException**이라 하고 필수적이지 않고 프로그래머의
판단에 맡기는 예외처리를 **UnCheckedException** 이라고 한다.


### 예제 1
```java
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
		
		System.out.println("Exception After");//프로그램이 종료되지 않고 실행된다.
		
	}

}
```
try영역에는 예외가 발생할 수 있는코드 (0으로 정수를 나눈다거나, 배열의 인덱스 초과, null 레퍼런스이용 등)를 기입하고
catch를 이용해 발생하는 오류메세지를 기록하고(?) 프로그램을 계속 이어나간다.
--
