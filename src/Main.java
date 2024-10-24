import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        taskBookEbook();
        task2();
    }
    public static void taskBookEbook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter title: ");
        String title = scanner.nextLine();
        System.out.println("enter author");
        String author = scanner.nextLine();
        System.out.println("enter price: ");
        double price = scanner.nextDouble();
        System.out.println("enter the size: ");
        double fileSize = scanner.nextDouble();
        scanner.close();

        Book book = new Book(title,author,price);
        Ebook ebook = new Ebook(title,author,price,fileSize);
        ebook.getEbookInfo();
    }
    public static void task2() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first integer (a):");
            int a = scanner.nextInt();
            System.out.println("Enter second integer (b):");
            int b = scanner.nextInt();

            if (a < 0 || b < 0) {
                throw new IllegalArgumentException("Negative values are not allowed.");
            }

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            Random random = new Random();
            int countOdd = 0;
            int countEven = 0;
            int[] randomNumbers = new int[10];

            System.out.println("Generated Random Numbers:");
            for (int i = 0; i < 10; i++) {
                randomNumbers[i] = random.nextInt(b - a + 1) + a; // Random number between a and b
                System.out.print(randomNumbers[i] + " ");
                if (randomNumbers[i] % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }

            System.out.println("\n\nCount of Odd Numbers: " + countOdd);
            System.out.println("Count of Even Numbers: " + countEven);

            scanner.close();
        }

    }

