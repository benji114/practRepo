public class Continuedemo {
    public static void main(String[] args) {
        int i=0;
        while(i<100){
            i++;
            /*
            当I=10或者1010的倍数的时候，循环会直接跳回WHILE，continue用于跳过某次循环
             */
            if(i%10==0){
                System.out.println();
                continue;
            }
            System.out.println(i);
        }
    }
}
