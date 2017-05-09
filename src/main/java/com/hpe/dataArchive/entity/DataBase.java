package com.hpe.dataArchive.entity;

import java.util.Date;

/**
 * Created by zhangshe on 5/5/2017.
 */
public class DataBase   {
	private String databaseName;
	private String tableName;
	private Date date;
	
	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public DataBase(String databaseName, String tableName, Date date) {
		super();
		this.databaseName = databaseName;
		this.tableName = tableName;
		this.date = date;
	}

	@Override
	public String toString() {
		return "DataBase [databaseName=" + databaseName + ", tableName=" + tableName + ", date=" + date + "]";
	}
	
}
