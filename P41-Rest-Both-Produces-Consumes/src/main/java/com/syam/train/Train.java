package com.syam.train;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Train {
	
	private Integer no;
	
	private String trainName;
	
	private String toAdd;
	
	private String fromAdd;
	
	private Integer cost;

}
