import javax.swing.JButton;
import javax.swing.JFrame;

public class KI {

	int[] turn = { 1, -1, 0 };

	public double minimax(JButton[][] f, int depth, boolean isMaximizing) {
		if (isMaximizing = true) {
			double bestScore = Double.NEGATIVE_INFINITY;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (f[i][j].getText() == "") {
						double score = minimax(f, depth + 1, false);
						f[i][j].getText().equals("");
						if (score > bestScore) {
							bestScore = score;
						}
					}
				}

			}
			return bestScore;
		} else {
			double bestScore = Double.POSITIVE_INFINITY;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (f[i][j].getText() == "") {
						double score = minimax(f, depth + 1, true);
						f[i][j].getText().equals("");
						if (score < bestScore) {
							bestScore = score;
						}

					}

				}

			}
			return bestScore;
		}

	}

}
