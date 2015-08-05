package agentsoz.jill.core.beliefbase.abs;

import java.util.Arrays;

public class ABelief {

	private int beliefset;
	private Object[] tuple;
	
	public ABelief(int beliefset, Object[] tuple) {
		this.beliefset = beliefset;
		this.tuple = tuple;
	}

	/**
	 * @return the beliefset
	 */
	public int getBeliefset() {
		return beliefset;
	}

	/**
	 * @param beliefset the beliefset to set
	 */
	public void setBeliefset(int beliefset) {
		this.beliefset = beliefset;
	}

	/**
	 * @return the tuple
	 */
	public Object[] getTuple() {
		return tuple;
	}

	/**
	 * @param tuple the tuple to set
	 */
	public void setTuple(Object[] tuple) {
		this.tuple = tuple;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + beliefset;
		result = prime * result + Arrays.hashCode(tuple);
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
		if (!(obj instanceof ABelief)) {
			return false;
		}
		ABelief other = (ABelief) obj;
		if (beliefset != other.beliefset) {
			return false;
		}
		if (!Arrays.equals(tuple, other.tuple)) {
			return false;
		}
		return true;
	}

	
}
