package com.zhoushiya.mybatismutidatasource.generator.testdb2.controller;

import com.zhoushiya.mybatismutidatasource.generator.testdb2.entity.Reader;
import com.zhoushiya.mybatismutidatasource.generator.testdb2.service.IReaderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhoushiya
 * @since 2020-05-06
 */
@RestController
@RequestMapping("/rest")
public class ReaderController {
    @Resource
    IReaderService readerService;

    @GetMapping("/reader")
    public List<Reader> GetAll() {
        List<Reader> readers = readerService.getAll();
        return readers;
    }
}
