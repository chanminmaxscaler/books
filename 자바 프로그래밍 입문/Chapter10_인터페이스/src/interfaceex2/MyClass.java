package interfaceex2;

public class MyClass implements MyInterface{

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myInterface() {
		System.out.println("myMethod()");
	}
	
	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		
		X xClass = myclass;
		xClass.x();
	}

}
