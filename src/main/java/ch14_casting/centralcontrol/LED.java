package ch14_casting.centralcontrol;

public class LED implements Power {

    @Override
    public void on() {
        System.out.println("LED의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("LED의 전원을 끕니다.");
    }

    public void changeColor() {
        System.out.println("LED 색깔을 바꿉니다.");
    }
}

