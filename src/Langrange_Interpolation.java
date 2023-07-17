import java.util.Scanner;

public class Langrange_Interpolation {
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



        calculation(x,y,input,n);



    }
    double numerator(double input, double x[], int j, int n){
        double ans = 1.0;
        for(int i=0;i<n;i++){
            if(i!=j)ans*=(input-x[i]);
        }
        return ans;
    }
    double denominator(double x[], int i, int n){
        double ans=1.0;
        for(int j=0;j<n;j++){
            if(j!=i)ans*=(x[i]-x[j]);
        }
        return ans;
    }

    void calculation(double x[], double y[], double input, int n){
        double ans=0.0;
        for(int i=0;i<n;i++){
            ans+=(numerator(input, x, i, n)/denominator(x, i, n))*y[i];
        }
        System.out.println(ans);
    }
}
