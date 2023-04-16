package data.struct.jdkLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 456);
        Employee marySmith = new Employee("Mary","Smith", 789);
        Employee mikeWilson = new Employee("Mike", "Wilson", 012);
        Employee johnWick = new Employee("John", "Wick", 345);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);
        list.add(johnWick);

        Iterator iter = list.iterator();
        System.out.print("HEAD ->");
        while(iter.hasNext()){
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("NULL");


    }
}