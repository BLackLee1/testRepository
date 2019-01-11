package com.yueqian.cn.dao.entity;

import java.util.HashSet;
import java.util.Set;

public class Category {
	private Integer id;
	private String name;
	private Integer parent_id;
	private Set<Category> children = new HashSet<Category>();
	private Category parent;

	public Category() {
		super();
	}

	public Category(Integer id, String name, Integer parent_id, Set<Category> children, Category parent) {
		super();
		this.id = id;
		this.name = name;
		this.parent_id = parent_id;
		this.children = children;
		this.parent = parent;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public Set<Category> getChildren() {
		return children;
	}

	public void setChildren(Set<Category> children) {
		this.children = children;
	}

	public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", parent_id=" + parent_id + ", children=" + children
				+ ", parent=" + parent + "]";
	}

}
