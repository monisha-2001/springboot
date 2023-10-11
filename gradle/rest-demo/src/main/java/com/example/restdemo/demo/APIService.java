package com.example.restdemo.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class APIService {

    private List<Vendor> vendors;

    @PostConstruct
    public void vendor(){
        vendors=new ArrayList<>();
        vendors.add(new Vendor(1,"raju","mysore",1234));
        vendors.add(new Vendor(2,"ravi","mysuru",5678));
        vendors.add(new Vendor(3,"rama","bangalore",9101));
        vendors.add(new Vendor(4,"raaj","mangalore",1121));

    }

    @GetMapping("/vendors")
    public List<Vendor> getVendors(){
        return vendors;
    }

    @GetMapping("/vendors/{vendorId}")
    public Vendor getById(@RequestParam int vendorId){
        if(vendorId >=vendors.size() ||vendorId <0){
            throw new RuntimeException("Vendor Id is not found"+vendorId);
        }
        return vendors.get(vendorId);
    }

    @PostMapping("/vendors")
    public Vendor create(@RequestBody Vendor vendor){
        vendor.setVendorId(0);
        return vendor;
    }

    @PutMapping("/vendors")
    public Vendor update(@RequestBody Vendor vendor){
        return vendor;
    }

    @DeleteMapping("/vendor/{vendorId}")
    public int delete(@RequestParam int vendorId){
        if(vendorId >=0 ||vendorId <0){
            throw new RuntimeException("Vendor Id is not found"+vendorId);
        }
        return vendorId;
    }

}
