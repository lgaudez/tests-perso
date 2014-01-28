package com.languageApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.languageApp.dao.RoleDAO;
import com.languageApp.model.Role;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleDAO roleDAO;

	public Role getRole(int id) {
		return roleDAO.getRole(id);
	}

}
