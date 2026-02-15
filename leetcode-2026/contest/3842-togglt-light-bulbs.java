import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] state=new boolean[101];
        for(int b:bulbs){
            state[b]=!state[b];
        }
        List<Integer>res=new ArrayList<>();
        for(int i=1;i<=100;i++){
            if(state[i]){
                res.add(i);
            }
        }
        return res;
    }
}