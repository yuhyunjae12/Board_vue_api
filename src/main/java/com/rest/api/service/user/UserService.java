package com.rest.api.service.user;

import javax.transaction.Transactional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rest.api.model.user.ParamsUser;
import com.rest.api.repo.UserJpaRepo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional
@Service
public class UserService {
	
	private final UserJpaRepo userJpaRepo;
	private final PasswordEncoder passwordEncoder;

	// 유저 비밀번호 수정
	public int userPasswordModify(ParamsUser paramsUser) {
		String encodePassword = passwordEncoder.encode(paramsUser.getPassword());
		paramsUser.setPassword(encodePassword);
    	return userJpaRepo.update(paramsUser);
    }
}
