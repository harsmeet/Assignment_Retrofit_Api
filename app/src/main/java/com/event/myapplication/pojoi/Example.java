package com.event.myapplication.pojoi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {
        @SerializedName("Women")
        @Expose
        private List<Woman> women = null;
        @SerializedName("Men")
        @Expose
        private List<Man> men = null;
        @SerializedName("Kids")
        @Expose
        private List<Kid> kids = null;

        public List<Woman> getWomen() {
            return women;
        }

        public void setWomen(List<Woman> women) {
            this.women = women;
        }

        public List<Man> getMen() {
            return men;
        }

        public void setMen(List<Man> men) {
            this.men = men;
        }

        public List<Kid> getKids() {
            return kids;
        }

        public void setKids(List<Kid> kids) {
            this.kids = kids;
        }

    }

