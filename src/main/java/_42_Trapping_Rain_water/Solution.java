package _42_Trapping_Rain_water;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhu on 2017/3/19.
 */
public class Solution {

    List<Node> toBeSolved = new LinkedList<>();

    public int trap(int[] height) {

        int size = 0;

        for (int i =0; i<height.length ; i ++){
            int currentHeight = height[i];
            if (toBeSolved.size() == 0 ){
                if (currentHeight > 0){
                    toBeSolved.add(new Node(currentHeight, i, i));
                }
            } else {
                while (true) {
                    int smallestHeight = toBeSolved.get(toBeSolved.size()-1).height;
                    Node smallestNode = toBeSolved.get(toBeSolved.size()-1);
                    if (currentHeight < smallestHeight) {
                        toBeSolved.add(new Node(currentHeight, i ,i));
                        break;
                    } else if ( currentHeight == smallestHeight) {
                        smallestNode.rightIndex= i;
                        break;
                    } else {
                        if (toBeSolved.size() == 1) {
                            toBeSolved.clear();
                            toBeSolved.add(new Node(currentHeight, i ,i));
                            break;
                        } else {
                            int borderHeight = toBeSolved.get(toBeSolved.size()-2).height;
                            int borderIndex = toBeSolved.get(toBeSolved.size()-2).rightIndex;
                            int bottonHeight = toBeSolved.get(toBeSolved.size()-1).height;
                            int bottonIndex = toBeSolved.get(toBeSolved.size()-1).leftIndex;
                            int sizeToAdd = (Math.min(borderHeight,currentHeight) - bottonHeight) * (i - bottonIndex);
//                            System.out.println("left:"+borderHeight + "  mid:"+ bottonHeight +" right:"+currentHeight +
//                                    "   index " + bottonIndex +"  "+ i +"     size:"+sizeToAdd);
                            size += sizeToAdd;
                            toBeSolved.remove(toBeSolved.size()-1);
                            if (borderHeight > currentHeight) {
                                toBeSolved.add(new Node(currentHeight, borderIndex+1,i));
                            } else if (borderHeight == currentHeight){
                                toBeSolved.get(toBeSolved.size()-1).rightIndex = i;
                                break;
                            }
                        }
                    }
                }
            }

        }
        return size;

    }

    class Node {
        int height;
        int leftIndex;
        int rightIndex;
        public Node (int height, int leftIndex, int rightIndex){
            this.height = height;
            this.leftIndex = leftIndex;
            this.rightIndex = rightIndex;
        }
    }
}
