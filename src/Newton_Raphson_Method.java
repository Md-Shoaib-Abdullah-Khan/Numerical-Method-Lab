public class Newton_Raphson_Method {
        public static void solve() {
            double x=1*Math.random()*100, x2;


            x = x + equation(x)/ diff_equation(x);
            double tolerance=0.0005;
            int steps=0;
            while(Math.abs(equation(x)-0)>tolerance){
                x = x - equation(x)/ diff_equation(x);
                System.out.println(x);
                steps++;
            }

            System.out.println("Root is " +x);
            System.out.println("Steps" + steps);


        }
        public static double equation(double x){
            return x*x*x + 4*x*x-1;
        }
        public static double diff_equation(double x){
            return 3*x*x + 8*x;
        }

}
