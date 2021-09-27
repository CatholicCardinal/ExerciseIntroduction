package fedorov;
import java.util.ArrayList;

public class ex14 {
	public static void main(String[] args) {
		Book first = new Book("Harry Potåer", "Dg Rouling", 100, 3, 1);
		Book second = new Book("Alice in Wonderfull", "Luis Kerol", 60, 5, 2);
		Book third = new Book("Cooking", "Ostin Jhon", 30, 3, 3);
		Book fouth = new Book("Family", "Jhon Scala", 140, 2, 4);
		Book fiveth = new Book("Kinght", "Luis Kostin", 30, 3, 5);
		Book sixth = new Book("Peace and war", "Lev Tolstoy", 60, 5, 6);
	
		ArrayList<Book> place = new ArrayList<Book>();
		place.add(sixth);
		place.add(fiveth);
		place.add(fouth);
		place.add(third);
		place.add(second);
		place.add(first);
		
		first.bubleSort(place);
		
		for (int i = 0; i < 5; i++) {
			   System.out.println(place.get(i));
			}
}
}