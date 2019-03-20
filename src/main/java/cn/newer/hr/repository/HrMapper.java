package cn.newer.hr.repository;

import cn.newer.hr.pojo.Department;
import cn.newer.hr.pojo.Employ;
import cn.newer.hr.pojo.QueryVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author XiaoYongJun
 * @date 2019/3/19 20:32
 * 描述:
 */
@Mapper
public interface HrMapper {

    @Insert("insert into emp(ename,job,mgr,hiredate,sal,comm,dep_no) values" +
            "(#{ename},#{job},#{mgr},#{hiredate}," +
            "#{sal},#{comm},#{dep_no})")
    public void insertEmploy(Employ employ);

    @Select("select * from emp")
    public List<Employ> getAllEmployPage();

    @Select("select count(1) from emp")
    public int getEmployCount();

    @Select("select * from dept")
    public List<Department> getAllDepartmentPage();

    @Select("select count(1) from dept")
    public int getDepartmentCount();

    @Delete("delete from emp where emp_no = #{emp_no}")
    public void deleteEmploy(String emp_no);

    @Select("select d.dname,count(e.dep_no) dcount from dept d,emp e " +
            " where e.dep_no = d.dept_no group by e.dep_no")
    public List<QueryVo>getCountCharts();

    @Select("select d.dname,round(avg(e.sal)) avgSal from dept d,emp e  where " +
            "e.dep_no = d.dept_no group by e.dep_no")
    public List<QueryVo>getAvgSalCharts();
}
