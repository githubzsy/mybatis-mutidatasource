package com.zhoushiya.mybatismutidatasource.generator.testdb.service.impl;

import com.zhoushiya.mybatismutidatasource.generator.testdb.entity.Article;
import com.zhoushiya.mybatismutidatasource.generator.testdb.mapper.ArticleMapper;
import com.zhoushiya.mybatismutidatasource.generator.testdb.service.IArticleService;
import com.zhoushiya.mybatismutidatasource.generator.testdb.vo.ArticleVO;
import com.zhoushiya.mybatismutidatasource.utils.DozerUtils;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhoushiya
 * @since 2020-04-30
 */
@Service
public class ArticleServiceImpl implements IArticleService {

    @Resource
    ArticleMapper articleMapper;

    @Resource
    private Mapper mapper;

    public ArticleVO insert(ArticleVO articleVO) {
        Article article= mapper.map(articleVO,Article.class);
        articleMapper.insert(article);
        return articleVO;
    }

    @Override
    public ArticleVO getById(long id) {
        Article article = articleMapper.getById(id);
        ArticleVO articleVO= mapper.map(article,ArticleVO.class);
        return articleVO;
    }

    @Override
    public List<ArticleVO> getAll() {
        List<Article> articles = articleMapper.getAll();
        List<ArticleVO> articleVOS= DozerUtils.mapList(articles,ArticleVO.class);
        return articleVOS;
    }
}
