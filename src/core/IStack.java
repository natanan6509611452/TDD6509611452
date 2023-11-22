package core;

public interface IStack {
	boolean isEmpty();
	boolean isFull();
	int getSize();
	Object getTop();
	Object pop();
	int getCount();
	void push(Object data) throws ArrayIndexOutOfBoundsException;
}
