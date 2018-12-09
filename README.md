# mye3

#### 项目介绍
宜立方商城学习项目

#### 软件架构
- 采用soa架构
- 后台:Spring + SpringMvc + Mybatis + Maven
- 数据库: Mysql + Redis
- 消息中间件: ActiveMQ
- RPC框架: Dubbo + Zookeeper 

![](https://raw.githubusercontent.com/xia45399/mye3/master/jiagou.png)

#### 使用说明

服务层
- manage-service 商品服务 8181
- content-service 内容服务 8182
- sso-service 单点登陆  8183

表现层
- manage-web 后台管理系统 8081
- portable-web 商城门户系统 8082
- sso-web 登陆统 8083
- search-web 搜索 8085
- item-web 商品详情页面 8086


