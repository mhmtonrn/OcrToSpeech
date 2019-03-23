/**
 * @author mehmet
 */

package util;

import util.toolTip.OcrEngineTip;

public class Settings {
	
	//directory settings
	public static String ROOT_DIRECTORY = null;
	public static String TESSERACT_DATA_PATH = "C:\\Users\\mehme\\eclipse-workspace\\OcrToSpeech\\project-data\\ocr-data\\tesseract-data\\tessdata";
	
	
	//webcam settings
	public static final int DIMEN_X = 640;
	public static final int DIMEN_Y = 480;
	public static final String CAMERA_NAME = null;
	
	
	//image setting
	public static final boolean resmiKaydet = true;
	
	//ocr engine
	public static String LANGAGE = "tur";
	public static OcrEngineTip DEFAULT_OCR_ENGINE = OcrEngineTip.TESSERACT;
	



}
