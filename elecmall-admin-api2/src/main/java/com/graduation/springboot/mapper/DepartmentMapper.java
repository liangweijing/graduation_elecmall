package com.graduation.springboot.mapper;


import com.graduation.springboot.bean.Department;
import org.apache.ibatis.annotations.*;


//指定这是一个操作数据库的mapper
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    //返回影响行数
    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    //id自增不用插入
    @Options(useGeneratedKeys = true,keyProperty = "id") //插入时使用自增的属性，对应的是表中id
//    @Insert("insert into department(departmentName) values(#{departmentName})")
    @Insert("insert into department(department_name) values(#{departmentName})")//数据库用下划线字段，而类中是驼峰departmentName，要做配置MyBatisConfig才能对应
    public int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
