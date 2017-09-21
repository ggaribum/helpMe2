package com.example.a301.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by 301 on 2017-09-20.
 */

public class Repo {

    Response response;

    public class Response {

        Header header;
        Body body;
        ///////////////
        public class Header {
            String resultCode;
            String resultMsg;

            public String getResultCode() {
                return resultCode;
            }

            public String getResultMsg() {
                return resultMsg;
            }
        }
        ///////////////////////
        public class Body {
            Items items;

            public class Items {
                ArrayList<DataObject2> item= new ArrayList<>();

                //getItem()
                public ArrayList<DataObject2> getItem() {
                    return item;
                }


                public class DataObject2 {
                    String baseDate;
                    String baseTime;
                    String category;
                    String nx;
                    String ny;
                    String obsrValue;

                    public DataObject2(String baseDate, String baseTime, String category, String nx, String ny, String obsrValue) {
                        this.baseDate = baseDate;
                        this.baseTime = baseTime;
                        this.category = category;
                        this.nx = nx;
                        this.ny = ny;
                        this.obsrValue = obsrValue;
                    }

                    public String getBaseDate() {
                        return baseDate;
                    }

                    public String getBaseTime() {
                        return baseTime;
                    }

                    public String getCategory() {
                        return category;
                    }

                    public String getNx() {
                        return nx;
                    }

                    public String getNy() {
                        return ny;
                    }

                    public String getObsrValue() {
                        return obsrValue;
                    }

                    public void setBaseDate(String baseDate) {
                        this.baseDate = baseDate;
                    }

                    public void setBaseTime(String baseTime) {
                        this.baseTime = baseTime;
                    }

                    public void setCategory(String category) {
                        this.category = category;
                    }

                    public void setNx(String nx) {
                        this.nx = nx;
                    }

                    public void setNy(String ny) {
                        this.ny = ny;
                    }

                    public void setObsrValue(String obsrValue) {
                        this.obsrValue = obsrValue;
                    }
                }


            }
            //getItems()
            public Items getItems() {
                return items;
            }
        }
        ///////헤더는 필요없다///////
        public Header getHeader() {
            return header;
        }
        //////////////////

        public Body getBody() {
            return body;
        }

    }

    public Response getResponse() {
        return response;
    }
}
