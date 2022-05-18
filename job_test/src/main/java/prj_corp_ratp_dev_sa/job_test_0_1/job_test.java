
package prj_corp_ratp_dev_sa.job_test_0_1;

import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.DataQuality;
import routines.Relational;
import routines.DataQualityDependencies;
import routines.Mathematical;
import routines.SQLike;
import routines.Numeric;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.DQTechnical;
import routines.StringHandling;
import routines.DataMasking;
import routines.TalendDate;
import routines.DqStringHandling;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 




	//the import part of tJava_1
	//import java.util.List;


@SuppressWarnings("unused")

/**
 * Job: job_test Purpose: <br>
 * Description:  <br>
 * @author BIZARD, Stéphane
 * @version 8.0.1.20220421_1430-patch
 * @status 
 */
public class job_test implements TalendJob {
	static {System.setProperty("TalendJob.log", "job_test.log");}

	
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(job_test.class);
	

	

protected static void logIgnoredError(String message, Throwable cause) {
       log.error(message, cause);

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(delim != null){
				
					this.setProperty("delim", delim.toString());
				
			}
			
			if(societe != null){
				
					this.setProperty("societe", societe.toString());
				
			}
			
			if(ora_ServiceName != null){
				
					this.setProperty("ora_ServiceName", ora_ServiceName.toString());
				
			}
			
			if(ora_Login != null){
				
					this.setProperty("ora_Login", ora_Login.toString());
				
			}
			
			if(ora_Password != null){
				
					this.setProperty("ora_Password", ora_Password.toString());
				
			}
			
			if(ora_AdditionalParams != null){
				
					this.setProperty("ora_AdditionalParams", ora_AdditionalParams.toString());
				
			}
			
			if(ora_Schema != null){
				
					this.setProperty("ora_Schema", ora_Schema.toString());
				
			}
			
			if(ora_Port != null){
				
					this.setProperty("ora_Port", ora_Port.toString());
				
			}
			
			if(ora_Server != null){
				
					this.setProperty("ora_Server", ora_Server.toString());
				
			}
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

public String delim;
public String getDelim(){
	return this.delim;
}
public String societe;
public String getSociete(){
	return this.societe;
}
public String ora_ServiceName;
public String getOra_ServiceName(){
	return this.ora_ServiceName;
}
public String ora_Login;
public String getOra_Login(){
	return this.ora_Login;
}
public java.lang.String ora_Password;
public java.lang.String getOra_Password(){
	return this.ora_Password;
}
public String ora_AdditionalParams;
public String getOra_AdditionalParams(){
	return this.ora_AdditionalParams;
}
public String ora_Schema;
public String getOra_Schema(){
	return this.ora_Schema;
}
public String ora_Port;
public String getOra_Port(){
	return this.ora_Port;
}
public String ora_Server;
public String getOra_Server(){
	return this.ora_Server;
}
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "job_test";
	private final String projectName = "PRJ_CORP_RATP_DEV_SA";
	public Integer errorCode = null;
	private String currentComponent = "";
	
	private String cLabel =  null;
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_Dz83EKHREeuxyb1GpbWmfw", "0.1");
private org.talend.job.audit.JobAuditLogger auditLogger_talendJobLog = null;

private RunStat runStat = new RunStat(talendJobLog, System.getProperty("audit.interval"));

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
                    dataSources.put(entry.getKey(), entry.getValue());
                    talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}

	LogCatcherUtils talendLogs_LOGS = new LogCatcherUtils();
	StatCatcherUtils talendStats_STATS = new StatCatcherUtils("_Dz83EKHREeuxyb1GpbWmfw", "0.1");

private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	
	private String currentComponent = null;
	private String cLabel =  null;
	
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}
	
	private TalendException(Exception e, String errorComponent, String errorComponentLabel, final java.util.Map<String, Object> globalMap) {
		this(e, errorComponent, globalMap);
		this.cLabel = errorComponentLabel;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				job_test.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(job_test.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
		if(enableLogStash) {
			talendJobLog.addJobExceptionMessage(currentComponent, cLabel, null, e);
			talendJobLogProcess(globalMap);
		}
				talendLogs_LOGS.addMessage("Java Exception", currentComponent, 6, e.getClass().getName() + ":" + e.getMessage(), 1);
				talendLogs_LOGSProcess(globalMap);
			}
			} catch (TalendException e) {
				// do nothing
			
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendStats_STATS_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							talendStats_CONSOLE_error(exception, errorComponent, globalMap);
						
						}
					
			public void talendStats_CONSOLE_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendStats_STATS_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendLogs_LOGS_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							talendLogs_CONSOLE_error(exception, errorComponent, globalMap);
						
						}
					
			public void talendLogs_CONSOLE_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendLogs_LOGS_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendStats_STATS_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendLogs_LOGS_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}


	








public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tJava_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_1", false);
		start_Hash.put("tJava_1", System.currentTimeMillis());
		
	
	currentComponent="tJava_1";
	
	
		int tos_count_tJava_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tJava_1", "tJava_1", "tJava");
				talendJobLogProcess(globalMap);
			}
			


System.out.println("test !!");
 



/**
 * [tJava_1 begin ] stop
 */
	
	/**
	 * [tJava_1 main ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 


	tos_count_tJava_1++;

/**
 * [tJava_1 main ] stop
 */
	
	/**
	 * [tJava_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 



/**
 * [tJava_1 process_data_begin ] stop
 */
	
	/**
	 * [tJava_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 



/**
 * [tJava_1 process_data_end ] stop
 */
	
	/**
	 * [tJava_1 end ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 

ok_Hash.put("tJava_1", true);
end_Hash.put("tJava_1", System.currentTimeMillis());




/**
 * [tJava_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_1 finally ] start
	 */

	

	
	
	currentComponent="tJava_1";
	
	

 



/**
 * [tJava_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
	}
	


public static class row_talendStats_STATSStruct implements routines.system.IPersistableRow<row_talendStats_STATSStruct> {
    final static byte[] commonByteArrayLock_PRJ_CORP_RATP_DEV_SA_job_test = new byte[0];
    static byte[] commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test = new byte[0];

	
			    public java.util.Date moment;

				public java.util.Date getMoment () {
					return this.moment;
				}

				public Boolean momentIsNullable(){
				    return true;
				}
				public Boolean momentIsKey(){
				    return false;
				}
				public Integer momentLength(){
				    return 0;
				}
				public Integer momentPrecision(){
				    return 0;
				}
				public String momentDefault(){
				
					return "";
				
				}
				public String momentComment(){
				
				    return null;
				
				}
				public String momentPattern(){
				
					return "yyyy-MM-dd HH:mm:ss";
				
				}
				public String momentOriginalDbColumnName(){
				
					return "moment";
				
				}

				
			    public String pid;

				public String getPid () {
					return this.pid;
				}

				public Boolean pidIsNullable(){
				    return true;
				}
				public Boolean pidIsKey(){
				    return false;
				}
				public Integer pidLength(){
				    return 20;
				}
				public Integer pidPrecision(){
				    return 0;
				}
				public String pidDefault(){
				
					return "";
				
				}
				public String pidComment(){
				
				    return null;
				
				}
				public String pidPattern(){
				
				    return null;
				
				}
				public String pidOriginalDbColumnName(){
				
					return "pid";
				
				}

				
			    public String father_pid;

				public String getFather_pid () {
					return this.father_pid;
				}

				public Boolean father_pidIsNullable(){
				    return true;
				}
				public Boolean father_pidIsKey(){
				    return false;
				}
				public Integer father_pidLength(){
				    return 20;
				}
				public Integer father_pidPrecision(){
				    return 0;
				}
				public String father_pidDefault(){
				
					return "";
				
				}
				public String father_pidComment(){
				
				    return null;
				
				}
				public String father_pidPattern(){
				
				    return null;
				
				}
				public String father_pidOriginalDbColumnName(){
				
					return "father_pid";
				
				}

				
			    public String root_pid;

				public String getRoot_pid () {
					return this.root_pid;
				}

				public Boolean root_pidIsNullable(){
				    return true;
				}
				public Boolean root_pidIsKey(){
				    return false;
				}
				public Integer root_pidLength(){
				    return 20;
				}
				public Integer root_pidPrecision(){
				    return 0;
				}
				public String root_pidDefault(){
				
					return "";
				
				}
				public String root_pidComment(){
				
				    return null;
				
				}
				public String root_pidPattern(){
				
				    return null;
				
				}
				public String root_pidOriginalDbColumnName(){
				
					return "root_pid";
				
				}

				
			    public Long system_pid;

				public Long getSystem_pid () {
					return this.system_pid;
				}

				public Boolean system_pidIsNullable(){
				    return true;
				}
				public Boolean system_pidIsKey(){
				    return false;
				}
				public Integer system_pidLength(){
				    return 8;
				}
				public Integer system_pidPrecision(){
				    return 0;
				}
				public String system_pidDefault(){
				
					return "";
				
				}
				public String system_pidComment(){
				
				    return null;
				
				}
				public String system_pidPattern(){
				
				    return null;
				
				}
				public String system_pidOriginalDbColumnName(){
				
					return "system_pid";
				
				}

				
			    public String project;

				public String getProject () {
					return this.project;
				}

				public Boolean projectIsNullable(){
				    return true;
				}
				public Boolean projectIsKey(){
				    return false;
				}
				public Integer projectLength(){
				    return 50;
				}
				public Integer projectPrecision(){
				    return 0;
				}
				public String projectDefault(){
				
					return "";
				
				}
				public String projectComment(){
				
				    return null;
				
				}
				public String projectPattern(){
				
				    return null;
				
				}
				public String projectOriginalDbColumnName(){
				
					return "project";
				
				}

				
			    public String job;

				public String getJob () {
					return this.job;
				}

				public Boolean jobIsNullable(){
				    return true;
				}
				public Boolean jobIsKey(){
				    return false;
				}
				public Integer jobLength(){
				    return 255;
				}
				public Integer jobPrecision(){
				    return 0;
				}
				public String jobDefault(){
				
					return "";
				
				}
				public String jobComment(){
				
				    return null;
				
				}
				public String jobPattern(){
				
				    return null;
				
				}
				public String jobOriginalDbColumnName(){
				
					return "job";
				
				}

				
			    public String job_repository_id;

				public String getJob_repository_id () {
					return this.job_repository_id;
				}

				public Boolean job_repository_idIsNullable(){
				    return true;
				}
				public Boolean job_repository_idIsKey(){
				    return false;
				}
				public Integer job_repository_idLength(){
				    return 255;
				}
				public Integer job_repository_idPrecision(){
				    return 0;
				}
				public String job_repository_idDefault(){
				
					return "";
				
				}
				public String job_repository_idComment(){
				
				    return null;
				
				}
				public String job_repository_idPattern(){
				
				    return null;
				
				}
				public String job_repository_idOriginalDbColumnName(){
				
					return "job_repository_id";
				
				}

				
			    public String job_version;

				public String getJob_version () {
					return this.job_version;
				}

				public Boolean job_versionIsNullable(){
				    return true;
				}
				public Boolean job_versionIsKey(){
				    return false;
				}
				public Integer job_versionLength(){
				    return 255;
				}
				public Integer job_versionPrecision(){
				    return 0;
				}
				public String job_versionDefault(){
				
					return "";
				
				}
				public String job_versionComment(){
				
				    return null;
				
				}
				public String job_versionPattern(){
				
				    return null;
				
				}
				public String job_versionOriginalDbColumnName(){
				
					return "job_version";
				
				}

				
			    public String context;

				public String getContext () {
					return this.context;
				}

				public Boolean contextIsNullable(){
				    return true;
				}
				public Boolean contextIsKey(){
				    return false;
				}
				public Integer contextLength(){
				    return 50;
				}
				public Integer contextPrecision(){
				    return 0;
				}
				public String contextDefault(){
				
					return "";
				
				}
				public String contextComment(){
				
				    return null;
				
				}
				public String contextPattern(){
				
				    return null;
				
				}
				public String contextOriginalDbColumnName(){
				
					return "context";
				
				}

				
			    public String origin;

				public String getOrigin () {
					return this.origin;
				}

				public Boolean originIsNullable(){
				    return true;
				}
				public Boolean originIsKey(){
				    return false;
				}
				public Integer originLength(){
				    return 255;
				}
				public Integer originPrecision(){
				    return 0;
				}
				public String originDefault(){
				
					return "";
				
				}
				public String originComment(){
				
				    return null;
				
				}
				public String originPattern(){
				
				    return null;
				
				}
				public String originOriginalDbColumnName(){
				
					return "origin";
				
				}

				
			    public String message_type;

				public String getMessage_type () {
					return this.message_type;
				}

				public Boolean message_typeIsNullable(){
				    return true;
				}
				public Boolean message_typeIsKey(){
				    return false;
				}
				public Integer message_typeLength(){
				    return 255;
				}
				public Integer message_typePrecision(){
				    return 0;
				}
				public String message_typeDefault(){
				
					return "";
				
				}
				public String message_typeComment(){
				
				    return null;
				
				}
				public String message_typePattern(){
				
				    return null;
				
				}
				public String message_typeOriginalDbColumnName(){
				
					return "message_type";
				
				}

				
			    public String message;

				public String getMessage () {
					return this.message;
				}

				public Boolean messageIsNullable(){
				    return true;
				}
				public Boolean messageIsKey(){
				    return false;
				}
				public Integer messageLength(){
				    return 255;
				}
				public Integer messagePrecision(){
				    return 0;
				}
				public String messageDefault(){
				
					return "";
				
				}
				public String messageComment(){
				
				    return null;
				
				}
				public String messagePattern(){
				
				    return null;
				
				}
				public String messageOriginalDbColumnName(){
				
					return "message";
				
				}

				
			    public Long duration;

				public Long getDuration () {
					return this.duration;
				}

				public Boolean durationIsNullable(){
				    return true;
				}
				public Boolean durationIsKey(){
				    return false;
				}
				public Integer durationLength(){
				    return 8;
				}
				public Integer durationPrecision(){
				    return 0;
				}
				public String durationDefault(){
				
					return "";
				
				}
				public String durationComment(){
				
				    return null;
				
				}
				public String durationPattern(){
				
				    return null;
				
				}
				public String durationOriginalDbColumnName(){
				
					return "duration";
				
				}

				



	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test.length) {
				if(length < 1024 && commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test.length == 0) {
   					commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test = new byte[1024];
				} else {
   					commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test, 0, length);
			strReturn = new String(commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test.length) {
				if(length < 1024 && commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test.length == 0) {
   					commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test = new byte[1024];
				} else {
   					commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test, 0, length);
			strReturn = new String(commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_PRJ_CORP_RATP_DEV_SA_job_test) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.root_pid = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.system_pid = null;
           				} else {
           			    	this.system_pid = dis.readLong();
           				}
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.job_repository_id = readString(dis);
					
					this.job_version = readString(dis);
					
					this.context = readString(dis);
					
					this.origin = readString(dis);
					
					this.message_type = readString(dis);
					
					this.message = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.duration = null;
           				} else {
           			    	this.duration = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_PRJ_CORP_RATP_DEV_SA_job_test) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.root_pid = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.system_pid = null;
           				} else {
           			    	this.system_pid = dis.readLong();
           				}
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.job_repository_id = readString(dis);
					
					this.job_version = readString(dis);
					
					this.context = readString(dis);
					
					this.origin = readString(dis);
					
					this.message_type = readString(dis);
					
					this.message = readString(dis);
					
			            length = dis.readByte();
           				if (length == -1) {
           	    			this.duration = null;
           				} else {
           			    	this.duration = dis.readLong();
           				}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// Long
				
						if(this.system_pid == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.system_pid);
		            	}
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.job_repository_id,dos);
					
					// String
				
						writeString(this.job_version,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message_type,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Long
				
						if(this.duration == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.duration);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// Long
				
						if(this.system_pid == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.system_pid);
		            	}
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.job_repository_id,dos);
					
					// String
				
						writeString(this.job_version,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message_type,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Long
				
						if(this.duration == null) {
			                dos.writeByte(-1);
						} else {
               				dos.writeByte(0);
           			    	dos.writeLong(this.duration);
		            	}
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("moment="+String.valueOf(moment));
		sb.append(",pid="+pid);
		sb.append(",father_pid="+father_pid);
		sb.append(",root_pid="+root_pid);
		sb.append(",system_pid="+String.valueOf(system_pid));
		sb.append(",project="+project);
		sb.append(",job="+job);
		sb.append(",job_repository_id="+job_repository_id);
		sb.append(",job_version="+job_version);
		sb.append(",context="+context);
		sb.append(",origin="+origin);
		sb.append(",message_type="+message_type);
		sb.append(",message="+message);
		sb.append(",duration="+String.valueOf(duration));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(moment == null){
        					sb.append("<null>");
        				}else{
            				sb.append(moment);
            			}
            		
        			sb.append("|");
        		
        				if(pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(pid);
            			}
            		
        			sb.append("|");
        		
        				if(father_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(father_pid);
            			}
            		
        			sb.append("|");
        		
        				if(root_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(root_pid);
            			}
            		
        			sb.append("|");
        		
        				if(system_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(system_pid);
            			}
            		
        			sb.append("|");
        		
        				if(project == null){
        					sb.append("<null>");
        				}else{
            				sb.append(project);
            			}
            		
        			sb.append("|");
        		
        				if(job == null){
        					sb.append("<null>");
        				}else{
            				sb.append(job);
            			}
            		
        			sb.append("|");
        		
        				if(job_repository_id == null){
        					sb.append("<null>");
        				}else{
            				sb.append(job_repository_id);
            			}
            		
        			sb.append("|");
        		
        				if(job_version == null){
        					sb.append("<null>");
        				}else{
            				sb.append(job_version);
            			}
            		
        			sb.append("|");
        		
        				if(context == null){
        					sb.append("<null>");
        				}else{
            				sb.append(context);
            			}
            		
        			sb.append("|");
        		
        				if(origin == null){
        					sb.append("<null>");
        				}else{
            				sb.append(origin);
            			}
            		
        			sb.append("|");
        		
        				if(message_type == null){
        					sb.append("<null>");
        				}else{
            				sb.append(message_type);
            			}
            		
        			sb.append("|");
        		
        				if(message == null){
        					sb.append("<null>");
        				}else{
            				sb.append(message);
            			}
            		
        			sb.append("|");
        		
        				if(duration == null){
        					sb.append("<null>");
        				}else{
            				sb.append(duration);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row_talendStats_STATSStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void talendStats_STATSProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendStats_STATS_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
		String currentVirtualComponent = null;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row_talendStats_STATSStruct row_talendStats_STATS = new row_talendStats_STATSStruct();




	
	/**
	 * [talendStats_CONSOLE begin ] start
	 */

	

	
		
		ok_Hash.put("talendStats_CONSOLE", false);
		start_Hash.put("talendStats_CONSOLE", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendStats_CONSOLE";
	
	currentComponent="talendStats_CONSOLE";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Main");
					}
				
		int tos_count_talendStats_CONSOLE = 0;
		
                if(log.isDebugEnabled())
            log.debug("talendStats_CONSOLE - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_talendStats_CONSOLE{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_talendStats_CONSOLE = new StringBuilder();
                    log4jParamters_talendStats_CONSOLE.append("Parameters:");
                            log4jParamters_talendStats_CONSOLE.append("BASIC_MODE" + " = " + "true");
                        log4jParamters_talendStats_CONSOLE.append(" | ");
                            log4jParamters_talendStats_CONSOLE.append("TABLE_PRINT" + " = " + "false");
                        log4jParamters_talendStats_CONSOLE.append(" | ");
                            log4jParamters_talendStats_CONSOLE.append("VERTICAL" + " = " + "false");
                        log4jParamters_talendStats_CONSOLE.append(" | ");
                            log4jParamters_talendStats_CONSOLE.append("FIELDSEPARATOR" + " = " + "\"|\"");
                        log4jParamters_talendStats_CONSOLE.append(" | ");
                            log4jParamters_talendStats_CONSOLE.append("PRINT_HEADER" + " = " + "false");
                        log4jParamters_talendStats_CONSOLE.append(" | ");
                            log4jParamters_talendStats_CONSOLE.append("PRINT_UNIQUE_NAME" + " = " + "false");
                        log4jParamters_talendStats_CONSOLE.append(" | ");
                            log4jParamters_talendStats_CONSOLE.append("PRINT_COLNAMES" + " = " + "false");
                        log4jParamters_talendStats_CONSOLE.append(" | ");
                            log4jParamters_talendStats_CONSOLE.append("USE_FIXED_LENGTH" + " = " + "false");
                        log4jParamters_talendStats_CONSOLE.append(" | ");
                            log4jParamters_talendStats_CONSOLE.append("PRINT_CONTENT_WITH_LOG4J" + " = " + "true");
                        log4jParamters_talendStats_CONSOLE.append(" | ");
                if(log.isDebugEnabled())
            log.debug("talendStats_CONSOLE - "  + (log4jParamters_talendStats_CONSOLE) );
                    } 
                } 
            new BytesLimit65535_talendStats_CONSOLE().limitLog4jByte();
            }

	///////////////////////
	
		final String OUTPUT_FIELD_SEPARATOR_talendStats_CONSOLE = "|";
		java.io.PrintStream consoleOut_talendStats_CONSOLE = null;	

 		StringBuilder strBuffer_talendStats_CONSOLE = null;
		int nb_line_talendStats_CONSOLE = 0;
///////////////////////    			



 



/**
 * [talendStats_CONSOLE begin ] stop
 */



	
	/**
	 * [talendStats_STATS begin ] start
	 */

	

	
		
		ok_Hash.put("talendStats_STATS", false);
		start_Hash.put("talendStats_STATS", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";
	
	
		int tos_count_talendStats_STATS = 0;
		
                if(log.isDebugEnabled())
            log.debug("talendStats_STATS - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_talendStats_STATS{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_talendStats_STATS = new StringBuilder();
                    log4jParamters_talendStats_STATS.append("Parameters:");
                if(log.isDebugEnabled())
            log.debug("talendStats_STATS - "  + (log4jParamters_talendStats_STATS) );
                    } 
                } 
            new BytesLimit65535_talendStats_STATS().limitLog4jByte();
            }

	for (StatCatcherUtils.StatCatcherMessage scm : talendStats_STATS.getMessages()) {
		row_talendStats_STATS.pid = pid;
		row_talendStats_STATS.root_pid = rootPid;
		row_talendStats_STATS.father_pid = fatherPid;	
    	row_talendStats_STATS.project = projectName;
    	row_talendStats_STATS.job = jobName;
    	row_talendStats_STATS.context = contextStr;
		row_talendStats_STATS.origin = (scm.getOrigin()==null || scm.getOrigin().length()<1 ? null : scm.getOrigin());
		row_talendStats_STATS.message = scm.getMessage();
		row_talendStats_STATS.duration = scm.getDuration();
		row_talendStats_STATS.moment = scm.getMoment();
		row_talendStats_STATS.message_type = scm.getMessageType();
		row_talendStats_STATS.job_version = scm.getJobVersion();
		row_talendStats_STATS.job_repository_id = scm.getJobId();
		row_talendStats_STATS.system_pid = scm.getSystemPid();

 



/**
 * [talendStats_STATS begin ] stop
 */
	
	/**
	 * [talendStats_STATS main ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";
	
	

 


	tos_count_talendStats_STATS++;

/**
 * [talendStats_STATS main ] stop
 */
	
	/**
	 * [talendStats_STATS process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";
	
	

 



/**
 * [talendStats_STATS process_data_begin ] stop
 */

	
	/**
	 * [talendStats_CONSOLE main ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_CONSOLE";
	
	currentComponent="talendStats_CONSOLE";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Main"
						
						);
					}
					
///////////////////////		
						



				strBuffer_talendStats_CONSOLE = new StringBuilder();




   				
	    		if(row_talendStats_STATS.moment != null) { //              
                    							
       
				strBuffer_talendStats_CONSOLE.append(
								FormatterUtils.format_Date(row_talendStats_STATS.moment, "yyyy-MM-dd HH:mm:ss")				
				);


							
	    		} //  			

    			strBuffer_talendStats_CONSOLE.append("|");
    			


   				
	    		if(row_talendStats_STATS.pid != null) { //              
                    							
       
				strBuffer_talendStats_CONSOLE.append(
				                String.valueOf(row_talendStats_STATS.pid)							
				);


							
	    		} //  			

    			strBuffer_talendStats_CONSOLE.append("|");
    			


   				
	    		if(row_talendStats_STATS.father_pid != null) { //              
                    							
       
				strBuffer_talendStats_CONSOLE.append(
				                String.valueOf(row_talendStats_STATS.father_pid)							
				);


							
	    		} //  			

    			strBuffer_talendStats_CONSOLE.append("|");
    			


   				
	    		if(row_talendStats_STATS.root_pid != null) { //              
                    							
       
				strBuffer_talendStats_CONSOLE.append(
				                String.valueOf(row_talendStats_STATS.root_pid)							
				);


							
	    		} //  			

    			strBuffer_talendStats_CONSOLE.append("|");
    			


   				
	    		if(row_talendStats_STATS.system_pid != null) { //              
                    							
       
				strBuffer_talendStats_CONSOLE.append(
				                String.valueOf(row_talendStats_STATS.system_pid)							
				);


							
	    		} //  			

    			strBuffer_talendStats_CONSOLE.append("|");
    			


   				
	    		if(row_talendStats_STATS.project != null) { //              
                    							
       
				strBuffer_talendStats_CONSOLE.append(
				                String.valueOf(row_talendStats_STATS.project)							
				);


							
	    		} //  			

    			strBuffer_talendStats_CONSOLE.append("|");
    			


   				
	    		if(row_talendStats_STATS.job != null) { //              
                    							
       
				strBuffer_talendStats_CONSOLE.append(
				                String.valueOf(row_talendStats_STATS.job)							
				);


							
	    		} //  			

    			strBuffer_talendStats_CONSOLE.append("|");
    			


   				
	    		if(row_talendStats_STATS.job_repository_id != null) { //              
                    							
       
				strBuffer_talendStats_CONSOLE.append(
				                String.valueOf(row_talendStats_STATS.job_repository_id)							
				);


							
	    		} //  			

    			strBuffer_talendStats_CONSOLE.append("|");
    			


   				
	    		if(row_talendStats_STATS.job_version != null) { //              
                    							
       
				strBuffer_talendStats_CONSOLE.append(
				                String.valueOf(row_talendStats_STATS.job_version)							
				);


							
	    		} //  			

    			strBuffer_talendStats_CONSOLE.append("|");
    			


   				
	    		if(row_talendStats_STATS.context != null) { //              
                    							
       
				strBuffer_talendStats_CONSOLE.append(
				                String.valueOf(row_talendStats_STATS.context)							
				);


							
	    		} //  			

    			strBuffer_talendStats_CONSOLE.append("|");
    			


   				
	    		if(row_talendStats_STATS.origin != null) { //              
                    							
       
				strBuffer_talendStats_CONSOLE.append(
				                String.valueOf(row_talendStats_STATS.origin)							
				);


							
	    		} //  			

    			strBuffer_talendStats_CONSOLE.append("|");
    			


   				
	    		if(row_talendStats_STATS.message_type != null) { //              
                    							
       
				strBuffer_talendStats_CONSOLE.append(
				                String.valueOf(row_talendStats_STATS.message_type)							
				);


							
	    		} //  			

    			strBuffer_talendStats_CONSOLE.append("|");
    			


   				
	    		if(row_talendStats_STATS.message != null) { //              
                    							
       
				strBuffer_talendStats_CONSOLE.append(
				                String.valueOf(row_talendStats_STATS.message)							
				);


							
	    		} //  			

    			strBuffer_talendStats_CONSOLE.append("|");
    			


   				
	    		if(row_talendStats_STATS.duration != null) { //              
                    							
       
				strBuffer_talendStats_CONSOLE.append(
				                String.valueOf(row_talendStats_STATS.duration)							
				);


							
	    		} //  			
 

                    if (globalMap.get("tLogRow_CONSOLE")!=null)
                    {
                    	consoleOut_talendStats_CONSOLE = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                    }
                    else
                    {
                    	consoleOut_talendStats_CONSOLE = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                    	globalMap.put("tLogRow_CONSOLE",consoleOut_talendStats_CONSOLE);
                    }
                    	log.info("talendStats_CONSOLE - Content of row "+(nb_line_talendStats_CONSOLE+1)+": " + strBuffer_talendStats_CONSOLE.toString());
                    consoleOut_talendStats_CONSOLE.println(strBuffer_talendStats_CONSOLE.toString());
                    consoleOut_talendStats_CONSOLE.flush();
                    nb_line_talendStats_CONSOLE++;
//////

//////                    
                    
///////////////////////    			

 


	tos_count_talendStats_CONSOLE++;

/**
 * [talendStats_CONSOLE main ] stop
 */
	
	/**
	 * [talendStats_CONSOLE process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_CONSOLE";
	
	currentComponent="talendStats_CONSOLE";
	
	

 



/**
 * [talendStats_CONSOLE process_data_begin ] stop
 */
	
	/**
	 * [talendStats_CONSOLE process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_CONSOLE";
	
	currentComponent="talendStats_CONSOLE";
	
	

 



/**
 * [talendStats_CONSOLE process_data_end ] stop
 */



	
	/**
	 * [talendStats_STATS process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";
	
	

 



/**
 * [talendStats_STATS process_data_end ] stop
 */
	
	/**
	 * [talendStats_STATS end ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";
	
	

	}


 
                if(log.isDebugEnabled())
            log.debug("talendStats_STATS - "  + ("Done.") );

ok_Hash.put("talendStats_STATS", true);
end_Hash.put("talendStats_STATS", System.currentTimeMillis());




/**
 * [talendStats_STATS end ] stop
 */

	
	/**
	 * [talendStats_CONSOLE end ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_CONSOLE";
	
	currentComponent="talendStats_CONSOLE";
	
	


//////
//////
globalMap.put("talendStats_CONSOLE_NB_LINE",nb_line_talendStats_CONSOLE);
                if(log.isInfoEnabled())
            log.info("talendStats_CONSOLE - "  + ("Printed row count: ")  + (nb_line_talendStats_CONSOLE)  + (".") );

///////////////////////    			

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Main");
			  	}
			  	
 
                if(log.isDebugEnabled())
            log.debug("talendStats_CONSOLE - "  + ("Done.") );

ok_Hash.put("talendStats_CONSOLE", true);
end_Hash.put("talendStats_CONSOLE", System.currentTimeMillis());




/**
 * [talendStats_CONSOLE end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendStats_STATS finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_STATS";
	
	currentComponent="talendStats_STATS";
	
	

 



/**
 * [talendStats_STATS finally ] stop
 */

	
	/**
	 * [talendStats_CONSOLE finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendStats_CONSOLE";
	
	currentComponent="talendStats_CONSOLE";
	
	

 



/**
 * [talendStats_CONSOLE finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendStats_STATS_SUBPROCESS_STATE", 1);
	}
	


public static class row_talendLogs_LOGSStruct implements routines.system.IPersistableRow<row_talendLogs_LOGSStruct> {
    final static byte[] commonByteArrayLock_PRJ_CORP_RATP_DEV_SA_job_test = new byte[0];
    static byte[] commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test = new byte[0];

	
			    public java.util.Date moment;

				public java.util.Date getMoment () {
					return this.moment;
				}

				public Boolean momentIsNullable(){
				    return true;
				}
				public Boolean momentIsKey(){
				    return false;
				}
				public Integer momentLength(){
				    return 0;
				}
				public Integer momentPrecision(){
				    return 0;
				}
				public String momentDefault(){
				
					return "";
				
				}
				public String momentComment(){
				
				    return null;
				
				}
				public String momentPattern(){
				
					return "yyyy-MM-dd HH:mm:ss";
				
				}
				public String momentOriginalDbColumnName(){
				
					return "moment";
				
				}

				
			    public String pid;

				public String getPid () {
					return this.pid;
				}

				public Boolean pidIsNullable(){
				    return true;
				}
				public Boolean pidIsKey(){
				    return false;
				}
				public Integer pidLength(){
				    return 20;
				}
				public Integer pidPrecision(){
				    return 0;
				}
				public String pidDefault(){
				
					return "";
				
				}
				public String pidComment(){
				
				    return null;
				
				}
				public String pidPattern(){
				
				    return null;
				
				}
				public String pidOriginalDbColumnName(){
				
					return "pid";
				
				}

				
			    public String root_pid;

				public String getRoot_pid () {
					return this.root_pid;
				}

				public Boolean root_pidIsNullable(){
				    return true;
				}
				public Boolean root_pidIsKey(){
				    return false;
				}
				public Integer root_pidLength(){
				    return 20;
				}
				public Integer root_pidPrecision(){
				    return 0;
				}
				public String root_pidDefault(){
				
					return "";
				
				}
				public String root_pidComment(){
				
				    return null;
				
				}
				public String root_pidPattern(){
				
				    return null;
				
				}
				public String root_pidOriginalDbColumnName(){
				
					return "root_pid";
				
				}

				
			    public String father_pid;

				public String getFather_pid () {
					return this.father_pid;
				}

				public Boolean father_pidIsNullable(){
				    return true;
				}
				public Boolean father_pidIsKey(){
				    return false;
				}
				public Integer father_pidLength(){
				    return 20;
				}
				public Integer father_pidPrecision(){
				    return 0;
				}
				public String father_pidDefault(){
				
					return "";
				
				}
				public String father_pidComment(){
				
				    return null;
				
				}
				public String father_pidPattern(){
				
				    return null;
				
				}
				public String father_pidOriginalDbColumnName(){
				
					return "father_pid";
				
				}

				
			    public String project;

				public String getProject () {
					return this.project;
				}

				public Boolean projectIsNullable(){
				    return true;
				}
				public Boolean projectIsKey(){
				    return false;
				}
				public Integer projectLength(){
				    return 50;
				}
				public Integer projectPrecision(){
				    return 0;
				}
				public String projectDefault(){
				
					return "";
				
				}
				public String projectComment(){
				
				    return null;
				
				}
				public String projectPattern(){
				
				    return null;
				
				}
				public String projectOriginalDbColumnName(){
				
					return "project";
				
				}

				
			    public String job;

				public String getJob () {
					return this.job;
				}

				public Boolean jobIsNullable(){
				    return true;
				}
				public Boolean jobIsKey(){
				    return false;
				}
				public Integer jobLength(){
				    return 255;
				}
				public Integer jobPrecision(){
				    return 0;
				}
				public String jobDefault(){
				
					return "";
				
				}
				public String jobComment(){
				
				    return null;
				
				}
				public String jobPattern(){
				
				    return null;
				
				}
				public String jobOriginalDbColumnName(){
				
					return "job";
				
				}

				
			    public String context;

				public String getContext () {
					return this.context;
				}

				public Boolean contextIsNullable(){
				    return true;
				}
				public Boolean contextIsKey(){
				    return false;
				}
				public Integer contextLength(){
				    return 50;
				}
				public Integer contextPrecision(){
				    return 0;
				}
				public String contextDefault(){
				
					return "";
				
				}
				public String contextComment(){
				
				    return null;
				
				}
				public String contextPattern(){
				
				    return null;
				
				}
				public String contextOriginalDbColumnName(){
				
					return "context";
				
				}

				
			    public Integer priority;

				public Integer getPriority () {
					return this.priority;
				}

				public Boolean priorityIsNullable(){
				    return true;
				}
				public Boolean priorityIsKey(){
				    return false;
				}
				public Integer priorityLength(){
				    return 3;
				}
				public Integer priorityPrecision(){
				    return 0;
				}
				public String priorityDefault(){
				
					return "";
				
				}
				public String priorityComment(){
				
				    return null;
				
				}
				public String priorityPattern(){
				
				    return null;
				
				}
				public String priorityOriginalDbColumnName(){
				
					return "priority";
				
				}

				
			    public String type;

				public String getType () {
					return this.type;
				}

				public Boolean typeIsNullable(){
				    return true;
				}
				public Boolean typeIsKey(){
				    return false;
				}
				public Integer typeLength(){
				    return 255;
				}
				public Integer typePrecision(){
				    return 0;
				}
				public String typeDefault(){
				
					return "";
				
				}
				public String typeComment(){
				
				    return null;
				
				}
				public String typePattern(){
				
				    return null;
				
				}
				public String typeOriginalDbColumnName(){
				
					return "type";
				
				}

				
			    public String origin;

				public String getOrigin () {
					return this.origin;
				}

				public Boolean originIsNullable(){
				    return true;
				}
				public Boolean originIsKey(){
				    return false;
				}
				public Integer originLength(){
				    return 255;
				}
				public Integer originPrecision(){
				    return 0;
				}
				public String originDefault(){
				
					return "";
				
				}
				public String originComment(){
				
				    return null;
				
				}
				public String originPattern(){
				
				    return null;
				
				}
				public String originOriginalDbColumnName(){
				
					return "origin";
				
				}

				
			    public String message;

				public String getMessage () {
					return this.message;
				}

				public Boolean messageIsNullable(){
				    return true;
				}
				public Boolean messageIsKey(){
				    return false;
				}
				public Integer messageLength(){
				    return 255;
				}
				public Integer messagePrecision(){
				    return 0;
				}
				public String messageDefault(){
				
					return "";
				
				}
				public String messageComment(){
				
				    return null;
				
				}
				public String messagePattern(){
				
				    return null;
				
				}
				public String messageOriginalDbColumnName(){
				
					return "message";
				
				}

				
			    public Integer code;

				public Integer getCode () {
					return this.code;
				}

				public Boolean codeIsNullable(){
				    return true;
				}
				public Boolean codeIsKey(){
				    return false;
				}
				public Integer codeLength(){
				    return 3;
				}
				public Integer codePrecision(){
				    return 0;
				}
				public String codeDefault(){
				
					return "";
				
				}
				public String codeComment(){
				
				    return null;
				
				}
				public String codePattern(){
				
				    return null;
				
				}
				public String codeOriginalDbColumnName(){
				
					return "code";
				
				}

				



	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}
	
	private java.util.Date readDate(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = unmarshaller.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(unmarshaller.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }
    
    private void writeDate(java.util.Date date1, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(date1 == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeLong(date1.getTime());
    	}
    }

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test.length) {
				if(length < 1024 && commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test.length == 0) {
   					commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test = new byte[1024];
				} else {
   					commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test, 0, length);
			strReturn = new String(commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test, 0, length, utf8Charset);
		}
		return strReturn;
	}
	
	private String readString(org.jboss.marshalling.Unmarshaller unmarshaller) throws IOException{
		String strReturn = null;
		int length = 0;
        length = unmarshaller.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test.length) {
				if(length < 1024 && commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test.length == 0) {
   					commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test = new byte[1024];
				} else {
   					commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test = new byte[2 * length];
   				}
			}
			unmarshaller.readFully(commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test, 0, length);
			strReturn = new String(commonByteArray_PRJ_CORP_RATP_DEV_SA_job_test, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }
    
    private void writeString(String str, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(str == null) {
			marshaller.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
            marshaller.writeInt(byteArray.length);
            marshaller.write(byteArray);
    	}
    }
	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}
	
	private Integer readInteger(org.jboss.marshalling.Unmarshaller dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}
	
	private void writeInteger(Integer intNum, org.jboss.marshalling.Marshaller marshaller) throws IOException{
		if(intNum == null) {
			marshaller.writeByte(-1);
		} else {
			marshaller.writeByte(0);
			marshaller.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_PRJ_CORP_RATP_DEV_SA_job_test) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.root_pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.context = readString(dis);
					
						this.priority = readInteger(dis);
					
					this.type = readString(dis);
					
					this.origin = readString(dis);
					
					this.message = readString(dis);
					
						this.code = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }
    
    public void readData(org.jboss.marshalling.Unmarshaller dis) {

		synchronized(commonByteArrayLock_PRJ_CORP_RATP_DEV_SA_job_test) {

        	try {

        		int length = 0;
		
					this.moment = readDate(dis);
					
					this.pid = readString(dis);
					
					this.root_pid = readString(dis);
					
					this.father_pid = readString(dis);
					
					this.project = readString(dis);
					
					this.job = readString(dis);
					
					this.context = readString(dis);
					
						this.priority = readInteger(dis);
					
					this.type = readString(dis);
					
					this.origin = readString(dis);
					
					this.message = readString(dis);
					
						this.code = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }
    
    public void writeData(org.jboss.marshalling.Marshaller dos) {
        try {

		
					// java.util.Date
				
						writeDate(this.moment,dos);
					
					// String
				
						writeString(this.pid,dos);
					
					// String
				
						writeString(this.root_pid,dos);
					
					// String
				
						writeString(this.father_pid,dos);
					
					// String
				
						writeString(this.project,dos);
					
					// String
				
						writeString(this.job,dos);
					
					// String
				
						writeString(this.context,dos);
					
					// Integer
				
						writeInteger(this.priority,dos);
					
					// String
				
						writeString(this.type,dos);
					
					// String
				
						writeString(this.origin,dos);
					
					// String
				
						writeString(this.message,dos);
					
					// Integer
				
						writeInteger(this.code,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("moment="+String.valueOf(moment));
		sb.append(",pid="+pid);
		sb.append(",root_pid="+root_pid);
		sb.append(",father_pid="+father_pid);
		sb.append(",project="+project);
		sb.append(",job="+job);
		sb.append(",context="+context);
		sb.append(",priority="+String.valueOf(priority));
		sb.append(",type="+type);
		sb.append(",origin="+origin);
		sb.append(",message="+message);
		sb.append(",code="+String.valueOf(code));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(moment == null){
        					sb.append("<null>");
        				}else{
            				sb.append(moment);
            			}
            		
        			sb.append("|");
        		
        				if(pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(pid);
            			}
            		
        			sb.append("|");
        		
        				if(root_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(root_pid);
            			}
            		
        			sb.append("|");
        		
        				if(father_pid == null){
        					sb.append("<null>");
        				}else{
            				sb.append(father_pid);
            			}
            		
        			sb.append("|");
        		
        				if(project == null){
        					sb.append("<null>");
        				}else{
            				sb.append(project);
            			}
            		
        			sb.append("|");
        		
        				if(job == null){
        					sb.append("<null>");
        				}else{
            				sb.append(job);
            			}
            		
        			sb.append("|");
        		
        				if(context == null){
        					sb.append("<null>");
        				}else{
            				sb.append(context);
            			}
            		
        			sb.append("|");
        		
        				if(priority == null){
        					sb.append("<null>");
        				}else{
            				sb.append(priority);
            			}
            		
        			sb.append("|");
        		
        				if(type == null){
        					sb.append("<null>");
        				}else{
            				sb.append(type);
            			}
            		
        			sb.append("|");
        		
        				if(origin == null){
        					sb.append("<null>");
        				}else{
            				sb.append(origin);
            			}
            		
        			sb.append("|");
        		
        				if(message == null){
        					sb.append("<null>");
        				}else{
            				sb.append(message);
            			}
            		
        			sb.append("|");
        		
        				if(code == null){
        					sb.append("<null>");
        				}else{
            				sb.append(code);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row_talendLogs_LOGSStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void talendLogs_LOGSProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendLogs_LOGS_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
		String currentVirtualComponent = null;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row_talendLogs_LOGSStruct row_talendLogs_LOGS = new row_talendLogs_LOGSStruct();




	
	/**
	 * [talendLogs_CONSOLE begin ] start
	 */

	

	
		
		ok_Hash.put("talendLogs_CONSOLE", false);
		start_Hash.put("talendLogs_CONSOLE", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendLogs_CONSOLE";
	
	currentComponent="talendLogs_CONSOLE";
	
	
					if(execStat) {
						runStat.updateStatOnConnection(resourceMap,iterateId,0,0,"Main");
					}
				
		int tos_count_talendLogs_CONSOLE = 0;
		
                if(log.isDebugEnabled())
            log.debug("talendLogs_CONSOLE - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_talendLogs_CONSOLE{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_talendLogs_CONSOLE = new StringBuilder();
                    log4jParamters_talendLogs_CONSOLE.append("Parameters:");
                            log4jParamters_talendLogs_CONSOLE.append("BASIC_MODE" + " = " + "true");
                        log4jParamters_talendLogs_CONSOLE.append(" | ");
                            log4jParamters_talendLogs_CONSOLE.append("TABLE_PRINT" + " = " + "false");
                        log4jParamters_talendLogs_CONSOLE.append(" | ");
                            log4jParamters_talendLogs_CONSOLE.append("VERTICAL" + " = " + "false");
                        log4jParamters_talendLogs_CONSOLE.append(" | ");
                            log4jParamters_talendLogs_CONSOLE.append("FIELDSEPARATOR" + " = " + "\"|\"");
                        log4jParamters_talendLogs_CONSOLE.append(" | ");
                            log4jParamters_talendLogs_CONSOLE.append("PRINT_HEADER" + " = " + "false");
                        log4jParamters_talendLogs_CONSOLE.append(" | ");
                            log4jParamters_talendLogs_CONSOLE.append("PRINT_UNIQUE_NAME" + " = " + "false");
                        log4jParamters_talendLogs_CONSOLE.append(" | ");
                            log4jParamters_talendLogs_CONSOLE.append("PRINT_COLNAMES" + " = " + "false");
                        log4jParamters_talendLogs_CONSOLE.append(" | ");
                            log4jParamters_talendLogs_CONSOLE.append("USE_FIXED_LENGTH" + " = " + "false");
                        log4jParamters_talendLogs_CONSOLE.append(" | ");
                            log4jParamters_talendLogs_CONSOLE.append("PRINT_CONTENT_WITH_LOG4J" + " = " + "true");
                        log4jParamters_talendLogs_CONSOLE.append(" | ");
                if(log.isDebugEnabled())
            log.debug("talendLogs_CONSOLE - "  + (log4jParamters_talendLogs_CONSOLE) );
                    } 
                } 
            new BytesLimit65535_talendLogs_CONSOLE().limitLog4jByte();
            }

	///////////////////////
	
		final String OUTPUT_FIELD_SEPARATOR_talendLogs_CONSOLE = "|";
		java.io.PrintStream consoleOut_talendLogs_CONSOLE = null;	

 		StringBuilder strBuffer_talendLogs_CONSOLE = null;
		int nb_line_talendLogs_CONSOLE = 0;
///////////////////////    			



 



/**
 * [talendLogs_CONSOLE begin ] stop
 */



	
	/**
	 * [talendLogs_LOGS begin ] start
	 */

	

	
		
		ok_Hash.put("talendLogs_LOGS", false);
		start_Hash.put("talendLogs_LOGS", System.currentTimeMillis());
		
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";
	
	
		int tos_count_talendLogs_LOGS = 0;
		
                if(log.isDebugEnabled())
            log.debug("talendLogs_LOGS - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_talendLogs_LOGS{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_talendLogs_LOGS = new StringBuilder();
                    log4jParamters_talendLogs_LOGS.append("Parameters:");
                            log4jParamters_talendLogs_LOGS.append("CATCH_JAVA_EXCEPTION" + " = " + "true");
                        log4jParamters_talendLogs_LOGS.append(" | ");
                            log4jParamters_talendLogs_LOGS.append("CATCH_TDIE" + " = " + "true");
                        log4jParamters_talendLogs_LOGS.append(" | ");
                            log4jParamters_talendLogs_LOGS.append("CATCH_TWARN" + " = " + "true");
                        log4jParamters_talendLogs_LOGS.append(" | ");
                            log4jParamters_talendLogs_LOGS.append("CATCH_TACTIONFAILURE" + " = " + "true");
                        log4jParamters_talendLogs_LOGS.append(" | ");
                if(log.isDebugEnabled())
            log.debug("talendLogs_LOGS - "  + (log4jParamters_talendLogs_LOGS) );
                    } 
                } 
            new BytesLimit65535_talendLogs_LOGS().limitLog4jByte();
            }

try {
	for (LogCatcherUtils.LogCatcherMessage lcm : talendLogs_LOGS.getMessages()) {
		row_talendLogs_LOGS.type = lcm.getType();
		row_talendLogs_LOGS.origin = (lcm.getOrigin()==null || lcm.getOrigin().length()<1 ? null : lcm.getOrigin());
		row_talendLogs_LOGS.priority = lcm.getPriority();
		row_talendLogs_LOGS.message = lcm.getMessage();
		row_talendLogs_LOGS.code = lcm.getCode();
		
		row_talendLogs_LOGS.moment = java.util.Calendar.getInstance().getTime();
	
    	row_talendLogs_LOGS.pid = pid;
		row_talendLogs_LOGS.root_pid = rootPid;
		row_talendLogs_LOGS.father_pid = fatherPid;
	
    	row_talendLogs_LOGS.project = projectName;
    	row_talendLogs_LOGS.job = jobName;
    	row_talendLogs_LOGS.context = contextStr;
    		
 



/**
 * [talendLogs_LOGS begin ] stop
 */
	
	/**
	 * [talendLogs_LOGS main ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";
	
	

 


	tos_count_talendLogs_LOGS++;

/**
 * [talendLogs_LOGS main ] stop
 */
	
	/**
	 * [talendLogs_LOGS process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";
	
	

 



/**
 * [talendLogs_LOGS process_data_begin ] stop
 */

	
	/**
	 * [talendLogs_CONSOLE main ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_CONSOLE";
	
	currentComponent="talendLogs_CONSOLE";
	
	
					if(execStat){
						runStat.updateStatOnConnection(iterateId,1,1
						
							,"Main"
						
						);
					}
					
///////////////////////		
						



				strBuffer_talendLogs_CONSOLE = new StringBuilder();




   				
	    		if(row_talendLogs_LOGS.moment != null) { //              
                    							
       
				strBuffer_talendLogs_CONSOLE.append(
								FormatterUtils.format_Date(row_talendLogs_LOGS.moment, "yyyy-MM-dd HH:mm:ss")				
				);


							
	    		} //  			

    			strBuffer_talendLogs_CONSOLE.append("|");
    			


   				
	    		if(row_talendLogs_LOGS.pid != null) { //              
                    							
       
				strBuffer_talendLogs_CONSOLE.append(
				                String.valueOf(row_talendLogs_LOGS.pid)							
				);


							
	    		} //  			

    			strBuffer_talendLogs_CONSOLE.append("|");
    			


   				
	    		if(row_talendLogs_LOGS.root_pid != null) { //              
                    							
       
				strBuffer_talendLogs_CONSOLE.append(
				                String.valueOf(row_talendLogs_LOGS.root_pid)							
				);


							
	    		} //  			

    			strBuffer_talendLogs_CONSOLE.append("|");
    			


   				
	    		if(row_talendLogs_LOGS.father_pid != null) { //              
                    							
       
				strBuffer_talendLogs_CONSOLE.append(
				                String.valueOf(row_talendLogs_LOGS.father_pid)							
				);


							
	    		} //  			

    			strBuffer_talendLogs_CONSOLE.append("|");
    			


   				
	    		if(row_talendLogs_LOGS.project != null) { //              
                    							
       
				strBuffer_talendLogs_CONSOLE.append(
				                String.valueOf(row_talendLogs_LOGS.project)							
				);


							
	    		} //  			

    			strBuffer_talendLogs_CONSOLE.append("|");
    			


   				
	    		if(row_talendLogs_LOGS.job != null) { //              
                    							
       
				strBuffer_talendLogs_CONSOLE.append(
				                String.valueOf(row_talendLogs_LOGS.job)							
				);


							
	    		} //  			

    			strBuffer_talendLogs_CONSOLE.append("|");
    			


   				
	    		if(row_talendLogs_LOGS.context != null) { //              
                    							
       
				strBuffer_talendLogs_CONSOLE.append(
				                String.valueOf(row_talendLogs_LOGS.context)							
				);


							
	    		} //  			

    			strBuffer_talendLogs_CONSOLE.append("|");
    			


   				
	    		if(row_talendLogs_LOGS.priority != null) { //              
                    							
       
				strBuffer_talendLogs_CONSOLE.append(
				                String.valueOf(row_talendLogs_LOGS.priority)							
				);


							
	    		} //  			

    			strBuffer_talendLogs_CONSOLE.append("|");
    			


   				
	    		if(row_talendLogs_LOGS.type != null) { //              
                    							
       
				strBuffer_talendLogs_CONSOLE.append(
				                String.valueOf(row_talendLogs_LOGS.type)							
				);


							
	    		} //  			

    			strBuffer_talendLogs_CONSOLE.append("|");
    			


   				
	    		if(row_talendLogs_LOGS.origin != null) { //              
                    							
       
				strBuffer_talendLogs_CONSOLE.append(
				                String.valueOf(row_talendLogs_LOGS.origin)							
				);


							
	    		} //  			

    			strBuffer_talendLogs_CONSOLE.append("|");
    			


   				
	    		if(row_talendLogs_LOGS.message != null) { //              
                    							
       
				strBuffer_talendLogs_CONSOLE.append(
				                String.valueOf(row_talendLogs_LOGS.message)							
				);


							
	    		} //  			

    			strBuffer_talendLogs_CONSOLE.append("|");
    			


   				
	    		if(row_talendLogs_LOGS.code != null) { //              
                    							
       
				strBuffer_talendLogs_CONSOLE.append(
				                String.valueOf(row_talendLogs_LOGS.code)							
				);


							
	    		} //  			
 

                    if (globalMap.get("tLogRow_CONSOLE")!=null)
                    {
                    	consoleOut_talendLogs_CONSOLE = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                    }
                    else
                    {
                    	consoleOut_talendLogs_CONSOLE = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                    	globalMap.put("tLogRow_CONSOLE",consoleOut_talendLogs_CONSOLE);
                    }
                    	log.info("talendLogs_CONSOLE - Content of row "+(nb_line_talendLogs_CONSOLE+1)+": " + strBuffer_talendLogs_CONSOLE.toString());
                    consoleOut_talendLogs_CONSOLE.println(strBuffer_talendLogs_CONSOLE.toString());
                    consoleOut_talendLogs_CONSOLE.flush();
                    nb_line_talendLogs_CONSOLE++;
//////

//////                    
                    
///////////////////////    			

 


	tos_count_talendLogs_CONSOLE++;

/**
 * [talendLogs_CONSOLE main ] stop
 */
	
	/**
	 * [talendLogs_CONSOLE process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_CONSOLE";
	
	currentComponent="talendLogs_CONSOLE";
	
	

 



/**
 * [talendLogs_CONSOLE process_data_begin ] stop
 */
	
	/**
	 * [talendLogs_CONSOLE process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_CONSOLE";
	
	currentComponent="talendLogs_CONSOLE";
	
	

 



/**
 * [talendLogs_CONSOLE process_data_end ] stop
 */



	
	/**
	 * [talendLogs_LOGS process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";
	
	

 



/**
 * [talendLogs_LOGS process_data_end ] stop
 */
	
	/**
	 * [talendLogs_LOGS end ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";
	
	
	}
} catch (Exception e_talendLogs_LOGS) {
globalMap.put("talendLogs_LOGS_ERROR_MESSAGE",e_talendLogs_LOGS.getMessage());
	logIgnoredError(String.format("talendLogs_LOGS - tLogCatcher failed to process log message(s) due to internal error: %s", e_talendLogs_LOGS), e_talendLogs_LOGS);
}

 
                if(log.isDebugEnabled())
            log.debug("talendLogs_LOGS - "  + ("Done.") );

ok_Hash.put("talendLogs_LOGS", true);
end_Hash.put("talendLogs_LOGS", System.currentTimeMillis());




/**
 * [talendLogs_LOGS end ] stop
 */

	
	/**
	 * [talendLogs_CONSOLE end ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_CONSOLE";
	
	currentComponent="talendLogs_CONSOLE";
	
	


//////
//////
globalMap.put("talendLogs_CONSOLE_NB_LINE",nb_line_talendLogs_CONSOLE);
                if(log.isInfoEnabled())
            log.info("talendLogs_CONSOLE - "  + ("Printed row count: ")  + (nb_line_talendLogs_CONSOLE)  + (".") );

///////////////////////    			

				if(execStat){
			  		runStat.updateStat(resourceMap,iterateId,2,0,"Main");
			  	}
			  	
 
                if(log.isDebugEnabled())
            log.debug("talendLogs_CONSOLE - "  + ("Done.") );

ok_Hash.put("talendLogs_CONSOLE", true);
end_Hash.put("talendLogs_CONSOLE", System.currentTimeMillis());




/**
 * [talendLogs_CONSOLE end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendLogs_LOGS finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_LOGS";
	
	currentComponent="talendLogs_LOGS";
	
	

 



/**
 * [talendLogs_LOGS finally ] stop
 */

	
	/**
	 * [talendLogs_CONSOLE finally ] start
	 */

	

	
	
		currentVirtualComponent = "talendLogs_CONSOLE";
	
	currentComponent="talendLogs_CONSOLE";
	
	

 



/**
 * [talendLogs_CONSOLE finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendLogs_LOGS_SUBPROCESS_STATE", 1);
	}
	

public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	String cLabel =  null;
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [talendJobLog begin ] start
	 */

	

	
		
		ok_Hash.put("talendJobLog", false);
		start_Hash.put("talendJobLog", System.currentTimeMillis());
		
	
	currentComponent="talendJobLog";
	
	
		int tos_count_talendJobLog = 0;
		

	for (JobStructureCatcherUtils.JobStructureCatcherMessage jcm : talendJobLog.getMessages()) {
		org.talend.job.audit.JobContextBuilder builder_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
			.custom("process_id", jcm.pid).custom("thread_id", jcm.tid).custom("pid", pid).custom("father_pid", fatherPid).custom("root_pid", rootPid);
		org.talend.logging.audit.Context log_context_talendJobLog = null;
		
		
		if(jcm.log_type == JobStructureCatcherUtils.LogType.PERFORMANCE){
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.sourceId(jcm.sourceId).sourceLabel(jcm.sourceLabel).sourceConnectorType(jcm.sourceComponentName)
				.targetId(jcm.targetId).targetLabel(jcm.targetLabel).targetConnectorType(jcm.targetComponentName)
				.connectionName(jcm.current_connector).rows(jcm.row_count).duration(duration).build();
			auditLogger_talendJobLog.flowExecution(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBSTART) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment).build();
			auditLogger_talendJobLog.jobstart(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBEND) {
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
		
			log_context_talendJobLog = builder_talendJobLog
				.timestamp(jcm.moment).duration(duration).status(jcm.status).build();
			auditLogger_talendJobLog.jobstop(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.RUNCOMPONENT) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment)
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label).build();
			auditLogger_talendJobLog.runcomponent(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWINPUT) {//log current component input line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowInput(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWOUTPUT) {//log current component output/reject line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowOutput(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBERROR) {
			java.lang.Exception e_talendJobLog = jcm.exception;
			if(e_talendJobLog!=null) {
				try(java.io.StringWriter sw_talendJobLog = new java.io.StringWriter();java.io.PrintWriter pw_talendJobLog = new java.io.PrintWriter(sw_talendJobLog)) {
					e_talendJobLog.printStackTrace(pw_talendJobLog);
					builder_talendJobLog.custom("stacktrace", sw_talendJobLog.getBuffer().substring(0,java.lang.Math.min(sw_talendJobLog.getBuffer().length(), 512)));
				}
			}

			if(jcm.extra_info!=null) {
				builder_talendJobLog.connectorId(jcm.component_id).custom("extra_info", jcm.extra_info);
			}
				
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_id.substring(0, jcm.component_id.lastIndexOf('_')))
				.connectorId(jcm.component_id)
				.connectorLabel(jcm.component_label == null ? jcm.component_id : jcm.component_label).build();

			auditLogger_talendJobLog.exception(log_context_talendJobLog);
		}
		
		
		
	}

 



/**
 * [talendJobLog begin ] stop
 */
	
	/**
	 * [talendJobLog main ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 


	tos_count_talendJobLog++;

/**
 * [talendJobLog main ] stop
 */
	
	/**
	 * [talendJobLog process_data_begin ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog process_data_begin ] stop
 */
	
	/**
	 * [talendJobLog process_data_end ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog process_data_end ] stop
 */
	
	/**
	 * [talendJobLog end ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 

ok_Hash.put("talendJobLog", true);
end_Hash.put("talendJobLog", System.currentTimeMillis());




/**
 * [talendJobLog end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, cLabel, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendJobLog finally ] start
	 */

	

	
	
	currentComponent="talendJobLog";
	
	

 



/**
 * [talendJobLog finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendJobLog_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Default";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    

    public static void main(String[] args){
        final job_test job_testClass = new job_test();

        int exitCode = job_testClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'job_test' - Done.");
	        }

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }
        enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));

	        if(!"".equals(log4jLevel)){
	        	
				if("trace".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.TRACE);
				}else if("debug".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.DEBUG);
				}else if("info".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.INFO);
				}else if("warn".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.WARN);
				}else if("error".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.ERROR);
				}else if("fatal".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.FATAL);
				}else if ("off".equalsIgnoreCase(log4jLevel)){
					log.setLevel(org.apache.log4j.Level.OFF);
				}
				org.apache.log4j.Logger.getRootLogger().setLevel(log.getLevel());
				
				
				
			}
			log.info("TalendJob: 'job_test' - Start.");
		
		
		
			if(enableLogStash) {
				java.util.Properties properties_talendJobLog = new java.util.Properties();
				properties_talendJobLog.setProperty("root.logger", "audit");
				properties_talendJobLog.setProperty("encoding", "UTF-8");
				properties_talendJobLog.setProperty("application.name", "Talend Studio");
				properties_talendJobLog.setProperty("service.name", "Talend Studio Job");
				properties_talendJobLog.setProperty("instance.name", "Talend Studio Job Instance");
				properties_talendJobLog.setProperty("propagate.appender.exceptions", "none");
				properties_talendJobLog.setProperty("log.appender", "file");
				properties_talendJobLog.setProperty("appender.file.path", "audit.json");
				properties_talendJobLog.setProperty("appender.file.maxsize", "52428800");
				properties_talendJobLog.setProperty("appender.file.maxbackup", "20");
				properties_talendJobLog.setProperty("host", "false");

				System.getProperties().stringPropertyNames().stream()
					.filter(it -> it.startsWith("audit.logger."))
					.forEach(key -> properties_talendJobLog.setProperty(key.substring("audit.logger.".length()), System.getProperty(key)));

				
				org.apache.log4j.Logger.getLogger(properties_talendJobLog.getProperty("root.logger")).setLevel(org.apache.log4j.Level.DEBUG);
				
				
				
				auditLogger_talendJobLog = org.talend.job.audit.JobEventAuditLoggerFactory.createJobAuditLogger(properties_talendJobLog);
			}
		

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }
        boolean inOSGi = routines.system.BundleUtils.inOSGi();

        try {
            java.util.Dictionary<String, Object> jobProperties = null;
            if (inOSGi) {
                jobProperties = routines.system.BundleUtils.getJobProperties(jobName);
    
                if (jobProperties != null && jobProperties.get("context") != null) {
                    contextStr = (String)jobProperties.get("context");
                }
            }
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = job_test.class.getClassLoader().getResourceAsStream("prj_corp_ratp_dev_sa/job_test_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = job_test.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
    	                defaultProps.load(inContext);
    	                if (inOSGi && jobProperties != null) {
                             java.util.Enumeration<String> keys = jobProperties.keys();
                             while (keys.hasMoreElements()) {
                                 String propKey = keys.nextElement();
                                 if (defaultProps.containsKey(propKey)) {
                                     defaultProps.put(propKey, (String) jobProperties.get(propKey));
                                 }
                             }
    	                }
    	                context = new ContextProperties(defaultProps);
                    }
                } finally {
                    inContext.close();
                }
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("delim", "id_String");
                        if(context.getStringValue("delim") == null) {
                            context.delim = null;
                        } else {
                            context.delim=(String) context.getProperty("delim");
                        }
                        context.setContextType("societe", "id_String");
                        if(context.getStringValue("societe") == null) {
                            context.societe = null;
                        } else {
                            context.societe=(String) context.getProperty("societe");
                        }
                        context.setContextType("ora_ServiceName", "id_String");
                        if(context.getStringValue("ora_ServiceName") == null) {
                            context.ora_ServiceName = null;
                        } else {
                            context.ora_ServiceName=(String) context.getProperty("ora_ServiceName");
                        }
                        context.setContextType("ora_Login", "id_String");
                        if(context.getStringValue("ora_Login") == null) {
                            context.ora_Login = null;
                        } else {
                            context.ora_Login=(String) context.getProperty("ora_Login");
                        }
                        context.setContextType("ora_Password", "id_Password");
                        if(context.getStringValue("ora_Password") == null) {
                            context.ora_Password = null;
                        } else {
                            String pwd_ora_Password_value = context.getProperty("ora_Password");
                            context.ora_Password = null;
                            if(pwd_ora_Password_value!=null) {
                                if(context_param.containsKey("ora_Password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.ora_Password = pwd_ora_Password_value;
                                } else if (!pwd_ora_Password_value.isEmpty()) {
                                    try {
                                        context.ora_Password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_ora_Password_value);
                                        context.put("ora_Password",context.ora_Password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("ora_AdditionalParams", "id_String");
                        if(context.getStringValue("ora_AdditionalParams") == null) {
                            context.ora_AdditionalParams = null;
                        } else {
                            context.ora_AdditionalParams=(String) context.getProperty("ora_AdditionalParams");
                        }
                        context.setContextType("ora_Schema", "id_String");
                        if(context.getStringValue("ora_Schema") == null) {
                            context.ora_Schema = null;
                        } else {
                            context.ora_Schema=(String) context.getProperty("ora_Schema");
                        }
                        context.setContextType("ora_Port", "id_String");
                        if(context.getStringValue("ora_Port") == null) {
                            context.ora_Port = null;
                        } else {
                            context.ora_Port=(String) context.getProperty("ora_Port");
                        }
                        context.setContextType("ora_Server", "id_String");
                        if(context.getStringValue("ora_Server") == null) {
                            context.ora_Server = null;
                        } else {
                            context.ora_Server=(String) context.getProperty("ora_Server");
                        }
                } 
                public void processAllContext() {
                        processContext_0();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("delim")) {
                context.delim = (String) parentContextMap.get("delim");
            }if (parentContextMap.containsKey("societe")) {
                context.societe = (String) parentContextMap.get("societe");
            }if (parentContextMap.containsKey("ora_ServiceName")) {
                context.ora_ServiceName = (String) parentContextMap.get("ora_ServiceName");
            }if (parentContextMap.containsKey("ora_Login")) {
                context.ora_Login = (String) parentContextMap.get("ora_Login");
            }if (parentContextMap.containsKey("ora_Password")) {
                context.ora_Password = (java.lang.String) parentContextMap.get("ora_Password");
            }if (parentContextMap.containsKey("ora_AdditionalParams")) {
                context.ora_AdditionalParams = (String) parentContextMap.get("ora_AdditionalParams");
            }if (parentContextMap.containsKey("ora_Schema")) {
                context.ora_Schema = (String) parentContextMap.get("ora_Schema");
            }if (parentContextMap.containsKey("ora_Port")) {
                context.ora_Port = (String) parentContextMap.get("ora_Port");
            }if (parentContextMap.containsKey("ora_Server")) {
                context.ora_Server = (String) parentContextMap.get("ora_Server");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("ora_Password");
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();
        talendStats_STATS.addMessage("begin");


this.globalResumeTicket = true;//to run tPreJob




        try {
            talendStats_STATSProcess(globalMap);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
		if(enableLogStash) {
	        talendJobLog.addJobStartMessage();
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }

this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tJava_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tJava_1) {
globalMap.put("tJava_1_SUBPROCESS_STATE", -1);

e_tJava_1.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob




        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : job_test");
        }
        talendStats_STATS.addMessage(status==""?"end":status, (end-startTime));
        try {
            talendStats_STATSProcess(globalMap);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
		if(enableLogStash) {
	        talendJobLog.addJobEndMessage(startTime, end, status);
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;


    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {


    }














    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();






        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     119790 characters generated by Talend Cloud API Services Platform 
 *     on the May 18, 2022 at 10:23:59 AM CEST
 ************************************************************************************************/