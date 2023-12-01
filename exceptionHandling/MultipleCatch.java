package exceptionHandling;

public class MultipleCatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int[] arr=new int[5];
			arr[5]=30/0;
		}
		catch(ArithmeticException e){
			System.err.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("Array Index Out Of Bounds Exception occurs");
		}
		catch(Exception e){
			System.err.println("Parent Exception occurs");
		}

	}
}
