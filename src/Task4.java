import java.sql.SQLOutput;
import java.util.Arrays;

public class Task4
{
    public static void main(String[] args) {
        int[] a = new int[]{-1,5,4,-5,2,7,9,-3};
        System.out.println(sum(a));
        System.out.println(Arrays.toString(cumsum(a)));
        System.out.println(Arrays.toString(positives(a)));
        System.out.println(Arrays.toString(positives(new int[]{-4})));
        System.out.println(positives(new int[]{-4}).length);
    }
    public static int sum(int[] a){
       return sum(a, 0);
    }
    public static int sum(int[] a, int b){
        if(b==a.length){
            return 0;
        }
        return a[b] + sum( a, (b+1));
    }
    public static int[] cumsum(int[] a){
        int[] accumulation = new int[a.length];
        int index = 0;
        while(true){
           if(index == a.length){
               break;
           }
           if(index == 0){
               accumulation[0] = a[0];
           }
           else{
               accumulation[index]= accumulation[index-1]+a[index];
           }
           index++;
        }
        return accumulation;
    }
    public static int[] positives(int[] a){
        int numofpositives = 0;
        for(int i = 0; i<a.length;i++) {
            if(a[i]>=0)
                numofpositives++;
        }
        int[] positives = new int[numofpositives];
        int positivesfound = 0;
        for(int i = 0; i<a.length;i++){
            if(a[i]>=0){
                positives[positivesfound] = a[i];
                positivesfound++;
            }
            if(positivesfound == numofpositives){
                return positives;
            }

        }
        return positives;
    }

}
