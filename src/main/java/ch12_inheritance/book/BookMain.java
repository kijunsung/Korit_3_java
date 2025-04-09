package ch12_inheritance.book;

public class BookMain {
    public static void main(String[] args) {
        Book book =new Book("마시멜로 이야기", "엘렌 싱어 와 호아킴데포사다");
        System.out.println("이 책의 제목은 : " + book.getTitle() + "입니다.");
        System.out.println("이 책의 저자는 :" + book.getAuthor()+ "입니다");

        System.out.println();

        EBook eBook1 = new EBook("스프링 입문", "이강준", 5.2, "EPUB");
        eBook1.setFormat("PDF");
        System.out.println("이 책의 포멧은 "+ eBook1.getFormat() + "입니다.");
        eBook1.displayInfo();
    }
}
