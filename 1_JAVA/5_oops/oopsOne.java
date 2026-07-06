// public class Main {

//     public static class Student {
//         String name;
//         int age;

//     // Parameterized constructor
//     Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     // Copy constructor
//     Student2(Student s) {
//         this.name = s.name;
//         this.age = s.age;
//     }
// }
//     public static void main(String[] args) {

//         Student s1 = new Student("Aman", 20); // parameterized
//         Student2 s2 = new Student2(s1);         // copy

//         System.out.println(s2.name); // Aman
//         System.out.println(s2.age);  // 20
//     }
// }