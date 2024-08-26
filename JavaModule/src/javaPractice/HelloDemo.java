package javaPractice;

 class A {
int aa=20;
public void Night()
{
	System.out.println("executing the Night method");
}
}
class B extends A{
	public void Zero()
	{
		System.out.println("executing the zero method");
	}
}
class C extends A{
	
}
class D extends B{
	
}

public class HelloDemo {
	public static void main(String[] args) {
		D obj=new D();
		System.out.println(obj.aa);
		obj.Zero();
		C obj1=new C();
		obj1.Night();
		B obj2=new B();
		obj2.Zero();
		obj2.Night();
		A obj3=new A();
		obj3.Night();
		
	}
}