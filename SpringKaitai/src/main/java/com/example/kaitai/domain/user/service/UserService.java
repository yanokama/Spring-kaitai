package com.example.kaitai.domain.user.service;

import java.util.List;

import com.example.kaitai.domain.user.model.MUser;

public interface UserService {

	/**ユーザー登録*/
	public void signup(MUser user);

	/**ユーザー取得*/
	public List<MUser> getUsers();
	
	/** ユーザー取得（１件）*/
	public MUser getUserOne(String userId);
}
