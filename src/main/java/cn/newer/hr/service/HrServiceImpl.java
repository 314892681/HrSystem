package cn.newer.hr.service;

import cn.newer.hr.pojo.Department;
import cn.newer.hr.pojo.Employ;
import cn.newer.hr.pojo.PageBean;
import cn.newer.hr.pojo.QueryVo;
import cn.newer.hr.repository.HrMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XiaoYongJun
 * @date 2019/3/19 20:30
 * 描述:  人力资源管理平台业务逻辑接口的实现类
 */
@Service
public class HrServiceImpl implements HrService {
    @Autowired
    HrMapper hrMapper;

    @Override
    public void insertEmploy(Employ employ) {
        hrMapper.insertEmploy(employ);
    }

    @Override
    public List<Employ> getAllEmployPage(int currentPage, int pageSize) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(currentPage, pageSize);
        List<Employ> allItems = hrMapper.getAllEmployPage();   //全部商品
        int countNums = hrMapper.getEmployCount();            //总记录数
        PageBean<Employ> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }
    @Override
    public List<Department> getAllDepartmentPage(int currentPage, int pageSize) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(currentPage, pageSize);
        List<Department> allItems = hrMapper.getAllDepartmentPage();   //全部商品
        int countNums = hrMapper.getDepartmentCount();            //总记录数
        PageBean<Department> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(allItems);
        return pageData.getItems();
    }

    @Override
    public Integer getEmployCount() {
        return hrMapper.getEmployCount();
    }

    @Override
    public Integer getDepartmentCount() {
        return hrMapper.getDepartmentCount();
    }

    @Override
    public void deleteEmploy(String emp_no) {
        hrMapper.deleteEmploy(emp_no);
    }

    @Override
    public List<Department> getAllDepartment() {
        return hrMapper.getAllDepartmentPage();
    }

    @Override
    public List<QueryVo> getCountCharts() {
        return hrMapper.getCountCharts();
    }


    @Override
    public List<QueryVo> getAvgSalCharts() {
        return hrMapper.getAvgSalCharts();
    }
}