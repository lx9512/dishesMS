package com.dishesMS.model;

import java.util.List;

/**
 * Created by aa123 on 2018/2/21.
 */
public class Role {
    private int id;
    private String title;       //职位名称
    private String describe;    //职位描述
    private List<Staff> staffList;  //该职位员工所有信息

    public Role(){
        super();
    }

    public Role(int id)
    {
        this.id = id;
    }

    public Role(String title,String describe)
    {
        super();
        this.title = title;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String discribe) {
        this.describe = discribe;
    }

    public List<Staff> getStaff() {
        return staffList;
    }

    public void setStaff(List<Staff> staff) {
        this.staffList = staff;
    }
}
