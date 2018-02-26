package com.dudu.util;

import tk.mybatis.mapper.common.*;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * 继承自己的MyMapper
 *
 * @author
 * @since 2017-06-26 21:53
 */

public interface MyMapper<T>
        extends
        BaseMapper<T>,
        ConditionMapper<T>,
        IdsMapper<T>,
        InsertListMapper<T> {
}
