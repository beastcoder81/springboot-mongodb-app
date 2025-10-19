package com.example.myprograms.Model;


import com.example.myprograms.enums.BatchStatus;
import lombok.Data;

import java.util.Date;

@Data
public class TransportResponse {
    private String transportId;
    private String transportStatus;
    private Date createdDate;
    private Double fareAmount;
    private String paymentMode;
    private Boolean delayed;
    private String remarks;
    private BatchStatus batchStatus;
    private VehicleInfo vehicleInfo;
    private DriverInfo driverInfo;
    private RouteDetails routeDetails;


    @Data
    public static class VehicleInfo {
        private String vehicleNumber;
        private String vehicleType;
        private int capacity;
        private String fuelType;
    }

    @Data
    public static class DriverInfo {
        private String driverId;
        private String driverName;
        private String contactNumber;
        private License license;
    }

    @Data
    public static class License {
        private String licenseNumber;
        private Date expiryDate;
        private String issuingState;
    }

    @Data
    public static class RouteDetails {
        private String source;
        private String destination;
        private Double distanceKm;
        private Date estimatedArrival;
        private Boolean expressRoute;
    }
}
