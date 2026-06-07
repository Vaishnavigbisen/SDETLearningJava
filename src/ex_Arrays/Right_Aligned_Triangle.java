package ex_Arrays;

public class Right_Aligned_Triangle {
    public static void main(String[] args){
        int n=5;

        //Outer loop - controls row
        for(int i=1;i<=n; i++){

            //For spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
