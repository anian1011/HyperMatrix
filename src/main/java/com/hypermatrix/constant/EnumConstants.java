package com.hypermatrix.constant;

/**
 * Created by anian on 2016/6/18.
 */
public class EnumConstants {

    public enum ReturnState{
        PIC(1,"toPicList.do"),NEWS(2,"toNewsList.do"), FUNCTION(3,"toFunctionList.do"),RESOURCE(4,"toResourceList.do"),MEMBER(5,"toMemberList.do"),HOME(6,"toHome.do");

        private final int value;
        private final String url;

        ReturnState(int value,String url) {
            this.value = value;
            this.url = url;
        }

        public int getValue() {
            return value;
        }

        public String getUrl() {
            return url;
        }
    }
    public enum FunctionCategory{
        科学计算(1,"科学计算"),大数据分析(2,"大数据分析"),工程应用(3,"工程应用");
        private final int cid;
        private final String cname;
        FunctionCategory(int cid,String cname){
            this.cid=cid;
            this.cname=cname;
        }

        public int getCid() {
            return cid;
        }

        public String getCname() {
            return cname;
        }
    }
}
