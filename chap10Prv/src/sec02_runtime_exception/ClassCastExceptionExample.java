package sec02_runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		changeDog(dog);
		System.out.println("--------");
		
		Cat cat = new Cat();
		changeDog(cat);
//		Exception in thread "main" java.lang.ClassCastException: sec02_runtime_exception.Cat cannot be cast to sec02_runtime_exception.Dog
//		at sec02_runtime_exception.ClassCastExceptionExample.changeDog(ClassCastExceptionExample.java:19)
//		at sec02_runtime_exception.ClassCastExceptionExample.main(ClassCastExceptionExample.java:12)	
	}
	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
		Dog dog = (Dog) animal;
		} else {
			System.out.println("타입 변환할 수 없습니다.");
		}
	}
}

class Animal {}
class Dog extends Animal{}
class Cat extends Animal {}
		