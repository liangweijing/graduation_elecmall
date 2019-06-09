package com.graduation.springboot.utils;

import java.util.List;



public class Page<T> {//这里加上<T>
    private int totalRows;//总条数
    private int totalPage;//总页数
    private int pageRows;//每页条数，sql语句定死取8条这样
    private int currentPage;//当前页
    private List<T> data;//每页的数据


    public Page() {
        super();
    }
    public Page(int rows, int totalPage, int pageNumber, int curPage, List<T> data) {
        super();
        this.totalRows = rows;
        this.totalPage = totalPage;
        this.pageRows = pageNumber;
        this.currentPage = curPage;
        this.data = data;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageRows() {
        return pageRows;
    }

    public void setPageRows(int pageRows) {
        this.pageRows = pageRows;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}

