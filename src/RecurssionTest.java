public class RecurssionTest {
    //int result = 0;
    public int run(int x,int num){
        if(num==x){
            return 0;
        }else if(num%3 ==0){
            //result += x;
            return 1;
        }else{
            return run(x+1,num);
        }

    }
}
