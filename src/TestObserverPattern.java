
public class TestObserverPattern {

	public static void main(String[] args) {
		myObservable cOb = new ConcreteObservable();
		
		myObserver ob1 = new ConcreteObserverA();
		myObserver ob2 = new ConcreteObserverB();
		
		cOb.attach(ob1);
		cOb.attach(ob2);
		cOb.setState("beans and peas");
		cOb.setState("more beans, more peas");
		
		cOb.detach(ob1);
		cOb.setState("just peas");
	}

}
