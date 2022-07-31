<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<liferay-theme:defineObjects />
<portlet:defineObjects />

<%
String userExistMessage = Validator.isNotNull((String)request.getAttribute("USER_EXIST"))  ? (String)request.getAttribute("USER_EXIST") : null;

PortletURL registerUserURL=renderResponse.createActionURL();
registerUserURL.setParameter(ActionRequest.ACTION_NAME, "registration");
%>

              <%
              if(Validator.isNotNull(userExistMessage)){
              %>
                <div Style="color:red;"><%=userExistMessage%></div>
              <%}%>

<aui:form action="<%=registerUserURL%>" method="post">
                           <aui:input  name="firstName" label="" placeholder="First Name">
                          <aui:validator name="required"/>
                          <aui:validator name="alpha"/>
                </aui:input>                          
      
                           <aui:input  name="lastName"  label="" placeholder="Last Name" >
                                   <aui:validator name="required"/>
                          <aui:validator name="alpha"/>
                         </aui:input>
      
                         <aui:input  name="email" label="" placeholder="E-mail">
                                   <aui:validator name="required"/>
                          <aui:validator name="email"/>
                </aui:input>
      
                           <aui:input type="password"  name="password"  label="" placeholder="Password">
                           <aui:validator name="required"/>
                         </aui:input>
             
                           <aui:input type="password"  name="repass" label="" placeholder="Retype-Password">
                            <aui:validator name="equalTo">'#<portlet:namespace />password'</aui:validator>
                         </aui:input>
                           <aui:button type="submit" value="Register"/>
</aui:form>