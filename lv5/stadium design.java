import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] heights) {
        int answer = 0;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> listEnd = new ArrayList<Integer>();
        Arrays.sort(heights);
        
        if(heights.length % 2 == 0){
            
            int middle = heights.length / 2;
            
            for(int i = 0 ; i < middle; i ++){
                list1.add(heights[i]);
            }
            for(int i = middle ; i < heights.length; i ++){
                list2.add(heights[i]);
            }
            Collections.sort(list2, Collections.reverseOrder());
            
            for(int i = 0 ; i < middle; i ++){
                listEnd.add(list2.get(i));
                listEnd.add(list1.get(i));
            }
            int before = 0;
            int after = 0;
            
            for(int i = 1 ; i < listEnd.size(); i ++){
                before = listEnd.get(i-1);
                after = listEnd.get(i);
                if(i == 1 ){
                    answer = before - after;
                }else {
                    if( before > after && before - after < answer ){
                        answer = before - after;
                    }else if (before < after && after - before < answer){
                        answer = after - before;
                    }
                }
            }
            
        }else {
            
//             int middle = heights.length / 2;
            
//             for(int i = 0 ; i < middle; i ++){
//                 list1.add(heights[i]);
//             }
//             for(int i = middle+1 ; i < heights.length; i ++){
//                 list2.add(heights[i]);
//             }
//             Collections.sort(list2, Collections.reverseOrder());
//             listEnd.add(heights[middle]);
//             for(int i = 0 ; i < middle; i ++){
//                 listEnd.add(list1.get(i));
//                 listEnd.add(list2.get(i));
//             }
//             int before = 0;
//             int after = 0;
            
//             for(int i = 1 ; i < listEnd.size(); i ++){
//                 before = listEnd.get(i-1);
//                 after = listEnd.get(i);
//                 if(i == 1 ){
//                     answer = before - after;
//                 }else {
//                     if( before > after && before - after < answer ){
//                         answer = before - after;
//                     }else if (before < after && after - before < answer){
//                         answer = after - before;
//                     }
//                 }
//             }
            
        }
        
        
        
        return answer;
    }
}
