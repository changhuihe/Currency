package com.hch.service.baseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hch.dao.baseDao.BaseDao;
import com.hch.entity.baseEntity.BaseEntity;

/*
 * 业务层抽象类
 * @Service业务层组件注解
 */
@Service
public abstract class BaseService<E extends BaseEntity<E>, D extends BaseDao<E>> {
	/*
	 * 注入持久层对象
	 */
	@Autowired
	protected D dao;

	/*
	 * 通过Id获取单条数据
	 */
	public E get(String id) {
		return dao.get(id);
	}

}
