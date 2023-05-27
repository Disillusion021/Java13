package com.coding.Test.泛型;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.Map.Entry;

public class GenericDemo6 {
    @Test
    public void test() {
        DAO<User> dao = new DAO<>();
        dao.save("0", new User(0, 18, "西施"));
        dao.save("1", new User(1, 15, "貂蝉"));
        dao.save("2", new User(2, 19, "大乔"));
        dao.save("3", new User(3, 17, "小乔"));
        dao.save("4", new User(4, 22, "lucy"));
        dao.update("4", new User(4, 26, "Linda"));
        dao.delete("4");
        System.out.println(dao.get("1"));
        System.out.println(dao.list());
        System.out.println(dao.list2());
    }
}

class User {

    private int id;

    private int age;

    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", id=" + id + ", name=" + name + "]";
    }
    
}

class DAO<T> {

    private Map<String, T> map = new HashMap<>();

    public void save(String id, T t) {
        map.put(id, t);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T t) {
        map.put(id, t);
    }

    public List<T> list() {
        Iterator<Entry<String, T>> iterator = map.entrySet().iterator();
        List<T> list = new ArrayList<>();
        while(iterator.hasNext()) {
            Entry<String, T> entry = iterator.next();
            list.add(entry.getValue());
        }
        return list;
    }

    public List<T> list2() {
        return new ArrayList<>(map.values());
    }

    public void delete(String id) {
        map.remove(id);
    }
}