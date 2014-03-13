package mocabdi.lang;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface PlanInfo {
	
	String handlesGoal();
	String[] postsGoals() default {};
}
