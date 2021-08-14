package com.smartkantin.controller;

import com.smartkantin.dto.menu.TableTransfer;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TableTransferController {
    
    public List<TableTransfer> getListTransfer(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://smartkantin.tkitif.xyz/public/api/transfer";
        TableTransfer[] response = restTemplate.getForObject(
                url, TableTransfer[].class);
        List<TableTransfer> responseApi = Arrays.asList(response);
        return responseApi;
    }
    public int postIdTransfer(int id){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://smartkantin.tkitif.xyz/public/api/transfer";
        int response = restTemplate.postForObject(url, id, int.class);
        return response;
    }
}
