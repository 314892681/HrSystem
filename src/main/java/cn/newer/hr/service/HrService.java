package cn.newer.hr.service;

import cn.newer.hr.pojo.Department;
import cn.newer.hr.pojo.Employ;
import cn.newer.hr.pojo.PageBean;
import cn.newer.hr.pojo.QueryVo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XiaoYongJun
 * @date 2019/3/19 20:20
 * 描述:  人力资源管理平台业务逻辑接口
 */
@Service
public interface HrService {
    /**
     * 添加员工
     * @param employ
     */
    public void insertEmploy(Employ employ);

    /**
     * 雇员分页功能(集成mybatis的分页插件pageHelper实现)
     * @param currentPage :当前页数
     * @param pageSize        :每页显示的总记录数
     * @return
     */
    List<Employ> getAllEmployPage(int currentPage, int pageSize);

    /**
     * 部门分页功能(集成mybatis的分页插件pageHelper实现)
     * @param currentPage :当前页数
     * @param pageSize        :每页显示的总记录数
     * @return
     */
    List<Department> getAllDepartmentPage(int currentPage, int pageSize);

    /**
     * 员工表总记录数
     * @return
     */
    Integer getEmployCount();

    /**
     * 部门表总记录数
     * @return
     */
    Integer getDepartmentCount();

    /**
     * 删除员工
     * @param emp_no
     */
    public void deleteEmploy(String emp_no);

    /**
     * 所有部门，不分页，用于部门下拉框数据
     * @return
     */
    List<Department> getAllDepartment();

    /**
     * 查询各部门人数
     * @return
     */
    public List<QueryVo>getCountCharts();

    /**
     * 查询各部门平均工资
     * @return
     */
    public List<QueryVo>getAvgSalCharts();
}