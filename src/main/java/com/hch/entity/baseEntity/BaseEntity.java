package com.hch.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

/*
 * ʵ�������
 */
public abstract class BaseEntity<E> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * Ψһ��־
	 */
	private String id;
	/*
	 * ɾ����־��0:δɾ����1��ɾ�������ڻ���վ���գ���2������ɾ����Ĭ��0
	 */
	private Integer deletedFlag;
	/*
	 * ��˱�־��false:δ��ˣ�true:��ˣ�Ĭ��false
	 */
	private Boolean checkedFlag;
	/*
	 * ��������
	 */
	private Date createDate;
	/*
	 * �޸�����
	 */
	private Date editorDate;
	/*
	 * ɾ������
	 */
	private Date deleteDate;
	/*
	 * �������
	 */
	private Date checkDate;

	public BaseEntity() {
		this.deletedFlag = 0;
		this.checkedFlag = false;
	}

	/*
	 * ��������ǰʵ�ֵķ���
	 */
	public abstract void preInsert();

	/*
	 * ��������ǰʵ�ֵķ���
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
