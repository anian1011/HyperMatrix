package com.hypermatrix.entity;

import java.util.Date;
import org.springframework.stereotype.Component;
/**
 * 新闻实体类
 * @author wanqihan 2016年5月28日
 *
 */
@Component
public class News {
	//新闻id
	private Integer nid;
	//新闻标题
	private String title;
	//创建时间
	private Date createTime;
	//作者
	private String author;
	//正文
	private String context;
	
	
	public Integer getNid() {
		return nid;
	}
	public void setNid(Integer nid) {
		this.nid = nid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public News() {
		super();
	}
	public News(Integer nid, String title, Date createTime, String author, String context) {
		super();
		this.nid = nid;
		this.title = title;
		this.createTime = createTime;
		this.author = author;
		this.context = context;
	}
	@Override
	public String toString() {
		return "News [nid=" + nid + ", title=" + title + ", createTime=" + createTime + ", author=" + author
				+ ", context=" + context + "]";
	}
	
	
}
