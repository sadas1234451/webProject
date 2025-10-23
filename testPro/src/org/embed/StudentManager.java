package org.embed;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

	public ArrayList<Student> studentList = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		manager.run();
	}
	public void run() {
		 displayMenu();
		int num;
		boolean running = true;
		while (running) {
			try {
				num = sc.nextInt();
                sc.nextLine(); 

                switch (num) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        viewStudents();
                        break;
                    case 3:
                        deleteStudent();
                        break;
                    case 4:
                        System.out.println("프로그램을 종료");
                        running = false;
                        break;
                    default:
                        System.out.println("1~4번 중 선택하세요.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("숫자를 입력해주세요.");
                sc.nextLine();
            }
            System.out.println("------------------------------------------");
        }
        sc.close(); 
    }
	public void displayMenu() {
        System.out.println("\n*** 학생 관리 시스템 ***");
        System.out.println("1. 학생 추가");
        System.out.println("2. 학생 조회");
        System.out.println("3. 학생 삭제");
        System.out.println("4. 종료");
        System.out.print("메뉴를 선택하세요 (1-4) > ");
    }
	public void addStudent() {
        System.out.println("\n[ 학생 추가 ]");
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("주소: ");
        String address = sc.nextLine();
        System.out.print("전화번호: ");
        String phone = sc.nextLine();

        Student newStudent = new Student(name, address, phone);
        studentList.add(newStudent);
        System.out.println(name + " 학생 정보가 추가되었습니다.");
    }
	public void viewStudents() {
        System.out.println("\n학생 전체 조회");
        if (studentList.isEmpty()) {
            System.out.println("등록된 학생 정보가 없습니다.");
            return;
        }

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((i + 1) + ". " + studentList.get(i));
        }
    }
    public void deleteStudent() {
        System.out.println("\n[ 학생 삭제 ]");
        System.out.print("삭제할 학생의 이름: ");
        String nameToDelete = sc.nextLine();
        
        boolean found = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(nameToDelete)) {
                studentList.remove(i);
                System.out.println(nameToDelete + " 학생 정보가 삭제되었습니다.");
                found = true;
                break; // 삭제 후 반복문 종료
            }
        }
        
        if (!found) {
            System.out.println(nameToDelete + " 학생은 목록에 없습니다.");
        }
}
}