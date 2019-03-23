package util.toolTip;

public enum OcrEngineTip {
	TESSERACT("tesseract");

	private String ocrEngine;
	
	private OcrEngineTip(String ocrEngine) {
		this.ocrEngine = ocrEngine;
	}

	public String getOcrEngine() {
		return ocrEngine;
	}
	
}
