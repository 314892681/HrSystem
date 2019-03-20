package cn.newer.hr.pojo;

import java.math.BigDecimal;

/**
 * @author XiaoYongJun
 * @date 2019/3/20 10:58
 * 描述:
 */
public class QueryVo {
    private String dname;   //部门名称
    private int dcount;     //部门人数
    private BigDecimal avgSal;     //部门平均工资

    public QueryVo(String dname, BigDecimal avgSal) {
        this.dname = dname;
        this.avgSal = avgSal;
    }

    public QueryVo(String dname, int dcount) {
        this.dname = dname;
        this.dcount = dcount;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDcount() {
        return dcount;
    }

    public void setDcount(int dcount) {
        this.dcount = dcount;
    }

    public BigDecimal getAvgSal() {
        return avgSal;
    }

    public void setAvgSal(BigDecimal avgSal) {
        this.avgSal = avgSal;
    }
}