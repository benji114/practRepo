public class chengfabiao99 {
    public static void main(String[] args) {
        for (int i = 0; i <=9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (1 * j) + "\t");
            }
            System.out.println();
        }
        System.out.println("===================");
        for (int x = 1; x < 10; x++) {
            for (int y = 9; y >=x; y--) {
                System.out.print(x+"*"+y+"="+(x*y)+"\t");
            }
            System.out.println();
        }
    }

}
