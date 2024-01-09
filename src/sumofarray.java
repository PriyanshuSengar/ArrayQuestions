import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        int[] array=new int[5];
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++){

            array[i]=sc.nextInt();
            }
            for(int i=0;i<5;i++){
                sum+=array[i];
            }
            System.out.println(sum);
        }


}
