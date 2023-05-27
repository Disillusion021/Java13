package com.coding.Test.泛型;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;

public class GenericDemo3 {
    public static void main(String[] args) {
        HashMap<String, Student> hashMap = new HashMap<>();
        hashMap.put("小王", new Student("小王", 18));
        hashMap.put("小李", new Student("小李", 19));
        hashMap.put("小张", new Student("小张", 20));
        // 第一种遍历方式 
        for(Entry<String, Student> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        // 第二种遍历方式(Iterator和entrySet遍历方式都很快，而且Iterator循环中途删除元素更安全)
        Iterator<Entry<String, Student>> iterator =  hashMap.entrySet().iterator();
        
        while(iterator.hasNext()){
            Entry<String, Student> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

class Student {

    private String name;

    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h = 31 * h + ((age == null) ? 0 : age.hashCode());
        h = 31 * h + ((name == null) ? 0 : name.hashCode());
        return h;
    }

    // 或者直接用Objects工具类
    // @Override
    // public int hashCode() {
    //     return Objects.hash(name, age);
    // }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;
        Student other = (Student) o;
        return Objects.equals(age, other.getAge()) && Objects.equals(name, other.getName());
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}