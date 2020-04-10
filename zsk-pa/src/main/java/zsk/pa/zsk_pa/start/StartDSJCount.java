package zsk.pa.zsk_pa.start;

import zsk.pa.zsk_pa.Entity.pageEntity;
import zsk.pa.zsk_pa.Entity.service.IDownLodeService;
import zsk.pa.zsk_pa.Entity.service.IProcessService;
import zsk.pa.zsk_pa.Entity.service.impl.HttpClientDownLoadServiceimpl;
import zsk.pa.zsk_pa.Entity.service.impl.YOUKUProcessServce;
import zsk.pa.zsk_pa.util.pageDownLoadUtil;

/***
 * 爬虫执行入口类
 * @author Lenov
 *
 */
public class StartDSJCount {
	private IDownLodeService iDownLodeService;
	private IProcessService  iProcessService; 
public static void main(String[] args) {
	StartDSJCount dsj =new StartDSJCount();
	dsj.setiDownLodeService(new HttpClientDownLoadServiceimpl());
	dsj.setiProcessService(new YOUKUProcessServce());
		//下载页面
	  String url="https://v.youku.com/v_show/id_XNDU3MDY3NjQ3Mg==.html?spm=a2h0k.11417342.soresults.dposter";
	   pageEntity page=dsj.downloadpage(url);
	   dsj.proccessPage(page);
	  //System.out.println(page.getCount());
}
/***
 * 下载页面
 * @param url
 * @return
 */
public pageEntity downloadpage(String url) {
	
	return this.iDownLodeService.download(url);
	
}
//解析页面
public void proccessPage(pageEntity page) {
	this.iProcessService.Process(page);
	
}
public IDownLodeService getiDownLodeService() {
	return iDownLodeService;
}
public void setiDownLodeService(IDownLodeService iDownLodeService) {
	this.iDownLodeService = iDownLodeService;
}

public IProcessService getiProcessService() {
	return iProcessService;
}
public void setiProcessService(IProcessService iProcessService) {
	this.iProcessService = iProcessService;
}


}
