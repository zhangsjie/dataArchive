package com.hpe.dataArchive.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hpe.dataArchive.service.DataBaseService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangshe on 5/5/2017.
 */
@Controller
@RequestMapping("dataBase")
public class DataBaseController {

	private DataBaseService dataBaseService;
	
	@RequestMapping(value = "/find.do", method = RequestMethod.POST)
	public String searchDataBase(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String databaseName=req.getParameter("databaseName");
		String tableName=req.getParameter("tableName");
		String date=req.getParameter("date");
		System.out.println(databaseName+"  "+tableName+"时间"+date);
		List<String> fields=dataBaseService.getFieldByDataBase(tableName);
		
		return "success";
		
	}
	
}
