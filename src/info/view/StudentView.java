package info.view;

import java.util.ArrayList;
import info.vo.StudentVO;
import java.util.Scanner;

//ȭ�鿡 �����ֱ�(���) ���� ��ü 
public class StudentView {

//view(ArrayList<StudentVO> svoList): ȭ�鿡 ����� ���� �޼���
	public void view(ArrayList<StudentVO> svoList) {
		for(StudentVO svo : svoList) {
			System.out.println("=====================");
			System.out.println("===���� : "+svo.getName());
			System.out.println("===�й� : "+svo.getStuId());
			System.out.println("===�г� : "+svo.getGrade());
			System.out.println("===���� : "+svo.getMajor());
			System.out.println("===��ȭ��ȣ : "+svo.getMobile());
			System.out.println("=====================");
		}
	}
}
