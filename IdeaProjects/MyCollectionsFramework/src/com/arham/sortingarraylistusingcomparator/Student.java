package com.arham.sortingarraylistusingcomparator;

//public class Student implements Comparator<Student> {
public class Student {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

//    @Override
//    public int compare(Student o1, Student o2) {
//        int compare = o1.getName().compareTo(o2.getName());
//        if (compare == 0)
//            compare = Integer.compare(o1.getAge(), o2.getAge())
//        return 0;
//    }
}
