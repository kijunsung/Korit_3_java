package ch09_classes.products;
/*
    Product.java에 여러가지 생성자를 정의하세요.
    필드는

    int productNum;
    String productName;

    메서드

    showInFo() -> productNum과 productName 정보가 콘솔에 출력되도록 작성

    필드가 두개 이기 때문에 생성자가 만들어질 경우의 수는 4가지

    1. 기본 생성자를 사용하여 객체를 생성하시오 product1
        productNum 123456
        productName LG엘패드

    2. 시리얼 넘버를 기본으로 입력하는 매개변수 생성자를 통해
       객체를 생성하시오. product
       productNum 987654
       productName 다이소 충전기

    3. 제품명을 기본으로 입력하는 매개변수 생성자를 통해
       객체를 생성하시오 product
       productNum 159357
       productName USB-C 케이블

    4. AllArgsConstructor를 이용하여 객체 생성하시오. product4
       productNum 951753
       productName GFlip6

    5. 정보를 출력하는  showInFo() (call()타입으로 정의할 것)의 콘솔칭 결과는
       다음과 같습니다

       실행 예
       시리얼 넘버 : 951753
       제품 타이틀 : GFlip6
 */
public class ProductMain {
    public static void main(String[] args) {
        //객체 생성
        Product product1 = new Product();
        Product product2 = new Product(987654);
        Product product3 = new Product("USB-C 케이블");
        Product product4 = new Product(951753, "GFlip6");

        product1.productNum = 123456;
        product1.productName = "LG엘패드";

        product2.productName = "다이소충전기";

        product3.productNum = 159357;

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();

    }
}
