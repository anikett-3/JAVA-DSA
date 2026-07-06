








// public class Main {

//     public static class Student {
//         private String name;
//         private int age;
//         private int rollNo;
//         private double percent;

//         // Constructor
//         public Student(String name, int age, int rollNo, double percent) {
//             this.name = name;
//             this.age = age;
//             this.rollNo = rollNo;
//             this.percent = percent;
//         }

//         // Getters & Setters
//         public String getName() {
//             return name;
//         }

//         public void setName(String name) {
//             this.name = name;
//         }

//         public int getAge() {
//             return age;
//         }

//         public void setAge(int age) {
//             if (age > 0) {
//                 this.age = age;
//             }
//         }

//         public int getRollNo() {
//             return rollNo;
//         }

//         public void setRollNo(int rollNo) {
//             this.rollNo = rollNo;
//         }

//         public double getPercent() {
//             return percent;
//         }

//         public void setPercent(double percent) {
//             this.percent = percent;
//         }

//         // Display method
//         public void display() {
//             System.out.println("Name: " + name);
//             System.out.println("Age: " + age);
//             System.out.println("Roll No: " + rollNo);
//             System.out.println("Percent: " + percent);
//         }
//     }

//     public static void main(String[] args) {
//         // Create object
//         Student s1 = new Student("Rahul", 20, 101, 85.5);

//         // Call method
//         s1.display();
//     }
// }