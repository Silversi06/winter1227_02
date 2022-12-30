package info.vo;

import java.util.ArrayList;

//Data Access Object
public class StudentDAO {
	//�л� ���� ��ü(StudentVO) ���� �����ϱ� ����
	ArrayList<StudentVO> svoList = new ArrayList<StudentVO>();

	//insert: ArrayList �� �л�������ü(StudentVO)�� �߰��ϴ� �޼���
	public void insert(StudentVO svo) {
		svoList.add(svo);
	}
	
	//select:��ü �л�������ü���� ��Ȳ�ϴ� �޼���
	public ArrayList<StudentVO> select(){
		return svoList;
	}
}

