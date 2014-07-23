package com.hcl.poc.service;

import java.util.List;
import java.util.Map;

import com.hcl.poc.daos.StubtabDAO;
import com.poc.dao.entity.Stubtab;

public class StubtabService {
	
	private StubtabDAO stubdao;
	
	public StubtabService(){		
		super();
		stubdao = new StubtabDAO();
	}
	
	public void save(Stubtab entity) {	
		stubdao.save(entity);
	}
	
	public void delete(Stubtab entity) {
		stubdao.delete(entity);
	}

	
	public Stubtab update(Stubtab entity) {
		return stubdao.update(entity);
	}

	public Stubtab find(long entityID){		
		return stubdao.find(entityID);
	}
	
	public List<Stubtab> findAll(){ 
		return stubdao.findAll();
	}
	
	public Stubtab findReferenceOnly(int entityID) {
		return stubdao.findReferenceOnly(entityID);
	}

	
	public List<Stubtab> findAllBySQLQuery(String sql,
			Map<Integer, Object> inputMap, Class className) {
		return stubdao.findAllBySQLQuery(sql, inputMap, className);
	}

	
	public List<Object> findAllBySQLQueryObj(String sql,
			Map<Integer, Object> inputMap) {
		return stubdao.findAllBySQLQueryObj(sql, inputMap);
	}

	
	public Stubtab findBySQLQuery(String sql, Map<Integer, Object> inputMap,
			Class className) {
		return stubdao.findBySQLQuery(sql, inputMap, className);
	}

	
	public int updateBySQLQuery(String sql, Map<Integer, Object> inputMap) {
		return stubdao.updateBySQLQuery(sql, inputMap);
	}

	
	

}
