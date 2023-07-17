import java.util.Scanner;

public class Simpson_rule {

        void solve(){
            double upper_limit, lower_limit;
            Scanner sc = new Scanner(System.in);

            upper_limit = sc.nextDouble();
            lower_limit = sc.nextDouble();

            int n;
            n=sc.nextInt();
            double h = (upper_limit - lower_limit)/n;

            double x[] = new double[n+1];
            double y[] = new double[n+1];

            x[0] = lower_limit;
            y[0] = equation(x[0]);
            for(int i=1;i<=n;i++){
                x[i] = x[i-1] + h;
                y[i] = equation(x[i]);

            }
            calculation(y, n, h);



        }
        void calculation(double y[], int n, double h){
            double ans=0;
            for(int i=1;i<n;i++)
                    if(i%2==0) ans+=2*y[i];
                    else ans+= 4*y[i];
            ans+=(y[0]+y[n]);
            ans*=(h/3);
            System.out.println(ans);
        }
        double equation(double x){
            return 1/(1+x);
        }


}
