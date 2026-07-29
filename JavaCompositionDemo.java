package JavaCompotions;

/*
 * Containment
 * 
 * 
 * 
 * 
 * 
 * 
 * it represents a "has-a" relationship'
 * unlike inheritance represents an "is-a" relationship.
 * 
 * Key Points:
 * 1) Has-A relationship - A class has another class object.
 * 2) Code Re-usability - instead of inheriting, 
 *                       you can reuse functionality by including 
 *                       object of another class.
 * 3) Flexibility - 
 * 
 * 
 */
class Engine
{
	void start()
	{
		System.out.println("Engine is Starting");
	}
}
class Car
{
	Engine eng;
	
	Car()
	{
		eng = new Engine();
	}
	
	void drive()
	{
		eng.start();
		System.out.println("Car is Driving");
	}
}

public class JavaCompositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car ob = new Car();
        ob.drive();
	}

}
