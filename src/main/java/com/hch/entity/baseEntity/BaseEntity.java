package com.hch.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

/*
 * 实体抽象类
 */
public abstract class BaseEntity<E> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * 唯一标志
	 */
	private String id;
	/*
	 * 删除标志，0:未删除，1：删除（可在回收站回收），2：彻底删除，默认0
	 */
	private Integer deletedFlag;
	/*
	 * 审核标志，false:未审核，true:审核，默认false
	 */
	private Boolean checkedFlag;
	/*
	 * 创建日期
	 */
	private Date createDate;
	/*
	 * 修改日期
	 */
	private Date editorDate;
	/*
	 * 删除日期
	 */
	private Date deleteDate;
	/*
	 * 审核日期
	 */
	private Date checkDate;

	public BaseEntity() {
		this.deletedFlag = 0;
		this.checkedFlag = false;
	}

	/*
	 * 插入数据前实现的方法
	 */
	public abstract void preInsert();

	/*
	 * 更新数据前实现的方法
	 */
	public abstract void preUpdate();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getDeletedFlag() {
		return deletedFlag;
	}

	public void setDeletedFlag(Integer deletedFlag) {
		this.deletedFlag = deletedFlag;
	}

	public Boolean getCheckedFlag() {
		return checkedFlag;
	}

	public void setCheckedFlag(Boolean checkedFlag) {
		this.checkedFlag = checkedFlag;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getEditorDate() {
		return editorDate;
	}

	public void setEditorDate(Date editorDate) {
		this.editorDate = editorDate;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	@Override
	public String toString() {
		return "id=" + id + ", deletedFlag=" + deletedFlag + ", checkedFlag=" + checkedFlag + ", createDate="
				+ createDate + ", editorDate=" + editorDate + ", deleteDate=" + deleteDate + ", checkDate=" + checkDate;
	}

}
