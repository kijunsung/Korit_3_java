package ch10_setter_gette.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivStudent univStudent1 = new UnivStudent();
        UnivStudent univStudent2 = new UnivStudent("김일");
        UnivStudent univStudent3 = new UnivStudent(1);
        UnivStudent univStudent4 = new UnivStudent("김일", 1);
        UnivStudent univStudent5 = new UnivStudent("김일", 1, 3.3);

        //객체에 값 대입 -> 실패한 후까지 고려하여 까지 다 집어넣었습니다.
        univStudent1.setName("김일");
        univStudent1.setName(1);
        univStudent1.setName(3.3);

        univStudent2.setName("김이");
        univStudent2.setName(3);
        univStudent2.setName(-30);
        univStudent2.setName(2.7);

        univStudent3.setName("김삼");
        univStudent3.setName(5);
        univStudent3.setName(2);
        univStudent3.setName(2.7);

        univStudent4.setName("김사");
        univStudent4.setName(4);
        univStudent4.setName(3.8);

        univStudent5.setName("김오");
        univStudent5.setName(2);
        univStudent5.setName(1.0);

        univStudent1.showInfo();
        univStudent2.showInfo();
        univStudent3.show();
        univStudent4.show();
        univStudent5.show();





    }
}
