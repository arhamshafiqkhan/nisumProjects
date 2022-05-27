package com.arham.sortingarraylistusingcomparator;

import java.util.Comparator;
public class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        // sort by name and then by age
        if (o1.getName().compareTo(o2.getName()) == 0)
            return o1.getAge() - o2.getAge();
//            return Integer.compare(o1.getAge(), o2.getAge());
        return o1.getName().compareTo(o2.getName());

        // sort by name, then by age, and then by id
        /**
        if (o1.getName().compareTo(o2.getName()) == 0) {
            if (o1.getAge() - o2.getAge() == 0)
                return o2.getId() - o1.getId();
            return o1.getAge() - o2.getAge();
        }
        return o1.getName().compareTo(o2.getName());
         **/
    }
}
