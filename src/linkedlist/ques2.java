package linkedlist;

import java.util.Scanner;

public class ques2 {

    static class Node {
        String title;
        String director;
        int year;
        double rating;

        Node prev;
        Node next;

        Node(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
            this.prev = null;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    static Scanner sc = new Scanner(System.in);
    static void insertAtBeginning(String title, String director, int year, double rating) {

        Node newNode = new Node(title, director, year, rating);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        System.out.println("Movie added at beginning.");
    }

    static void insertAtEnd(String title, String director, int year, double rating) {

        Node newNode = new Node(title, director, year, rating);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Movie added at end.");
    }
    static void insertAtPosition(String title, String director, int year,
                                 double rating, int pos) {

        if (pos < 1) {
            System.out.println("Invalid Position.");
            return;
        }

        if (pos == 1) {
            insertAtBeginning(title, director, year, rating);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position.");
            return;
        }

        if (temp == tail) {
            insertAtEnd(title, director, year, rating);
            return;
        }

        Node newNode = new Node(title, director, year, rating);

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;

        System.out.println("Movie added at position " + pos);
    }
    static void deleteMovie(String title) {

        if (head == null) {
            System.out.println("Movie list is empty.");
            return;
        }

        Node temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found.");
            return;
        }

        if (temp == head) {
            head = head.next;
        } else {
            temp.prev.next = temp.next;
        }

        if (temp == tail) {
            tail = tail.prev;
        } else {
            temp.next.prev = temp.prev;
        }

        if (head != null) {
            head.prev = null;
        }

        if (tail != null) {
            tail.next = null;
        }

        System.out.println("Movie deleted successfully.");
    }
    static void searchByDirector(String director) {

        Node temp = head;
        boolean found = false;

        while (temp != null) {

            if (temp.director.equalsIgnoreCase(director)) {

                displayMovie(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movie found for this director.");
        }
    }

    static void searchByRating(double rating) {

        Node temp = head;
        boolean found = false;

        while (temp != null) {

            if (temp.rating == rating) {

                displayMovie(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movie found with this rating.");
        }
    }

    static void displayMovie(Node temp) {

        System.out.println("--------------------------");
        System.out.println("Movie Title: " + temp.title);
        System.out.println("Director: " + temp.director);
        System.out.println("Year: " + temp.year);
        System.out.println("Rating: " + temp.rating);
    }
    static void displayForward() {

        if (head == null) {
            System.out.println("Movie list is empty.");
            return;
        }

        Node temp = head;

        System.out.println("\nMovies in Forward Order:");

        while (temp != null) {

            displayMovie(temp);

            temp = temp.next;
        }
    }

    static void displayReverse() {

        if (tail == null) {
            System.out.println("Movie list is empty.");
            return;
        }

        Node temp = tail;

        System.out.println("\nMovies in Reverse Order:");

        while (temp != null) {

            displayMovie(temp);

            temp = temp.prev;
        }
    }

    static void updateRating(String title, double newRating) {

        Node temp = head;

        while (temp != null) {

            if (temp.title.equalsIgnoreCase(title)) {

                temp.rating = newRating;

                System.out.println("Movie rating updated successfully.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Movie not found.");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== MOVIE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Movie at Beginning");
            System.out.println("2. Add Movie at End");
            System.out.println("3. Add Movie at Position");
            System.out.println("4. Remove Movie");
            System.out.println("5. Search by Director");
            System.out.println("6. Search by Rating");
            System.out.println("7. Display Forward");
            System.out.println("8. Display Reverse");
            System.out.println("9. Update Movie Rating");
            System.out.println("10. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            sc.nextLine();

            String title, director;
            int year, pos;
            double rating;

            switch (choice) {
                case 1:
                case 2:
                case 3:


                    System.out.print("Enter Movie Title: ");
                    title = sc.nextLine();

                    System.out.print("Enter Director Name: ");
                    director = sc.nextLine();

                    System.out.print("Enter Release Year: ");
                    year = sc.nextInt();

                    System.out.print("Enter Rating: ");
                    rating = sc.nextDouble();

                    sc.nextLine();

                    if (choice == 1) {
                        insertAtBeginning(title, director, year, rating);
                    }
                    else if (choice == 2) {
                        insertAtEnd(title, director, year, rating);
                    }
                    else {
                        System.out.print("Enter Position: ");
                        pos = sc.nextInt();

                        insertAtPosition(title, director, year, rating, pos);
                    }

                    break;


                case 4:

                    System.out.print("Enter Movie Title to Remove: ");
                    title = sc.nextLine();

                    deleteMovie(title);
                    break;


                case 5:

                    System.out.print("Enter Director Name: ");
                    director = sc.nextLine();

                    searchByDirector(director);
                    break;


                case 6:

                    System.out.print("Enter Rating: ");
                    rating = sc.nextDouble();

                    searchByRating(rating);
                    break;


                case 7:

                    displayForward();
                    break;


                case 8:

                    displayReverse();
                    break;


                case 9:

                    System.out.print("Enter Movie Title: ");
                    title = sc.nextLine();

                    System.out.print("Enter New Rating: ");
                    rating = sc.nextDouble();

                    updateRating(title, rating);
                    break;


                case 10:

                    System.out.println("Program Terminated.");
                    return;


                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}