import java.util.Scanner;

public class Least_Square_Straight_Line {

        public static void solve() {
            int n;
            Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
            double x[] = new double[n];
            double y[] = new double[n];
            for(int i=0;i<n;i++){
                x[i] = sc.nextDouble();
                y[i] = sc.nextDouble();
            }
            double a,b;
            double x1,x2,y1,y2,z1,z2;
            x1=n;
            y1=summation(x, n);
            z1=summation(y, n);
            x2=summation(x, n);
            y2=summation_of_squares(x, n);
            z2=summation_of_xy(x, y, n);
            b = (double)(x2*z1 - x1*z2)/(x2*y1 - x1*y2);
            a = (double)(y2*z1 - y1*z2)/(y2*x1 - y1*x2);
            System.out.println(String.format("%.4f",a) + " " + String.format("%.4f",b));

        }
        public static double summation(double arr[], int n){
            double sum=0;
            for(int i=0;i<n;i++)sum+=arr[i];
            return sum;
        }
        public static double summation_of_squares(double arr[], int n){
            double sum=0;
            for(int i=0;i<n;i++)sum+=arr[i]*arr[i];
            return sum;
        }
        public static double summation_of_xy(double arr1[],double arr2[], int n){
            double sum=0;
            for(int i=0;i<n;i++)sum+=arr1[i]*arr2[i];
            return sum;
        }

}
