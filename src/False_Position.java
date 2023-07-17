public class False_Position {

        public static void solve() {

            double x1=-1*Math.random()*100, x2=Math.random()*100;

            System.out.println(x1 + " " + x2);

            double x = (x1 + x2) / 2.0;
            double tolerance=.5;

            while(Math.abs(equation(x)-0.0)>tolerance){

                double y = (x1*equation(x));

            }
        }

    public static double equation(double x){
        return x+30;
    }

}
