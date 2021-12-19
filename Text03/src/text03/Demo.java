package text03;

interface Animal{
	public abstract void move(); 
}

public class Demo {
	public static class Tiger implements Animal{
		public void move() {
			System.out.println("老虎会跑");
		}
	}
	public static class Bird implements Animal{
		public void move() {
			System.out.println("鸟会飞");
		}
	}
	public static class Fish implements Animal{
		public void move() {
			System.out.println("鱼会游");
		}
	}
	public static void main(String[] args) {
		Animal t = new Tiger();
		t.move();
		Animal b= new Bird();
		b.move();
		Animal f = new Fish();
		f.move();
	}
}
