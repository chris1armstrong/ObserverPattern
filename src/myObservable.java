
public interface myObservable {

		public void attach(myObserver observer);
		public void detach(myObserver observer);
		public void allnotify();
		public void setState(Object object);
		public Object getState();
}
