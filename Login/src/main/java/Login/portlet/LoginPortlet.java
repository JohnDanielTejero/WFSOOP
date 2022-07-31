package Login.portlet;

import Login.constants.LoginPortletKeys;

import com.liferay.adaptive.media.exception.AMRuntimeException.IOException;
import com.liferay.portal.kernel.model.CompanyConstants;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.security.auth.session.AuthenticatedSessionManagerUtil;
import com.liferay.portal.kernel.service.PasswordTrackerLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import java.lang.reflect.Method;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author DanielPC
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Login",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + LoginPortletKeys.LOGIN,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LoginPortlet extends MVCPortlet {
	public void loginUser(ActionRequest actionRequest,
            ActionResponse actionResponse) throws IOException, PortletException{
           
            String email = ParamUtil.getString(actionRequest, "emailId").trim();
            String password = ParamUtil.getString(actionRequest, "password").trim();
            boolean rememberMe = ParamUtil.getBoolean(actionRequest, "remember");
            ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);    
            HttpServletRequest request = PortalUtil.getHttpServletRequest(actionRequest);
            HttpServletResponse response = PortalUtil.getHttpServletResponse(actionResponse);
            
            User userDetail = null;
            try {
                userDetail = UserLocalServiceUtil.fetchUserByEmailAddress(themeDisplay.getCompanyId(), email);
                if(Validator.isNull(userDetail)){
                 actionRequest.setAttribute("EMAIL_NOT_EXIST", "Account not exist with email");
                  }else{
                 boolean passwordMatched = PasswordTrackerLocalServiceUtil.isSameAsCurrentPassword(userDetail.getUserId(), password);
	                 if(!passwordMatched){
	                  actionRequest.setAttribute("PASSWORD_NOT_MATCHED", "Please Enter Correct Password");
	                 }else{
	                	 	String url = PortalUtil.getLayoutFriendlyURL(themeDisplay);
	                	 	url = url.replace("/login", "/");
	                        AuthenticatedSessionManagerUtil.login(
	                                request, response, email, password, rememberMe, CompanyConstants.AUTH_TYPE_EA);
	                          actionResponse.sendRedirect(url);
	                          
	                 }
                 }
              }catch (Exception e) {
                    e.printStackTrace();
              }
     }
}