package com.fan.springcloud.pojo;



import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@NoArgsConstructor
/*链式写法
* Dept dept = new Dept();
* dept.setDeptNo(1).setDeptName().
* */

@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;
    private String deptname;
    //区分所对应的数据库
    private String db_source;

    public Dept(String deptname) {
        this.deptname = deptname;
    }
}
