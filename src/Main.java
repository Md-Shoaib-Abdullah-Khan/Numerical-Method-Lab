public class Main {
    public static void main(String[] args) {
        Gauss_Jordan gaussJordan = new Gauss_Jordan();
        Gauss_Elimination gaussElimination = new Gauss_Elimination();
        Least_Square_Straight_Line leastSquareStraightLine = new Least_Square_Straight_Line();
        Bisection_Method bisectionMethod = new Bisection_Method();
        Secant_Method secantMethod = new Secant_Method();
        secantMethod.solve();

    }
}