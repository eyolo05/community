
## 项目介绍

本项目是一个开源的社区论坛系统，采用 Spring Boot 作为主框架，结合 MyBatis、Redis、Elasticsearch、Kafka 等主流技术，实现了用户管理、帖子发布与分页、评论与点赞、私信系统、全文搜索、消息队列处理等模块，旨在打造一个简洁、高效、易用的在线社区平台。

## 项目结构

```
src
├── main
│   ├── java
│   │   └── com.example.forum
│   │       ├── controller 
│   │       ├── service 
│   │       ├── dao    
│   │       ├── entity   
│   │       ├── config  
│   │       ├── util    
│   │       └── event   
│   └── resources
│       ├── templates
│       ├── static      
│       └── application.properties   
└── test                     
```

## 主要功能

### 用户模块

- 注册、登录、登出
- 邮箱验证、账号激活
- 账号密码修改，头像上传
- 账号权限管理
### 帖子模块

- 发布帖子、查看帖子详情页
- 帖子分页显示
- 帖子置顶、加精、删除（需管理员权限）
### 评论与互动

- 对帖子/评论进行回复
- 点赞帖子/评论
- 点赞、评论、关注消息通知

### 私信系统

- 发送私信、回复私信
- 查看私信详情页
- 私信列表分页显示
- 未读消息计数

### 搜索功能

- 基于 Elasticsearch 实现帖子全文检索
- 高亮显示关键词

### 系统优化

- 使用 Redis 实现点赞、关注、热点缓存
- 使用 Kafka 处理异步事件（评论、点赞、系统通知）
- 使用 Quartz 实现热门帖子定时计算

## 项目依赖

- JDK 8
- Maven 3.9+
- MySQL 8.0+
- Redis 3.2+
- Elasticsearch 6.4+
- Kafka 2.12+

## 待优化

- 增加第三方登录（微信、GitHub）
- 帖子支持图片上传
- 前后端分离
