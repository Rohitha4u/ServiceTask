package com.xworkz.spring.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dao.ValentineDAO;
import com.xworkz.spring.entity.ValentineEntity;
@Component
public class ValentineServiceImpl implements ValentineService{
	
	@Autowired
	private ValentineDAO dao;
	
	public ValentineServiceImpl() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	public boolean validateAndSave(ValentineEntity entity) {
		
		System.out.println("invoked validateAndSave"+entity);
		Integer id = dao.save(entity);
		if(Objects.nonNull(id)) {
			System.out.println("entity save");
		return true;
	}
	System.out.println("entity not saved");
	return false;
}
}