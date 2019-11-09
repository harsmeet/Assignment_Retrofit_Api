package com.event.myapplication.pojoi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subcategory__ {


        @SerializedName("id_category_sub")
        @Expose
        private String idCategorySub;
        @SerializedName("name_sub")
        @Expose
        private String nameSub;
        @SerializedName("image")
        @Expose
        private String image;

        public String getIdCategorySub() {
            return idCategorySub;
        }

        public void setIdCategorySub(String idCategorySub) {
            this.idCategorySub = idCategorySub;
        }

        public String getNameSub() {
            return nameSub;
        }

        public void setNameSub(String nameSub) {
            this.nameSub = nameSub;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

    }

