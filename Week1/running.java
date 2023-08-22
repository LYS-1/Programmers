import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> playersM = new HashMap<>();
        String call = "";
        int called = 0;
        int behinded = 0;
        String behind = "";
        
        
        for(int i = 0; i < players.length; i ++){
            playersM.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i ++){
            call = callings[i];
            called = playersM.get(call);
            behinded = called - 1;
            behind = players[behinded];
            
            players[called] = behind;
            players[behinded] = call;
            
            playersM.put(behind, called);
            playersM.put(call, behinded);
            
        }
        answer = players;
        return answer;
    }
}
