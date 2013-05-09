/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Test extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 928936533;

	/**
	 * The singleton instance of <code>TEST</code>
	 */
	public static final Test TEST = new Test();

	/**
	 * No further instances allowed
	 */
	private Test() {
		super("TEST");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final java.util.List<org.jooq.Sequence<?>> getSequences0() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			org.jooq.test.oracle.generatedclasses.test.Sequences.S_AUTHOR_ID,
			org.jooq.test.oracle.generatedclasses.test.Sequences.S_961_BIG_INTEGER,
			org.jooq.test.oracle.generatedclasses.test.Sequences.S_961_BYTE,
			org.jooq.test.oracle.generatedclasses.test.Sequences.S_961_INT,
			org.jooq.test.oracle.generatedclasses.test.Sequences.S_961_LONG,
			org.jooq.test.oracle.generatedclasses.test.Sequences.S_961_SHORT);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.test.oracle.generatedclasses.test.tables.MLibrary.M_LIBRARY,
			org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS,
			org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR,
			org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK,
			org.jooq.test.oracle.generatedclasses.test.tables.TBookStore.T_BOOK_STORE,
			org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS,
			org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES,
			org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY,
			org.jooq.test.oracle.generatedclasses.test.tables.TExoticTypes.T_EXOTIC_TYPES,
			org.jooq.test.oracle.generatedclasses.test.tables.TLanguage.T_LANGUAGE,
			org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS,
			org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE,
			org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest.T_725_LOB_TEST,
			org.jooq.test.oracle.generatedclasses.test.tables.T_785.T_785,
			org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR,
			org.jooq.test.oracle.generatedclasses.test.tables.VBook.V_BOOK,
			org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete.V_INCOMPLETE,
			org.jooq.test.oracle.generatedclasses.test.tables.VLibrary.V_LIBRARY,
			org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025,
			org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69,
			org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_71.X_TEST_CASE_71,
			org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85,
			org.jooq.test.oracle.generatedclasses.test.tables.XUnused.X_UNUSED);
	}

	@Override
	public final java.util.List<org.jooq.UDT<?>> getUDTs() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getUDTs0());
		return result;
	}

	private final java.util.List<org.jooq.UDT<?>> getUDTs0() {
		return java.util.Arrays.<org.jooq.UDT<?>>asList(
			org.jooq.test.oracle.generatedclasses.test.udt.OInvalidType.O_INVALID_TYPE,
			org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.U_ADDRESS_TYPE,
			org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType.U_AUTHOR_TYPE,
			org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE,
			org.jooq.test.oracle.generatedclasses.test.udt.UInvalidTable.U_INVALID_TABLE,
			org.jooq.test.oracle.generatedclasses.test.udt.UInvalidType.U_INVALID_TYPE,
			org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.U_STREET_TYPE);
	}
}
