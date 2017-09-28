package com.inesv.digiccy.validata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inesv.digiccy.common.ResponseCode;
import com.inesv.digiccy.dto.BonusLevelDto;
import com.inesv.digiccy.query.QueryBonusLevel;
import com.inesv.digiccy.validata.util.ExcelUtils;

@Component
public class BonusLevelValidata {

	@Autowired 
	QueryBonusLevel queryBonusLevel;
	
	public Map<String,Object> queryAll(){
		Map<String,Object> map = new HashMap<String, Object>();
		List<BonusLevelDto> list = new ArrayList<BonusLevelDto>();
		list = queryBonusLevel.queryAll();
		if(list != null || list.size()>0){
			map.put("data", list);
			map.put("code", ResponseCode.SUCCESS);
			map.put("desc", ResponseCode.SUCCESS_DESC);
		}else{
			map.put("code", ResponseCode.FAIL);
			map.put("code", ResponseCode.FAIL_DESC);
		}
		return map;
	}
	public void getExcel(HttpServletResponse response){
		Map<String, List<String>> contact = new HashMap<String, List<String>>();
		List<BonusLevelDto> list =  queryBonusLevel.queryAll();
		String title1 = "来源订单";
		String title2 = "货币种类";
		String title3 = "获取分红用户";
		String title4 = "交易类型";
		String title5 = "所得分红";
		List<String> col1 = new ArrayList<String>();
		List<String> col2 = new ArrayList<String>();
		List<String> col3 = new ArrayList<String>();
		List<String> col4 = new ArrayList<String>();
		List<String> col5 = new ArrayList<String>();
		for(BonusLevelDto dto : list){
			col1.add(dto.getBonus_source().toString());
			col2.add(dto.getBonus_coin().toString());
			col3.add(dto.getBonus_user().toString());
			col4.add(dto.getBonus_type()+"");
			col5.add(dto.getBonus().toString());
		}
		contact.put(title5, col5);
		contact.put(title1, col1);
		contact.put(title2, col2);
		contact.put(title3, col3);
		contact.put(title4, col4);
		
		ExcelUtils.export(response, contact);
	}
}
