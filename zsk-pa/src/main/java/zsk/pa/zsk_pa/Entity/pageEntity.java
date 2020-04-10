package zsk.pa.zsk_pa.Entity;
/***
 * 保存页面内容
 * @author zsk
 *createby 2020/3/16
 */
public class pageEntity {
//页面内容
private String count;
//总播放量
private String allnumber;
//播放增量
private String daynumber;
//评论区
private String commentnumber;
//收藏数
private String collectnumber;
//赞数
private String supportnumber;

//踩
private String againstnumber;
//名称
private String name;

//路径
private String url;
//子级信息
private String eplsodenumber;
public String getCount() {
	return count;
}
public void setCount(String count) {
	this.count = count;
}
public String getAllnumber() {
	return allnumber;
}
public void setAllnumber(String allnumber) {
	this.allnumber = allnumber;
}
public String getDaynumber() {
	return daynumber;
}
public void setDaynumber(String daynumber) {
	this.daynumber = daynumber;
}
public String getCommentnumber() {
	return commentnumber;
}
public void setCommentnumber(String commentnumber) {
	this.commentnumber = commentnumber;
}
public String getCollectnumber() {
	return collectnumber;
}
public void setCollectnumber(String collectnumber) {
	this.collectnumber = collectnumber;
}
public String getSupportnumber() {
	return supportnumber;
}
public void setSupportnumber(String supportnumber) {
	this.supportnumber = supportnumber;
}
public String getAgainstnumber() {
	return againstnumber;
}
public void setAgainstnumber(String againstnumber) {
	this.againstnumber = againstnumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getEplsodenumber() {
	return eplsodenumber;
}
public void setEplsodenumber(String eplsodenumber) {
	this.eplsodenumber = eplsodenumber;
}
@Override
public String toString() {
	return "pageEntity [count=" + count + ", allnumber=" + allnumber + ", daynumber=" + daynumber + ", commentnumber="
			+ commentnumber + ", collectnumber=" + collectnumber + ", supportnumber=" + supportnumber
			+ ", againstnumber=" + againstnumber + ", name=" + name + ", url=" + url + ", eplsodenumber="
			+ eplsodenumber + "]";
}


}
