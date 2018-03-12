package com.hch.service.baseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hch.dao.baseDao.BaseDao;
import com.hch.entity.baseEntity.BaseEntity;

/*
 * ҵ��������
 * @Serviceҵ������ע��
 */
@Service
public abstract class BaseService<E extends BaseEntity<E>, D extends BaseDao<E>> {
	/*
	 * ע��־ò����
	 */
	@Autowired
	protected D dao;

	/*
	 * ͨ��Id��ȡ��������
	 */
	public E get(String id) {
		return dao.get(id);
	}

}
