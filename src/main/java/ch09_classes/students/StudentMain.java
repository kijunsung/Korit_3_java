package ch09_classes.students;

public class StudentMain {
    public static void main(String[] args) {
        Student student6 = new Student();
        Student student7 = new Student(2025002);
        Student student8 = new Student("김삼");
        Student student9 = new Student(2025004, "김사");
        Student student10 = new Student(2025005, "김오", 70);

        student6.studentCode = 2025001;
        student6.name = "김일";
        student6.score = 20;

        student7.name = "김이";
        student7.score = 65;

        student8.studentCode = 2025003;
        student8.score = 30;

        student9.score = 59;


        student6.showInfo();
        student7.showInfo();
        student8.showInfo();
        student9.showInfo();
        student10.showInfo();

    }

}
