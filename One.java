public class One {
         public static void y(int r, int c ){
        for(int i= 1;i<=r;i++){
            for(int j = 1;j<=i;j++){
                if(i%2==0){
                System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        y(4,4);
    }
}
