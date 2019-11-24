package com.rest.api.model.board;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ParamsBoardSearch {

	@ApiModelProperty(value = "검색키워드")
	private String keyword;
	
	@ApiModelProperty(value = "검색어")
	private String searchWord;
	
}
