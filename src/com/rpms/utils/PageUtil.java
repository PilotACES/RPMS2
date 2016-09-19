package com.rpms.utils;

import java.util.List;

public class PageUtil {
	
	private String tableName;//����
	
	private String columns;//��Ҫ��ѯ��������
	
	private String whereStr;//��ѯ����
	
	private String orderString;//��������
	
	private int pageSize;//ÿҳ��¼��

	private int currentPage;//��ǰҳ��
	
	private int totalSize;//�ܼ�¼��
	
	private int totalPage;//��ҳ��
	
	private int first=1;//��һҳ
	
	private int previous;//��һҳ
	
	private int next;//��һҳ
	
	private int last;//���һҳ
	
	private List date;//��ѯ�������м�¼����

	
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
