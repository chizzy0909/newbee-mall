package ltd.newbee.mall.dao;

import java.util.ArrayList;

import ltd.newbee.mall.entity.Student;

public interface StudentMapper {

	// public interface xxx
	// 通过名字来查询学生的信息，参数是学生名字name
	// 返回可以是多个学生, list<Student>

	/**
	 *
	 * 学生リストを返す。 学生名前で曖昧検索を行う。
	 * 
	 * @param name学生名前
	 * @return 学生リスト
	 * 
	 */

	public ArrayList<Student> getStudentListByName(String name);

	// get student's id
	long getId();
	// xml mapper 如下
	// select max(id) +1 from Student
	
	int insertStudent(Student s);
	
}
