package info.vo;

import java.util.ArrayList;

//Data Access Object
public class StudentDAO {
	//학생 정보 객체(StudentVO) 들을 저장하기 위해
	ArrayList<StudentVO> svoList = new ArrayList<StudentVO>();

	//insert: ArrayList 에 학생정보객체(StudentVO)를 추가하는 메서드
	public void insert(StudentVO svo) {
		svoList.add(svo);
	}
	
	//select:전체 학생정보객체들을 반황하는 메서드
	public ArrayList<StudentVO> select(){
		return svoList;
	}
}

