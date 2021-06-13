
public abstract class CaffeineBeverage {

	// TODO Create a final method prepareReceipe()
	// Which will be called by client
	// This shall make calls to concrete and abstract methods
	// 1.call boilWater()
	// 2.call brew()
	// 3.addCondiments()
	// 4. pourInCup()
	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
