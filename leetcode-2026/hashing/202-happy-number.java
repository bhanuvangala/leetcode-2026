import java.util.HashMap;

class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Boolean>map=new HashMap<>();
        while(n!=1){ //run logic until it equals 1
        //square digits in num
            int t=n;
            int sum=0;
            while(t!=0){
                int rem=t%10;
                sum+=rem*rem;
                t=t/10;
            }
            //loop detect
            if(map.containsKey(sum)){
                return false;
            }else{
                map.put(sum,false);
            }
            n=sum;
        }
        
        return true;
    }
}