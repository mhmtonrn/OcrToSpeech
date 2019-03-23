package camera;

import java.awt.Dimension;

import com.github.sarxos.webcam.Webcam;

import util.constant.WebcamConstant;

public class CameraFactory {

	/**
	 * 
	 * @param webcamName  kamera ad� null ge�ilebilir
	 * @return
	 * ==========================================================================================================================
	 * kameran�n �rne�ini olu�turmak iistendi�inde kulllan�lacak olan method
	 */
	public static Webcam cameraInstance(String webcamName) {
		Webcam webcam = getWebcam(webcamName);
		webcam = setDimension(webcam,WebcamConstant.DIMENTION);
		webcam.open();
		return webcam;
	}
	
	/**
	 * @param w view size ayarlanacak olan kamera
	 * @param d dimension
	 * @return size ayarlanm�� kamera
	 * ==========================================================================================================================
	 * kameran�n size de�erini ayarlamak i�in kullan�l�r kamera sabitlendi�inde dimension de�ererini sabitleyece�iz
	 */
	private static Webcam setDimension(Webcam w, Dimension d) {
		w.setViewSize(d);
		return w;
	}

	/**
	 * @param webcamName
	 * @return nesnesini geri d�ner
	 * 
	 * ==========================================================================================================================
	 * sistemde default olan kameray� al�r @param webcamName dolu ise isimde
	 * kay�tl� kameray� getirir bo� verilirse default olan kamera se�ilir
	 */
	private static Webcam getWebcam(String webcamName) {
		Webcam webcam = null;
		if (webcamName == null) {
			webcam = Webcam.getDefault();
		} else {
			webcam = getWebcam(webcamName);
		}
		if (webcam != null) {
			return webcam;
		}
		return null;

	}

}
