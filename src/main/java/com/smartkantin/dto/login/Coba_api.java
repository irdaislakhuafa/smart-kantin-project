
package com.smartkantin.dto.login;

import java.util.ArrayList;
import java.util.List;

public class Coba_api {
    private String status;
    private List<Data> data;
    
    public Coba_api(){
        this.data = new ArrayList<>();
    }
    
    public String getStatus(){
        return status;
    }
    public List<Data> getData(){
        return data;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setData(List<Data> data){
        this.data = data;
    }
}
