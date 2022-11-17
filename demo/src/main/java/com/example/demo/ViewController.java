package com.example.demo;

import com.example.demo.model.Kendaraan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.FieldError;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.MethodNotAllowedException;

import java.util.*;

@org.springframework.stereotype.Controller
//@CrossOrigin(origins = "http://localhost:8081/")
//@RequestMapping("/api")
public class Controller {

    @Autowired
    Repository repository;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("allKendaraan", repository.findAll());
        return "index";
    }

//    @GetMapping("/kendaraan")
//    List<Kendaraan> all(){ return repository.findAll(); }
//
//    @PostMapping("/kendaraan")
//    Kendaraan postKendaraan(@RequestBody Kendaraan kendaraan){
//        return repository.save(kendaraan);
//    }
//
//    @PutMapping("/kendaraan/{nomor_registrasi_kendaraan}")
//    Kendaraan updateKendaraan(@RequestBody Kendaraan kendaraan, @PathVariable String nomor_registrasi_kendaraan){
//        try{
//            Optional<Kendaraan> oldKendaraan = repository.findById(nomor_registrasi_kendaraan);
//
//            if(oldKendaraan.isPresent()){
//                Kendaraan _kendaraan = oldKendaraan.get();
////                _kendaraan.setNomor_registrasi_kendaraan(kendaraan.getNomor_registrasi_kendaraan());
//                _kendaraan.setNama_pemilik(kendaraan.getNama_pemilik());
//                _kendaraan.setAlamat(kendaraan.getAlamat());
//                _kendaraan.setMerk_kendaraan(kendaraan.getMerk_kendaraan());
//                _kendaraan.setTahun_pembuataan(kendaraan.getTahun_pembuataan());
//                _kendaraan.setKapasitas_silinder(kendaraan.getKapasitas_silinder());
//                _kendaraan.setWarna_kendaraan(kendaraan.getWarna_kendaraan());
//                _kendaraan.setBahan_bakar(kendaraan.getBahan_bakar());
//
//                return repository.save(_kendaraan);
//            }
//        }catch (Exception e){
//            return null;
//        }
//        return null;
//    }
//
//    @DeleteMapping("/kendaraan/{nomor_registrasi_kendaraan}")
//    public String deleteKendaraan(@PathVariable String nomor_registrasi_kendaraan){
//        repository.deleteById(nomor_registrasi_kendaraan);
//        return "Kendaraan dengan nomor registrasi = " + nomor_registrasi_kendaraan + " sudah berhasil dihapus";
//    }
}
