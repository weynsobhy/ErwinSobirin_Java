package dms.Action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import dms.Service.ESUserService;

public class ESLoginAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 1L;
	private ESUserService eSUserService;
	private Map<String, Object> session;

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		try {
			session = ActionContext.getContext().getSession();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
