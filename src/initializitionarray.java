import java.util.Scanner;

public class initializitionarray {
    public static void main(String[] args) {
        int [] array=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            array[i]=sc.nextInt();
        }
    }
}
