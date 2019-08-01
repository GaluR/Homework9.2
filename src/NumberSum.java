public class NumberSum {
    static int numberSum(int a, int b){
        while(a!=0){
            b += a%10;
            a/=10;

        }return  b;
    }
}
