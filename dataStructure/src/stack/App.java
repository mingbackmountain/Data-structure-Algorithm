package stack;

public class App {

	public static void main(String[] args) {
		Stack mystatck = new Stack(5);
		mystatck.push('a');
		mystatck.push('b');
		mystatck.push('c');
		mystatck.push('d');
		
		String test = "Hello";
		System.out.println(reverseString(test));

	}
	
	public static String reverseString(String str) {
		int stackSize = str.length();
		Stack reverse = new Stack(stackSize);
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			reverse.push(ch);
		}
		
		String result = "";
		while(!reverse.isEmpty()) {
			result += reverse.pop();
		}
		return result;
	}

}
