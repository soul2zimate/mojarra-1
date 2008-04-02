/*
 * $Id: FileOutputResponseWrapper.java,v 1.2 2003/02/20 22:49:46 ofung Exp $
 */

/*
 * Copyright 2003 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

// FileOutputResponseWrapper.java

package com.sun.faces;

import org.mozilla.util.Assert;
import org.mozilla.util.Debug;
import org.mozilla.util.ParameterCheck;

import javax.servlet.http.HttpServletResponseWrapper;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

/**
 *
 *  The sole purpose of <B>FileOutputResponseWrapper</B> is to wrap an
 *  ServletResponse and change its writer object  so that
 *  output can be directed to a file.  <P>
 *
 * <B>Lifetime And Scope</B> <P>
 *
 * @version $Id: FileOutputResponseWrapper.java,v 1.2 2003/02/20 22:49:46 ofung Exp $
 * 
 *
 */

public class FileOutputResponseWrapper extends HttpServletResponseWrapper
{
//
// Protected Constants
//

//
// Class Variables
//

//
// Instance Variables
//
protected PrintWriter out = null;
public static final String FACES_RESPONSE_ROOT = "./build/test/servers/tomcat40/webapps/test/";
public static final String  FACES_RESPONSE_FILENAME = FACES_RESPONSE_ROOT + 
    "FacesResponse.txt";

// Attribute Instance Variables


// Relationship Instance Variables

//
// Constructors and Initializers    
//

public FileOutputResponseWrapper(HttpServletResponse toWrap)
{
    super(toWrap);
    try {
        File file = new File ( FACES_RESPONSE_FILENAME );
        FileOutputStream fs = new FileOutputStream(file);
        out = new PrintWriter(fs);
    } catch ( Exception e ) {
        System.out.println(e.getMessage());
    }
}

public void flushBuffer() throws IOException {
    out.flush();
    out.close();
}


//
// Class methods
//

//
// Methods from ServletResponse 
//

public PrintWriter getWriter() {
    return out;
}




} // end of class FileOutputResponseWrapper


