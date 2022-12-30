package info.vo;

public class StudentVO {
	
	//����, �й�,�г�,����,��ȭ��ȣ
	private String name;
	private int stuId;
	private int grade;
	private String major;
	private String mobile;
	
	//������: �ʵ� �� �ʱ�ȭ
	public StudentVO(String name, int stuId, int grade, String major, String mobile) {
		super();
		this.name = name;
		this.stuId = stuId;
		this.grade = grade;
		this.major = major;
		this.mobile = mobile;
	}
	
	//setter: �ʵ� �� ����
	//getter: �ʵ� �� ��ȯ
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", stuId=" + stuId + ", grade=" + grade + ", major=" + major + ", mobile="
				+ mobile + "]";
	}
	
	
	
}
