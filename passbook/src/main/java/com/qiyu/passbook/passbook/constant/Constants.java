package com.qiyu.passbook.passbook.constant;

/**
 * <h1>constant define</h1>
 * Created by Qiyu.
 */
public class Constants {

    /** coupon Kafka Topic */
    public static final String TEMPLATE_TOPIC = "merchants-template";

    /** token dir */
    public static final String TOKEN_DIR = "/tmp/token/";

    /** used token suffix */
    public static final String USED_TOKEN_SUFFIX = "_";  //mark the used token

    /** user's redis key */
    public static final String USE_COUNT_REDIS_KEY = "passbook-user-count";

    /**
     * <h2>User HBase Table</h2>
     * */
    public class UserTable {

        /** User HBase name, space : table name */
        public static final String TABLE_NAME = "pb:user";

        /** basic cols */
        public static final String FAMILY_B = "b";

        /** name */
        public static final String NAME = "name";

        /** age */
        public static final String AGE = "age";

        /** sex */
        public static final String SEX = "sex";

        /** additional cols */
        public static final String FAMILY_O = "o";

        /** phone */
        public static final String PHONE = "phone";

        /** address */
        public static final String ADDRESS = "address";
    }

    /**
     * <h2>PassTemplate HBase Table</h2>
     * */
    public class PassTemplateTable {

        /** PassTemplate HBase name */
        public static final String TABLE_NAME = "pb:passtemplate";

        /** basic */
        public static final String FAMILY_B = "b";

        /** merchants id */
        public static final String ID = "id";

        /** coupon name */
        public static final String TITLE = "title";

        /** coupon summary */
        public static final String SUMMARY = "summary";

        /** coupon sinfo */
        public static final String DESC = "desc";

        /** coupon has token or not */
        public static final String HAS_TOKEN = "has_token";

        /** coupon background color*/
        public static final String BACKGROUND = "background";

        /** limit cols */
        public static final String FAMILY_C = "c";

        /** upper  */
        public static final String LIMIT = "limit";

        /** begin time */
        public static final String START = "start";

        /** deadline */
        public static final String END = "end";
    }

    /**
     * <h2>Pass HBase Table</h2>
     * */
    public class PassTable {

        /** Pass HBase name */
        public static final String TABLE_NAME = "pb:pass";

        /** info cols */
        public static final String FAMILY_I = "i";

        /** user id */
        public static final String USER_ID = "user_id";

        /** coupon id */
        public static final String TEMPLATE_ID = "template_id";

        /** coupon token*/
        public static final String TOKEN = "token";

        /** when did user get */
        public static final String ASSIGNED_DATE = "assigned_date";

        /** when did user cost */
        public static final String CON_DATE = "con_date";
    }

    /**
     * <h2>Feedback Hbase Table</h2>
     * */
    public class Feedback {

        /** Feedback HBase name */
        public static final String TABLE_NAME = "pb:feedback";

        /** info cols */
        public static final String FAMILY_I = "i";

        /** user id */
        public static final String USER_ID = "user_id";

        /** comment type */
        public static final String TYPE = "type";

        /** PassTemplate RowKey, -1 for app comment*/
        public static final String TEMPLATE_ID = "template_id";

        /** context of comment */
        public static final String COMMENT = "comment";
    }
}

