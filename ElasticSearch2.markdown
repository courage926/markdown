# Ik分词器
针对中文的分词

<img alt="ElasticSearch2-379c3e55.png" src="assets/ElasticSearch2-379c3e55.png" width="" height="" >

需要重启
<img alt="ElasticSearch2-efe92a1f.png" src="assets/ElasticSearch2-efe92a1f.png" width="" height="" >
默认分词,一个字一个字

<img alt="ElasticSearch2-3ab9ce89.png" src="assets/ElasticSearch2-3ab9ce89.png" width="" height="" >

<img alt="ElasticSearch2-6c25587d.png" src="assets/ElasticSearch2-6c25587d.png" width="" height="" >

<img alt="ElasticSearch2-d2934bef.png" src="assets/ElasticSearch2-d2934bef.png" width="" height="" >

<img alt="ElasticSearch2-09bbb652.png" src="assets/ElasticSearch2-09bbb652.png" width="" height="" >

test可以继续被分词
keyword不能再分词
<img alt="ElasticSearch2-ebc50a1d.png" src="assets/ElasticSearch2-ebc50a1d.png" width="" height="" >

<img alt="ElasticSearch2-d0a3009e.png" src="assets/ElasticSearch2-d0a3009e.png" width="" height="" >

<img alt="ElasticSearch2-4dc0fa67.png" src="assets/ElasticSearch2-4dc0fa67.png" width="" height="" >

# 中文搜索
自定义mapping
<img alt="ElasticSearch2-67cbd86a.png" src="assets/ElasticSearch2-67cbd86a.png" width="" height="" >

<img alt="ElasticSearch2-a8957ca3.png" src="assets/ElasticSearch2-a8957ca3.png" width="" height="" >

三个都能查出来了
默认的分词器没有这种效果

# Spring Data Elasticsearch
<img alt="ElasticSearch2-5db961ee.png" src="assets/ElasticSearch2-5db961ee.png" width="" height="" >

<img alt="ElasticSearch2-35e7607e.png" src="assets/ElasticSearch2-35e7607e.png" width="" height="" >

```
Document注解,配置映射到es服务器中的信息
包括索引.类型/映射(在字段上贴注解)
```
```
@Id //该字段是文档的_id
private Long id;
@Field(type=FieldType.Text,...)
private String name;

private Integer age;
```
domain
<img alt="ElasticSearch2-12d8b76a.png" src="assets/ElasticSearch2-12d8b76a.png" width="" height="" >

application.properties
```
# 配置连接es集群点名称
# 默认值
spring.data.elasticsearch.cluster-name=elasticsearch
# 配置地址
spring.data.elasticsearch.cluster-nodes=localhost:9200
```

<img alt="ElasticSearch2-abd15ef3.png" src="assets/ElasticSearch2-abd15ef3.png" width="" height="" >

# EsRespository 和 EsTemplate 分工

<img alt="ElasticSearch2-c7d5dabe.png" src="assets/ElasticSearch2-c7d5dabe.png" width="" height="" >

<img alt="ElasticSearch2-857f85a4.png" src="assets/ElasticSearch2-857f85a4.png" width="" height="" >

<img alt="ElasticSearch2-24dca653.png" src="assets/ElasticSearch2-24dca653.png" width="" height="" >

<img alt="ElasticSearch2-d04ead40.png" src="assets/ElasticSearch2-d04ead40.png" width="" height="" >

<img alt="ElasticSearch2-8079739b.png" src="assets/ElasticSearch2-8079739b.png" width="" height="" >

<img alt="ElasticSearch2-f6922305.png" src="assets/ElasticSearch2-f6922305.png" width="" height="" >

<img alt="ElasticSearch2-e901b6e7.png" src="assets/ElasticSearch2-e901b6e7.png" width="" height="" >

<img alt="ElasticSearch2-3dd60655.png" src="assets/ElasticSearch2-3dd60655.png" width="" height="" >

<img alt="ElasticSearch2-068c45eb.png" src="assets/ElasticSearch2-068c45eb.png" width="" height="" >

<img alt="ElasticSearch2-3b32e1bd.png" src="assets/ElasticSearch2-3b32e1bd.png" width="" height="" >

分词器不一致
<img alt="ElasticSearch2-2dcfa75d.png" src="assets/ElasticSearch2-2dcfa75d.png" width="" height="" >

<img alt="ElasticSearch2-6cf831c5.png" src="assets/ElasticSearch2-6cf831c5.png" width="" height="" >

<img alt="ElasticSearch2-7caaf6bd.png" src="assets/ElasticSearch2-7caaf6bd.png" width="" height="" >
