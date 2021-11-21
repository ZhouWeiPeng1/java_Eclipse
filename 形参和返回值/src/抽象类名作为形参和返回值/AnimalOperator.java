package 抽象类名作为形参和返回值;

public class AnimalOperator {
	
	public void useAnimal(Animal a) {
		a.eat();
	}
	
	public Animal getAnimal() {
		Animal a = new Cat();
		return a;
	}
}
