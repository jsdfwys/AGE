package com.age.core.utils;

import java.math.BigDecimal;
import java.util.Date;

import com.age.core.domain.CursorVO;

public class JdbcHelper {

	public JdbcHelper() {
	}

	/*
	public static final int BIT = -7;
	public static final int TINYINT = -6;
	public static final int SMALLINT = 5;
	public static final int INTEGER = 4;
	public static final int BIGINT = -5;
	public static final int FLOAT = 6;
	public static final int REAL = 7;
	public static final int DOUBLE = 8;
	public static final int NUMERIC = 2;
	public static final int DECIMAL = 3;
	public static final int CHAR = 1;
	public static final int VARCHAR = 12;
	public static final int LONGVARCHAR = -1;
	public static final int DATE = 91;
	public static final int TIME = 92;
	public static final int TIMESTAMP = 93;
	/**
	 * @deprecated Field TIMESTAMPNS is deprecated
	 */
	/*
	public static final int TIMESTAMPNS = -100;
	public static final int TIMESTAMPTZ = -101;
	public static final int TIMESTAMPLTZ = -102;
	public static final int INTERVALYM = -103;
	public static final int INTERVALDS = -104;
	public static final int BINARY = -2;
	public static final int VARBINARY = -3;
	public static final int LONGVARBINARY = -4;
	public static final int ROWID = -8;
	public static final int CURSOR = -10;
	public static final int BLOB = 2004;
	public static final int CLOB = 2005;
	public static final int BFILE = -13;
	public static final int STRUCT = 2002;
	public static final int ARRAY = 2003;
	public static final int REF = 2006;
	public static final int OPAQUE = 2007;
	public static final int JAVA_STRUCT = 2008;
	public static final int JAVA_OBJECT = 2000;
	public static final int PLSQL_INDEX_TABLE = -14;
	public static final int BINARY_FLOAT = 100;
	public static final int BINARY_DOUBLE = 101;
	public static final int NULL = 0;
	public static final int NUMBER = 2;
	public static final int RAW = -2;
	public static final int OTHER = 1111;
	public static final int FIXED_CHAR = 999;
	public static final int DATALINK = 70;
	public static final int BOOLEAN = 16;
	private static final String _Copyright_2004_Oracle_All_Rights_Reserved_ = null;
	public static final boolean TRACE = false;
	public static final boolean PRIVATE_TRACE = false;
	public static final String BUILD_DATE = "Sat_Feb__2_11:39:33_PST_2008";
	 */

	public static int translateType(Object o) {
		if (o instanceof String)
			return 12;
		if (o instanceof Integer)
			return 4;
		if (o instanceof Long)
			return -5;
		if (o instanceof Float)
			return 7;
		if (o instanceof Double)
			return 8;
		if (o instanceof BigDecimal)
			return 3;
		if (o instanceof Boolean)
			return 16;
		if (o instanceof CursorVO)
			return -10;//游标类 key:cursor value:CursorVO
		return !(o instanceof Date) ? 12 : 91;
	}

}