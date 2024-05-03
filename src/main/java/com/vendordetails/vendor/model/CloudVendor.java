package com.vendordetails.vendor.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cloud_vendor_info")
public class CloudVendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendorId;
    private String vendorFirstName;
    private String vendorLastName;
    private String vendorEmail;
    private String vendorPhoneNumber;
    private String vendorAddress;
}
