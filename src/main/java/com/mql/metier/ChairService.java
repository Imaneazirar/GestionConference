package com.mql.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mql.dao.ChairRepository;
import com.mql.entities.Chair;

@Service
public class ChairService implements IChairMetier{
	@Autowired
	private ChairRepository cr;
	@Override
	@Transactional
	public List<Chair> findAllChair() {
	
		return cr.findAll();
	}

	@Override
	public void saveChair() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Chair findOne(long id) {
		return  cr.findOne(id);
	}
	

}
