package com.coding.day14.集合_List2;

import java.util.List;

public class StudentTest1 {

    /*
    创建一个Student类(封装)，两个成员变量
    private int id;		//学号
    private String name;	//姓名
    自动生成get，set方法，自动生成toString方法(作用是在打印学生对象时将对象的成员变量显示出来)
    创建一个Model类，有一个常量，
    public static final List<Student> LIST = new ArrayList<>();
    定义一个接口StudentCheck，三个抽象方法
    void addStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(int id, Student student);
    创建一个StudentCheckList类实现StudentCheck接口，重写三个方法
    其中addStudent方法中，将student对象直接添加到常量LIST集合中(通过类名点调用LIST集合)
    deleteStudent方法中，根据传进来的参数id，将LIST集合中学号为id的学生删除掉。
    updateStudent方法中，根据传进来的参数id，将LIST集合中学号为id的学生改为参数中的student。
    创建一个StudentTest1类，创建三个Student对象，学号和姓名分别为
	1001，“小利”，1002，“小君”，1003，“小兰”
    调用StudentCheckList类中的addStudent方法，将三个对象添加到集合中，接着创建另一个学生对象，学号和姓名为1004，“小智”，调用updateStudent方法将学号为1002的学生的信息改为新对象的信息，接着调用deleteStudent方法，将学号为1003的学生信息删除掉，最后输出LIST集合中的数据。
*/

    public static void main(String[] args) {
        Student s1 = new Student(1001,"小利");
        Student s2 = new Student(1002,"小君");
        Student s3 = new Student(1003,"小兰");
        StudentCheck ss = new StudentCheckList();
        ss.addStudent(s1);
        ss.addStudent(s2);
        ss.addStudent(s3);
        Student s4 = new Student(1004, "小智");
        ss.updateStudent(1002,s4);
        ss.deleteStudent(1003);
        System.out.println(Model.LIST);
    }

}
