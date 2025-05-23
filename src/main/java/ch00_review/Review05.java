package ch00_review;
/*
    method - 순차적으로 실행되는 여러 코드들을 하나의 이름으로 묶어둔 것
        유형을 저희는 call() ~call4() 매개변수 유무 / return 유무로
        분할해서 학습했었습니다.

    형식 :
        (접근지정자) 리턴타입 메서드명(매개변수1, 매개변수2) {
        메서드에 순서대로 들어갈 코드들
        }
    정의 예시 public void  writeSchedule(String data, String content) {
        System.out.println(data + "일의 스케줄은 다음과 같습니다.");
        System.out.print(content);
    }
    호출 방식 :
    같은 클래스 내에 정의된 메서드라면(즉, 지금 상황이라면)

    writeSchedule("20250321", 메서드/오버로딩/클래스 복습);

 */
public class Review05 {
    //메서드 정의 영역

//    //call2() 유형으로 정의
//    public void writeSchedule(String data, String content) {
//        System.out.println(data + "일의 스케줄은 다음과 같습니다.");
//        System.out.print(content);
//    }
//    //overloading으로 정의
//    public void writeSchedule(int data2, String content) {
//        System.out.println(data2 + "일의 스케줄은 다음과 같습니다.");
//        System.out.print(content);
//    }
    //call2()유형으로 작성할건데, int 숫자 하나를 받아가지고, 그 숫자가 7의 배수인지 아닌지를 확인하는 메서드를 구하시오
    public void dividedBySeven(int randomNumber) {

        //지역변수
        String answer = "";     //iny i = 0; 얘랑 비슷함(사실같음)
        if ( randomNumber % 7 ==0) {
            answer = "는 7의 약수입니다.";
        } else {
            answer = "는 7의 약수가 아닙니다.";
        }
        System.out.println(randomNumber + answer);
    }
    /*
        매개변수로 한계값을 받아서 메서드를 호출 했을 때, 1부터 한계값까지 출력하는 메서드를
        작성하시오.
        호출 방식:
        Review05.printLimitNumber(100);
        실행 예
        1 2 3 4 5... 100
     */
//    void printlimitNumber(int limitNum) {
//        //로직이 필요한데..
//        for (int i = 0; i < limitNum; i++) {
//            System.out.print((i + 1) + "");
//        }
//    }
    //이상의 메서드를 참조하여 한계값을 매개변수로 받아 짝수만 출력하는 메서드를 정의하세요
    /*
        호출 방식
        review05.printEvenNumber(50);
        실행 예
        2 4 6 8 10 ...50
     */
    void printlimitNumber(int limitNum) {
        //로직이 필요한데..
        for (int i = 0; i < limitNum; i++) {
            int addedI = i+1;
            if (addedI % 2 == 0) {
                System.out.print(addedI + "");
            }
        }
    }
    /*
        이제 매개변수를 두 개 받을겁니다
        첫번째 매개변수에는 한계값 / 두번째 매개변수로는 나누는 값
        호출 방식 :
        revier05.printSpecificNums(50,4);
        실행 에
        4 8 12 ...40

        revier05.printSpecificNums(20,3);
        3 6 9 12...
     */

    void  printEvenNumber(int limitNum, int dividingNum) {
        for(int i =1; i < limitNum; i++) {
            //특정한 숫자로 나누었을 때 나머지가 0인 숫자만 출력하는 조건문 작성
            if (i % dividingNum == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Review05 review05 = new Review05();
//        Review05.printLimitNumber(100);
        review05.printEvenNumber(50, 4);
        System.out.println("");
        review05.printEvenNumber(20, 3);
        //메서드 호출 영역
//        review05.writeSchedule("20250321", "메서드/오버로딩/클래스 복습");
//        review05.writeSchedule(20250321, "메서드/오버로딩/클래스 복습");
    }

}
