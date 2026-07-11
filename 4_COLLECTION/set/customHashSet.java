package set;

import java.util.HashSet;
import java.util.Objects;

public class customHashSet{
    static class Student {
    
        public int rollNo;
        public String name;
        public Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return rollNo == student.rollNo;
        }

        @Override
        public int hashCode() {
            return Objects.hash(rollNo);
        }
    }
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();  // yaha hamra custom dataTypes - student

        Student s1 = new Student(1, "Babbar");
        Student s2 = new Student(1, "Babbar");
        Student s3 = new Student(1, "Babbar");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);        
         
    }
}

    


