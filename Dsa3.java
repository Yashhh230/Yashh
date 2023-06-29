import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Dsa3 {
    public static int line(int number[], int key) {

        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static int l(int number[]) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < max) {
                max = number[i];
            }
            // System.out.println(number[i]);
        }
        return max;
    }

    public static int bin(int number[], int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            } else if (number[mid] < key) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void swap(int number[]) {
        int first = 0;
        int last = number.length - 1;
        while (first < last) {
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;
            first++;
            last--;
        }
    }

    public static void sub(int number[]) {
        int to =0;
        int p = Integer.MIN_VALUE;
  
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                to=0;
                for (int k = i; k <= j; k++) {
                 System.out.print(number[k] + " ");
                     
                    // System.out.println(number[i]);
                    to += number[k];

                }
                System.out.println(to);
                if(p<to){
                    p=to;   
                }
                // System.out.println(to+number[i]);
                
                // p = p + to;
                // System.out.println(p);
                // System.out.println(to);

            }
            // System.out.println(number[i]);
            System.out.println();
             
        }
        System.out.println("hello"+p);    
    }
    public static boolean pr(int number[]){
        for(int i = 0 ; i < number.length;i++){
            for(int j = i+1 ; j<number.length;j++){
            if(number[i]==number[j]){
                //  System.out.println("hello");
                return true;  
               }
            }
       }
    return false;
   }
   public static int tar(int number[],int key){
     for(int i = 0;i<number.length;i++){
        if(number[i]==key){
            return i;
        }
     }
     return -1;
   }
   public static void lu(int number[]){
    for(int i = 0;i<1;i++){
        for(int j = i;j<number.length;j++){
            for(int k =j;k<number.length;k++){
                if(number[i]+number[j]+number[k]==0){
                   if(i!=j && i!=k && j!=k){
                    System.out.println("["+number[i]+" "+number[j]+" "+number[k]+"]");
                   }
                }
                else{
                    //  System.out.println("hello"+i);
                }
            }
        }
    }
   }
    

    public static void main(String[] args) {
        int number[] = {-1,0,1,2,-1,-4};
        int key=3;
        lu(number);
        // for(int i =0;i<number.length;i++){
        // System.out.println(number[i]);

        // }
        // l(number);
        // int key=8;

        // int index= line(number, key);
        // if(index==-1){
        // System.out.println("key founnd"+bin(number, key));
        // }
        // else{System.out.println(index);}

    }
}
