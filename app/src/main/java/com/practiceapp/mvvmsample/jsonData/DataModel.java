package com.practiceapp.mvvmsample.jsonData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataModel {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("year")
        @Expose
        private Integer year;
        @SerializedName("color")
        @Expose
        private String color;
        @SerializedName("pantone_value")
        @Expose
        private String pantoneValue;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getPantoneValue() {
            return pantoneValue;
        }

        public void setPantoneValue(String pantoneValue) {
            this.pantoneValue = pantoneValue;
        }

}

//
//    public class Data {
//
//        @SerializedName("page")
//        @Expose
//        private Integer page;
//        @SerializedName("per_page")
//        @Expose
//        private Integer perPage;
//        @SerializedName("total")
//        @Expose
//        private Integer total;
//        @SerializedName("total_pages")
//        @Expose
//        private Integer totalPages;
//        @SerializedName("data")
//        @Expose
//        private List<Datum> data = null;
//        @SerializedName("support")
//        @Expose
//        private Support support;
//
//        public Integer getPage() {
//            return page;
//        }
//
//        public void setPage(Integer page) {
//            this.page = page;
//        }
//
//        public Integer getPerPage() {
//            return perPage;
//        }
//
//        public void setPerPage(Integer perPage) {
//            this.perPage = perPage;
//        }
//
//        public Integer getTotal() {
//            return total;
//        }
//
//        public void setTotal(Integer total) {
//            this.total = total;
//        }
//
//        public Integer getTotalPages() {
//            return totalPages;
//        }
//
//        public void setTotalPages(Integer totalPages) {
//            this.totalPages = totalPages;
//        }
//
//        public List<Datum> getData() {
//            return data;
//        }
//
//        public void setData(List<Datum> data) {
//            this.data = data;
//        }
//
//        public Support getSupport() {
//            return support;
//        }
//
//        public void setSupport(Support support) {
//            this.support = support;
//        }
//
//    }
//
//    public class Support {
//
//        @SerializedName("url")
//        @Expose
//        private String url;
//        @SerializedName("text")
//        @Expose
//        private String text;
//
//        public String getUrl() {
//            return url;
//        }
//
//        public void setUrl(String url) {
//            this.url = url;
//        }
//
//        public String getText() {
//            return text;
//        }
//
//        public void setText(String text) {
//            this.text = text;
//        }
//
//    }
//}
