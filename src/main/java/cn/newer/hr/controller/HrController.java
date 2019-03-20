package cn.newer.hr.controller;

import cn.newer.hr.pojo.Department;
import cn.newer.hr.pojo.Employ;
import cn.newer.hr.pojo.PageBean;
import cn.newer.hr.pojo.QueryVo;
import cn.newer.hr.service.HrService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XiaoYongJun
 * @date 2019/3/19 20:27 -- 2019-03-20
 * 描述:  处理前台发来的跨域所有请求
 */
@Controller
@CrossOrigin
public class HrController {

    @Autowired
    HrService hrService;
    /**
     * 添加员工
     * @param employ
     */
    @CrossOrigin
    @PostMapping("insertEmploy")
    public void insertEmploy(Employ employ) {
        hrService.insertEmploy(employ);
    }

    /**
     * 雇员分页功能(集成mybatis的分页插件pageHelper实现)
     * @param currentPage :当前页数
     * @param pageSize    :每页显示的总记录数
     * @return 总记录数，该页5条记录
     */
    @RequestMapping("employPage")
    @ResponseBody
    public List<Employ> getAllEmployPage(@RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "5") int pageSize) {
        return hrService.getAllEmployPage(currentPage, pageSize);
    }

    /**
     * 部门分页功能(集成mybatis的分页插件pageHelper实现)
     * @param currentPage :当前页数
     * @param pageSize    :每页显示的总记录数
     * @return
     */
    @RequestMapping("departmentPage")
    @ResponseBody
    public List<Department> getAllDepartmentPage(@RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "5") int pageSize) {
        return hrService.getAllDepartmentPage(currentPage, pageSize);
    }
    /**
     * 根据员工编号删除(离职、辞退)
     *
     * @param emp_no
     */
    @PostMapping("deleteEmploy")
    public void deleteEmploy(String emp_no) {
        hrService.deleteEmploy(emp_no);
    }

    /**
     * 所有部门，不分页
     * @return
     */
    @GetMapping("getAllDepartment")
    @ResponseBody
    public List<Department> getAllDepartment() {
        return hrService.getAllDepartment();
    }
    /**
     * 查询各部门人数
     * @return
     */
    @GetMapping("getCountCharts")
    @ResponseBody
    public List<QueryVo>getCountCharts(){
        return hrService.getCountCharts();
    }

    /**
     * 查询各部门平均工资
     * @return
     */
    @GetMapping("getAvgSalCharts")
    @ResponseBody
    public List<QueryVo>getAvgSalCharts(){
        return hrService.getAvgSalCharts();
    }

    /**
     * 员工总页数
     * @return
     */
    @GetMapping("getEmployPageNums")
    public int getEmployPageNums(){
        return 1;
    }
}