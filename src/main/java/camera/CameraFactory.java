package camera;

import java.awt.Dimension;

import com.github.sarxos.webcam.Webcam;

import util.constant.WebcamConstant;

public class CameraFactory {

	/**
	 * 
	 * @param webcamName  kamera adý null geçilebilir
	 * @return
	 * ==========================================================================================================================
	 * kameranýn örneðini oluþturmak iistendiðinde kulllanýlacak olan method
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
	 * @return size ayarlanmýþ kamera
	 * ==========================================================================================================================
	 * kameranýn size deðerini ayarlamak için kullanýlýr kamera sabitlendiðinde dimension deðererini sabitleyeceðiz
	 */
	private static Webcam setDimension(Webcam w, Dimension d) {
		w.setViewSize(d);
		return w;
	}

	/**
	 * @param webcamName
	 * @return nesnesini geri döner
	 * 
	 * ==========================================================================================================================
	 * sistemde default olan kamerayý alýr @param webcamName dolu ise isimde
	 * kayýtlý kamerayý getirir boþ verilirse default olan kamera seçilir
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
