import java.util.Scanner;

public class maxandminelement {
    public static void main(String[] args) {
        int[] array=new int[5];
        Scanner sc=new Scanner(System.in);
        int max=array[0],min=array[0];
        for(int i=0;i<5;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
                System.out.println("iii");
            }
        }
        System.out.println(max + " "+min);


    }
}
