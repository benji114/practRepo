public class FindMostFrequent {
    public static void main(String[] args) {
        int[] num = {1,30,2,2,5,30,5,2};
        int element = 0;
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            int tempElement = num[i];
            int tempCount =0;
            for (int j = 0; j < num.length; j++) {
                if(num[j]==tempElement){
                    tempCount++;
                }
            }
            if(tempCount>count){
                element=tempElement;
                count=tempCount;
            }
        }
        System.out.println("the most frequent element: "+element +" occurs: "+ count);

        new MostFrequentString().findMostFrequentString();
    }
}

class MostFrequentString{
    String words= "absdfbaaabsdfwabsdf";
    public void findMostFrequentString(){
        char element =' ';
        int count =0;
        for (int i = 0; i < words.length(); i++) {
            char tempElement = words.charAt(i);
            int tempCount=0;
            for (int j = 0; j < words.length(); j++) {
                if(words.charAt(j)==tempElement){
                    tempCount++;
                }
            }
            if(tempCount>count){
                element= tempElement;
                count=tempCount;
            }
        }
        System.out.println("the most frequent character: "+ element+" time of occurs: "+count);
    }
}
