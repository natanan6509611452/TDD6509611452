package core;

public class Stack implements IStack {

	private int size;
	private int top;
	private int count;
	private Object[] dataList;
	
	public Stack() {
		size = 5;
		top = -1;
		count = 0;
		dataList = new Object[size];
	}
	
	public Stack(int size) {
		this.size = size;
		top = -1;
		count = 0;
		dataList = new Object[size];
	}
	
	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public boolean isFull() {
		return count == size;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public Object getTop() {
		return dataList[top];
	}

	@Override
	public Object pop() {
		Object tmp = dataList[top];
		dataList[top--] = null;
		count--;
		return tmp;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void push(Object data) throws ArrayIndexOutOfBoundsException {
		if (count < size){			
			dataList[++top] = data;
			count++;
		}
		else {
			throw new ArrayIndexOutOfBoundsException("");
		}		
	}

}
