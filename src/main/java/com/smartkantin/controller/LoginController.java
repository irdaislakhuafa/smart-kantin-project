package com.smartkantin.controller;

import com.smartkantin.dto.login.Coba_api;
import com.smartkantin.dto.login.Data;
import com.smartkantin.view.Dashboard;
import javax.swing.JOptionPane;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//@Service
@RestController
public class LoginController {
    
//    @Autowired
//    private RestTemplate restTemplate = new RestTemplate();
    
    private String urlApi = "https://smartkantin.tkitif.xyz/public/api/coba_api";
//    private String urlApi = "https://jsonplaceholder.typicode.com/users";
    
    
//    public ResponseEntity<Coba_api> postUserObject(Coba_api coba){
////        String urlApi = "https://jsonplaceholder.typicode.com/users";
//        RestTemplate restTemplate = new RestTemplate();
//        Coba_api response = restTemplate.postForObject(urlApi, coba, Coba_api.class);
//        return ResponseEntity.ok(response);
//    }
//    
//    public String sayHello(){
//        return "Harusnya bisa...";
//    }
    
    
//    public String postObject(Coba_api coba){
////        String urlApi = "https://jsonplaceholder.typicode.com/users";
//        RestTemplate restTemplate = new RestTemplate();
//        Coba_api response = restTemplate.postForObject(urlApi, coba, Coba_api.class);
//        return response.getData().get(0).getUsername();
//    }
//    @PostMapping
//    public ResponseEntity<JSONObject> postJSONObject(@RequestBody JSONObject coba){
//        String urlApi2 = "https://smartkantin.tkitif.xyz/public/api/coba_api";
//        RestTemplate restTemplate = new RestTemplate();
//        JSONObject response = restTemplate.postForObject(urlApi2, coba, JSONObject.class);
//        return ResponseEntity.ok(response);
//    }
//    public ResponseEntity<String> postString(String coba){
//        String urlApi2 = "https://smartkantin.tkitif.xyz/public/api/coba_api";
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.postForObject(urlApi2, coba, String.class);
//        return ResponseEntity.ok(response);
//    }
    
    public Data postDataToApi(Data data) throws Exception{
        RestTemplate restTemplate = new RestTemplate();
        Data responseApi = new Data();
        Dashboard dashboard = new Dashboard();
        try {
            show("Before post");
            responseApi = restTemplate.postForObject(urlApi, data, Data.class);
           
            show("After post");
            show("Status: " + responseApi.getStatus()); 
        } catch (Exception e) {
            System.err.println(e.getMessage());
               if (e.getMessage().contains("java.net.UknowHostException")){
                   int yesAndNo = JOptionPane.YES_NO_OPTION;
                   JOptionPane.showMessageDialog(
                           dashboard.getMainPanel(), "Maaf terjadi masalah saat menghubungkan ke jaringan", 
                           "Error", yesAndNo);
               }
            System.err.println(e.getCause()); 
        }
        
        
        return responseApi;
    }
    
//    keep it simple
    private void show(String string){
        System.out.println(string);
    }
}
