import java.swing.JLabel;

public class DrawXandO {	
	
	static Image imgX, imgO;
	
	
	public DrawXandO() {
		try {
		imgX = ImageIO.read(new File("quelle/x.png"));
		imgO = ImageIO.read(new File("quelle/o.png"));
		
	}
	catch (IOException e)	{
		e.printStacktrace();
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
