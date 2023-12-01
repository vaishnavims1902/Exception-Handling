package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int[] arr=new int[5];
			arr[5]=30/0;
		}
		catch(ArithmeticException e){
			System.err.println("Arithmetic Exception occurs");
		}

	}

}
