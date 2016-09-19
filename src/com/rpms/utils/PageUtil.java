package com.rpms.utils;

import java.util.List;

public class PageUtil {
	
	private String tableName;//表名
	
	private String columns;//需要查询的条件名
	
	private String whereStr;//查询条件
	
	private String orderString;//排序条件
	
	private int pageSize;//每页记录数

	private int currentPage;//当前页码
	
	private int totalSize;//总记录数
	
	private int totalPage;//总页数
	
	private int first=1;//第一页
	
	private int previous;//上一页
	
	private int next;//下一页
	
	private int last;//最后一页
	
	private List date;//查询出的所有记录集合

	
	public PageUtil(int pageSize, int currentPage) {
		super();
		this.pageSize = pageSize;
		this.currentPage = currentPage;
	}


	public PageUtil(String whereStr, String orderString, int pageSize, int currentPage) {
		super();
		this.whereStr = whereStr;
		this.orderString = orderString;
		this.pageSize = pageSize;
		this.currentPage = currentPage;
	}


	public PageUtil(String tableName, String columns, String whereStr, String orderString, int pageSize,
			int currentPage) {
		super();
		this.tableName = tableName;
		this.columns = columns;
		this.whereStr = whereStr;
		this.orderString = orderString;
		this.pageSize = pageSize;
		this.currentPage = currentPage;
	}
	
	


	public PageUtil(int pageSize, int currentPage, int totalSize, int totalPage, int first, int previous, int next,
			int last, List date) {
		this.pageSize = pageSize;
		this.currentPage = currentPage;
		this.totalSize = totalSize;
		this.totalPage = totalPage;
		this.first = first;
		this.previous = previous;
		this.next = next;
		this.last = last;
		this.date = date;
	}


	public String getTableName() {
		return tableName;
	}


	public void setTableName(String tableName) {
		this.tableName = tableName;
	}


	public String getColumns() {
		return columns;
	}


	public void setColumns(String columns) {
		this.columns = columns;
	}


	public String getWhereStr() {
		return whereStr;
	}


	public void setWhereStr(String whereStr) {
		this.whereStr = whereStr;
	}


	public String getOrderString() {
		return orderString;
	}


	public void setOrderString(String orderString) {
		this.orderString = orderString;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public int getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	public int getTotalSize() {
		return totalSize;
	}


	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}


	public int getTotalPage() {
		return totalPage;
	}


	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}


	public int getFirst() {
		return first;
	}


	public void setFirst(int first) {
		this.first = first;
	}


	public int getPrevious() {
		return previous;
	}


	public void setPrevious(int previous) {
		this.previous = previous;
	}


	public int getNext() {
		return next;
	}


	public void setNext(int next) {
		this.next = next;
	}


	public int getLast() {
		return last;
	}


	public void setLast(int last) {
		this.last = last;
	}


	public List getDate() {
		return date;
	}


	public void setDate(List date) {
		this.date = date;
	}
	
	
	
	
	

}
