package fedorov;

import java.util.ArrayList;

public class Book implements Comparable {
	private int isbn;
	private String title;
	private String author;
	private int price;
	private int edition;
	
	public Book(String title, String author, int price, int edition, int isbn)
	{
		this.setIsbn(isbn);
		this.setTitle(title);
		this.setAuthor(author);
		this.setPrice(price);
		this.setEdition(edition);
	}
	
	public ArrayList<Book> bubleSort(ArrayList<Book> list)
	{
		Book temp;
		for(int k = 1 ; k > 0;)
		{
			k = 0;
			for(int i=0; i<list.size()-1; i++)
			{
				if(list.get(i).getIsbn()>list.get(i+1).getIsbn())
				{
					temp = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, temp);
					k++;
				}
			}
		}
		
		return list;
	}
	
	
	@Override
    public String toString() {
        return "Book [title=" + getTitle() 
                + ", author=" + getAuthor() 
                + ", price=" + getPrice()
                + ", edition=" + getEdition() +"isbn=" + getIsbn() + "]";
    }
	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}
}