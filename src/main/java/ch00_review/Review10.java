package ch00_review;

class Data {
    private int intData;
    private String strData;

    //Getter / Setter 만들어주시고
    // main에서 data1 객체 생성해주시고
    //setter를 통해서 intData에 1750 입력
    //strData에 "집 가는 시간!!!"입력
    //Getter를 활용하여
    //실행 예
    //오늘 1750은 집 가는 시간!!!
    //이 출력되도록 작성하시오

    public int getIntData() {
        return intData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public String getStrData() {
        return strData;
    }

    public void setStrData(String strData) {
        this.strData = strData;
    }
}


public class Review10 {

    //Getter / Setter 만들게요

    public static void main(String[] args) {
        Data data1 = new Data();
        data1.setIntData(1750);
        data1.setStrData("집 가는 시간");

        System.out.println("오늘 " + data1.getIntData()+ "은"+
                data1.getStrData());
    }
}