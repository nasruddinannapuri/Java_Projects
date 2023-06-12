package labprograms;

public class FactoryDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory obj = new FruitFactory();
		Fruit fruits = obj.provideFruit("Banana");
		fruits.provideJuice();
	}

}

interface Fruit{
	void provideJuice();
}

class Banana implements Fruit{
	public void provideJuice() {
		System.out.println("Here is the Banana Juice");
	}
}
class Apple implements Fruit{
	public void provideJuice() {
		System.out.println("Here is the Apple Juice");
	}
}
class Orange implements Fruit{
	public void provideJuice() {
		System.out.println("Here is the Orange Juice");
	}
}

interface factory{
	Fruit provideFruit(String name);
}
class FruitFactory implements factory{
	public Fruit provideFruit(String name) {
		switch(name) {
		case "Banana":
			return new Banana();
		case "Apple":
			return new Apple();
		default:
			return new Orange();
		}
	}
}
