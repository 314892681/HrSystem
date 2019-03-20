package cn.newer.hr.pojo;

/**
 * @author XiaoYongJun
 * @date 2019/3/19 20:22
 * 描述:  部门实体类
 */
public class Department {
    private int dept_no;    //部门编号
    private String dname;   //部门名称
    private String loc;     //部门所在地

    /**
     * 带整参数构造
     * @param dept_no
     * @param dname
     * @param loc
     */
    public Department(int dept_no, String dname, String loc) {
        this.dept_no = dept_no;
        this.dname = dname;
        this.loc = loc;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dept_no=" + dept_no +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}