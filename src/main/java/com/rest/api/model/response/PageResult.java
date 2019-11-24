package com.rest.api.model.response;

import java.util.List;

import org.springframework.data.domain.Page;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageResult<T> extends CommonResult {
	private Page<T> page;
}
