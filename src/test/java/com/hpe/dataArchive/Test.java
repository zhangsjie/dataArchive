package com.hpe.dataArchive;

import com.hpe.dataArchive.sqlProcess.MysqlProcess;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "c:/archiveSql/MysqlArchive.sql";
		String sql = "select * from user";
		MysqlProcess mysqlProcess = new MysqlProcess();
		try {
			mysqlProcess.insertIntoFile(sql, path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
