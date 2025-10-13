package com.jspiders.allinone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Abstraction: Abstract class for library items
abstract class LibraryItem {
    abstract String checkOut();
    abstract String returnItem();
    abstract String displayInfo();
}

// Encapsulation: Book class with private attributes and public methods
class Book extends LibraryItem {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    private LocalDate dueDate;

    // Constructor
    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
        this.dueDate = null;
    }

    // Getters (encapsulation)
    public String getTitle() {
        return title;
    }

    public boolean getAvailable() {   // Added getter for availability
        return available;
    }

    // Setter for availability (encapsulation)
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Method overriding (polymorphism)
    @Override
    public String checkOut() {
        if (available) {
            available = false;
            dueDate = LocalDate.now().plusDays(14);
            return title + " checked out. Due on: " + dueDate;
        }
        return title + " is not available.";
    }

    @Override
    public String returnItem() {
        if (!available) {
            available = true;
            dueDate = null;
            return title + " returned.";
        }
        return title + " was not checked out.";
    }

    @Override
    public String displayInfo() {
        String status = available ? "Available" : "Due: " + dueDate;
        return "Book: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Status: " + status;
    }
}

// Inheritance: EBook class inherits from Book
class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, String isbn, double fileSize, boolean available) {
        super(title, author, isbn, available);
        this.fileSize = fileSize;
    }

    // Method overriding (polymorphism)
    @Override
    public String checkOut() {
        if (getAvailable()) { // Using getter
            setAvailable(false); // Using setter
            return "EBook " + getTitle() + " downloaded.";
        }
        return "EBook " + getTitle() + " is not available.";
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", File Size: " + fileSize + "MB";
    }

    // Getter for fileSize
    public double getFileSize() {
        return fileSize;
    }
}

// Composition: Library class contains LibraryItems
class Library {
    private List<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    public String addItem(LibraryItem item) {
        items.add(item);
        return item.displayInfo().split(",")[0] + " added to library.";
    }

    public String checkOutItem(String title) {
        for (LibraryItem item : items) {
            if (item instanceof Book && ((Book) item).getTitle().equals(title)) {
                return item.checkOut(); // Polymorphic call
            }
        }
        return "Item " + title + " not found.";
    }

    public String returnItem(String title) {
        for (LibraryItem item : items) {
            if (item instanceof Book && ((Book) item).getTitle().equals(title)) {
                return item.returnItem(); // Polymorphic call
            }
        }
        return "Item " + title + " not found.";
    }

    public String displayCatalog() {
        StringBuilder catalog = new StringBuilder();
        for (LibraryItem item : items) {
            catalog.append(item.displayInfo()).append("\n");
        }
        return catalog.toString();
    }

    // Getter for items
    public List<LibraryItem> getItems() {
        return items;
    }
}

// Main class to test the system
public class LibraryManagement {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Create books and ebooks
        Book book1 = new Book("1984", "George Orwell", "123456789", true);
        EBook ebook1 = new EBook("Java Guide", "John Doe", "987654321", 5.2, true);

        // Add items to library (composition)
        System.out.println(library.addItem(book1));
        System.out.println(library.addItem(ebook1));

        // Display catalog
        System.out.println("\nLibrary Catalog:");
        System.out.println(library.displayCatalog());

        // Check out items (polymorphism)
        System.out.println("Checking out items:");
        System.out.println(library.checkOutItem("1984"));
        System.out.println(library.checkOutItem("Java Guide"));

        // Display updated catalog
        System.out.println("\nUpdated Library Catalog:");
        System.out.println(library.displayCatalog());

        // Return items
        System.out.println("\nReturning items:");
        System.out.println(library.returnItem("1984"));
    }
}
