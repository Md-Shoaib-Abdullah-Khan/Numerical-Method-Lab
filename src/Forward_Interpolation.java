import java.util.Scanner;

public class Forward_Interpolation {
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

        double h = x[1] - x[0];

        double input = sc.nextDouble();

        double u[] = new double[n];

        double a = (input-x[0])/h;

        u[0]=1;
        u[1]= a;

        for(i=2;i<n;i++){
            u[i] = u[i-1] * (a-i+1);
        }
        calculation(u, y, n);



    }
    double forward_difference(double y[], int i, int j){
        if(i==0)return y[j];
        return forward_difference(y, i-1, j+1) - forward_difference(y, i-1, j);
    }
    int fact(int n){
        if(n<=1)return 1;
        return n*fact(n-1);
    }

    void calculation(double u[], double y[], int n){
        double ans=0.0;
        for(int i=0;i<n;i++){
            ans+=((forward_difference(y, i, 0)*u[i])/fact(i));
        }
        System.out.println(ans);
    }
}
