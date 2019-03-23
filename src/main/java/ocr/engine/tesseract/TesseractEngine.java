/**
 * @author mehmet
 */

package ocr.engine.tesseract;

import java.awt.image.BufferedImage;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import util.Settings;

public class TesseractEngine {

	private BufferedImage bufferedImage;
	private String TESSERACT_DATA_PATH  = Settings.TESSERACT_DATA_PATH;

	public TesseractEngine(BufferedImage bufferedImage) {
		super();
		this.bufferedImage = bufferedImage;
	}
	
	public String imgToStream() {
		String text = null;
		Tesseract tesseract  = new Tesseract();
		tesseract.setLanguage(Settings.LANGAGE);
		tesseract.setDatapath(this.TESSERACT_DATA_PATH);
		try {
			text = tesseract.doOCR(bufferedImage);
		} catch (TesseractException e) {
			e.printStackTrace();
		}
		
		return text;
		
	}
	

}
