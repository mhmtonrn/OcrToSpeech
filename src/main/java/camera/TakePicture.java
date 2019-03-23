/**
 * @author mehmet
 */

package camera;

import java.awt.image.BufferedImage;

import com.github.sarxos.webcam.Webcam;

public class TakePicture {
	private Webcam webcam;
	private String cameraName;

	public TakePicture(String cameraName) {
		super();
		this.cameraName = cameraName;
	}

	public BufferedImage getPicture() {
		webcam = CameraFactory.cameraInstance(this.cameraName);
		BufferedImage image = webcam.getImage();
		webcam.close();

		if (image == null) {
			return null;
		}
		return image;
	}

}
