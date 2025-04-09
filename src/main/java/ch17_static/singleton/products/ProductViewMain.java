package ch17_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        //객체 생성
//        ProductView productView1 = new ProductView();
        //ProductView.Java에 생성자를 private으로 선언했기 때문에 오류 발생
        ProductView productView1 = ProductView.getInstance();
        ProductView productView2 = ProductView.getInstance();
        ProductView productView3 = ProductView.getInstance();
        ProductView productView4 = ProductView.getInstance();

        //이상의 코드에서 복수의 객체를 만든 것처럼 보이지만 실제로
        //ProductView.getInstance();의 결과값은 동일한 instance이기 때문에
        //실제 생성된 객체의 개수는 한 개 밖에 없음.

        //콘솔창에 이상의 코드를 실행시킨 결과로
        //1번 째 객체가 생성되었습니다. 가 한 줄만 출력되었습니다.

        //적어도 static변수로





    }
}
