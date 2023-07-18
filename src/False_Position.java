public class False_Position {

        public static void solve() {

            double x1=-1*Math.random()*100, x2=Math.random()*100;

            System.out.println(x1 + " " + x2);

            if(equation(x1)*equation(x2)>0){
                System.out.println("Not Found");
                return;
            }

            double x=0.0;
            double tolerance=.0005;
            int steps=0;

            x = (x1*equation(x2) - x2*equation(x1))/(equation(x2)-equation(x1));
            while(Math.abs(equation(x))>tolerance){

                x = (x1*equation(x2) - x2*equation(x1))/(equation(x2)-equation(x1));
                if(equation(x)>=0)x1=x;
                else x2=x;

                System.out.println(x1 + " " + x2);
                steps++;
            }

            System.out.println("Root is " + x);
            System.out.println("No of steps " + steps);
        }

    public static double equation(double x){
        return x*x*x -2*x-5;
    }

}
