package org.dimigo.thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ ServerThread2
 * 
 * 1. 媛쒖슂 : 
 * 2. �옉�꽦�씪 : 2015. 10. 29.
 * </pre>
 *
 * @author		: �씠由�
 * @version		: 1.0
 */
public class ServerThread2 implements Runnable {
  
	// �겢�씪�씠�뼵�듃���쓽 �넻�떊�쓣 �쐞�븳 �냼耳�
	private Socket connectionSocket;
	
	private final static String DEFAULT_FILE_NAME = "index.html";
	
	public ServerThread2(Socket connectionSocket) {		
		this.connectionSocket = connectionSocket;
	}
	  
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " thread start");
		
		// �겢�씪�씠�뼵�듃�� �넻�떊�쓣 �쐞�븳 �엯/異쒕젰 �뒪�듃由쇱쓣 �깮�꽦�븳�떎.
	    try(BufferedReader in = new BufferedReader(
	    		new InputStreamReader(connectionSocket.getInputStream()));
	    	PrintWriter out = new PrintWriter(connectionSocket.getOutputStream(), true)) {
	    	
	    	// �겢�씪�씠�뼵�듃濡쒖쓽 硫붿떆吏� 以� 泥ル쾲吏� 以꾩쓣 �씫�뼱�뱾�씤�떎.
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
	    		/************************************
	    		 * �빐�떦 �뙆�씪濡쒕��꽣 �궡�슜�쓣 �씫�뼱 response�뿉 �떞湲�
	    		 ************************************/
	    		String line;
	    		StringBuffer sb = new StringBuffer();
	    		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
	    			while((line = br.readLine()) != null) {
	    				sb.append(line);
	    			}
	    		}
	    		
		    	String response = sb.toString();
		    	
		    	System.out.println("response : [" + response + "]");
		    	
		    	// �젙�긽�쟻�쑝濡� 泥섎━媛� �릺�뿀�쓬�쓣 �굹���궡�뒗 200 肄붾뱶瑜� 異쒕젰�븳�떎.
		    	out.println("HTTP/1.1 200");
		    	out.println("Content-type: text/html");
		    	out.println("Content-length: " + response.length());
		    	// header遺��쓽 �걹�쓣 �븣由ш린 �쐞�빐 �븳以� �쓣湲�
		    	out.println("");
		    	out.println(response);		    	
	    	} else {
	    		// �긽�깭 肄붾뱶 404 : Not Found
	    		out.println("HTTP/1.1 404");
		    	out.println("Content-type: text/html");
		    	String response = "<html><head><title>My Web Server</title></head>" +
		    					  "<body><h1>" + fileName + " File Not Found</h1></body></html>";
		    	out.println("Content-length: " + response.length());
		    	// header遺��쓽 �걹�쓣 �븣由ш린 �쐞�빐 �븳以� �쓣湲�
		    	out.println("");
		    	out.println(response);
	    	}

	    } catch(Exception e) {
	    	e.printStackTrace();
	    } finally {
	    	try {
				connectionSocket.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	System.out.println(Thread.currentThread().getName() + " thread end");
	    }
	}
}
