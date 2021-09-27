package fedorov;

public class ProgrammerBook extends Book{
	private String language;
	private int level;
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public ProgrammerBook(String title, String author, int price, int edition, String language, int level) {
		super(title, author, price, edition);
		this.setLanguage(language);
		this.setLevel(level);
	}
	
	@Override
    public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (obj == null || obj.getClass() != this.getClass()) {
        return false;
    }

    ProgrammerBook guest = (ProgrammerBook) obj;
    return getTitle() == guest.getTitle()
        && getAuthor() == guest.getAuthor() 
        && getPrice() == guest.getPrice()
        && getEdition() == guest.getEdition()
        && getLevel() == guest.getLevel()
    	&& getLanguage() == guest.getLanguage();
    }
	
	@Override
    public int hashCode() {
		final int prime = 31;
		int result = 1;
    
		result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());             
		result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());    
		result = prime * result + getPrice();
		result = prime * result + getEdition(); 
		result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode()); 
		result = prime * result + getLevel(); 
		return result;
    }
	
	@Override
    public String toString() {
        return "Book [title=" + getTitle() 
                + ", author=" + getAuthor() 
                + ", price=" + getPrice()
                + ", edition=" + getEdition()
                + ", language=" + getLanguage()
                + ", level=" + getLevel() + "]";
    }

}
