package _93_Restore_IP_Addresses;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ret = new ArrayList<String>();
        int[] ip = new int[4];
        put(s,0,0, ip,ret);
        return ret;
    }

    public void put(String s, int start, int index, int[] ip, List<String> ret){
        int minSize = s.length() - start - (3 - index)*3;
        int maxSize = s.length() - start - (3 - index);
        if (minSize < 1)
            minSize = 1;
        if (maxSize > 3)
            maxSize = 3;
        if (index ==3 ){
            minSize=maxSize=s.length()-start;
        }

        for (int i = minSize; i <= maxSize; i ++){
            String v = s.substring(start, start+i);
            int num = Integer.valueOf(v);
            if (i == 2 && num < 10) continue;
            if (i == 3 && num < 100) continue;
            if (num <= 255){
                ip[index] = num;
                if (index == 3) {
                    ret.add(ip[0]+"."+ip[1]+"."+ip[2]+"."+ip[3]);
                } else {
                    put(s, start+i , index +1, ip, ret);
                }
            }
        }
    }
}