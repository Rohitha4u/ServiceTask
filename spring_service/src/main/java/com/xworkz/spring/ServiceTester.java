package com.xworkz.spring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.entity.ValentineEntity;
import com.xworkz.spring.service.ValentineService;

public class ServiceTester {
	
	public static void main(String[] args) {
		try {
			
			
			ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
			ValentineService service = container.getBean(ValentineService.class);
			
			ValentineEntity entity = new ValentineEntity();
			entity.setName("eshwar");
			entity.setAmountspent(500);
			entity.setGift("hearts");
			entity.setStatus("double");
			
			service.validateAndSave(entity);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
