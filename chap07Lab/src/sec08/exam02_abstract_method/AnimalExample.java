package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println("일반 인스턴스");
		dog.sound();
		cat.sound();
		System.out.println("--------");
		
		// 변수의 자동타입 변환
		Animal animal = null;
		System.out.println("변수의 자동타입 변환");
		animal = new Dog(); // 부모형 <- 자식형
		animal.sound();
		animal = new Cat(); 
		animal.sound();
		System.out.println("--------");
		
		// 매개변수의 자동타입 변환
		System.out.println("매개변수의 자동타입 변환");
		animalSound(dog);
		animalSound(cat);
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
