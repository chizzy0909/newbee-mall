/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.service;

import java.util.ArrayList;

import ltd.newbee.mall.entity.Student;
import ltd.newbee.mall.util.PageInquiryUtil;

public interface StudentService {
	/**
	 * 取得学生,通过name进行模糊查询
	 *
	 * @param name学生名前
	 * @return 学生list
	 */
	ArrayList<Student> getStudentListByName(String name);

	/**
     * 插入学生信息
     *
     * @param id
     * @return 
     */
	long insertStudent(Student stu);
	
	/**
     * 更新表
     *
     * @param 
     * @return 
     */
	int updateStudent(Student student);
	
    /**
     * 删除一行学生信息
     *
     * @param id
     * @return 
     */

	Boolean deleteStudentById(long id);
	
	//ArrayList<Student> getPageRecords(PageInquiryUtil pageInquiryUtil);
   
}
