package com.myo2o.service;

import com.myo2o.entity.LocalAuth;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.myo2o.dto.LocalAuthExecution;

public interface LocalAuthService {
	/**
	 * 
	 * @param userName
	 * @return
	 */
	LocalAuth getLocalAuthByUserNameAndPwd(String userName, String password);

	/**
	 * 
	 * @param userId
	 * @return
	 */
	LocalAuth getLocalAuthByUserId(long userId);

	/**
	 * 
	 * @param localAuth
	 * @param profileImg
	 * @return
	 * @throws RuntimeException
	 */
	LocalAuthExecution register(LocalAuth localAuth,
                                CommonsMultipartFile profileImg) throws RuntimeException;

	/**
	 * 
	 * @param localAuth
	 * @return
	 * @throws RuntimeException
	 */
	LocalAuthExecution bindLocalAuth(LocalAuth localAuth)
			throws RuntimeException;

	@Transactional
	LocalAuthExecution register(LocalAuth localAuth,
								CommonsMultipartFile profileImg) throws RuntimeException;

	/**
	 * 
	 * @param localAuthId
	 * @param userName
	 * @param password
	 * @param newPassword
	 * @param lastEditTime
	 * @return
	 */
	LocalAuthExecution modifyLocalAuth(Long userId, String userName,
                                       String password, String newPassword);
}
