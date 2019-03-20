package cn.newer.hr.pojo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author XiaoYongJun
 * @date   2019/3/19 20:22
 * 描述:    员工实体类
 */
@Component
public class Employ {
    private int emp_no; //员工编号
    private String ename;//员工姓名
    private String job;  //职位名称
    private String hiredate; //入职日期
    private BigDecimal sal;//基本工资
    private BigDecimal comm;//奖金
    private int dep_no;     //所属部门编号

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public BigDecimal getComm() {
        return comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public int getDep_no() {
        return dep_no;
    }

    public void setDep_no(int dep_no) {
        this.dep_no = dep_no;
    }

    public Employ(int emp_no, String ename, String job, String hiredate, BigDecimal sal, BigDecimal comm, int dep_no) {
        this.emp_no = emp_no;
        this.ename = ename;
        this.job = job;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.dep_no = dep_no;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "emp_no=" + emp_no +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", dep_no=" + dep_no +
                '}';
    }

    public Employ() {
    }
}