package camera;

import java.io.File;

import util.constant.FileConstant;

public class ImgFileController {
	
	/**
	 * 
	 * @param directory içerisinde çalýþýlmak istenen dizin eðer null gönderilirse programýn seçtiði rastgele dizinde çalýþacak
	 * @return dizin adý
	 */
	public static String getNewPicturePath(String directory) {
		if (directory != null) {
			return FileConstant.PATH+directory+"/";
		}else{
			File f = new File(FileConstant.PATH+"Dir_"+System.currentTimeMillis());
			if (!f.exists()) {
				f.mkdir();
				return f.getAbsolutePath();
			}
			return f.getAbsolutePath();
		}
	}
	
	/**
	 * 
	 * @return kaydedilecek olan görüntünün adý
	 */
	public static String picName() {
		return "pic_"+System.currentTimeMillis();
	}

}
