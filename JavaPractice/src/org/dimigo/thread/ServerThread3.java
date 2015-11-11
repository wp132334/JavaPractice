package org.dimigo.thread;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ ServerThread3
 * 
 * 1. 媛쒖슂 : 
 * 2. �옉�꽦�씪 : 2015. 10. 29.
 * </pre>
 *
 * @author		: �씠由�
 * @version		: 1.0
 */
public class ServerThread3 implements Runnable {
  
	// �겢�씪�씠�뼵�듃���쓽 �넻�떊�쓣 �쐞�븳 �냼耳�
	private Socket connectionSocket;
	
	private final static String DEFAULT_FILE_NAME = "index.html";
	private final static String NEWLINE = System.getProperty("line.separator");
	
	public ServerThread3(Socket connectionSocket) {
		this.connectionSocket = connectionSocket;
	}
	  
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " thread start");
		
		// �겢�씪�씠�뼵�듃�� �넻�떊�쓣 �쐞�븳 �엯/異쒕젰 �뒪�듃由쇱쓣 �깮�꽦�븳�떎.
	    try(BufferedReader in = new BufferedReader(
	    		new InputStreamReader(connectionSocket.getInputStream()));
	    	BufferedOutputStream out = new BufferedOutputStream(connectionSocket.getOutputStream())) {
	    	
	    	// �겢�씪�씠�뼵�듃濡쒖쓽 硫붿떆吏�以� 泥ル쾲吏� 以꾩쓣 �씫�뼱�뱾�씤�떎.
	    	String request = in.readLine();
	    	System.out.println("request message : " + request);
	    	
	    	// �뙆�씪紐� �뼸湲�
	    	String[] requestArr = request.split(" ");
	    	String fileName = "";
	    	
	    	if(requestArr[1].equals("/")) {
	    		fileName = DEFAULT_FILE_NAME;
	    	} else {
	    		fileName += requestArr[1].substring(1);
	    	}
	    	System.out.println("file name : " + fileName);
	    	
	    	// �뙆�씪 �엯�젰 �뒪�듃由� �깮�꽦
	    	File file = new File("org/dimigo/thread/" + fileName);
	    	
	    	// �빐�떦 �뙆�씪�씠 議댁옱�븯�뒗 寃쎌슦
	    	if(file.exists()) {	    		
	    		byte[] bytes = new byte[(int)file.length()];
	    		
	    		/********************************************
	    		 * 諛붿씠�듃湲곕컲 �뒪�듃由쇱쓣 �깮�꽦�븯�뿬 �뙆�씪�뿉�꽌 �씫�뼱 byte[]�뿉 �떞湲�
	    		 ********************************************/
		    	
	    		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
	    			bis.read(bytes);
	    		}
	    		
		    	// �젙�긽�쟻�쑝濡� 泥섎━媛� �릺�뿀�쓬�쓣 �굹���궡�뒗 200 肄붾뱶瑜� 異쒕젰�븳�떎.
		    	out.write(("HTTP/1.1 200" + NEWLINE).getBytes());
		    	out.write(("Content-type: " + contentType(fileName) + NEWLINE).getBytes());
		    	out.write(("Content-length: " + bytes.length + NEWLINE).getBytes());
		    	// header遺��쓽 �걹�쓣 �븣由ш린 �쐞�빐 �븳以� �쓣湲�
		    	out.write(NEWLINE.getBytes());
		    	out.write(bytes, 0, (int)file.length());
		    	
	    	} else {
	    		// �긽�깭 肄붾뱶 404 : Not Found
	    		out.write(("HTTP/1.1 404" + NEWLINE).getBytes());
		    	out.write(("Content-type: text/html" + NEWLINE).getBytes());
		    	String response = "<html><head><title>My Web Server</title></head>" +
		    					  "<body><h1>" + fileName + " File Not Found</h1></body></html>";
		    	out.write(("Content-length: " + response.length() + NEWLINE).getBytes());
		    	// header遺��쓽 �걹�쓣 �븣由ш린 �쐞�빐 �븳以� �쓣湲�
		    	out.write(NEWLINE.getBytes());
		    	out.write(response.getBytes(), 0, response.getBytes().length);
	    	}
	    	out.flush();
	    	
	    } catch(Exception e) {
	    	e.printStackTrace();
	    } finally {
	    	try {
				connectionSocket.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	System.out.println(Thread.currentThread().getName() + " thread close");
	    }
	}
	
	private static String contentType(String fileName) {
	    if(fileName.endsWith(".htm") || fileName.endsWith(".html")) {
	        return "text/html";
	    } else if(fileName.endsWith(".jpeg") || fileName.endsWith(".jpg")) {
	    	return "image/jpeg";
	    } else if(fileName.endsWith(".gif")) {
	    	return "image/gif";
	    } else if(fileName.endsWith(".png")) {
	    	return "image/png";
	    }
	    return "application/octet-stream";
	}
}
