package com.coding.Test.StreamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SimpleStream {
    private static List<User> getList() {
        User user = new User();
        user.setId("0001");
        user.setName("张三");
        user.setAge(20);
        user.setDeptName("开发部");
        List<User> list = new ArrayList<>();
        list.add(user);

        User user2 = new User();
        user2.setId("0002");
        user2.setName("李四");
        user2.setAge(21);
        user2.setDeptName("财务部");
        list.add(user2);

        User user3 = new User();
        user3.setId("0003");
        user3.setName("王五");
        user3.setAge(22);
        user3.setDeptName("运维部");
        list.add(user3);

        User user4 = new User();
        user4.setId("0004");
        user4.setName("赵六");
        user4.setAge(22);
        user4.setDeptName("运维部");
        list.add(user4);
        return list;
    }

    public static void main(String[] args) {
        List<User> users = getList();
        // 将list转化成key为id，value为element的Map
        Map<String, User> userMap = users.stream().collect(Collectors.toMap(User::getId, e -> e, (oldValue, newValue) -> newValue));
        System.out.println(userMap);
        System.out.println("========================================");
        // 获取list中所有id
        List<String> idsList = users.stream().map(User::getId).collect(Collectors.toList());
        String ids = String.join(",", idsList);
        System.out.println(ids);
        System.out.println("========================================");
        // 获取list中年龄大于21的人
        List<User> usersList = users.stream().filter(user -> user.getAge() >= 21).collect(Collectors.toList());
        for (int i = 0; i < usersList.size(); i++) {
            System.out.print(usersList.get(i));
            if (i != usersList.size() - 1) {
                System.out.print("\t");
            } else {
                System.out.println();
            }
        }
        System.out.println("========================================");
        // 将list按key为deptName，value为element分组成Map
        Map<String, List<User>> usersGroup = users.stream().collect(Collectors.groupingBy(User::getDeptName));
        System.out.println(usersGroup);
    }
}

class User{
    private String id;
    private String name;
    private Integer age;
    private String deptName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}