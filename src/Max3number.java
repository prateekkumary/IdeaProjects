import java.util.Scanner;
import java.util.*;

public class Max3number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[n-1]);
        System.out.println(a[n-2]);
        System.out.println(a[n-3]);

    }
}
