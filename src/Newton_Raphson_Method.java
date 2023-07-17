public class Newton_Raphson_Method {
        public static void solve() {
            double x1=-1*Math.random()*100, x2;

            //System.out.println(x1 + " " + x2);

//        if(equation.eq(x1)*equation.eq(x1)>0){
//            System.out.println("No root");
//            return;
//        }
            x2 = x1 + equation(x1)/ diff_equation(x1);
            double tolerance=0.05;
            while(Math.abs(equation(x1)-0)>tolerance){
                x1 = x2;
                x2 = x1 - equation(x1)/ diff_equation(x1);
                System.out.println(x1+" "+x2);
            }

            System.out.println(x1);


        }
        public static double equation(double x){
            return x*x-25;
        }
        public static double diff_equation(double x){
            return 2*x;
        }

}
