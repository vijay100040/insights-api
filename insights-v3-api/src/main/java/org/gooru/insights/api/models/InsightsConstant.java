package org.gooru.insights.api.models;

public interface InsightsConstant {

	/**
	 * cache constants
	 */
	String CACHE_PREFIX = "insights";

	String CACHE_PREFIX_ID = "key";

	String EMPTY= "";
	
	String COMMA = ",";

	String DATA_OBJECT = "data";

	String GOORU_PREFIX = "authenticate_";

	String SEPARATOR = "~";

	String GOORUUID = "gooruUId";
	
	String NEW_QUERY = "new query:";
	
	String WILD_CARD = "*";
	
	String PARENT_ID = "parentId";
	
	String COLLECTION_ID = "collectionId";
	
	String USER_UID = "userUid";
	
	String SESSION_ID = "sessionId";
	
	String START_TIME = "startTime";
	
	String SEQUENCE = "sequence";
	
	String PROGRESS = "progress";
	
	String ASSESSMENT = "assessment";
	
	 String TITLE = "title";
	 String DESCRIPTION = "desription";
	 String CATEGORY = "category";
	 String RESOURCE_FORMAT_ID = "resourceFormatId";
	 String VIEWS = "views";
	 String AVG_TIMESPENT = "avgTimeSpent";
	 String AVG_RATING = "avgRating";
	 String AVG_REACTION = "avgReaction";
	 String AVG_SCORE = "avgScore";
	 String TIMESPENT = "timeSpent";
	 String RATING = "rating";
	 String REACTION = "reaction";
	 String SCORE = "score";
	 String THUMBNAIL = "thumbnail";
	 String RESOURCE_FORMAT = "resourceFormat";
	 String RESOURCE_ID = "resourceId";
	 String ANSWER_STATUS = "answerStatus";
	 String ATTEMPT_COUNT = "attemptCount";
	 String QUESTION_TYPE = "questionType";
	 String ANSWER_ID = "answerId";
	 String ANSWER_OPTION_SEQUENCE = "answerOptionSequence";
	 String ANSWER_TEXT = "answerText";
	 String TOTAL_ATTEMPT_COUNT = "totalAttemptCount";
	 String TOTAL_REACTION = "totalReaction";
	 String TOTAL_VIEWS = "totalViews";
	 String GOORUOID = "gooruOid";
	 String CONTENTID = "contentId";



	/**
	 * Serializer Excludes
	 */
	String EXCLUDE_CLASSES = "*.class";

	String EVENT_NAME = "event_name";

	String STATUS = "status";

	String CREATED = "created";

	public enum ColumnFamily {
		RESOURCE("resource"), DIM_RESOURCE("dim_resource"), REAL_TIME_DASHBOARD(
				"real_time_aggregator"), CUSTOM_FIELDS("custom_fields_data"), LIVE_DASHBOARD(
				"live_dashboard"), COLLECTION("collection"), COLLECTION_ITEM(
				"collection_item"), CLASSPAGE("classpage"), ASSESSMENT_ANSWER(
				"assessment_answer"), MICRO_AGGREGATION("micro_aggregation"), FORMULA_DETAIL(
				"formula_detail"), EVENT_TIMELINE("event_timeline"), EVENT_DETAIL(
				"event_detail"), USERPROFILE("user_profile_settings"), USER_COLLECTION_ITEM_ASSOC(
				"user_collection_item_assoc"), CONFIG_SETTING(
				"job_config_settings"), USER("user");

		private String columnFamily;

		private ColumnFamily(String value) {
			columnFamily = value;
		}

		public String getColumnFamily() {
			return columnFamily;
		}
	}


	public enum formulaDetail {
		ID("id"), EVENTS("events"), REQUESTVALUES("requestValues"), CREATEDON(
				"createdOn"), FORMULA("formula"), AGGREGATETYPE(
				"aggregate_type"), DEFAULT_AGGREGATETYPE("normal"), FORMULAS(
				"formulas"), NAME("name"), STATUS("status");

		private String name;

		private formulaDetail(String data) {
			name = data;
		}

		public String getName() {
			return name;
		}
	}
	
	public static enum DateFormats {

		DEFAULT("yyyy-MM-dd hh:kk:ss"), YEAR("yyyy"), QUARTER("yyyy-MM-dd"), MONTH(
				"yyyy-MM"), WEEK("yyyy-MM-dd"), DAY("yyyy-MM-dd"), HOUR(
				"yyyy-MM-dd hh"), MINUTE("yyyy-MM-dd hh:kk"), SECOND(
				"yyyy-MM-dd hh:kk:ss"), MILLISECOND("yyyy-MM-dd hh:kk:ss.SSS"), NANOSECOND(
				"yyyy-MM-dd hh:kk:ss.SSS");

		private String format;

		public String format() {
			return format;
		}

		private DateFormats(String format) {
			this.format = format;
		}
	}

}
