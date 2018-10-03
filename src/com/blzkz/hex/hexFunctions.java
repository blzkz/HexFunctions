package com.blzkz.hex;

import java.io.UnsupportedEncodingException;

//import com.appiancorp.suiteapi.expression.annotations.AppianScriptingFunctionsCategory;
//import com.appiancorp.suiteapi.expression.annotations.Category;
import com.appiancorp.suiteapi.expression.annotations.Function;
import com.appiancorp.suiteapi.expression.annotations.Parameter;

@hexFunctionsCategory
public class hexFunctions {
	
	@Function
	public String text2hex(@Parameter String text) {
		String hex;
		 try {
			hex = HexStringConverter.getHexStringConverterInstance().stringToHex(text);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			hex = text;
		}
		return hex;
	}
	
	@Function
	public String hex2text(@Parameter String hex) {
		return HexStringConverter.getHexStringConverterInstance().hexToString(hex);
	}
}
