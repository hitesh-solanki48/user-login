package com.hitesh.dao;

import java.util.List;

import com.hitesh.model.UserProfile;

public interface UserProfileDao {

	List<UserProfile> findAll();

	UserProfile findById(int id);

	UserProfile findByType(String type);
}
