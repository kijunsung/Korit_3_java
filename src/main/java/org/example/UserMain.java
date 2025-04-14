package org.example;

class User {
     String username;
     String password;
     String name;
     String email;

    public User(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        System.out.println("username : "+username+
                "\npassword: "+password+
                "\nname: "+name+
                "\nemail: "+email);

    }
}
    public class UserMain {
        public static void main(String[] args) {
            System.out.println("[사용자 정보]");
            User user = new User("junil", "1234", "김준일", "junil@gmail.com");
            System.out.println(user);
        }
    }


