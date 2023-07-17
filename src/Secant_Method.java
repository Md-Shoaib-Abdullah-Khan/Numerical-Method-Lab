public class Secant_Method {

        public static void solve() {
            double x1=1*Math.random()*100, x2=-1*Math.random()*100;


            double x = (x1*equation(x2)-x2* equation(x1))/ (equation(x2)- equation(x1));
            double tolerance=0.05;
            while(Math.abs(equation(x)-0)>tolerance){
                x1 = x2;
                x2 = x;
                x = (x1*equation(x2)-x2* equation(x1))/ (equation(x2)- equation(x1));
                System.out.println(x1+" "+x2);
            }
            System.out.println(x);
        }
        public static double equation(double x){
            return x*x-121;
        }

}
