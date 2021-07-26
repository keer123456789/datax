package com.alibaba.datax.plugin.rdbms.reader;

import com.sun.prism.shader.Solid_ImagePattern_AlphaTest_Loader;

/**
 * 编码，时区等配置，暂未定.
 */
public final class Key {
    public final static String JDBC_URL = "jdbcUrl";

    public final static String USERNAME = "username";

    public final static String PASSWORD = "password";

    public final static String TABLE = "table";

    public final static String MANDATORY_ENCODING = "mandatoryEncoding";

    // 是数组配置
    public final static String COLUMN = "column";

    public final static String COLUMN_LIST = "columnList";

    public final static String WHERE = "where";

    public final static String HINT = "hint";

    public final static String SPLIT_PK = "splitPk";

    public final static String SPLIT_MODE = "splitMode";

    public final static String SAMPLE_PERCENTAGE = "samplePercentage";

    public final static String QUERY_SQL = "querySql";

    public final static String SPLIT_PK_SQL = "splitPkSql";


    public final static String PRE_SQL = "preSql";

    public final static String POST_SQL = "postSql";

    public final static String CHECK_SLAVE = "checkSlave";

    public final static String SESSION = "session";

    public final static String DBNAME = "dbName";

    public final static String DRYRUN = "dryRun";

    /**
     * hive Kerberos 特殊配置
     */
    public static final String HAVE_KERBEROS = "haveKerberos";
    /**
     * 文件 ***.keytab 文件路径
     */
    public static final String KERBEROS_KEYTAB_FILE_PATH = "kerberosKeytabFilePath";
    /**
     * 文件 hdfs-site.xml 文件路径
     */
    public static final String KERBEROS_HDFSCONF_FILE_PATH = "kerberosHdfsConfFilePath";
    /**
     * 文件 core-site.xml 文件路径
     */
    public static final String KERBEROS_CORECONF_FILE_PATH = "kerberosCoreConfFilePath";
    /**
     * 文件 krb5.conf 文件路径
     */
    public static final String KERBEROS_CONFIG_FILE_PATH = "kerberosConfigFilePath";
    /**
     * Kerberos 用户名
     */
    public static final String KERBEROS_USERNAME = "kerberosUserName";


}