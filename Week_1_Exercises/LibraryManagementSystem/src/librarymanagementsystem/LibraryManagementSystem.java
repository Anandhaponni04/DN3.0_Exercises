/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagementsystem;

import java.util.*;
public class LibraryManagementSystem {
    private Book[] books;
    private int count;

    public LibraryManagementSystem(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        int low = 0;
        int high = count - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem(10);

        Book book1 = new Book("1", "The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("2", "To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("3", "1984", "George Orwell");

        lms.addBook(book1);
        lms.addBook(book2);
        lms.addBook(book3);

        System.out.println("Linear Search for '1984':");
        Book searchResult1 = lms.linearSearchByTitle("1984");
        if (searchResult1 != null) {
            System.out.println(searchResult1);
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("\nBinary Search for '1984':");
        // Ensure books are sorted before performing binary search
        Arrays.sort(lms.books, 0, lms.count, Comparator.comparing(Book::getTitle));
        Book searchResult2 = lms.binarySearchByTitle("1984");
        if (searchResult2 != null) {
            System.out.println(searchResult2);
        } else {
            System.out.println("Book not found.");
        }
    }
}

