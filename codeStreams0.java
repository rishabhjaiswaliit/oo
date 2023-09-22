import java.util.*;
import java.util.stream.*;

public class Test {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        for(int i=0; i < numStudents; i++){
            String name= sc.nextLine();
            Double cgpa = sc.nextDouble();
            sc.nextLine();
            Integer backlog = sc.nextInt();
            sc.nextLine();
            Student student = new Student(name, cgpa, backlog);
            students.add(student);
        }
        List<Student> flist = getFinalList(students);
        for(Student s : flist){
            System.out.println(s);
        }
    }
    static List<Student> getFinalList(List<Student> stulist) {
        List<Student> flist = new ArrayList<>(
                stulist.stream().filter(s -> s.numBacklogs >= 1).toList());
        Collections.sort(flist, (stu1, stu2) -> stu1.cgpa > stu2.cgpa ? -1 : (stu1.cgpa < stu2.cgpa ? 1: 0));
        return flist;
    }
    static List<Student> getFinalList3(List<Student> stulist) {
        List<Student> flist = new ArrayList<>(stulist.stream().filter(s -> s.numBacklogs >= 1).toList());
        Collections.sort(flist, (stu1, stu2) -> stu2.cgpa.compareTo(stu1.cgpa));
        return flist;
    }
    static List<Student> getFinalList1(List<Student> stulist) {
        return stulist.stream()
                .filter(s -> s.numBacklogs >= 1)
                .sorted(Comparator.comparingDouble(Student::getCgpa).reversed())
                .collect(Collectors.toList());
    }


    static List<Student> getFinalList2(List<Student> stulist) {
        List<Student> flist = new ArrayList<>();
        for (Student s: stulist) {
            if (fn(s)) {
                flist.add(s);
            }
        }
        // manual sorting i.e. any sort for ex: Bubble
        for (int i = 0; i < flist.size(); i++) {
            for (int j = 0; j < flist.size() - 1; j++) {
                if (flist.get(j).cgpa < flist.get(j + 1).cgpa) {
                    // swapping j, j + 1
                    Student temp = flist.get(j);
                    flist.set(j, flist.get(j + 1));
                    flist.set(j + 1, temp);
                }
            }
        }
        return flist;
    }

    static boolean fn(Student s) {
        return s.numBacklogs >= 1;
    }
}

class Student {
    String name;
    Double cgpa;
    Integer numBacklogs;
    public Student(String name, Double cgpa, int backlog){ //Constructor
        this.name = name;
        this.cgpa = cgpa;
        this.numBacklogs = backlog;
    }
    public String getName() {
        return this.name;
    }
    public double getCgpa() {
        return this.cgpa;
    }
    public int getNumBacklogs() {
        return this.numBacklogs;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public void setNumBacklogs(int back) {
        this.numBacklogs = back;
    }

    public String toString() {
        return "Student [name = " +
                name + ", cgpa = " +
                cgpa + ", numBacklogs: " +
                numBacklogs +  "]";
    }

}
