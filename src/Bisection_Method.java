import java.util.Collection;
import java.util.Collections;
public class Bisection_Method {

        public static void solve() {
            double x1=-1*Math.random()*100, x2=Math.random()*100;

            System.out.println(x1 + " " + x2);

            double x = (x1 + x2) / 2.0;
            double tolerance=.05;


            if(equation(x1)* equation(x2)>0) {
                System.out.println("Not Found");
                return;
            }
            if (equation(x1) > equation(x2)) {
                double temp = x1;
                x1 = x2;
                x2 = temp;
            }

            int steps=0;
            while (Math.abs(equation(x)-0.0)>tolerance ) {
                System.out.println(" Value of X1 = " +x1 + " Value of X2 = " + x2 + " Value of mid = "+ x);
                if(equation(x)<0.0)x1 = x;
                else x2 = x;
                x = (x1+x2)/2;
                steps++;
            }
            System.out.println("No of steps " + steps);


            System.out.println(x);

        }
        public static double equation(double x) {

            return x * x * x + 4 * x * x - 1;
        }

}
