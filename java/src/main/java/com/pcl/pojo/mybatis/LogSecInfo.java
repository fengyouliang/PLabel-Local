package com.pcl.pojo.mybatis;

public class LogSecInfo {

	private String id;
	
	private int oper_type;//login, logout
	
	private int user_id;
	
	private String user_name;
	
	private String oper_name;
	
	private String oper_id;
	
	private String log_info;
	
	private String oper_time_start;
	
	private String oper_time_end;

	private String record_id;
	
	private String extend1;
	
	private String extend2;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getOper_name() {
		return oper_name;
	}

	public void setOper_name(String oper_name) {
		this.oper_name = oper_name;
	}



	public int getOper_type() {
		return oper_type;
	}

	public void setOper_type(int oper_type) {
		this.oper_type = oper_type;
	}

	public String getOper_time_start() {
		return oper_time_start;
	}

	public void setOper_time_start(String oper_time_start) {
		this.oper_time_start = oper_time_start;
	}

	public String getOper_time_end() {
		return oper_time_end;
	}

	public void setOper_time_end(String oper_time_end) {
		this.oper_time_end = oper_time_end;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOper_id() {
		return oper_id;
	}

	public void setOper_id(String oper_id) {
		this.oper_id = oper_id;
	}

	public String getRecord_id() {
		return record_id;
	}

	public void setRecord_id(String record_id) {
		this.record_id = record_id;
	}

	public String getExtend1() {
		return extend1;
	}

	public void setExtend1(String extend1) {
		this.extend1 = extend1;
	}

	public String getExtend2() {
		return extend2;
	}

	public void setExtend2(String extend2) {
		this.extend2 = extend2;
	}

	public String getLog_info() {
		return log_info;
	}

	public void setLog_info(String log_info) {
		this.log_info = log_info;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

}
