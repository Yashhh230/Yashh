public class hoo{
    public static void y(int r, int col){
       for(int i = 1; i <= r;i++){
          for(int j = 1; j <= col;j++){
            if(i==1|| i == r|| j ==col||j==1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            // System.out.println();
          }
          System.out.println();
       }
    }
    public static void main(String[] args) {
          y(4, 5);
        }
    }
