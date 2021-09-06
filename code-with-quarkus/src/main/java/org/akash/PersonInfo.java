package org.akash;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PersonInfo  implements Serializable {
  private String hmac;
  private String idNumber;
  private String cardCountry;
  private String firstNameAr;
  private String middleName1Ar;
  private String middleName2Ar;
  private String middleName3Ar;
  private String middleName4Ar;
  private String lastNameAr;
  private String firstNameEn;
  private String middleName1En;
  private String middleName2En;
  private String middleName3En;
  private String middleName4En;
  private String lastNameEn;
  private String gender;
  private Integer dateOfBirth;
  private String telephoneNumber;
  private String email;
  private String addressType;
  private Integer flatNumber;
  private Integer buildingNumber;
  private String buildingAlpha;
  private Integer roadNumber;
  private Integer blockNumber;
  private String placeOfBirth;
  private String nationality;
  private String occupation;
  private String employmentStatus;
  private String nameOfEmployer;
  private Integer employerFlatNumber;
  private Integer employerBuildingNumber;
  private String employerBuildingAlpha;
  private Integer employerRoadNumber;
  private Integer employerBlockNumber;
  private String maritalStatus;
  private String passportNumber;
  private Integer passportExpiryDate;
  private String residentPermitNo;
  private Integer residentPermitExpiry;
  private String responseCode;
  private String responseMessage;
  private String personPhoto;
  private String signature;
  private Integer serverTimeStamp;
  private Integer clientTimeStamp;
}

