package nested.test.ex1;

import java.util.Arrays;

public class Library {
    private final Book[] bookList;
    private int count;

    public Library(int count) {
        this.count = 0;
        this.bookList = new Book[ count ];
    }

    public void addBook(String title, String author) {
        if (Arrays.stream(bookList).count() == count) {
            System.out.println("도서 저장 공간이 부족합니다.");
            return;
        }
        bookList[ count++ ] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("-- 책 목록 출력 --");
        for (int i = 0; i < count; i++) {
            System.out.println("책 제목 : " + bookList[ i ].title + ", 저자: " + bookList[ i ].author);
        }
    }

    private class Book {
        private final String title;
        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
