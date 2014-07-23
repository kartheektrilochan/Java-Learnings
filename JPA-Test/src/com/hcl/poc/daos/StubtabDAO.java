package com.hcl.poc.daos;

import java.util.List;
import java.util.Map;

import com.hcl.poc.base.service.BaseDAOService;
import com.poc.dao.entity.Stubtab;

public class StubtabDAO extends BaseDAOService<Stubtab> {

	public StubtabDAO() {
		super(Stubtab.class);
	}

	@Override
	public void delete(Stubtab entity) {
		// TODO Auto-generated method stub
		super.beginTransaction();
		super.delete(entity);
		super.commit();
	}

	@Override
	public Stubtab find(long entityID) {
		super.openEntityManager();

		Stubtab obj = super.find(entityID);

		super.closeEntityManager();
		return obj;

	}

	@Override
	public List<Stubtab> findAll() {
		super.openEntityManager();
		List<Stubtab> objList = super.findAll();
		super.closeEntityManager();
		return objList;
	}

	@Override
	public List<Stubtab> findAllByNamedQuery(String sql,
			Map<Integer, Object> inputMap, Class className) {
		// TODO Auto-generated method stub
		super.openEntityManager();
		List<Stubtab> objList = super.findAllByNamedQuery(sql, inputMap,
				className);
		super.closeEntityManager();

		return objList;

	}

	@Override
	public List<Stubtab> findAllBySQLQuery(String sql,
			Map<Integer, Object> inputMap, Class className) {

		super.openEntityManager();
		List<Stubtab> objList = super.findAllBySQLQuery(sql, inputMap,
				className);
		super.closeEntityManager();

		return objList;
	}

	@Override
	public List<Object> findAllBySQLQueryObj(String sql,
			Map<Integer, Object> inputMap) {
		super.openEntityManager();
		List<Object> objList = super.findAllBySQLQueryObj(sql, inputMap);
		super.closeEntityManager();

		return objList;

	}

	@Override
	public Stubtab findBySQLQuery(String sql, Map<Integer, Object> inputMap,
			Class className) {
		super.openEntityManager();
		Stubtab obj = super.findBySQLQuery(sql, inputMap, className);
		super.closeEntityManager();

		return obj;

	}

	@Override
	public Stubtab findReferenceOnly(int entityID) {
		super.openEntityManager();
		Stubtab obj = super.findReferenceOnly(entityID);
		super.closeEntityManager();
		return obj;
	}

	@Override
	public void save(Stubtab entity) {
		// TODO Auto-generated method stub
		super.beginTransaction();
		super.save(entity);
		super.commit();
	}

	@Override
	public Stubtab update(Stubtab entity) {
		super.beginTransaction();
		Stubtab obj = super.update(entity);
		super.commitAndCloseTransaction();
		return obj;

	}

	@Override
	public int updateBySQLQuery(String sql, Map<Integer, Object> inputMap) {
		super.beginTransaction();
		int records = super.updateBySQLQuery(sql, inputMap);
		super.commitAndCloseTransaction();

		return records;
	}

}
