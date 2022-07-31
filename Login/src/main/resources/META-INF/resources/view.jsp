
<%@page import="com.liferay.petra.string.StringPool"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />


<%
String passwordNotMatched = Validator.isNotNull((String)request.getAttribute("PASSWORD_NOT_MATCHED")) ? (String)request.getAttribute("PASSWORD_NOT_MATCHED") : StringPool.BLANK;
String emailNotExist = Validator.isNotNull((String)request.getAttribute("EMAIL_NOT_EXIST")) ? (String)request.getAttribute("EMAIL_NOT_EXIST"): StringPool.BLANK;

PortletURL loginURL = renderResponse.createActionURL();
loginURL.setParameter(ActionRequest.ACTION_NAME, "loginUser");%>

<form method = "post" action="<%=loginURL.toString() %>" class = "row">
	<div class = "col-12 mb-3">
		 <label for = "emailId">Email</label>
		<input class ="form-control" type = "email" name="<portlet:namespace/>emailId"/>
	</div>
	<%if(Validator.isNotNull(emailNotExist)){%>
		<div style="color:red;"><%=emailNotExist%></div>
	<%}%>
	<div class = "col-12 mb-3">
		 <label for = "password">Password</label>
		<input class ="form-control" type = "password" name="<portlet:namespace/>password"/>
		<%if(Validator.isNotNull(passwordNotMatched)){%>
		 	<div style="color:red;"><%=passwordNotMatched%></div>
		<%}%>
	</div>
	<div class = "col-12 mb-3">
		<input type = "checkbox" name="<portlet:namespace/>remember"/>
		<span class ="fw-bold ms-1">Remember me?</span>
	</div>
	<div class = "col-12">
		<button class = "btn btn-info w-100 border rounded-pill">Login</button>
	</div>
</form> 
