package array;

public class App {

	public static void main(String[] args) {
		Array a = new Array(5);
		a.insert(15);
		a.insert(6);
		a.insert(1);
		a.insert(8);
		a.insert(2);
		for(int i =0;i<a.length();i++) {
			System.out.println(a.getElement(i));
		}
		//System.out.println(a.find(4));
		a.delete(3);
		System.out.println();
		for(int i =0;i<a.length();i++) {
			System.out.println(a.getElement(i));
		}
		
		System.out.println();
		System.out.println(a.findBi(1));
	}

}
