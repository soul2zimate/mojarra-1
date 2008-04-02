/*
 * $Id: MockViewHandler.java,v 1.3 2003/08/02 05:11:35 eburns Exp $
 */

/*
 * Copyright 2003 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package javax.faces.mock;

import java.io.IOException;
import java.io.Reader;
import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import javax.faces.component.UIPage;
import javax.faces.application.ViewHandler;
import javax.faces.application.StateManager;


public class MockViewHandler extends Object implements ViewHandler {

    protected StateManager stateManager = null;

    public void renderView(FacesContext context)
        throws IOException, FacesException {}

    public UIPage restoreView(FacesContext context, String treeId) {
	return null;
    }

    public StateManager getStateManager() {
	if (null == stateManager) {
	    stateManager = new StateManager() {
		    protected Object getTreeStructureToSave(FacesContext context) {
			return null;
		    }
		    protected Object getTreeStateToSave(FacesContext context) {
			return null;
		    }
		    public void restoreTree(FacesContext context, String treeId) throws IOException {}
		    public void writeStateMarker(FacesContext context) throws IOException {}
		    public void saveTree(FacesContext context, Reader content, 
			SerializedTree state) {}
		    protected boolean restoreTreeStructure(FacesContext context, 
							   String treeId) {
			return false;
		    }
		    protected void restoreTreeState(FacesContext context) throws IOException {}
		};
	}
	return stateManager;
    }

}

		    



