package info.controller;

import java.util.ArrayList;
import java.util.Scanner;

import info.view.StudentView;
import info.vo.StudentDAO;
import info.vo.StudentVO;

public class StudentController {
	public static final int CONTINUE=1;
	public static final int BREAK=0;
	
	ArrayList<String>name = new ArrayList<String>();
	ArrayList<Integer>stuId = new ArrayList<Integer>();
	ArrayList<Integer>grade = new ArrayList<Integer>();
	ArrayList<String>major = new ArrayList<String>();
	ArrayList<String>mobile = new ArrayList<String>();
	
	//콘솔창에서 입력받은 학생정보를 각각의 ArrayLis에 저장해준다.
	//생성된 StudentVO객체를 StudentDAO 객체의 ArrayList에 저장한다.(insert()사용)
	public void consolToList() {
		//콘솔에 입력받기 위해 Scanner 생성
		Scanner s1= new Scanner(System.in); //문자열입력용
		Scanner s2= new Scanner(System.in);//숫자입력용
		//여러학생 정보(동적 인원 수)를 입력받기 위해서 ArrayList 객체생성
		
		
		//콘솔창에서 학생정보를 입력받을 때 계속 입력받을 것인지 멈출 것인지의 상태를 저장하는 것
		int flag = CONTINUE;
		System.out.println("============= 학생정보입력 ============");
		while(true) {
			if(flag==CONTINUE) {
				System.out.print("==성명 입력 : ");
				name.add(s1.nextLine());
				System.out.print("==학번 입력 : ");
				stuId.add(s2.nextInt());
				System.out.print("==학년 입력 : ");
				grade.add(s2.nextInt());
				System.out.print("==전공 입력 : ");
				major.add(s1.nextLine());
				System.out.print("==전화번호 입력 : ");
				mobile.add(s1.nextLine());
			}else if(flag==BREAK) {
				break;
			}
		
			System.out.println("계속 학생정보를 입력받으시겠습니다?(계속:1, 중지:0)");
			flag=s2.nextInt();
		}
		
		s1.close();
		s2.close();
		
	}
	//생성된 StudentVO객체를 StudentDAO r객체의 ArrayList 에 저장한다(insert()사용)
	public void voToDAO(StudentDAO dao) {
		
		for(int i=0; i<name.size(); i++) {
			StudentVO svo = new StudentVO(name.get(i),stuId.get(i),grade.get(i),major.get(i),mobile.get(i));
			dao.insert(svo);
		}
	}
	public static void main(String []agrs) {
		StudentController controller = new StudentController();
		//콘솔창에서 입력 받은 값을 각각의 정보를 저장하는 ArrayList에 저장하는 메서드
		controller.consolToList();
		//입력받는 값들을 사용하여 StudentVO객체를 생성하여 DAO의 ArrayList에 저장하는 메서드
		StudentDAO dao = new StudentDAO();
		controller.voToDAO(dao);
		//화면에 출력
		StudentView sView = new StudentView();
		sView.view(dao.select());
		
		
	}

}
