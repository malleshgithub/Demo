
public class ArithExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	try{
int data=50/0;//may throw exception
System.out.println("exception"+data);
}catch(ArithmeticException ae){
	System.out.println(ae);
}
	try{
		int a[]=new int[5];
		a[5]=10;
		
	}catch (ArrayIndexOutOfBoundsException aie) {
		System.out.println("arrayindex"+aie);
	}

	}catch(Exception e){
		System.out.println(e);
	}
System.out.println("rest of the code");
}
}
