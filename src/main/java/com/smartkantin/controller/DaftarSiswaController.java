package com.smartkantin.controller;

import com.smartkantin.dto.menu.DaftarSiswa;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DaftarSiswaController {
    public List<DaftarSiswa> getListSiswa(){
        RestTemplate rest = new RestTemplate();
        String url = "https://smartkantin.tkitif.xyz/public/api/siswa";
        
        System.out.println("\nBefore get list siswa");
//        List<DaftarSiswa> response = (List<DaftarSiswa>) rest.getForObject(url, DaftarSiswa.class);
        DaftarSiswa[] response = rest.getForObject(url, DaftarSiswa[].class);
        System.out.println("After get list siswa");
//        System.out.println("Result : " + response.getNama_siswa());

        List<DaftarSiswa> responseApi = Arrays.asList(response);
        return responseApi;
    }
}
