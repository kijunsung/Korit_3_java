package ch16_bean.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Personlombok {
    @NonNull
    private final String name;
    private int age;


    //이상의 경우 동일하게 private final String name을 했을 때
    //오류가 발생했지만, alt + ins가 아니라 Lombok을 통해 해결

    //RequiredArgsConstructor는 필드의 final을 감지해서
    //걔가 포함되어 있는 매개변수 생성자를 자동으로 만들어줍니다.

    //그리고 @Data로 수정했습니다. -> RequiredArgsConstructor / Getter / Setter


    @Override
    public String toString() {
        return "이름 : " + name + "\n 나이: " + age;
    }
}
