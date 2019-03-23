
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;

import camera.ImageScan;
import ocr.engine.WordStream;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {



		JFrame window = new JFrame();
		JButton button = new JButton(new AbstractAction("Take Snapshot Now") {

			private static final long serialVersionUID = 1L;
			ImageScan img = new ImageScan();

			public void actionPerformed(ActionEvent e) {
				
				
				BufferedImage a = img.getImg();
				
				if (a!= null) {
					WordStream stream = new WordStream(a);
					stream.getOutputText();
				}
						

			}
		});

		window.add(button);

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		File currDir = new File(".");
		String path = currDir.getAbsolutePath();
		path = path.substring(0, path.length() - 1);
		System.out.println(path);

	}

}
