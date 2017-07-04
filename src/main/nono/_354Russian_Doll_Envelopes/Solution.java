package _354Russian_Doll_Envelopes;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by apple on 2017/3/21.
 */
public class Solution {
    public int maxEnvelopes(int[][] envelopes){
        if(envelopes == null || envelopes.length == 0)
            return 0;
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0])
                    return o2[1] - o1[1];
                return o1[0] - o2[0];
            }
        });

        int[] res = new int[envelopes.length];
        int len = 0;

        for(int i=0;i<envelopes.length;i++){
            for(int j=0;j<i;j++){
                if(envelopes[i][0]>envelopes[j][0]&&envelopes[i][1]>envelopes[j][1])
                    res[i] = Math.max(res[i],res[j]+1);
            }
            len = Math.max(len,res[i]);
        }
        return len;
    }
}
