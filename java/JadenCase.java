public class JadenCase {

	public static void main(String[] args) {
	    String[] spl = args[0].split(" ");
	    String out = "";
	    for (String i : spl) {
		out += i.toUpperCase().charAt(0) + i + " ";
		}
		System.out.println(out.trim());
	}

}
