package util.constant;

import java.io.File;

import util.Settings;

public class FileConstant {
	
	private static final String ROOT_DIRECTORY = Settings.ROOT_DIRECTORY;
	public static final String PATH = getDefaultLocation(ROOT_DIRECTORY);

	private static String getDefaultLocation(String rootDirectory) {
	    if (rootDirectory == null) {
	    	File currDir = new File(".");
		    String path = currDir.getAbsolutePath();
		    path = path.substring(0, path.length()-1);
		    return path+"data\\";
		}else {
			return rootDirectory;
		}
	}

}
