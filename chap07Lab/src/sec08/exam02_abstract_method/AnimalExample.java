package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println("�Ϲ� �ν��Ͻ�");
		dog.sound();
		cat.sound();
		System.out.println("--------");
		
		// ������ �ڵ�Ÿ�� ��ȯ
		Animal animal = null;
		System.out.println("������ �ڵ�Ÿ�� ��ȯ");
		animal = new Dog(); // �θ��� <- �ڽ���
		animal.sound();
		animal = new Cat(); 
		animal.sound();
		System.out.println("--------");
		
		// �Ű������� �ڵ�Ÿ�� ��ȯ
		System.out.println("�Ű������� �ڵ�Ÿ�� ��ȯ");
		animalSound(dog);
		animalSound(cat);
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
