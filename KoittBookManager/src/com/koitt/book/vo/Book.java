package com.koitt.book.vo;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;	
	
	private Integer isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String description;
	
	// 기본 생성자
	public Book() {}
	
	// 모든 필드 초기화하는 생성자
	public Book(Integer isbn, String title, String author, String publisher, int price, String description) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.description = description;
	}
	
	// getter setter
	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	// hashCode & equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + isbn;
		result = prime * result + price;
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// 주소 비교
		if (this == obj) {
			return true;
		}
		
		// 타입체크
		if (!(obj instanceof Book)) {
			return false;
		}
		
		// isbn 비교위해 다운캐스팅
		Book other = (Book) obj;
		if (this.isbn.equals(other.isbn)) {
			return true;
		}
		return false;
	}

	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(isbn);
		builder.append(" ㅣ ");
		builder.append(title);
		builder.append(" ㅣ ");
		builder.append(author);
		builder.append(" ㅣ ");
		builder.append(publisher);
		builder.append(" ㅣ ");
		builder.append(price);
		builder.append(" ㅣ ");
		builder.append(description);
		return builder.toString();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
