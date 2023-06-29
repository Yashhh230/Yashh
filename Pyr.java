public class Pyr {
    
    public static void y(int r){
        int l=1;
        for(int i=1;i<=r;i++){
          for (int j=1;j<=r-i;j++){
            System.out.print(" ");
          }
          for(int j=1;j<=i;j++){
            System.out.print("*");  
          }System.out.println();
        }
        
    }
    public static void main(String[] args) {
        y(4);
    }
}
