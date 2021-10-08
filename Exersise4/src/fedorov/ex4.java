package fedorov;

import java.util.Scanner;


public class ex4 {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N:");
        n = in.nextInt();
        in.close();

        testArray(n);
    }

    public static void testArray(int n) {
        int [] Arr = generateArray(n);
        System.out.println("Start Array: ");
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i]+" ");
        }
        System.out.println("");

        boolean flag = false;
        System.out.println("");
        for(int i =0;i<n;i++){
            if (isSimple(Arr[i])){
                if (!flag)
                    System.out.println("Prime numbers indexes: ");
                flag = true;
                System.out.print(i+" ");
            }
        }
        if (!flag){
            System.out.println("No prime numbers ");
        }
        else
        {
            System.out.println("");
        }

    }

    public static int [] generateArray(int n) {
        int [] Arr = new int[n];
        for(int i=0; i < Arr.length; i++) {
            Arr[i]=(int)(Math.random()*100+1);
        }
        return Arr;
    }

    public  static  boolean isSimple(int number){
        for (int i =2;i < number/2;i++){
            if(number % i ==0){
                return  false;
            }
        }

        return  true;
    }

}