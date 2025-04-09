package ch00_review;
/*
    클래스 - 설계도 / 틀 / 청사진
    클래스 내부에는 속성(필드/멤버변수/인스턴스변수) / 행위(메서드)
 */
class Developer  {
    // 필드 선언
    String name;
    boolean window;
    boolean java;
    boolean python;
    int career;
    String company;

    // 생성자 정의 -> 원래 기본 생성자는 default로 있습니다.
    public Developer() {
    }

    // introduce 메서드를 정의
    public void introduce() {
        System.out.println("안녕하세요 제 이름은 " + name + "입니다.");
        System.out.println("현재 저는 " + company + "에서 일하고 있으며, " + career + "년 경력자입니다.");
        System.out.println("window PC 소유 : " + window);
        System.out.println("Java 역량 : " + java);
        System.out.println("python 역량 : " + python);
    }
}
public class Review07 {
    public static void main(String[] args) {
        // 객체 생성
        Developer developer1 = new Developer();

        // 속성에 값 대입
        developer1.window = true;
        developer1.name = "안근수";
        developer1.career = 3;
        developer1.python = false;
        developer1.java = true;
        developer1.company = "코리아아이티아카데미";
        developer1.introduce();


        // call1() 타입으로 정의 매개변수x returnx
        // 호출 형식 :
        // developer1.introduce();
        // 실행 예
        /*
        안녕하세요 제 이름은 안근수입니다.
        현재 저는 코리아아이티아카데미에서 일하고 있으며, 3년 경력자입니다.
        window PC 소유 : true
        Java 역량 : true
        python 역량 : false
         */
    }
}