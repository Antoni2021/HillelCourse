package com.homeWork10.square;

public class SquarRoot {

//    method for finding roots of square equation
    public static String square (double x2, double x, double c) {
        double a = x2;
        double b = x;
        if (a == 0) {
            return "It is not a square equation";
        } else if (b == 0.0 && c == 0.0){
            return "корень уровнения равен 0";
        }
        double discriminant = b * b - 4 * a * c;
        double root1;
        double root2;
        String answer;
        if (discriminant < 0){
            answer = "there is no roots";
        } else if (discriminant == 0){
            root1 = -b / (2 * a);
            answer = "корень уровнения равен " + root1;
        } else {
            root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            answer = "корнями уровнения являются: " + root1 + " и " + root2;
        }
        return answer;

    }

    //    6x^2 - 7x + 3 = 0;
//
//    d = b^2 - 4ac
//    x1 = (-b + //D) / 2a
//    x2 = (-b - //D) / 2a
//

}
