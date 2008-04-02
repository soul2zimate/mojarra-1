<!--
 Copyright 2004 Sun Microsystems, Inc. All rights reserved.
 SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
-->

           <tr>

             <td>
               <h:outputText id="foo"
                     value="Grid with hardcoded values"/>
             </td>
                   

             <td>

               <h:form id="form1">

                  <h:panelGrid  columns="3" 
                                  border="1"
                             cellpadding="3"
                             cellspacing="3"
                                 summary="Grid with hardcoded HTML styles"
                                   title="Grid with hardcoded HTML styles" >

                    <f:facet        name="header">
                      <h:panelGroup>
                        <h:outputText
                                   value="Logon "/>
                        <h:outputText
                                   value="Form"/>
                      </h:panelGroup>
                    </f:facet>

                    <h:outputText value="Username:"/>

                    <h:inputText     id="username1"
                                   value="username"
                                required="true"/>

                    <h:message for="form1:username1"/>

                    <h:outputText value="Password:"/>

                    <h:inputSecret   id="password1"
                                   value="password"
                                required="true"/>

                    <h:message for="form1:password1"/>

                    <h:commandButton id="submit1"
                               action="#{LoginForm.login}"
                                    type="SUBMIT"
                                   value="Login"/>

                    <h:commandButton id="reset1"
                                    type="RESET"
                                   value="Reset"/>

                    <h:outputText value=""/>

                    <f:facet         name="footer">
                      <h:outputText
                                    value="Enter username and password to login"/>
                    </f:facet>

                </h:panelGrid>
 
               </h:form>

             </td>

            </tr>

            <tr>

              <td>
                 <h:outputText id="panel4Label"
                       value="Grid with CSS stylesheets"/>
             </td>


             <td>
             
               <h:form id="form2">

                  <h:panelGrid  columns="3"
                             footerClass="form-footer"
                             headerClass="form-header"
                              styleClass="form-background"
                           columnClasses="form-prompt,form-field"
                                 summary="Grid with CSS stylesheet styles"
                                   title="Grid with CSS stylesheet styles" >

                    <f:facet        name="header">
                      <h:panelGroup>
                        <h:outputText
                                   value="Logon "/>
                        <h:outputText
                                   value="Form"/>
                      </h:panelGroup>
                    </f:facet>

                    <h:outputText value="Username:"/>

                    <h:inputText     id="username2"
                                 binding="#{LoginForm.username}"
                                required="true"/>

                    <h:message for="form2:username2"/>

                    <h:outputText value="Password:"/>

                    <h:inputSecret   id="password2"
                                 binding="#{LoginForm.password}"
                                required="true"/>

                    <h:message for="form2:password2"/>

                    <h:commandButton id="submit2"
                               action="#{LoginForm.login}"
                                    type="SUBMIT"
                                   value="Login"/>

                    <h:commandButton id="reset2"
                                    type="RESET"
                                   value="Reset"/>

                    <h:outputText value=""/>

                    <f:facet         name="footer">
                      <h:panelGroup   id="footerGroup">
                        <h:outputText
                                    value="Enter username and password "/>
                        <h:outputText
                                    value="to login"/>
                      </h:panelGroup>
                    </f:facet>

                  </h:panelGrid>
 
                </h:form>

              </td>

            </tr>

