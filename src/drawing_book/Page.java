package drawing_book;

public class Page {

	private int first_page;
	private int last_page;
	
	public Page(int first_page, int last_page) {
		super();
		this.first_page = first_page;
		this.last_page = last_page;
	}

	public int getFirst_page() {
		return first_page;
	}

	public void setFirst_page(int first_page) {
		this.first_page = first_page;
	}

	public int getLast_page() {
		return last_page;
	}

	public void setLast_page(int last_page) {
		this.last_page = last_page;
	}
	
}
