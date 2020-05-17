public class Parent {
	public static void main(String args[]) {

		SuperClass sup = new SuperClass();
		sup.setInt(15);

		SubClassA subA = new SubClassA();
		subA.setStr("Hello World");
		subA.setInt(10);

		SubClassB<Float> subB = new SubClassB<>();
		subB.setObj(new Float(4.5));

		OtherClass other = new OtherClass();
		other.setSuperClass(subA);

		System.out.println(other.getInt());
	}
}