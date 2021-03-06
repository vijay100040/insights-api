package org.gooru.insights.api.constants;

public class ApiConstants {

	/**
	 * String constants
	 */
	public static final String STRING_EMPTY= "";
	 
	public static final String COMMA = ",";
	
	public static final String TILDA = "~";
	
	public static final String GOORU_SESSION_TOKEN = "Gooru-Session-Token";
	
	public static final String SESSION_TOKEN = "sessionToken";
	
	public static final String TOMCAT_INIT = "tomcat-init";
	
	public static final String GOORU_REST_ENDPOINT = "gooru.api.rest.endpoint";
	
	public static final String ENTITY_ROLE_OPERATIONS = "entity_role_opertaions";
	
	public static final String ROLE_GOORU_ADMIN = "ROLE_GOORU_ADMIN";
	
	public static final String CONTENT_ADMIN = "Content_Admin";
	
	public static final String ORGANIZATION_ADMIN = "Organization_Admin";
	
	public static final String USER_ROLE_SETSTRING = "userRoleSetString";
	
	public static final String CONSTANT_VALUE = "constant_value";
	
	public static final String USER_TOKEN = "userToken";
	
	public static final String USER = "user";
	
	/**
	 * Mail Constants
	 */
	public static final String DEFAULT_MAIL = "insights@goorulearning.org";
	
	public static final String DEFAULT_MAIL_MESSAGE = "File download link will be sent to your email Account";

	public static final String MAIL_TEXT = "Hi,This report will take some more time to get process,we will send you this report to insights@goorulearning.org, Thanks";
	
	/**
	 * User Message Constants
	 */
	public static final String DEFAULT_NOT_FOUND_MESSAGE = "No results for your request!";
	
	/**
	 * view constants
	 */
	public enum ModelAttributes{
		VIEW_NAME("content"),CONTENT("content"),RETURN_NAME("content"),MESSAGE("message"),PAGINATE("paginate"),TOTAL_ROWS("totalRows");
		
		private String attribute;
		
		private ModelAttributes(String attribute){
			this.attribute = attribute;
		}
		public String getAttribute(){
			return attribute;
		}
	}
	
	/**
	 * Exclude fields
	 */
	
	public static final String EXCLUDE_CLASSES = "*.class"; 
	
	/**
	 * HTTP constants
	 */
	public static final String STATUS_CODE = "statusCode";
	
	public static final String RESOURCE_GOORUOID = "resourceGooruOId";
	
	public static final String SESSION = "session";
	
	public static final String USERUID = "userUId";
	
	public static final String CLASSID_USERUID = "classId or userUId";
	
	public static final String CLASSPAGE_GOORU_OID = "classpage_gooru_oid";
	
	public static final String COLLECTION_GOORU_OID = "collection_gooru_oid";
	
	public static final String IS_GROUP_OWWNER = "is_group_owner";
	
	public static final String DELETED = "deleted";
	
	public static final String USERCOUNT = "userCount";
	
	public static final String GOORU_O_ID = "gooruOId";

	public static final String GOORU_UID = "gooru_uid";
	
	public static final String GOORUUID = "gooruUid";
	
	public static final String USERNAME = "userName";
	
	public static final String LAST_ACCESSED = "lastAccessed";
	
	public static final String LAST_MODIFIED = "lastModified";
	
	public static final String NFS_BUCKET = "insights.nfs.bucket.path";
	
	public static final String FOLDER = "folder";
	
	public static final String THUMBNAIL = "thumbnail";
	
	public static final String ASC = "ASC";
	
	public static final String FILTERS = "filters";
	
	public static final String GOORU_OID = "gooru_oid";
	
	public static final String QUESTION_GOORU_OID = "question_gooru_oid";
	
	public static final String COLLECTIONGOORUOID = "collection_gooru_oid";
	
	public static final String TOTAL_INCORRECT_COUNT = "totalInCorrectCount";
	
	public static final String TOTAL_CORRECT_COUNT = "totalCorrectCount";
	
	public static final String RESOURCE_GOORU_OID = "resourceGooruOid";
	
	public static final String RESOURCEGOORUOID = "resource_gooru_oid";
	
	public static final String HTTP = "http";
	
	public static final String HTTPS = "https";
	
	public static final String _HTTP = "http://";
	
	public static final String COLLECTION_ITEM_ID = "collectionItemId";
	
	public static final String COLLECTIONITEMID = "collection_item_id";
	
	public static final String FEEDBACK_PROVIDER = "feedbackProviderUId";
	
	public static final String FEEDBACK_TEACHER_NAME = "feedbackTeacherName";
	
	public static final String USER_NAME = "username";
	
	public static final String CATEGORY = "category";
	
	public static final String RESPONSE = "response";
	
	public static final String QUESTION = "question";
	
	public static final String QUESTION_TYPE = "questionType";
	
	public static final String FIRST_NAME = "firstName";
	
	public static final String LAST_NAME = "lastName";
	
	public static final String EMAIL_ID = "emailId";
	
	public static final String GOORU_U_ID = "gooruUId";
	
	public static final String PARTY_UId = "partyUid";
	
	public static final String OPEN_BRACE = "{";
	
	public static final String CLOSE_BRACE = "}";
	
	public static final String DATA = "data";
	
	public static final String COLLECTIONGOORUID = "collectionGooruId";

	public static final String CLASSGOORUID = "classGooruId";

	public static final String RESOURCEGOORUID = "resourceGooruId";
	
	public static final String REPORTTYPE = "reportType";
	
	public static final String DEVELOPER_MESSAGE = "developerMessage";

	public enum apiHeaders{
		ACCEPT("Accept"),JSON_HEADER("application/json"),XLS_HEADER("application/vnd.ms-excel"),XLS_RESPONSE("application/xls"),CSV_RESPONSE("application/csv");
		
		private String header;
		
		private apiHeaders(String header){
			this.header = header;
		}
		public String apiHeader(){
			return header;
		}
	}
	
	public enum SessionAttributes{
		CS("CS"),AS("AS"),FS("FS"),RS("RS");
		
		private String session;
		
		private SessionAttributes(String session){
			this.session = session;
		}
		public String getSession(){
			return session;
		}
	}
	public enum fileAttributes{
		XLS("xls"),CSV("csv"),JSON("json");
		
		private String attribute;
		
		private fileAttributes(String attribute){
			this.attribute = attribute;
		}
		public String attribute(){
			return attribute;
		}
	}

	public static enum Numbers {
		FOUR("4"), FIVE("5");

		private String number;

		public String getNumber() {
		return number;
		}

		private Numbers(String number) {
		this.number = number;
		}
	}
	
	public enum addQuestionType {
		OE("OE"),FIB("FIB"),MC("MC"),MA("MA"),TF("TF");
		
		private String questionType;
		
		private addQuestionType(String questionType){
			this.questionType = questionType;
		}
		public String getQuestionType(){
			return questionType;
		}
	}
}
