package agentsoz.jill.core.beliefbase.abs;

import java.util.Arrays;

import agentsoz.jill.core.beliefbase.BeliefBase.BeliefSetField;
import agentsoz.jill.struct.AObject;
import agentsoz.jill.util.AString;

public class ABeliefSet extends AObject {

	private BeliefSetField[] fields;
	
	public ABeliefSet(int id, String name, BeliefSetField[] fields) {
		super(name);
		setId(id);
		this.fields = fields;
	}

	
	/**
	 * @return the fields
	 */
	public BeliefSetField[] getFields() {
		return fields;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(fields);
		result = prime * result + getName().hashCode();
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ABeliefSet)) {
			return false;
		}
		ABeliefSet other = (ABeliefSet) obj;
		if (!Arrays.equals(fields, other.fields)) {
			return false;
		}
		if (!getName().equals(other.getName())) {
			return false;
		}
		return true;
	}

	
}
