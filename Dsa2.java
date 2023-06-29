public class Dsa2{
    public static boolean pr(int i){
        for(int l=2;l<i-1;l++){
            if(i%l==0){
                return false;
            }
        }
        return true;
               
    }
    public static void pa(int i){
        for(int s=2;s<i;s++){
           if(pr(s)){
             System.out.println(s);
           }
        }
    }
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println();
        pa(20);
    }
}