public class Dsa1{
    public static int pr(int n){
       int f=1;
       for(int i=1;i<=n;i++){
        f = f*i;
       }
       return f;
       }
     
    public static int p(int n,int r){
       int n_fact=pr(n);
       int r_fact=pr(r);
       int n_nfact=pr(n-r);
       int sl=n_fact/(r_fact*n_nfact);
       return sl;
    }
  
    public static void main(String[] args) {
   
    System.out.println(p(5,2));
    
    }
}