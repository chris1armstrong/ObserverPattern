
public class ConcreteObserverA implements myObserver {

	@Override
	public void update(Object object) {
		System.out.println(object);
		System.out.println("I am a bean lord, there are beans on my shirt");
	}
}
