package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {
	public static void main(String[] args) throws Exception {
		String imageUrl = "http://i.imgur.com/lsY8VMA.jpg";
		URL url = new URL(imageUrl);
		int result;
		
		try {
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/mabi.png")){
				
				while((result = is.read()) != -1) {
						os.write(result);
					}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
