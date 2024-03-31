// public class Power {
//     public static int powerOfNumber(int x,int pow){
//         if(pow==0){
//             return 1;
//         }
//         if(pow==1){
//             return x;
//         }
//         int fn=x*powerOfNumber(x, pow-1);
//         return fn;
//     }
//     public static void main(String[] args) {
//         int x=2;
//         int pow=4;
//         System.out.println(powerOfNumber(x, pow));
//     }
// }


public class Power{
    public static int optimized(int x,int pow){
        if(pow==0){
            return 1;
        }
        int halfPower=optimized(x, pow/2);
        int halfPowerSq=halfPower*halfPower;

        if(pow%2!=0){
            halfPowerSq=x*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x=2;
        int pow=5;
        System.out.println(optimized(x, pow));
    }
}