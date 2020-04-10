package zsk.pa.zsk_pa.Entity.service.impl;

import zsk.pa.zsk_pa.Entity.pageEntity;
import zsk.pa.zsk_pa.Entity.service.IDownLodeService;
import zsk.pa.zsk_pa.util.pageDownLoadUtil;

public class HttpClientDownLoadServiceimpl implements IDownLodeService {
	/***
	 * 页面下载接口实现类
	 * @author zsk
	 *createby 2020/3/16
	 */
	public pageEntity download(String url) {
		// TODO Auto-generated method stub
		pageEntity pageentity =new pageEntity();
		pageentity.setCount(pageDownLoadUtil.getpageContent(url));
		return pageentity;
	}

}
