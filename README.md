## Exception

Exception(예외처리)이란 프로그램에 문제가 있을 때 프로그램 전체가 멈추는것을 막는 것이다 그리고 이것은 Error와는 다르게 
사용자(즉s/w)가 대처할 수 있다 또한 반드시 예외처리가 필요한 예외처리를 **CheckedException**이라 하고 필수적이지 않고 프로그래머의
판단에 맡기는 예외처리를 **UnCheckedException** 이라고 한다.


### 예제 1 try~catch
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

### 출력결과

```
Exception Before
java.lang.ArrayIndexOutOfBoundsException: 3
	at exception.TryCatch.main(TryCatch.java:16)
msg : 3
Exception After
```

***

### 예제 2 finally

```java
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		int i,j;
		Scanner scanner = new Scanner(System.in);
				
		int[] Arr = {1,2,3,4,5};
		
		System.out.println("Before Exception");
		
		try {
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
```

Exception에서 주의할 점은 **프로그램** 의 실행이 계속되며 **try** 에 존재하는 에러코드 이후의 명령어들은 실행되지 않는다는 것이다.
그렇게 되면 try 내에 꼭 실행해야 할 명령어들이 실행되지 못하고 넘어가버리는 경우가 생길지도 모른다. 이 때 **finally** 를 이용하면
try문에서 문제가 발생하더라도 사용자가 실행하고싶은 명령어들을 기입할 수 있게된다. 

**그래서 try, catch, finally를 함께 사용한다고 생각하면 좋다.**
```
Before Exception
input i :
10
input j :
20
1
2
3
4
5
java.lang.ArrayIndexOutOfBoundsException: 5
Always exec
After Exception
	at exception.Finally.main(Finally.java:22)
```
예제 2의 실행결과이다. 배열의 크기보다 큰(length+1)인덱스에 대하여 연산을 try에서 시도하였고 그로인해 밑에줄에 System.out.println("never exec");
문장은 실행되지 않는다 그러나 finally에 선언된 System.out.println("Always exec");은 문제없이 실행되는 것을 보여준다.

***

### 예제 3 throws

```java
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
```
