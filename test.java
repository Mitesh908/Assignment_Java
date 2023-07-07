class A
{
	int x = 10;
}
class B extends A
{
	int x =20;
	public void showB() {
		System.out.println("parent x = " + super.x);
		System.out.println("Child x  =" + x);
	} // super is also an implicit variable similar to this but 
}       //it refer only the super class part
public class Test1 {

	public static void main(String[] args) {
	   B  b1 = new B();  
        b1.showB();
        //System.out.println(b1.super.x);  dont write like this it should be ue only with subclass
	}

}
