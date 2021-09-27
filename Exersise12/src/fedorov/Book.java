package fedorov;

public class Book {
	private String title;
	private String author;
	private int price;
	private int edition;
	
	public Book(String title, String author, int price, int edition)
	{
		this.setTitle(title);
		this.setAuthor(author);
		this.setPrice(price);
		this.setEdition(edition);
	}
	
	@Override
    public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (obj == null || obj.getClass() != this.getClass()) {
        return false;
    }

    Book guest = (Book) obj;
    return getTitle() == guest.getTitle()
        && getAuthor() == guest.getAuthor() 
        && getPrice() == guest.getPrice()
        && getEdition() == guest.getEdition();
    }
	
	@Override
    public int hashCode() {
		final int prime = 31;
		int result = 1;
    
		result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());             
		result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());    
		result = prime * result + getPrice();
		result = prime * result + getEdition(); 
		return result;
    }
	
	@Override
    public String toString() {
        return "Book [title=" + getTitle() 
                + ", author=" + getAuthor() 
                + ", price=" + getPrice()
                + ", edition=" + getEdition() + "]";
    }
	
	@Override
	public Book clone()
	 {
	  Book copy = new Book( title,  author,  price, edition);
	  copy.title = this.title;
	  copy.author = this.author;
	  copy.price = this.price;
	  copy.edition = this.edition;
	  return copy;
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
