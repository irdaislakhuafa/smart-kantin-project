package com.smartkantin.controller.dashboard;

import com.smartkantin.dto.dashboard.pendapatan.PendapatanKantin;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PendapatanController {
    
    public PendapatanKantin getListKantin(){
        RestTemplate restTemplate = new RestTemplate();
        String urlApi = "https://smartkantin.tkitif.xyz/public/api/pendapatan_kantin";
        
        PendapatanKantin response = restTemplate.getForObject(urlApi, PendapatanKantin.class);
        return response;
    }
    
}
