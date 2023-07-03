public class Strivers15 {
    public static void main(String[] args) { 
        int s=0;
        for(char i='A';i<='E';i++){
            for(char j ='A';j<='E'-s;j++){
                System.out.print(j);
                
            }s++;
            System.out.println();
        }
    }
}
