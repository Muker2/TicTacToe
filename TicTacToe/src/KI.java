public class KI {
	
	public void besterZug() {




		int[] score = {1, -1, 0};

		int minimax(JFrame f, int depth, boolean isMaximizing) {
		  boolean result = Gui.werGewinnt();
		  if (result == null) 
		  {
		  int score = scores [result];
		  return score;
		  }

		  if (isMaximizing) {
		    int bestScore = -Infinity;
		      for (int i = 0; i < 9; j++) {
		      if (board[i]== "") {
		       board[i] = ki;
		       int score = minimax(board, depth + 1, false);
		       board[i] = "";
		       bestScore = max(score, bestScore);
		       bestScore = score;
		       }
		   }
		  
		 return bestScore;

		} else {
		  int bestScore = Infinity;
		  for (int i = 0; i < 9; i++) {
		    if (board[i]== "") {
		     board[i] = mensch;
		     int score = minimax(board, depth + 1, true)
		     board[i] = "";
		     bestScore = min(score, bestScore);
		     bestScore = score;
		    }
		  }
		  return bestScore;
		 }

		}


		// Ki soll diesen Zug ausführen
		public void KI(){
		  int bestScore = -Infinity;
		  int bester Zug;
		    for (int i = 0; < 9; j++) {
		     // ist das Feld frei?
		      if (board[i] == "") {
		        board[i] = ki;
		        int score = minimax(board, 0 , false);
		        board[i] = "";
		        if (score > bestScore) {
		          bestScore = score;
		          besterZug = { i};
		      }
		    }
		 int move = random(available);
		  board[besterZug.i] = ki;
		  currentPlayer = mensch;
			}

		}


}
