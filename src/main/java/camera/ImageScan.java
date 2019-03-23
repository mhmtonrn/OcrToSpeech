/**
 * @author mehmet
 */

package camera;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


import util.Settings;
import util.constant.WebcamConstant;

public class ImageScan {
	private String path;
	private BufferedImage img;
	private String cameraName = WebcamConstant.CAMERA_NAME;

	public ImageScan() {
		this.path = ImgFileController.getNewPicturePath(null);
	}

	private void getImage() {
		TakePicture pic = new TakePicture(cameraName);

		BufferedImage image = pic.getPicture();
				try {
					if (image != null) {
						if (Settings.resmiKaydet) {
							ImageIO.write(image, "PNG", new File(path + "\\" + ImgFileController.picName() + ".png"));
							setImg(image);
						}
						
					}else {
						throw new IOException();
					}
				} catch (IOException e) {
					System.out.println("görüntü gelmedi");
				}



	}

	public BufferedImage getImg() {
		getImage();
		return img;
	}

	public void setImg(BufferedImage img) {
		this.img = img;
	}
	
	
	

}
