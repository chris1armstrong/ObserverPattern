
public class ConcreteObserverB implements myObserver {

	@Override
	public void update(Object object) {
		System.out.println(object);
		System.out.println("I am a pea lord, there are peas in my nose");
		
	}
}
