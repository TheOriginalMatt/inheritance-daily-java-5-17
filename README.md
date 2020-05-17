# Inheritance
## Daily Java Project for: 5/17/2020

### Description:

Super simple Interface practice 

### Daily Java Projects
I'm creating a small Java project each day to help me learn Java. These aren't rigorously tested, but instead exist just so I can get a better understanding of some portion of Java.

### Points of Interest
 + This was an uneventful daily java project, but I did get some practice in with Generic classes and that's always good

### Compiling

There is a build file using ant, which can be run by `$ant` and running `Parent.class` in `/build`, or you can go into `./src` and compile it by hand

### Using `SuperClass`
Example - Comparing using `SuperClass` or one of its child classes for some super simple tasks

```
public class Parent {
	public static void main(String args[]) {
		MySimpleIntObject intObj1 = new MySimpleIntObject();
		MySimpleIntObject intObj2 = new MySimpleIntObject();

		MySimpleStrObject strObj1 = new MySimpleStrObject();
		MySimpleStrObject strObj2 = new MySimpleStrObject();

		intObj1.setObj(15);
		strObj1.setObj("15");

		intObj2.setObj(15);
		strObj2.setObj("15");

		System.out.println(intObj1);
		System.out.println(strObj1);		

		System.out.println(intObj1.equals(intObj2));
		System.out.println(strObj1.equals(strObj2));

		System.out.println(intObj1.equals(strObj1));
		System.out.println(strObj1.equals(intObj2));

		intObj2.setObj("25");

		System.out.println(intObj1.equals(intObj2));
	}
}

```

### Documentation

No more handwritten documentation for me!

[`SuperClass`](https://theoriginalmatt.github.io/inheritance-daily-java-5-17/SuperClass.html)

[`SubClassA`](https://theoriginalmatt.github.io/inheritance-daily-java-5-17/SubClassA.html)

[`SubClassB`](https://theoriginalmatt.github.io/inheritance-daily-java-5-17/SubClassB.html)

[`OtherClass`](https://theoriginalmatt.github.io/inheritance-daily-java-5-17/OtherClass.html)