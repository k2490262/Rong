package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.CustomerManager;
import com.example.demo.vo.CustomerVo;

@Repository
public class CustomerDao {
	public int insertCustomer(CustomerVo c) {
		return CustomerManager.insertCustomer(c);
	}
	
	public int updateCustomer(CustomerVo c) {
		return CustomerManager.updateCustomer(c);
	}
	
	public int deleteCustomer(int custid) {
		return CustomerManager.deleteCustomer(custid);
	}
	
	public CustomerVo getCustomer(int custid) {
		return CustomerManager.getCustomer(custid);
	}
	
	public List<CustomerVo> listAll() {
		return CustomerManager.listAll();
	}
}
