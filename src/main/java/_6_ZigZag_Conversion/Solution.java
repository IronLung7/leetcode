package _6_ZigZag_Conversion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhu on 2017/1/20.
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows ==1 ){
            return s;
        }
        String result="";

        String headStr ="";
        String bottomStr ="";
        int lastHeadIndex = 0;
        List<Integer> headIndex = new ArrayList<>();
        for (int index = 0; index <s.length(); index =index + 2*numRows-2){
            headIndex.add(index);
            lastHeadIndex = index;
            headStr = headStr + s.charAt(index);
            int mid = index +numRows -1;
            if (mid < s.length()){
                bottomStr = bottomStr + s.charAt(mid);
            }
        }

        result = result + headStr;
        for (int i = 1 ; i<numRows ;i ++){
            if (i == numRows -1){
                result += bottomStr;
                break;
            }
            for (Integer index :headIndex){
                if (index == lastHeadIndex){
                    if (index +i <s.length()){
                        result+= s.charAt(index +i) ;
                    }
                    if (index+ 2*numRows-2 -i <s.length()){
                        result+= s.charAt(index+ 2*numRows-2 -i) ;
                    }
                }else {
                    result+= s.charAt(index +i) ;
                    result+= s.charAt(index+ 2*numRows-2 -i) ;
                }

            }
        }
        return result;
    }
}
