package camera;

import java.io.File;

import util.constant.FileConstant;

public class ImgFileController {
	
	/**
	 * 
	 * @param directory i�erisinde �al���lmak istenen dizin e�er null g�nderilirse program�n se�ti�i rastgele dizinde �al��acak
	 * @return dizin ad�
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
	 * @return kaydedilecek olan g�r�nt�n�n ad�
	 */
	public static String picName() {
		return "pic_"+System.currentTimeMillis();
	}

}
