package com.honey.in.errors;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
	
	private Integer errorCode;
	private String errorDesc;
	private Date date;

}
