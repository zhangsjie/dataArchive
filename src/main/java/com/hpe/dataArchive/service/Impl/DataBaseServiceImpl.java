package com.hpe.dataArchive.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpe.dataArchive.Dao.DataBaseDao;
import com.hpe.dataArchive.entity.DataBase;
import com.hpe.dataArchive.service.DataBaseService;
@Service
public class DataBaseServiceImpl  implements DataBaseService{
	@Autowired
	private DataBaseDao dataBaseDao;

	@Override
	public List<String> getFieldByDataBase(String tableName) {
		// TODO Auto-generated method stub
		return dataBaseDao.queryAll(tableName);
	}
	
	
	
}
