package com.yueqian.cn.util;

import java.util.List;

public class Page<T> {
	private int currentPage;
	private int pageSize;
	private int totalPage;
	private int totalCount;
	private List<T> lists;

	public Page() {
		super();
	}

	public Page(int currentPage, int pageSize, int totalCount, List<T> lists) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.lists = lists;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		totalPage = (totalCount % pageSize) == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
		return totalPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getLists() {
		return lists;
	}

	public void setLists(List<T> lists) {
		this.lists = lists;
	}

}
