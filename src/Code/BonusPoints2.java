package Code;

import java.util.Scanner;

public class BonusPoints2 {
    public static void main(String[] args) {
        String choiceAccess;
        do {
            System.out.println("a: Calculator");
            System.out.println("b: Quit");
            Scanner sc = new Scanner(System.in);
            choiceAccess = sc.nextLine();

            if (choiceAccess.equals("a")){
                    System.out.println("Enter a width: ");
                    double inputWidth = sc.nextDouble();
                    System.out.println("Enter a height: ");
                    double inputHeight = sc.nextDouble();

                    RectCalculator(inputWidth, inputHeight);
            }
        } while (!choiceAccess.equals("b"));
    }

    private static void RectCalculator(double rectWidth, double rectHeight) {
        double areaRect = rectWidth * rectHeight;
        double areaPerimeter = (rectHeight*2) + (rectWidth*2);
        System.out.println("The area of the rectangular is " + areaRect + "cm².");
        System.out.println("The perimeter of the rectangular is " + areaPerimeter + "cm.");
    }
}
