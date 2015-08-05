package agentsoz.jill.core.beliefbase.abs;

import agentsoz.jill.core.beliefbase.abs.ABeliefStore.Operator;

public class AQuery {

	private int beliefset;
	private int field;
	private Operator op;
	private Object value;
	
	public AQuery(int beliefset, int field, Operator op, Object value) {
		super();
		this.beliefset = beliefset;
		this.field = field;
		this.op = op;
		this.value = value;
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
	 * @return the field
	 */
	public int getField() {
		return field;
	}

	/**
	 * @param field the field to set
	 */
	public void setField(int field) {
		this.field = field;
	}

	/**
	 * @return the op
	 */
	public Operator getOp() {
		return op;
	}

	/**
	 * @param op the op to set
	 */
	public void setOp(Operator op) {
		this.op = op;
	}

	/**
	 * @return the value
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
