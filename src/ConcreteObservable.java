import java.util.ArrayList;

public class ConcreteObservable implements myObservable {
	private ArrayList<myObserver> subbies;
	private String state;
		
	public ConcreteObservable() {
		this.subbies = new ArrayList<myObserver>();
	}
	@Override
	public void attach(myObserver observer) {
		this.subbies.add(observer);
	}

	@Override
	public void detach(myObserver observer) {
		for (myObserver y : this.subbies) {
			if (y.equals(observer)) {
				this.subbies.remove(observer);
			}
		}
	}

	@Override
	public void allnotify() {
		for (myObserver y : this.subbies) {
			y.update(this.getState());
		}
	}
	
	public String getState() {
		return this.state;
	}
	@Override
	public void setState(Object object) {
		this.state = (String) object;
		this.allnotify();
	}

}
