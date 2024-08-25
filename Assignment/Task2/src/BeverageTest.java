import java.util.Scanner;

// Beverage class representing a generic beverage
abstract class Beverage {
    public void prepareRecipe(boolean addExtras) {
        boilWater();
        brew();
        pourInCup();
        if (addExtras) {
            addExtras();
        }
    }
    abstract void brew();
    abstract void addExtras();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}

// Tea class extending Beverage
class Tea extends Beverage {
    void brew() {
        System.out.println("Steeping the tea");
    }

    void addExtras() {
        System.out.println("Adding Lemon");
    }
}

// Coffee class extending Beverage
class Coffee extends Beverage {
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    void addExtras() {
        System.out.println("Adding sugar and milk");
    }
}

// Main class to run the program
public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want extras with your tea (yes/no)? ");
        boolean teaExtras = scanner.nextLine().equalsIgnoreCase("yes");
        System.out.print("Do you want extras with your coffee (yes/no)? ");
        boolean coffeeExtras = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Making tea ...");
        Tea tea = new Tea();
        tea.prepareRecipe(teaExtras);

        System.out.println("Making coffee ...");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe(coffeeExtras);

        scanner.close();
    }
}   
