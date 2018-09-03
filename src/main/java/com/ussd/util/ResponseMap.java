package com.ussd.util;



import com.ussd.response.Response;

import java.util.HashMap;
import java.util.Map;

public class ResponseMap {
	
	private Map<String, Response> mapAdd;
	private Map<String,Response> mapReplace;
	
	public ResponseMap() {
		mapAdd = new HashMap<>();
		mapReplace = new HashMap<>();
		
	}

}
