package com.gawlas.CarServiceServer.dao.apiModel;

public class DictItem {
    private String dictKey;
    private String code;
    private String name;

    public DictItem() {
    }

    private DictItem(Builder builder) {
        code = builder.code;
        name= builder.name;
    }


    public class Builder {
        private String code;
        private String name;
        private String dictKey;

        public Builder(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder dictKey(String dictKey) {
            this.dictKey = dictKey;
            return this;
        }

        public DictItem build() {
            return new DictItem(this);
        }
    }

    public String getDictKey() {
        return dictKey;
    }

    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
