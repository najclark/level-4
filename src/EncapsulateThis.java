import java.util.List;

class Book {

	private List<Page> pages;

	public List<Page> getPages() {
		return this.pages;
	}

	private void setPages(List<Page> pages) {
		this.pages = pages;
	}

	public void addPage(Page p){
		pages.add(p);
	}
	
	public Page getPage(int pgNum){
		if(pgNum < 0){
			System.exit(0);
		}
		return pages.get(pgNum-1);
	}
}

class Page {
}

public class EncapsulateThis {
	public static void main(String[] args) {

		// 1. How does the Book class break encapsulation?
		//It has a setter method
		// 2. Create a Book and clear all the pages.
//		Book b = new Book();
//		b.setPages(new ArrayList<Page>());
		// 3. We shouldn't be able to do that! Adjust the Book class so that it is properly encapsulated. The previous line should no longer work.

		// 4. But we still want to be able to add a page. Create a method in Book to allow that.

		// 5. Create a method in Book that allows us to access a certain Page given its page number.
	
	}
}


