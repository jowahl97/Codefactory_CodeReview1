package Code;

public class Calculator {
    public static void main(String[] args) {

        // This is number 1 - 5
        int recWidth1 = 20;
        int recHeight1 = 30;
        int recWidth2 = 40;
        int recHeight2 = 50;
        int recWidth3 = 60;
        int recHeight3 = 70;
        int recWidth4 = 80;
        int recHeight4 = 90;

        int sqWidth1 = 4;
        int sqWidth2 = 2;
        int sqWidth3 = 3;
        int sqWidth4 = 5;

        System.out.println("The area of the rectangular with the width " + recWidth1 + "cm and the height " + recHeight1 + "cm is " + CalculateRectArea(recWidth1, recHeight1) + "cm².");
        System.out.println("The area of the rectangular with the width " + recWidth2 + "cm and the height " + recHeight2 + "cm is " + CalculateRectArea(recWidth2, recHeight2) + "cm².");
        System.out.println("The area of the rectangular with the width " + recWidth3 + "cm and the height " + recHeight3 + "cm is " + CalculateRectArea(recWidth3, recHeight3) + "cm².");
        System.out.println("The area of the rectangular with the width " + recWidth4 + "cm and the height " + recHeight4 + "cm is " + CalculateRectArea(recWidth4, recHeight4) + "cm².");
        System.out.println("The area of the square with the width " + sqWidth1 + "cm is " + CalculateSquareArea(sqWidth1) + "cm².");
        System.out.println("The perimeter of the square with the width " + sqWidth1 + "cm is " + CalculateSquarePerimeter(sqWidth1) + "cm.");
        System.out.println("The area of the square with the width " + sqWidth2 + "cm is " + CalculateSquareArea(sqWidth2) + "cm².");
        System.out.println("The perimeter of the square with the width " + sqWidth2 + "cm is " + CalculateSquarePerimeter(sqWidth2) + "cm.");
        System.out.println("The area of the square with the width " + sqWidth3 + "cm is " + CalculateSquareArea(sqWidth3) + "cm².");
        System.out.println("The perimeter of the square with the width " + sqWidth3 + "cm is " + CalculateSquarePerimeter(sqWidth3) + "cm.");
        System.out.println("The area of the square with the width " + sqWidth4 + "cm is " + CalculateSquareArea(sqWidth4) + "cm².");
        System.out.println("The perimeter of the square with the width " + sqWidth4 + "cm is " + CalculateSquarePerimeter(sqWidth4) + "cm.");
    }

    static int CalculateRectArea(int recWidth, int recHeight) {
        return recWidth * recHeight;
    }

    static int CalculateSquareArea(int sqWidth) {
        return sqWidth * sqWidth;
    }

    static int CalculateSquarePerimeter(int sqWidth) {
        return sqWidth * 4;
    }

}

