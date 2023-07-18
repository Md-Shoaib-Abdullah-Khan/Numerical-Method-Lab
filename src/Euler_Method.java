import java.util.Scanner;

public class Euler_Method {

        void solve(){
            Scanner sc = new Scanner(System.in);
            double x0,y0, h;
            int n;
            x0 = sc.nextDouble();
            y0 = sc.nextDouble();
            h = sc.nextDouble();
            n=sc.nextInt();

            calculation(x0, y0, h, n);

        }
        void calculation(double x0, double y0, double h, int n){
            double x=x0,y=y0,ans=0;
            for(int i=0;i<n;i++){
                y = y + h*equation(x, y);
                x+=h;
                System.out.println(y);
            }

        }
        double equation(double x, double y){
            return -y;
        }




}
