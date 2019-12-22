package resources;

public class Book {
	String title;
	String author;
	
	public static void main (String [] args) {
		Book[] book = new Book[3];
		int x = 0;
		book[0] = new Book();
		book[1] = new Book();
		book[2] = new Book();
		
		book[0].title = "The Grapes of JAVA";
		book[1].title = "The JAVA Gatsby";
		book[2].title = "The JAVA cookbook";
		book[0].author = "bob";
		book[1].author = "sue";
		book[2].author = "ian";
		
		while (x < 3) {
			System.out.print(book[x].title);
			System.out.print(" by ");
			System.out.println(book[x].author);
			x = x + 1;
		}
	}
}
