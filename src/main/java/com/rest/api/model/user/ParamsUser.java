package com.rest.api.model.user;

import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiParam;
import lombok.Data;

@Data
public class ParamsUser {
	
	@ApiParam(value = "회원번호")
	private Long msrl;
	
	@ApiParam(value = "이름")
	private String name;
	
	@ApiParam(value = "회원ID : 이메일") 
	private String id;
	
    @ApiParam(value = "비밀번호") 
	private String password;

}
