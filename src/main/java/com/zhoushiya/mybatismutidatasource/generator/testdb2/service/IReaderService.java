package com.zhoushiya.mybatismutidatasource.generator.testdb2.service;


import com.zhoushiya.mybatismutidatasource.generator.testdb2.entity.Reader;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoushiya
 * @since 2020-05-06
 */
public interface IReaderService{
    List<Reader> getAll();
}
