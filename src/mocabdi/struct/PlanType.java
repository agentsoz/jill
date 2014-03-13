package mocabdi.struct;

import java.lang.reflect.Method;

public class PlanType extends GPType{
	private Class<?> cPlan;
	private Method mContext;
	private Method mBody;
	
	public PlanType(String name) {
		super(name);
	}

	public Method getContext() {
		return mContext;
	}
	
	public void setContext(Method mContext) {
		this.mContext = mContext;
	}

	public Method getBody() {
		return mBody;
	}
	
	public void setBody(Method mBody) {
		this.mBody = mBody;
	}

	public Class<?> getPlanClass() {
		return cPlan;
	}

	public void setPlanClass(Class<?> cPlan) {
		this.cPlan = cPlan;
	}	
}
