public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        
        System.out.println("");
        
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
            
        }
    }

    public static void xmasTree(int height) {
        int i = 1;
        int x = 1;
        while (i <= height) {
            printWhitespaces((height - i));
            printStars(x);
            i++;
            x += 2;
        }
        int k = 1;
        while (k <= 2) {
        printWhitespaces(((2*height - 2)/2) - 1);
        printStars(3);
        System.out.print("");
        k++;
        }
    } 

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
