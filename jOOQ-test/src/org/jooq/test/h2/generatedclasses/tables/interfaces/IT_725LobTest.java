/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IT_725LobTest extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.T_725_LOB_TEST.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_725_LOB_TEST.ID</code>. 
	 */
	public java.lang.Integer getId();

	/**
	 * Setter for <code>PUBLIC.T_725_LOB_TEST.LOB</code>. 
	 */
	public void setLob(byte[] value);

	/**
	 * Getter for <code>PUBLIC.T_725_LOB_TEST.LOB</code>. 
	 */
	public byte[] getLob();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IT_725LobTest
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IT_725LobTest from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IT_725LobTest
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IT_725LobTest> E into(E into);
}
