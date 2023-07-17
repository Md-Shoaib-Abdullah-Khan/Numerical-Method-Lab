import java.util.Scanner;

public class Newtons_Divided_Difference {

        public void solve(){
            int n,i;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            double x[] = new double[n];
            double y[] = new double[n];

            for(i=0;i<n;i++){
                x[i]=sc.nextDouble();
                y[i]=sc.nextDouble();
            }


            double input = sc.nextDouble();



           //for(i=1;i<n;i++) System.out.println(divided_difference(x, y, i, 0));
            calculation(x, y, input, n);



        }
        double divided_difference(double x[], double y[], int i, int j){
            if(i==1)return (y[j+1]-y[j])/(x[j+1]-x[j]);
            return (divided_difference(x, y, i-1, j+1)-divided_difference(x, y, i-1, j))/(x[i+j]-x[j]);
        }



        void calculation(double x[], double y[], double input, int n){
            double ans=y[0],a=1.0;
            for(int i=1;i<n;i++){
                a*=(input-x[i-1]);
                ans+=divided_difference(x, y, i, 0) * a;
            }
            System.out.println(ans);
        }
    }


