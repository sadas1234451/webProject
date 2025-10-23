package org.embed.book;

public class Book {
	String bookname;
	String author;
	String pub;
	String pages;
	int price;
	
	public Book(String bookname, String author, String pub, String pages, int price) {
        this.bookname = bookname;
        this.author = author;
        this.pub = pub;
        this.pages = pages;
        this.price = price;
    }
	public String getInfo() {
        return "도서명: " + bookname + 
               " | 출판사: " + pub + 
               " | 가격: " + price + "원" + 
               " | 저자: " + author + 
               " | 페이지: " + pages;
    }
    
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
