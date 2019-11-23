package Code;

import java.util.Arrays;

public class BonusPoints {
    public static void main(String[] args) {

        // This is number 6

        int[] arrayRecWidth = {20, 40, 60, 80};
        int[] arrayRecHeight = {30, 50, 70, 90};

        CalculateRectArea(arrayRecWidth, arrayRecHeight);

    }
    static void CalculateRectArea (int[] arrayRecWidth, int[] arrayRecHeight) {
        int sumRec = 0;
        for (int i = 0; i < 4; i++) {
            sumRec = arrayRecWidth[i] * arrayRecHeight[i];
            System.out.println("The area of a rectangular with the width of " + arrayRecWidth[i] + "cm and the height of " + arrayRecWidth[i] + "cm is " + sumRec + "cm².");
        }
    }
}
