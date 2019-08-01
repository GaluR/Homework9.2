public class NumberSum {
    static int numberSum(int a){
        int suma=0;
        while(a!=0){
            suma += a%10;
            a/=10;

        }return  suma;
    }
}
