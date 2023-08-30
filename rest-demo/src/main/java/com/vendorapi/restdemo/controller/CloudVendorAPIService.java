package com.vendorapi.restdemo.controller;

import com.vendorapi.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;


    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendorDetails(String vendorID) {
        return cloudVendor;
//                new CloudVendor("C1","Vendor 1",
//                "Address 1","123456780");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully.";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully.";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDetails(String vendorID) {
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully.";
    }
}
