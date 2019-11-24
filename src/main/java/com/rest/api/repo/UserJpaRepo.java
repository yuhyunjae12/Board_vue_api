package com.rest.api.repo;

import com.rest.api.entity.User;
import com.rest.api.model.user.ParamsUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserJpaRepo extends JpaRepository<User, Long> {

    Optional<User> findByUid(String email);

    Optional<User> findByUidAndProvider(String uid, String provider);
    
    boolean existsByUid(String uid);
    
    @Modifying	// update , delete Query
	@Query(value="update User u set u.password = :#{#paramsUser.password} WHERE u.msrl = :#{#paramsUser.msrl}", nativeQuery=false)
	Integer update(@Param("paramsUser") ParamsUser paramsUser );
}
