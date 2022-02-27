public class ReverseString {
    public static void main(String[] args) {
        String words = "Words backward three";
        String temp = "";
        String reverseString = "";
        for (int i = words.length()-1; i >= 0; i--) {
            if(words.charAt(i)!= ' '){
                temp=words.charAt(i)+temp;
            }else{
                reverseString+=temp+" ";
                temp="";
            }
        }
//        for (int j = words.length()-1; j >= 0 ; j--) {
//            if(words.charAt(j)!= ' '){
//                temp = words.charAt(j)+ temp;
//            }else {
//                reverseString += temp +" ";
//                temp="";
//            }
//        }
        if(temp.length()!=0){
            reverseString+=temp;
        }
        System.out.println(reverseString);
    }
}
