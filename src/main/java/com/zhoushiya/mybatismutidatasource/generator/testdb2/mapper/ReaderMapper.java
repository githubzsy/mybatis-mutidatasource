package com.zhoushiya.mybatismutidatasource.generator.testdb2.mapper;

import com.zhoushiya.mybatismutidatasource.generator.testdb2.entity.Reader;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhoushiya
 * @since 2020-05-06
 */
public interface ReaderMapper {
    int insert(Reader reader);

    List<Reader> getAll();
}
