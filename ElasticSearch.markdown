# navicat 12 连接mongdb

# ElasticSearch
<img alt="ElasticSearch-c8f32890.png" src="assets/ElasticSearch-c8f32890.png" width="" height="" >

不擅长增删改,擅长查询

# ES中的基本概念
lucene 全文检索
solr 企业级搜索应用服务器

<img alt="ElasticSearch-839e786e.png" src="assets/ElasticSearch-839e786e.png" width="" height="" >

ELK

# 安装
elasticSearch解压
.bat

<img alt="ElasticSearch-27f94695.png" src="assets/ElasticSearch-27f94695.png" width="" height="" >

# 后台启动
<img alt="ElasticSearch-90402bf1.png" src="assets/ElasticSearch-90402bf1.png" width="" height="" >

注册到服务列表,设置为开机启动

<img alt="ElasticSearch-06828dfc.png" src="assets/ElasticSearch-06828dfc.png" width="" height="" >



<img alt="ElasticSearch-6c81fdad.png" src="assets/ElasticSearch-6c81fdad.png" width="" height="" >

<img alt="ElasticSearch-a73ade7d.png" src="assets/ElasticSearch-a73ade7d.png" width="" height="" >

<img alt="ElasticSearch-24cb9a8f.png" src="assets/ElasticSearch-24cb9a8f.png" width="" height="" >

<img alt="ElasticSearch-10c05b2b.png" src="assets/ElasticSearch-10c05b2b.png" width="" height="" >

# 操作
<img alt="ElasticSearch-96c8e7e9.png" src="assets/ElasticSearch-96c8e7e9.png" width="" height="" >

默认5个分片 1个备份

<img alt="ElasticSearch-80f9ebc0.png" src="assets/ElasticSearch-80f9ebc0.png" width="" height="" >

版本号会一直递增

# 排序
<img alt="ElasticSearch-12b6eb00.png" src="assets/ElasticSearch-12b6eb00.png" width="" height="" >

# 分页
<img alt="ElasticSearch-43351481.png" src="assets/ElasticSearch-43351481.png" width="" height="" >

# 练习
<img alt="ElasticSearch-55526ac2.png" src="assets/ElasticSearch-55526ac2.png" width="" height="" >

<img alt="ElasticSearch-5c33848d.png" src="assets/ElasticSearch-5c33848d.png" width="" height="" >

<img alt="ElasticSearch-21ff9cfd.png" src="assets/ElasticSearch-21ff9cfd.png" width="" height="" >

<img alt="ElasticSearch-94a0362d.png" src="assets/ElasticSearch-94a0362d.png" width="" height="" >


<img alt="ElasticSearch-b6b45bbe.png" src="assets/ElasticSearch-b6b45bbe.png" width="" height="" >

<img alt="ElasticSearch-2de86a43.png" src="assets/ElasticSearch-2de86a43.png" width="" height="" >

<img alt="ElasticSearch-e30c1914.png" src="assets/ElasticSearch-e30c1914.png" width="" height="" >

# 高级查询
<img alt="ElasticSearch-e79a7325.png" src="assets/ElasticSearch-e79a7325.png" width="" height="" >

理清楚层级关系

json格式 有key就有value

一般不会查全部
<img alt="ElasticSearch-13230ead.png" src="assets/ElasticSearch-13230ead.png" width="" height="" >

# 投影查询
数据分析上用的较多
<img alt="ElasticSearch-b99578ee.png" src="assets/ElasticSearch-b99578ee.png" width="" height="" >

# 检索查询
term 精确匹配
match_phrase 短语检索
match 全文检索

<img alt="ElasticSearch-858fd1ca.png" src="assets/ElasticSearch-858fd1ca.png" width="" height="" >
只有match这种匹配方式能查出来
因为是全文检索

<img alt="ElasticSearch-9cedfc72.png" src="assets/ElasticSearch-9cedfc72.png" width="" height="" >

<img alt="ElasticSearch-8308ecbe.png" src="assets/ElasticSearch-8308ecbe.png" width="" height="" >

*区别*:第三个是全文检索
<img alt="ElasticSearch-e702fed7.png" src="assets/ElasticSearch-e702fed7.png" width="" height="" >

# 逻辑查询
<img alt="ElasticSearch-055b8c92.png" src="assets/ElasticSearch-055b8c92.png" width="" height="" >

<img alt="ElasticSearch-17ed4294.png" src="assets/ElasticSearch-17ed4294.png" width="" height="" >

# 范围查询
要用过滤filter
范围的比较规则
<img alt="ElasticSearch-82ae2079.png" src="assets/ElasticSearch-82ae2079.png" width="" height="" >


<img alt="ElasticSearch-723d6d08.png" src="assets/ElasticSearch-723d6d08.png" width="" height="" >

<img alt="ElasticSearch-5e7248cf.png" src="assets/ElasticSearch-5e7248cf.png" width="" height="" >

<img alt="ElasticSearch-440d5fad.png" src="assets/ElasticSearch-440d5fad.png" width="" height="" >

<img alt="ElasticSearch-26d08129.png" src="assets/ElasticSearch-26d08129.png" width="" height="" >

<img alt="ElasticSearch-ed41ca0c.png" src="assets/ElasticSearch-ed41ca0c.png" width="" height="" >


# 练习
<img alt="ElasticSearch-d68420f7.png" src="assets/ElasticSearch-d68420f7.png" width="" height="" >
```
# 查询rbac
GET /rbac/employee/_search
{
  "query": {
    "match": {
      "name": "zhang"
    }
  }
}

GET /rbac/employee/_search
{
  "query": {
    "bool": {
      "must": [
        {"match": {
          "name": "zhang"
        }},
        {"match": {
          "age": 26
        }}
      ]
    }
  }
}

GET /rbac/employee/_search
{
  "query": {
    "bool": {
      "should": [
        {"match": {
          "name": "zhang"
        }},
        {"match": {
          "age": 33
        }}
      ]
    }
  }
}

GET /rbac/employee/_search
{
  "query": {
    "bool": {"filter": [
      {"term":{"name":"zhang"}},
      {"range": {"age": {"gte": 26,"lte": 33}}}
      ]
    }
  }
}


GET /rbac/employee/_search
{
  "query": {
    "bool": {
      "must": [
       {"match": {
         "name": "zhang"
       }}
      ],
      "filter": [
      {"range": {"age": {"gte": 26,"lte": 33}}}
      ]
    }
  }
}
```
<img alt="ElasticSearch-2242a0e4.png" src="assets/ElasticSearch-2242a0e4.png" width="" height="" >

<img alt="ElasticSearch-c0ea40a3.png" src="assets/ElasticSearch-c0ea40a3.png" width="" height="" >

filter有缓存效果,
用于大数据分析,
比如:↓
<img alt="ElasticSearch-924a2b47.png" src="assets/ElasticSearch-924a2b47.png" width="" height="" >


# 分组查询
查询结果会出现新的篇章
aggs 桶聚合

<img alt="ElasticSearch-f81acdb0.png" src="assets/ElasticSearch-f81acdb0.png" width="" height="" >

<img alt="ElasticSearch-1e6e6385.png" src="assets/ElasticSearch-1e6e6385.png" width="" height="" >

带引号的是常量
不带引号的是变量

分组的结果:
<img alt="ElasticSearch-9bd55054.png" src="assets/ElasticSearch-9bd55054.png" width="" height="" >

不显示参与分组的数据
<img alt="ElasticSearch-b6ef5fd2.png" src="assets/ElasticSearch-b6ef5fd2.png" width="" height="" >

<img alt="ElasticSearch-448bbbb8.png" src="assets/ElasticSearch-448bbbb8.png" width="" height="" >

# 分组查询全状态
<img alt="ElasticSearch-15cd90d7.png" src="assets/ElasticSearch-15cd90d7.png" width="" height="" >

# 批量查询
<img alt="ElasticSearch-c774f845.png" src="assets/ElasticSearch-c774f845.png" width="" height="" >

# 批量增删改
<img alt="ElasticSearch-56bbe4fb.png" src="assets/ElasticSearch-56bbe4fb.png" width="" height="" >


<img alt="ElasticSearch-93593d51.png" src="assets/ElasticSearch-93593d51.png" width="" height="" >

<img alt="ElasticSearch-e12ef71e.png" src="assets/ElasticSearch-e12ef71e.png" width="" height="" >

<img alt="ElasticSearch-ba5efa69.png" src="assets/ElasticSearch-ba5efa69.png" width="" height="" >

# 手写:
<img alt="ElasticSearch-c4dc5c4f.png" src="assets/ElasticSearch-c4dc5c4f.png" width="" height="" >

<img alt="ElasticSearch-38e58b56.png" src="assets/ElasticSearch-38e58b56.png" width="" height="" >

<img alt="ElasticSearch-6572bce9.png" src="assets/ElasticSearch-6572bce9.png" width="" height="" >

<img alt="ElasticSearch-35c7f7e2.png" src="assets/ElasticSearch-35c7f7e2.png" width="" height="" >

```



GET /rbac/employee/_search
{
  "query": {
    "match": {
      "name": "zhang"
    }
  }
}

GET /rbac/employee/_search
{
  "query": {
    "bool": {
      "must": [
        {"match": {
          "name": "zhang"
        }},
        {"match": {
          "age": 26
        }}
      ]
    }
  }
}

GET /rbac/employee/_search
{
  "query": {
    "bool": {
      "should": [
        {"match": {
          "name": "zhang"
        }},
        {"match": {
          "age": 33
        }}
      ]
    }
  }
}




GET /rbac/employee/_search
{
  "query": {
    "bool": {"filter": [
      {"term":{"name":"zhang"}},
      {"range": {"age": {"gte": 26,"lte": 33}}}
      ]
    }
  }
}


GET /rbac/employee/_search
{
  "query": {
    "bool": {
      "must": [
       {"match": {
         "name": "zhang"
       }}
      ],
      "filter": [
      {"range": {"age": {"gte": 26,"lte": 33}}}
      ]
    }
  }
}








POST /rbac/employee/_bulk
{"create":{"_id": 1}}
{"id":1,"name":"super user admin","age":28,"deptId":1}
{"create":{"_id": 2}}
{"id":2,"name":"wang ni ma","age":32,"deptId":1}
{"create":{"_id": 3}}
{"id":3,"name":"zhang quan dan","age":33,"deptId":1}
{"create":{"_id": 4}}
{"id":4,"name":"zhang kun","age":26,"deptId":2}
{"create":{"_id": 5}}
{"id":5,"name":"wang xiao liang","age":33,"deptId":2}
{"create":{"_id": 6}}
{"id":6,"name":"cai xv kun","age":29,"deptId":3}
{"create":{"_id": 7}}
{"id":7,"name":"jia nai liang","age":25,"deptId":3}
{"create":{"_id": 8}}
{"id":8,"name":"fu rong wang","age":28,"deptId":1}
{"create":{"_id": 9}}
{"id":9,"name":"wang da","age":31,"deptId":2}
{"create":{"_id": 10}}
{"id":10,"name":"da wang","age":32,"deptId":3}



PUT /rbac/employee/1
{
  "name":"bunny",
  "age":18
}


GET /rbac/employee/_search
{
  "query": {
    "match": {
      "id": 2
    }
  }
}





POST /rbac/employee/1
{   
    "id":1,
    "name":"da wang",
    "age":81,
    "deptId":1
}


GET /rbac/employee/_search
{
  "sort": [
    {
      "id": {
        "order": "desc"
      }
    }
  ]
}


GET /rbac/employee/_search
{
  "from": 0,
  "size": 3
}


POST rbac/employee
{
  "id":22,
  "name":"wang xiao ming",
  "age":81,
  "deptId":3
}

PUT rbac/employee/tTw5rWsBeK4MSs1lG9pm
{
  "id":22,
  "name":"wang xiao lang",
  "age":88,
  "deptId":3
}

GET rbac/employee/tTw5rWsBeK4MSs1lG9pm

DELETE rbac/employee/tTw5rWsBeK4MSs1lG9pm

GET rbac/employee/_search
{
  "sort": [
    {
      "age": {
        "order": "desc"

      }
    }
  ]
}

GET rbac/employee/_search
{
  "from": 3,
  "size": 3
}

GET rbac/employee/_search
{
  "query": {
    "match_all": {}
  }
}

GET rbac/employee/_search
{
  "_source": ["age","name"]
}


GET rbac/employee/_search
{
  "query": {
    "match": {
      "name": "wang da"
    }
  }
}

GET rbac/employee/_search
{
  "query": {
    "term": {"name": "wang da"}
  }
}


GET rbac/employee/_search
{
  "query": {
    "match_phrase": {
      "name": "wang da"
    }
  }
}



GET rbac/employee/_search
{
  "query": {
    "bool": {
      "must":[
        {"match":{"name":"wang"}},
        {"match":{"name":"da"}}
        ]
        ,
        "should": [
          {"match": {"name": "wang"}},
          {"match": {"name": "da"}
          }
        ]
    }
  }
}

GET rbac/employee/_search
{
  "query": {
    "bool": {
      "filter": [
          {"match":{"name":"wang"}},
          {"range":{"age":{"gt":30}}}
        ]
    }
  }
}


GET rbac/employee/_search
{
  "query": {
    "match": {
      "name": "zhang"
    }
  }
}

GET rbac/employee/_search
{
  "query": {
    "bool": {
      "must": [
        {"match": {
          "name": "zhang"
        }},{
          "match": {
            "age": 26
          }
        }
      ]
    }
  }
}


GET rbac/employee/_search
{
  "query": {
    "bool": {
      "should": [
        {
          "match": {
            "name": "zhang"
          }
        },{
          "term": {
            "age": {
              "value": 33
            }
          }
        }
      ]
    }
  }
}



GET rbac/employee/_search
{
  "query": {
    "bool": {
      "must": [
        {"match": {
          "name": "zhang"
        }}
      ],"filter": {
        "range": {
          "age": {
            "gte": 26,
            "lte": 33
          }
        }
      }
    }
  }
}

GET rbac/employee/_search
{
  "size": 0,
  "aggs": {
    "deptId": {
      "terms": {
        "field": "deptId"
      }
    }
  }
}

GET rbac/employee/_search
{
  "size": 0,
  "aggs": {
    "一个别名": {
      "terms": {
        "field": "deptId",
        "size": 10
      },
      "aggs": {
        "部门人数": {
          "value_count": {
            "field": "deptId"
          }
        }
      }
    }
  }
}

GET rbac/employee/_search
{
  "size": 0,
  "aggs": {
    "按部门分组": {
      "terms": {
        "field": "deptId",
        "size": 10
      },
      "aggs": {
        "平均年龄": {
          "avg": {
            "field": "age"
          }
        }
      }
    }
  }
}


GET rbac/employee/_search
{
  "size": 0,
  "aggs": {
    "按部门分组": {
      "terms": {
        "field": "deptId",
        "size": 10
      },
      "aggs": {
        "年龄统计": {
          "stats": {
            "field": "age"
          }
        }
      }
    }
  }
}

GET rbac/employee/_mget
{
  "docs":[
    {"_id":1},
    {"_id":2},
    {"_id":3}
    ]
}


DELETE rbac/employee/5

POST rbac/employee/_bulk
{"create":{"_id":"dsa"}}
{"id":56,"name":"dada","age":18}
{"create": {"_id":59}}
{"id":57,"name":"mama","age":19}
{"update": {"_id":56}}
{"doc":{"name":"kaka"}}





PUT /esdemo

PUT /rbac

DELETE /rbac

DELETE /esdemo

PUT /esdemo/user/1
{
  "name":"bunny",
  "age":18
}

POST /esdemo/user
{
  "name":"liang",
  "age":20
}

GET /esdemo/user/2

GET /esdemo/user/_search

POST /esdemo/user/1
{
   "name":"bunny",
  "age":20
}


# 增加
PUT /esdemo/user/3
{
  "name":"lao李",
  "age":99
}

GET /esdemo/user/2

DELETE /esdemo/user/2

POST /esdemo/user/2
{
  "name":"李楚熙",
  "age":99
}




# 1：使用POST方法往rbac/employee中加入一个文档，文档具有id,name,age,deptId属性
# 2：使用PUT方法基于文档ID更新一个文档
# 3：使用GET方法基于文档ID查询一个文档
# 4：使用DELETE方法基于文档ID删除一个文档
# 5：查询rbac/employee中的所有文档，按照年龄排序
# 6：分页查询rbac/employee中的文档，每页显示3个，显示第2页


# 1：查询rbac/employee中所有name含有zhang的文档
# 2：查询rbac/employee中所有name含有zhang并且age=26的文档
# 3：查询rbac/employee中所有name含有zhang或者age=33的文档
# 4：查询rbac/employee中所有name含有zhang并且26<=age<=33的文档


# 1：按照部门编号分组，统计文档数量
# 2：按照部门编号分组，统计各部门的平均年龄
# 3：按照部门编号分组，统计各部门的年龄状态





# 1：使用POST方法往rbac/employee中加入一个文档，文档具有id,name,age,deptId属性
POST rbac/employee/
{
  "id":88,
  "name":"AA",
  "age":88,
  "deptId":2
}
# 2：使用PUT方法基于文档ID更新一个文档
PUT rbac/employee/88
{
  "id":88,
  "name":"BB",
  "age":88,
  "deptId":2
}

# 3：使用GET方法基于文档ID查询一个文档
GET rbac/employee/88

# 4：使用DELETE方法基于文档ID删除一个文档
DELETE rbac/employee/88

# 5：查询rbac/employee中的所有文档，按照年龄排序
GET rbac/employee/_search
{
  "sort": [
    {
      "age": {
        "order": "desc"
      }
    }
  ]
}

# 6：分页查询rbac/employee中的文档，每页显示3个，显示第2页
GET rbac/employee/_search
{
  "from": 3,
  "size": 3
}

# 1：查询rbac/employee中所有name含有zhang的文档
GET rbac/employee/_search
{
  "query": {
    "match": {
      "name": "zhang"
    }
  }
}
# 2：查询rbac/employee中所有name含有zhang并且age=26的文档
GET rbac/employee/_search
{
  "query": {
    "bool": {
      "must": [
        {"match": {
          "name": "zhang"
        }},{"match": {
          "age": 26
        }}
      ]
    }
  }
}
# 3：查询rbac/employee中所有name含有zhang或者age=33的文档
GET rbac/employee/_search
{
  "query": {
    "bool": {
      "should": [
        {"match": {
          "name": "zhang"
        }},{"match": {
          "age": 33
        }}
      ]
    }
  }
}
# 4：查询rbac/employee中所有name含有zhang并且26<=age<=33的文档
GET rbac/employee/_search
{
  "query": {
    "bool": {
      "must": [
        {"match": {
          "name": "zhang"
        }}

      ],
      "filter": {
        "range": {
          "age": {
            "gte": 26,
            "lte": 33
          }
        }
      }
    }
  }
}

# 1：按照部门编号分组，统计文档数量
GET rbac/employee/_search
{
  "size": 0,
  "aggs": {
    "groupByDeptId": {
     "terms": {
       "field": "deptId",
       "size": 10
     }
    }
  }
}
# 2：按照部门编号分组，统计各部门的平均年龄
GET rbac/employee/_search
{
  "size": 0,
  "aggs": {
    "groupByDeptId": {
     "terms": {
       "field": "deptId",
       "size": 10
     },
     "aggs": {
       "avg_age": {
         "avg": {
           "field": "age"
         }
       }
     }
    }
  }
}
# 3：按照部门编号分组，统计各部门的年龄状态
GET rbac/employee/_search
{
  "size": 0,
  "aggs": {
    "groupByDeptId": {
      "terms": {
        "field": "deptId",
        "size": 10
      },
      "aggs": {
        "age_stats": {
          "stats": {
            "field": "age"
          }
        }
      }
    }
  }
}
```
