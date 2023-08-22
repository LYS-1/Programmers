class Solution {
    public int[] solution(String[] wallpaper) {
        
        int top0 = Integer.MAX_VALUE;
        int top1 = Integer.MAX_VALUE;
        int bottom0 = Integer.MIN_VALUE;
        int bottom1 = Integer.MIN_VALUE;
        
        for(int i = 0; i < wallpaper.length; i ++){
            for(int j = 0; j < wallpaper[i].length(); j ++){
                if(wallpaper[i].charAt(j) == '#'){
                    top0 = Math.min(i, top0);
                    top1 = Math.min(j, top1);
                    bottom0 = Math.max(i+1, bottom0);
                    bottom1 = Math.max(j+1, bottom1);
                }
            }
        }
        int[] answer = {top0, top1, bottom0, bottom1};
        return answer;
    }
}
