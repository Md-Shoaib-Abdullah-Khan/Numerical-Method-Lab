public class Secant_Method {

        public static void solve() {
            double x1=1*Math.random()*100, x2=-1*Math.random()*100;


            double x = (x1*equation(x2)-x2* equation(x1))/ (equation(x2)- equation(x1));
            double tolerance=0.0005;
            int steps=0;
            while(Math.abs(equation(x2)-0)>tolerance){
                double temp = x2;
                x2 = (x1*equation(x2)-x2* equation(x1))/ (equation(x2)- equation(x1));
                x1=temp;
                System.out.println(x1+" "+x2);
                steps++;
            }
            System.out.println("Root is "+x2);
            System.out.println("Step " +steps);
        }
        public static double equation(double x){
            return x*x*x*x*x + x*x*x +3;
        }

}
