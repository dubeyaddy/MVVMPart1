package com.practiceapp.mvvmsample.jsonData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataResponse {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("per_page")
    @Expose
    private Integer perPage;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("data")
    @Expose
    private List<DataModel> data = null;
//    @SerializedName("support")
//    @Expose
//    private DataResponse.Support support;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public List<DataModel> getData() {
        return data;
    }

    public void setData(List<DataModel> data) {
        this.data = data;
    }

//    public DataResponse.Support getSupport() {
//        return support;
//    }
//
//    public void setSupport(DataResponse.Support support) {
//        this.support = support;
//    }

}
