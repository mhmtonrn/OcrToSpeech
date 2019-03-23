/**
 * @author mehmet
 */

package ocr.engine;

import java.awt.image.BufferedImage;

import ocr.engine.tesseract.TesseractEngine;
import util.Settings;
import util.toolTip.OcrEngineTip;

public class WordStream {
	
	private BufferedImage bufferedImage;
	private OcrEngineTip ocrEngineTip;

	public WordStream(BufferedImage bufferedImage) {
		super();
		this.bufferedImage = bufferedImage;
		this.ocrEngineTip = Settings.DEFAULT_OCR_ENGINE;
	}
	
	public String getOutputText() {
		String outputText = null;
		
		switch (ocrEngineTip) {
		case TESSERACT:
			outputText = tesseract();
			break;

		default:
			break;
		}
		
		
		return outputText;
	}

	private String tesseract() {
		TesseractEngine engine = new TesseractEngine(bufferedImage);
		engine.imgToStream();
		return null;
	}

	

}
