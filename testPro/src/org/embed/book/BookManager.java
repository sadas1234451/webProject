package org.embed.book;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class BookManager {

	public ArrayList<Book> BookList = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		BookManager manager = new BookManager();
		
		manager.run();
	}
	public void run() {
		int num;
		boolean running = true;
		while (running) {
				displayMenu();
				num = sc.nextInt();
                sc.nextLine(); 

                switch (num) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        System.out.println("프로그램을 종료");
                        running = false;
                        break;
                }
                System.out.println("------------------------------------------");
			}
		 sc.close(); 
		}
		public void displayMenu() {
	        System.out.println("\n*** 책 입력 시스템 ***");
	        System.out.println("1. 책 추가");
	        System.out.println("2. 종료");
	    }
		public void addBook() {
		    System.out.println("\n[ 책 추가 ]");
		    while (true) {
		        String bookname = "";
		        String author = "";
		        String pub = "";
		        String pages = "";
		        int price = 0;

		        try {
		            System.out.print("책 이름: ");
		            bookname = sc.nextLine();
		            
		            System.out.print("저자: ");
		            author = sc.nextLine();
		            
		            System.out.print("출판사 : ");
		            pub = sc.nextLine();
		            
		            System.out.print("페이지 수 : ");
		            pages = sc.nextLine();
		            
		            System.out.print("가격 : ");
		            price = Integer.parseInt(sc.nextLine());

		            Book newBook = new Book(bookname, author, pub, pages, price);
		            BookList.add(newBook);
		            System.out.println(bookname + " 책 정보가 추가되었습니다.");

		        } catch (NumberFormatException e) {
		            System.out.println("가격은 숫자로 입력해주세요. 현재 책 입력은 취소됩니다.");
		            continue; 
		        }
		        String answer;
		        while (true) {
		            System.out.print("\n그만 입력하시겠습니까(y/n)? > ");
		            answer = sc.nextLine().trim().toLowerCase();
		            
		            if (answer.equals("y") || answer.equals("n")) {
		                break; 
		            } else {
		                System.out.println("잘못 입력하셨습니다. y 또는 n을 입력해주세요.");
		            }
		        }
		        
		        if (answer.equals("y")) {
		            System.out.println("책 추가를 종료하고 메뉴로 돌아갑니다.");
		            printAndSaveBooks();
		            break; 
		        }
		        System.out.println("------------------------------------------");
		    }
		}
		public void printAndSaveBooks() {
	        System.out.println("\n[ 책 정보 출력 및 파일 저장 ]");
	        if (BookList.isEmpty()) {
	            System.out.println("등록된 책 정보가 없습니다.");
	            return;
	        }

	        try (FileWriter fw = new FileWriter("book.txt")) {
	            
	            System.out.println("--- 모니터 출력 결과 (총 " + BookList.size() + "권) ---");
	            
	            for (Book book : BookList) {
	                String info = book.getInfo(); 
	                
	                System.out.println(info);
	                
	                fw.write(info + "\n");
	            }
	            
	            System.out.println("-------------------------------------------------");
	            System.out.println("모든 책 정보가 'book.txt' 파일에 성공적으로 저장되었습니다.");
	            
	        } catch (IOException e) {
	            System.err.println(" 파일 출력 중 오류발생 : " + e.getMessage());
	        }
	}
}
