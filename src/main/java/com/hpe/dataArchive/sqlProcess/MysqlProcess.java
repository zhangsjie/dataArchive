package com.hpe.dataArchive.sqlProcess;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysqlProcess {
	
	private static Logger log = LoggerFactory.getLogger(MysqlProcess.class);
	String path = "c://archiveSql//MysqlArchive.sql";

	public void createFile(String path) throws Exception {
		File file = new File(path);
		boolean flag = false;
		try {
			if (!file.exists()) {
				file.createNewFile();
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertIntoFile(String sql, String path) {
		try {
			File f = new File(path);
			if (!f.exists()) {
				f.createNewFile();
			}
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(f));
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(sql);
			bw.flush();
			osw.close();
			bw.close();
			log.debug("Write File complete!");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}