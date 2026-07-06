// public class Main {

//     public static class Student {
//         public String name;
//         private int rollno;

//         // Getter
//         public int getRollNo() {
//             return rollno;
//         }

//         // Setter
//         public void setRollNo(int r) {
//             rollno = r;
//         }
//     }

//     public static void main(String[] args) {
//         Student s1 = new Student();

//         s1.name = "Aman";       // public → direct access OK
//         System.out.println(s1.getRollNo()); // 0 (default int value)

//         s1.setRollNo(89);       // set roll number
//         System.out.println(s1.getRollNo()); // 89
//     }
// }