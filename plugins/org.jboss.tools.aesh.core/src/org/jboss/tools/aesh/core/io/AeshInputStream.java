package org.jboss.tools.aesh.core.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class AeshInputStream extends PipedInputStream {
	
	public static final AeshInputStream INSTANCE = new AeshInputStream();

    private PipedOutputStream outputStream = new PipedOutputStream();
    
    public AeshInputStream() {
    	super();
    	try {
			connect(outputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public synchronized void append(String str) {
        try {
			outputStream.write(str.getBytes());
	        outputStream.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
}
