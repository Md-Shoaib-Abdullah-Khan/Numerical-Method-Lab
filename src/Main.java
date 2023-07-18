public class Main {
    public static void main(String[] args) {
        Gauss_Jordan gaussJordan = new Gauss_Jordan();
        Gauss_Elimination gaussElimination = new Gauss_Elimination();
        Least_Square_Straight_Line leastSquareStraightLine = new Least_Square_Straight_Line();
        Bisection_Method bisectionMethod = new Bisection_Method();
        False_Position falsePosition = new False_Position();
        Newton_Raphson_Method newtonRaphsonMethod = new Newton_Raphson_Method();
        Secant_Method secantMethod = new Secant_Method();
        Forward_Interpolation forwardInterpolation = new Forward_Interpolation();
        Langrange_Interpolation langrangeInterpolation = new Langrange_Interpolation();
        Newtons_Divided_Difference newtonsDividedDifference = new Newtons_Divided_Difference();
        Trapezoidal_rule trapezoidalRule = new Trapezoidal_rule();
        Simpson_rule simpsonRule = new Simpson_rule();
        Euler_Method eulerMethod = new Euler_Method();

        secantMethod.solve();

    }
}