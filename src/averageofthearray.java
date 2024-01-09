import java.util.Scanner;

public class averageofthearray {
    public static void main(String[] args) {
        int[] array=new int[5];
        Scanner sc=new Scanner(System.in);
        int avg=0;
        int sum=0;
        for(int i=0;i<5;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            sum+=array[i];
        }
        avg=sum/array.length;
        System.out.println(avg);
    }
}
