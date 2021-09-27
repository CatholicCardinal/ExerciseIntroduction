package fedorov;

public class ex12 {
	public static void main(String[] args) {
		Book first = new Book("Harry Potåer", "Dg Rouling", 100, 3);
		Book second = new Book("Alice in Wonderfull", "Luis Kerol", 60, 4);
		
		ProgrammerBook first1 = new ProgrammerBook("Fundamental C", "Dg Konor", 300, 3, "C", 1);
		ProgrammerBook second1 = new ProgrammerBook("Phylopsohy of Java", "Escell", 700, 4, "Java", 5);
		
		System.out.println(first.toString());
		System.out.println(second.toString());
		System.out.println("Is book first = second: "+first.equals(second));
		System.out.println();
		System.out.println(first1.toString());
		System.out.println(second1.toString());
		System.out.println("Is book first = second: "+first1.equals(second1));
		
		System.out.println();
		System.out.println("Clone:");
		first = second.clone();
		System.out.println(first.toString());
		System.out.println(second.toString());
		
		
	}
	
}
