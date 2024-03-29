package com.imooc.reader.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

// 21 Mybatis-plus运用   22mapper中TestMapper
@TableName("test") //说明实体对应哪一张表
public class Test {
    @TableId(type = IdType.AUTO) //数据自增
    @TableField("id") //说明属性对应哪个字段
    private Integer id;
    //如果字段名与属性名相同或者符合驼峰命名转换规则 则TableField可以省略
    @TableField("content")
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
