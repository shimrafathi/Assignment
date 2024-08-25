import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the shape type: ");
        String shapeType = Scanner.nextLine();

        switch (shapeType.toLowerCase()) {
            case "square":
                drawSquare();
                break;
            case "circle":
                drawCircle();
                break;
            case "rectangle":
                drawRectangle();
                break;
            default:
                System.out.println("Invalid shape type provided.");
                break;
        }

        System.out.println("Process finished with exit code 0");
    }

    public static void drawSquare() {
        System.out.println("Square:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawCircle() {
        System.out.println("Circle:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                if (Math.pow(i - 4, 2) + Math.pow(j - 7, 2) <= 16) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawRectangle() {
        System.out.println("Rectangle:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
