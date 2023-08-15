package com.book;

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book("덴마");
        Book b2 = new ComicBook();
        
        b1.setName("덴마");
        b1.setAuthor("양영순");
        
        b2.setName("덴큐");
        b2.setAuthor("덴경대");

        System.out.println(b1);
        System.out.println(b2);
    }
}
