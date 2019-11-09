package com.event.myapplication.pojoi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Kid {

        @SerializedName("id_category")
        @Expose
        private String idCategory;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("subcategory")
        @Expose
        private List<Subcategory__> subcategory = null;

        public String getIdCategory() {
            return idCategory;
        }

        public void setIdCategory(String idCategory) {
            this.idCategory = idCategory;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public List<Subcategory__> getSubcategory() {
            return subcategory;
        }

        public void setSubcategory(List<Subcategory__> subcategory) {
            this.subcategory = subcategory;
        }

    }


