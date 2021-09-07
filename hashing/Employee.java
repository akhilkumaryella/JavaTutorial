package hashing;

import java.util.*;

public class Employee implements Comparable<Employee>{

    private int id;

    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    public int compareTo(Employee o) {
        return this.getId() - o.getId();
    }
}

class Test {
    public static void main(String[] args) {

        HashMap<Employee, Integer> map = new HashMap<>();
        map.put(new Employee(1, "Akhil"), 1);
        map.put(new Employee(2, "Akhil"), 2);
        map.put(new Employee(3, "kumar"), 3);
        map.put(new Employee(1, "Akhil"), 4);

        System.out.println(map);

        Set<Employee> set = new HashSet<>();

        set.add(new Employee(1, "akhil"));
        set.add(new Employee(2, "akhil"));
        set.add(new Employee(3, "kumar"));
        set.add(new Employee(1, "akhil"));

        System.out.println(set);

        TreeMap<Employee, Integer> tMap = new TreeMap<>();
        tMap.put(new Employee(1, "Akhil"), 1);
        tMap.put(new Employee(2, "Akhil"), 2);
        tMap.put(new Employee(3, "kumar"), 3);
        tMap.put(new Employee(1, "Akhil"), 4);

        System.out.println(tMap);
    }
}

