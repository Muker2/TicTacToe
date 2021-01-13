function besterZug() {
// Ki soll diesen Zug ausführen
  let bestScore = -Infinity;
  let bester Zug;
  for (let i = 0; i < 3; i++) {
    for (let j = 0; < 3; j++) {
     // ist das Feld frei?
      if (board[i][j] == "") {
        board[i][j] = ki;
        let score = minimax(board, 0 , false);
        board[i][j] = "";
        if (score > bestScore) {
          bestScore = score;
          besterZug = { i, j};
      }
     }
    }
 let move = random(available);
  board[besterZug.i][besterZug.j] = ki;
  currentPlayer = mensch;
}

let score = {
  "X": 1,
  "O": -1,
  "unendschieden": 0

}
}
function minimax(board, depth, isMaximizing) {
  let result = checkWinner();
  if (result !== null) {
  let score = scores [result]
  return score;
        }

  if (isMaximizing) {
    let bestScore = -Infinity;
    for (let i = 0; i < 3; i++) {
      for (let j = 0; < 3; j++) {
      if (board[i][j]== "") {
       board[i][j] = ki;
       let score = minimax(board, depth + 1, false)
       board[i][j] = "";
       bestScore = max(score, bestScore);
         bestScore = score;
       }
     }
   }

 return bestScore;


} else {
  let bestScore = -Infinity;
  for (let i = 0; i < 3; i++) {
    for (let j = 0; < 3; j++){
    if (board[i][j]== "") {
     board[i][j] = mensch;
     let score = minimax(board, depth + 1, true)
     board[i][j] = "";
     bestScore = min(score, bestScore);
       bestScore = score;
    }
   }
  }
  return bestScore;
 }

}

