package org.bk.consumer.domain;

public class ErrorInfo {
	private String page;
	private String pageSize;
	private String payload;
	public ErrorInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorInfo(String page, String pageSize, String payload) {
		super();
		this.page = page;
		this.pageSize = pageSize;
		this.payload = payload;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	
	
}
