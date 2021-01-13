import java.awt.Image;
import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;

public class DrawXandO {	
	
	static Image imgX, imgO;
	
	
	public DrawXandO() {
		
		try {
		
		imgX = ImageIO.read(new File("quelle/x.png"));
		imgO = ImageIO.read(new File("quelle/o.png"));
		
	}
	catch (IOException e)	{
		e.fillInStackTrace();
		
	}
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
