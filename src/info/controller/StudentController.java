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
	
	//�ܼ�â���� �Է¹��� �л������� ������ ArrayLis�� �������ش�.
	//������ StudentVO��ü�� StudentDAO ��ü�� ArrayList�� �����Ѵ�.(insert()���)
	public void consolToList() {
		//�ֿܼ� �Է¹ޱ� ���� Scanner ����
		Scanner s1= new Scanner(System.in); //���ڿ��Է¿�
		Scanner s2= new Scanner(System.in);//�����Է¿�
		//�����л� ����(���� �ο� ��)�� �Է¹ޱ� ���ؼ� ArrayList ��ü����
		
		
		//�ܼ�â���� �л������� �Է¹��� �� ��� �Է¹��� ������ ���� �������� ���¸� �����ϴ� ��
		int flag = CONTINUE;
		System.out.println("============= �л������Է� ============");
		while(true) {
			if(flag==CONTINUE) {
				System.out.print("==���� �Է� : ");
				name.add(s1.nextLine());
				System.out.print("==�й� �Է� : ");
				stuId.add(s2.nextInt());
				System.out.print("==�г� �Է� : ");
				grade.add(s2.nextInt());
				System.out.print("==���� �Է� : ");
				major.add(s1.nextLine());
				System.out.print("==��ȭ��ȣ �Է� : ");
				mobile.add(s1.nextLine());
			}else if(flag==BREAK) {
				break;
			}
		
			System.out.println("��� �л������� �Է¹����ðڽ��ϴ�?(���:1, ����:0)");
			flag=s2.nextInt();
		}
		
		s1.close();
		s2.close();
		
	}
	//������ StudentVO��ü�� StudentDAO r��ü�� ArrayList �� �����Ѵ�(insert()���)
	public void voToDAO(StudentDAO dao) {
		
		for(int i=0; i<name.size(); i++) {
			StudentVO svo = new StudentVO(name.get(i),stuId.get(i),grade.get(i),major.get(i),mobile.get(i));
			dao.insert(svo);
		}
	}
	public static void main(String []agrs) {
		StudentController controller = new StudentController();
		//�ܼ�â���� �Է� ���� ���� ������ ������ �����ϴ� ArrayList�� �����ϴ� �޼���
		controller.consolToList();
		//�Է¹޴� ������ ����Ͽ� StudentVO��ü�� �����Ͽ� DAO�� ArrayList�� �����ϴ� �޼���
		StudentDAO dao = new StudentDAO();
		controller.voToDAO(dao);
		//ȭ�鿡 ���
		StudentView sView = new StudentView();
		sView.view(dao.select());
		
		
	}

}
