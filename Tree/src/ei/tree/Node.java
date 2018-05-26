package ei.tree;

public class Node<T> {
	Node<T> left;
	Node<T> right;
	T value;
	
	public Node(T t) {
		this.value = t;
	}
	
	public static void main(String[] args) {
		doIt(1, 2);
	}
	
	static int doIt(int a, int b){
		int c = 10;
		System.out.println(a + b);
		return c;
	}
}
