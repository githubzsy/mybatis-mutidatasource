1. ArticleServiceImpl.insert 加了事务，并且尝试像testdb.article和testdb2.reader中同时写入数据
2. 访问 http://localhost:12350/swagger-ui.html ,调用/rest/article接口添加数据
3. 因为 ArticleServiceImpl.insert 中加了个人为除以0的异常,所以两条数据都不会写入成功
4. 如果成功了,请检查你的表是否支持事务