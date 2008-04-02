/*
 * $Id: FormTag.java,v 1.38 2003/07/07 20:53:02 eburns Exp $
 */

/*
 * Copyright 2003 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

// FormTag.java

package com.sun.faces.taglib.html_basic;

import org.mozilla.util.Assert;
import org.mozilla.util.ParameterCheck;

import javax.servlet.jsp.JspException;

import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.context.FacesContext;
import javax.faces.FacesException;

import com.sun.faces.util.Util;

import com.sun.faces.taglib.FacesTag;
import com.sun.faces.RIConstants;

/**
 *
 *  <B>FacesTag</B> is a base class for most tags in the Faces Tag
 *  library.  Its primary purpose is to centralize common tag functions
 *  to a single base class. <P>
 *
 * @version $Id: FormTag.java,v 1.38 2003/07/07 20:53:02 eburns Exp $
 * 
 * @see	Blah
 * @see	Bloo
 *
 */

public class FormTag extends FacesTag
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

// Attribute Instance Variables

    public String formName = null;

// Relationship Instance Variables

//
// Constructors and Initializers    
//

public FormTag()
{
    super();
}

//
// Class methods
//

// 
// Accessors
//

    public String getFormName() { return formName; }
    public void setFormName(String newFormName) { 
	formName = newFormName;
    }

//
// General Methods
//

    public String getLocalRendererType() { return "Form"; }
    public String getComponentType() { return "Form"; }

    protected void overrideProperties(UIComponent component) {
	super.overrideProperties(component);
	UIForm form = (UIForm) component;

	if (null == form.getFormName()) {
	    form.setFormName(getFormName());
             // we set the bundle attribute on the root component here  
             // so that we don't set it again during postback. 
             // This cannot be done in FacesTag since this is specific
             // to FormTag. Since formName is a required attribute,
             // we can be sure that these statements will be executed
             // the first time the tags are processed.
            if ( getBundle() != null) { 
                // set it as an attribute on the root component so that
                // it is available to children and doesn't have to be repeated
                // in every tag.
                FacesContext context = FacesContext.getCurrentInstance();
                UIComponent root = context.getTree().getRoot();
                root.setAttribute(RIConstants.BUNDLE_ATTR, getBundle());
            }
	}
        // action, method, enctype, acceptcharset, accept, target, onsubmit, onreset
        if (getOnsubmit() != null ) {
            component.setAttribute("onsubmit", getOnsubmit()); 
        }
        if (getOnreset() != null ) {
            component.setAttribute("onreset", getOnreset()); 
        }
        if (getAction() != null ) {
            component.setAttribute("action", getAction()); 
        }
        if (getMethod() != null ) {
            component.setAttribute("method", getMethod()); 
        }
        if (getEnctype() != null ) {
            component.setAttribute("enctype", getEnctype()); 
        }
        if (getAccept() != null ) {
            component.setAttribute("accept", getAccept()); 
        }
        if (getTarget() != null ) {
            component.setAttribute("target", getTarget()); 
        }
        if (getAcceptcharset() != null ) {
            component.setAttribute("acceptcharset", getAcceptcharset()); 
        }
        if (getFormClass() != null ) {
            component.setAttribute("formClass", getFormClass()); 
        }

    }
    
//
// Methods from TagSupport
// 


} // end of class FormTag
