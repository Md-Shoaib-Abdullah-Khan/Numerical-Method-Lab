import java.util.Scanner;

public class Gauss_Elimination {

        public static void solve() {

            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            double matrix[][] = new double[n][n+1];

            int i,j;
            for(i=0;i<n;i++){
                for(j=0;j<n+1;j++){
                    matrix[i][j] = sc.nextDouble();
                }
            }
            echelon_form(matrix, n);
            answer(matrix,n);

        }
        static void echelon_form(double matrix[][], int n){
            int i,j,k;
            for(i=0;i<n;i++){
                for(j=i+1;j<n;j++){
                    double ratio = matrix[j][i]/matrix[i][i];
                    for(k=0;k<n+1;k++)matrix[j][k]-=ratio*matrix[i][k];
                }
            }

        }
        static void answer(double matrix[][], int n){
            double x[]=new double[n];
            int i,j,k;
            for(i=n-1;i>=0;i--){
                double ans=matrix[i][n];
                for(j=i+1;j<n;j++)ans-=x[j]*matrix[i][j];
                x[i]=ans/matrix[i][i];
            }
            display(x,n);
        }
        static void display(double x[], int n){
            int i,j;
            for(i=0;i<n;i++) {
                System.out.print(x[i]+" ");
            }
            System.out.println();
        }
    }

