package ch16_bean;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class UserEntityLombok {
    private int username;
    private int password;
    private String mail;
    private String name;
}
