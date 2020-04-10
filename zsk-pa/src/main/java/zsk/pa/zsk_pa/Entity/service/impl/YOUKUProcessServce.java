package zsk.pa.zsk_pa.Entity.service.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

import zsk.pa.zsk_pa.Entity.pageEntity;
import zsk.pa.zsk_pa.Entity.service.IProcessService;
import zsk.pa.zsk_pa.util.RegexUtil;

public class YOUKUProcessServce implements IProcessService {
	/***
 * 视频解析实现接口
 * @author zsk
 *createby 2020/3/16
 */
private  String allnumberRegex ="[\\d]+";
private  String commentnumberRegex ="[\\d,]+";
private  String parseAllNumber="";
private  String hot="//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div/div/div/span/span[2]";
private  String pl="//*[@id=\"left-title-content-wrap\"]/div/span";
private String content;

public void Process(pageEntity page) {
	// TODO Auto-generated method stub
	String count =page.getCount();
	HtmlCleaner htmlCleaner=new HtmlCleaner();
	Object [] evaluateXPath=null;
	TagNode  rootnode=htmlCleaner.clean(count);
	try {
		evaluateXPath= rootnode.evaluateXPath(hot);
		if(evaluateXPath.length>0) {
			TagNode node =(TagNode) evaluateXPath[0];
			Pattern numberPattern =Pattern.compile(commentnumberRegex, Pattern.DOTALL);
		   String conynt= RegexUtil.getregexinfo(node.getText().toString(), numberPattern, 0);
		   System.out.println("热点"+conynt);
		    
		}
		evaluateXPath= rootnode.evaluateXPath(pl);
		if(evaluateXPath.length>0) {
			TagNode node =(TagNode) evaluateXPath[0];
			Pattern numberPattern =Pattern.compile(commentnumberRegex, Pattern.DOTALL);
			 String conynt= RegexUtil.getregexinfo(node.getText().toString(), numberPattern, 0);
			   System.out.println("获取"+conynt);
		}
	} catch (XPatherException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
