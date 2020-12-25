
public class Player {
	private int Punkte = 0;
	private boolean spielzug = true;
	private String text1 = "Spieler 1 ist am Zug";
	private String text2 = "Spieler 2 ist am Zug";

	
	public String getText1() {
	return text1;
	}
	
	public String getText2() {
		return text2;
	}
	
	
	public int getPunkte(){
		return Punkte;
	}
	
	public void setPunkte(int punkte) {
		this.Punkte = punkte;
	}
	
	public boolean getSpielzug(){
		return spielzug;
	}
	
	public void setSpielzug(boolean zug) {
		this.spielzug = zug;
	}
	
	
	
	
	
	
	

}
