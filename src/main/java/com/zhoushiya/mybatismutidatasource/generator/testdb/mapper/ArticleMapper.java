package com.zhoushiya.mybatismutidatasource.generator.testdb.mapper;

import com.zhoushiya.mybatismutidatasource.generator.testdb.entity.Article;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhoushiya
 * @since 2020-04-30
 */
public interface ArticleMapper {
    int insert(Article article);

    Article getById(long id);

    List<Article> getAll();
}
