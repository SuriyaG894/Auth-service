package com.Auth_service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {


    private long empId;


    private byte[] profilePicture;


    private String firstName;

    private String lastName;

    private String emailOfficial;

    private String emailPersonal;


    private String password;


    private String phoneNumber;

    private String phoneNumberAlternate;


    private String gender;

    private String designation;

    private String projectAssigned;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate joiningDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dob;

    private String department;

    private String currentAddress;


    private String permanentAddress;

    private String nationality;

    private String workLocation;

    private String bloodGroup;


    private String employeeType;


    private String status;


    private String workType;


    private String serviceAgreement;



    private String probationPeriod;


    private String probationStatus;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate createdAt = LocalDate.now();

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate updatedAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate relievingDate;


    private String maritalStatus;

    private String workExperience;

    private Integer numberOfChildren;


    private long hrId;


    private long reportManagerId;


    private String reportManager;



    private String role;

}
