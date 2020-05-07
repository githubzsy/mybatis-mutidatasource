package com.zhoushiya.mybatismutidatasource.generator.testdb2.service.impl;

import com.zhoushiya.mybatismutidatasource.generator.testdb2.entity.Reader;
import com.zhoushiya.mybatismutidatasource.generator.testdb2.mapper.ReaderMapper;
import com.zhoushiya.mybatismutidatasource.generator.testdb2.service.IReaderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhoushiya
 * @since 2020-05-06
 */
@Service
public class ReaderServiceImpl implements IReaderService {

    @Resource
    ReaderMapper readerMapper;

    @Override
    public List<Reader> getAll() {
        return readerMapper.getAll();
    }
}
