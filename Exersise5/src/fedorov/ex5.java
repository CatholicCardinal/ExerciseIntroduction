package fedorov;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter N:");
        n = in.nextInt();

        in.close();
        findMaxChain(n);
    }

    public static void findMaxChain(int n) {
        int [] Arr = generateArray(n);

        int [] d = new int[Arr.length];
        initializeArray(d, 1);
        int min, length;

        for (int i=0; i<n; ++i) {
            d[i] = 1;
            for (int j=0; j<i; ++j)
                if (Arr[j] < Arr[i])
                    d[i] = Math.max(d[i], 1 + d[j]);
        }

        output(Arr, d);
    }

    public static int [] generateArray(int n) {
        int[] Arr = new int[n];
        for(int i=0; i < Arr.length; i++) {
            Arr[i]=(int)(Math.random()*100+1);
        }
        return Arr;
    }

    public static void initializeArray(int [] num,int val) {
        for(int i=0; i < num.length; i++) {
            num[i] = val;
        }
    }
    
    public static void output(int [] startArray, int [] d) {
        for(int i = 0; i < d.length; i++) {
            System.out.print(startArray[i]+" ");
        }
        System.out.println();

        int ans = d[0];
        for (int i=0; i<d.length; ++i)
            ans = Math.max(ans, d[i]);
        ans = d.length - ans;
        System.out.println("Result:" + ans);
    }


}
