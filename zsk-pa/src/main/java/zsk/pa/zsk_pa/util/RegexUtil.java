package zsk.pa.zsk_pa.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/***
 * 正则表达式规则
 * @author Lenovo
 *
 */
public class RegexUtil {
public  static  String getregexinfo(String content,Pattern pattern,int groupNb) {
	Matcher matcher =pattern.matcher(content);
    if(matcher.find()) {
    	
    	return  matcher.group(0).trim();
         
        }
	
    return "0";
}
 
}
