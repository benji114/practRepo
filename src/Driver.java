public class Driver {
    public static void main(String[] args) {
//        String words = "hello world";
//        String[] temp = words.split(" ");
//        String reverse ="";
//        //StringBuilder reverse = new StringBuilder(words);
//        for (int i = temp.length-1; i >=0 ; i--) {
//            reverse+=temp[i];
//        }
//        System.out.println(reverse);

        int result=0;
        for (int i = 2; i <=25 ; i++) {
            if(new RecurssionTest().run(2,i) == 1){
               result+=i;
            }
        }
        System.out.println(result);
        //System.out.println(new RecurssionTest().run(20));
    }
}
