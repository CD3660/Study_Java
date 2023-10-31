package pack99.test;

public class BoardDTO {
	private String title, body, author;
	private int index;
	
	public BoardDTO(String title, String body, String author, int index) {
		this.title = title;
		this.body = body;
		this.author = author;
		this.index = index;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	
}
