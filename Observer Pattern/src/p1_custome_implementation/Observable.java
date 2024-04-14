package p1_custome_implementation;

public interface Observable {
	void register(Observer o);
	void unregister(Observer o);
	void notifyObservers();
}
