public class Day1{
    public static long Recursion(int i){
         if(i == 1){
             return 1L;
         }else{
             return i * Recursion(i-1);
         }
         

     
    }
    public static void main(String[] args){
        System.out.println(Recursion(20));

}
}