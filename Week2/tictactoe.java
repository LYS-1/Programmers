class Solution {
    public int solution(String[] board) {
        int answer = -1;
        int o = 0;
        int x = 0;
        int dot = 0;
        
        boolean checkO = false;
        boolean checkX = false;
        
        //가로 체크
        for(int i = 0; i < board.length; i ++){
            if( board[i].equals("XXX") ){
                checkX = true;
            }else if( board[i].equals("OOO") ){
                checkO = true;
            }
        }
        //세로 체크
        for(int i = 0; i < 3; i ++){
            if( board[0].charAt(i) == board[1].charAt(i) && board[1].charAt(i) == board[2].charAt(i) ){
                if( board[0].charAt(i) == 'X' ){
                    checkX = true;
                }else if( board[0].charAt(i) == 'O' ){
                    checkO = true;
                }
            }
        }
        //대각 체크
        if( board[0].charAt(0) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(2) ){
            if( board[0].charAt(0) == 'X' ){
                checkX = true;
            }else if( board[0].charAt(0) == 'O' ){
                checkO = true;
            }
        }else if( board[0].charAt(2) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(0) ){
            if( board[0].charAt(2) == 'X' ){
                checkX = true;
            }else if( board[0].charAt(2) == 'O' ){
                checkO = true;
            }
        }
        
        for(int i = 0; i < board.length; i ++){
            for(int k = 0; k < board[i].length(); k ++){
                if(board[i].charAt(k) == 'O'){
                    o += 1;
                }else if(board[i].charAt(k) == 'X'){
                    x += 1;
                }else {
                    dot += 1;
                }
            }
            
        }
        
        if( o-x == 0 ){
            if( checkX == true && checkO == false ){
                answer = 1;
            }else if( checkX == false && checkO == false ){
                answer = 1;
            }else{
                answer = 0;
            }
        }else if( o-x == 1 ){
            if( checkO == true && checkX == false){
                answer = 1;
            }else if( checkO == false && checkX == false ){
                answer = 1;
            }else {
                answer = 0;
            }
        }else{
            answer = 0;
        }
        
        
        
        
        return answer;
    }
}
