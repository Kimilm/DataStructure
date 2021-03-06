package kimilm;

public class STK<T> implements QnSTK<T> {
	private Node<T> head;
	private int count;

	public STK() {
		head = null;
		count = 0;
	}

	@Override
	public void push(T value) {
		Node<T> temp = new Node<T>(value);

		temp.setNext(head);
		head = temp;

		++count;
		temp = null;
	}

	@Override
	public T pop() {
		if (count == 0) {
			return null;
		}

		T value = head.getValue();

		head = head.getNext();

		--count;

		return value;
	}

	@Override
	public T door() {
		return head.getValue();
	}

	@Override
	public boolean isEmpty() {
		return count != 0;
	}

	@Override
	public int length() {
		return count;
	}

	@Override
	public void clean() {
		while (head != null)
			head = head.getNext();

		count = 0;
	}

	@Override
	public String toString() {
		return head == null ? null : head.toString();
	}

}
