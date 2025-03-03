/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import Model.Ptsv2paymentsTravelInformationLodgingRoom;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Ptsv2paymentsTravelInformationLodging
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class Ptsv2paymentsTravelInformationLodging {
  @SerializedName("checkInDate")
  private String checkInDate = null;

  @SerializedName("checkOutDate")
  private String checkOutDate = null;

  @SerializedName("room")
  private List<Ptsv2paymentsTravelInformationLodgingRoom> room = null;

  @SerializedName("smokingPreference")
  private String smokingPreference = null;

  @SerializedName("numberOfRooms")
  private Integer numberOfRooms = null;

  @SerializedName("numberOfGuests")
  private Integer numberOfGuests = null;

  @SerializedName("roomBedType")
  private String roomBedType = null;

  @SerializedName("roomTaxType")
  private String roomTaxType = null;

  @SerializedName("roomRateType")
  private String roomRateType = null;

  @SerializedName("guestName")
  private String guestName = null;

  @SerializedName("customerServicePhoneNumber")
  private String customerServicePhoneNumber = null;

  @SerializedName("corporateClientCode")
  private String corporateClientCode = null;

  @SerializedName("additionalDiscountAmount")
  private String additionalDiscountAmount = null;

  @SerializedName("roomLocation")
  private String roomLocation = null;

  @SerializedName("specialProgramCode")
  private String specialProgramCode = null;

  @SerializedName("totalTaxAmount")
  private String totalTaxAmount = null;

  @SerializedName("prepaidCost")
  private String prepaidCost = null;

  @SerializedName("foodAndBeverageCost")
  private String foodAndBeverageCost = null;

  @SerializedName("roomTaxAmount")
  private String roomTaxAmount = null;

  @SerializedName("adjustmentAmount")
  private String adjustmentAmount = null;

  @SerializedName("phoneCost")
  private String phoneCost = null;

  @SerializedName("restaurantCost")
  private String restaurantCost = null;

  @SerializedName("roomServiceCost")
  private String roomServiceCost = null;

  @SerializedName("miniBarCost")
  private String miniBarCost = null;

  @SerializedName("laundryCost")
  private String laundryCost = null;

  @SerializedName("miscellaneousCost")
  private String miscellaneousCost = null;

  @SerializedName("giftShopCost")
  private String giftShopCost = null;

  @SerializedName("movieCost")
  private String movieCost = null;

  @SerializedName("healthClubCost")
  private String healthClubCost = null;

  @SerializedName("valetParkingCost")
  private String valetParkingCost = null;

  @SerializedName("cashDisbursementCost")
  private String cashDisbursementCost = null;

  @SerializedName("nonRoomCost")
  private String nonRoomCost = null;

  @SerializedName("businessCenterCost")
  private String businessCenterCost = null;

  @SerializedName("loungeBarCost")
  private String loungeBarCost = null;

  @SerializedName("transportationCost")
  private String transportationCost = null;

  @SerializedName("gratuityAmount")
  private String gratuityAmount = null;

  @SerializedName("conferenceRoomCost")
  private String conferenceRoomCost = null;

  @SerializedName("audioVisualCost")
  private String audioVisualCost = null;

  @SerializedName("banquestCost")
  private String banquestCost = null;

  @SerializedName("nonRoomTaxAmount")
  private String nonRoomTaxAmount = null;

  @SerializedName("earlyCheckOutCost")
  private String earlyCheckOutCost = null;

  @SerializedName("internetAccessCost")
  private String internetAccessCost = null;

  public Ptsv2paymentsTravelInformationLodging checkInDate(String checkInDate) {
    this.checkInDate = checkInDate;
    return this;
  }

   /**
   * Date on which the guest checked in. In the case of a no-show or a reservation, the scheduled arrival date. Format: &#x60;MMDDYY&#x60;. For best interchange rates, make sure it is a valid date. 
   * @return checkInDate
  **/
  @ApiModelProperty(value = "Date on which the guest checked in. In the case of a no-show or a reservation, the scheduled arrival date. Format: `MMDDYY`. For best interchange rates, make sure it is a valid date. ")
  public String getCheckInDate() {
    return checkInDate;
  }

  public void setCheckInDate(String checkInDate) {
    this.checkInDate = checkInDate;
  }

  public Ptsv2paymentsTravelInformationLodging checkOutDate(String checkOutDate) {
    this.checkOutDate = checkOutDate;
    return this;
  }

   /**
   * Date on which the guest checked out. Format: &#x60;MMDDYY&#x60;. For best interchange rates, make sure it is a valid date. 
   * @return checkOutDate
  **/
  @ApiModelProperty(value = "Date on which the guest checked out. Format: `MMDDYY`. For best interchange rates, make sure it is a valid date. ")
  public String getCheckOutDate() {
    return checkOutDate;
  }

  public void setCheckOutDate(String checkOutDate) {
    this.checkOutDate = checkOutDate;
  }

  public Ptsv2paymentsTravelInformationLodging room(List<Ptsv2paymentsTravelInformationLodgingRoom> room) {
    this.room = room;
    return this;
  }

  public Ptsv2paymentsTravelInformationLodging addRoomItem(Ptsv2paymentsTravelInformationLodgingRoom roomItem) {
    if (this.room == null) {
      this.room = new ArrayList<Ptsv2paymentsTravelInformationLodgingRoom>();
    }
    this.room.add(roomItem);
    return this;
  }

   /**
   * The object containing the number of nights and the daily rate that applies for that no of nights. 
   * @return room
  **/
  @ApiModelProperty(value = "The object containing the number of nights and the daily rate that applies for that no of nights. ")
  public List<Ptsv2paymentsTravelInformationLodgingRoom> getRoom() {
    return room;
  }

  public void setRoom(List<Ptsv2paymentsTravelInformationLodgingRoom> room) {
    this.room = room;
  }

  public Ptsv2paymentsTravelInformationLodging smokingPreference(String smokingPreference) {
    this.smokingPreference = smokingPreference;
    return this;
  }

   /**
   * Smoking preference of the guest. Possible values: - &#x60;Y&#x60;: smoking room - &#x60;N&#x60;: non-smoking room 
   * @return smokingPreference
  **/
  @ApiModelProperty(value = "Smoking preference of the guest. Possible values: - `Y`: smoking room - `N`: non-smoking room ")
  public String getSmokingPreference() {
    return smokingPreference;
  }

  public void setSmokingPreference(String smokingPreference) {
    this.smokingPreference = smokingPreference;
  }

  public Ptsv2paymentsTravelInformationLodging numberOfRooms(Integer numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
    return this;
  }

   /**
   * Number of rooms booked by the cardholder. 
   * minimum: 1
   * maximum: 99
   * @return numberOfRooms
  **/
  @ApiModelProperty(value = "Number of rooms booked by the cardholder. ")
  public Integer getNumberOfRooms() {
    return numberOfRooms;
  }

  public void setNumberOfRooms(Integer numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }

  public Ptsv2paymentsTravelInformationLodging numberOfGuests(Integer numberOfGuests) {
    this.numberOfGuests = numberOfGuests;
    return this;
  }

   /**
   * Number of guests staying in the room. 
   * minimum: 1
   * maximum: 99
   * @return numberOfGuests
  **/
  @ApiModelProperty(value = "Number of guests staying in the room. ")
  public Integer getNumberOfGuests() {
    return numberOfGuests;
  }

  public void setNumberOfGuests(Integer numberOfGuests) {
    this.numberOfGuests = numberOfGuests;
  }

  public Ptsv2paymentsTravelInformationLodging roomBedType(String roomBedType) {
    this.roomBedType = roomBedType;
    return this;
  }

   /**
   * Type of room, such as queen, king, or two doubles. 
   * @return roomBedType
  **/
  @ApiModelProperty(value = "Type of room, such as queen, king, or two doubles. ")
  public String getRoomBedType() {
    return roomBedType;
  }

  public void setRoomBedType(String roomBedType) {
    this.roomBedType = roomBedType;
  }

  public Ptsv2paymentsTravelInformationLodging roomTaxType(String roomTaxType) {
    this.roomTaxType = roomTaxType;
    return this;
  }

   /**
   * Type of tax, such as tourist or hotel. 
   * @return roomTaxType
  **/
  @ApiModelProperty(value = "Type of tax, such as tourist or hotel. ")
  public String getRoomTaxType() {
    return roomTaxType;
  }

  public void setRoomTaxType(String roomTaxType) {
    this.roomTaxType = roomTaxType;
  }

  public Ptsv2paymentsTravelInformationLodging roomRateType(String roomRateType) {
    this.roomRateType = roomRateType;
    return this;
  }

   /**
   * Type of rate, such as corporate or senior citizen. 
   * @return roomRateType
  **/
  @ApiModelProperty(value = "Type of rate, such as corporate or senior citizen. ")
  public String getRoomRateType() {
    return roomRateType;
  }

  public void setRoomRateType(String roomRateType) {
    this.roomRateType = roomRateType;
  }

  public Ptsv2paymentsTravelInformationLodging guestName(String guestName) {
    this.guestName = guestName;
    return this;
  }

   /**
   * Name of the guest under which the room is reserved. 
   * @return guestName
  **/
  @ApiModelProperty(value = "Name of the guest under which the room is reserved. ")
  public String getGuestName() {
    return guestName;
  }

  public void setGuestName(String guestName) {
    this.guestName = guestName;
  }

  public Ptsv2paymentsTravelInformationLodging customerServicePhoneNumber(String customerServicePhoneNumber) {
    this.customerServicePhoneNumber = customerServicePhoneNumber;
    return this;
  }

   /**
   * Your toll-free customer service phone number. 
   * @return customerServicePhoneNumber
  **/
  @ApiModelProperty(value = "Your toll-free customer service phone number. ")
  public String getCustomerServicePhoneNumber() {
    return customerServicePhoneNumber;
  }

  public void setCustomerServicePhoneNumber(String customerServicePhoneNumber) {
    this.customerServicePhoneNumber = customerServicePhoneNumber;
  }

  public Ptsv2paymentsTravelInformationLodging corporateClientCode(String corporateClientCode) {
    this.corporateClientCode = corporateClientCode;
    return this;
  }

   /**
   * Code assigned to a business. You can use this code to identify corporate rates and discounts for guests. 
   * @return corporateClientCode
  **/
  @ApiModelProperty(value = "Code assigned to a business. You can use this code to identify corporate rates and discounts for guests. ")
  public String getCorporateClientCode() {
    return corporateClientCode;
  }

  public void setCorporateClientCode(String corporateClientCode) {
    this.corporateClientCode = corporateClientCode;
  }

  public Ptsv2paymentsTravelInformationLodging additionalDiscountAmount(String additionalDiscountAmount) {
    this.additionalDiscountAmount = additionalDiscountAmount;
    return this;
  }

   /**
   * Amount of an additional coupon or discount. 
   * @return additionalDiscountAmount
  **/
  @ApiModelProperty(value = "Amount of an additional coupon or discount. ")
  public String getAdditionalDiscountAmount() {
    return additionalDiscountAmount;
  }

  public void setAdditionalDiscountAmount(String additionalDiscountAmount) {
    this.additionalDiscountAmount = additionalDiscountAmount;
  }

  public Ptsv2paymentsTravelInformationLodging roomLocation(String roomLocation) {
    this.roomLocation = roomLocation;
    return this;
  }

   /**
   * Location of room, such as lake view or ocean view. 
   * @return roomLocation
  **/
  @ApiModelProperty(value = "Location of room, such as lake view or ocean view. ")
  public String getRoomLocation() {
    return roomLocation;
  }

  public void setRoomLocation(String roomLocation) {
    this.roomLocation = roomLocation;
  }

  public Ptsv2paymentsTravelInformationLodging specialProgramCode(String specialProgramCode) {
    this.specialProgramCode = specialProgramCode;
    return this;
  }

   /**
   * Code that identifies special circumstances. Possible values: - &#x60;1&#x60;: lodging (default) - &#x60;2&#x60;: no show reservation - &#x60;3&#x60;: advanced deposit 
   * @return specialProgramCode
  **/
  @ApiModelProperty(value = "Code that identifies special circumstances. Possible values: - `1`: lodging (default) - `2`: no show reservation - `3`: advanced deposit ")
  public String getSpecialProgramCode() {
    return specialProgramCode;
  }

  public void setSpecialProgramCode(String specialProgramCode) {
    this.specialProgramCode = specialProgramCode;
  }

  public Ptsv2paymentsTravelInformationLodging totalTaxAmount(String totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
    return this;
  }

   /**
   * Total tax amount. 
   * @return totalTaxAmount
  **/
  @ApiModelProperty(value = "Total tax amount. ")
  public String getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(String totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }

  public Ptsv2paymentsTravelInformationLodging prepaidCost(String prepaidCost) {
    this.prepaidCost = prepaidCost;
    return this;
  }

   /**
   * Prepaid amount, such as a deposit. 
   * @return prepaidCost
  **/
  @ApiModelProperty(value = "Prepaid amount, such as a deposit. ")
  public String getPrepaidCost() {
    return prepaidCost;
  }

  public void setPrepaidCost(String prepaidCost) {
    this.prepaidCost = prepaidCost;
  }

  public Ptsv2paymentsTravelInformationLodging foodAndBeverageCost(String foodAndBeverageCost) {
    this.foodAndBeverageCost = foodAndBeverageCost;
    return this;
  }

   /**
   * Cost for all food and beverages. 
   * @return foodAndBeverageCost
  **/
  @ApiModelProperty(value = "Cost for all food and beverages. ")
  public String getFoodAndBeverageCost() {
    return foodAndBeverageCost;
  }

  public void setFoodAndBeverageCost(String foodAndBeverageCost) {
    this.foodAndBeverageCost = foodAndBeverageCost;
  }

  public Ptsv2paymentsTravelInformationLodging roomTaxAmount(String roomTaxAmount) {
    this.roomTaxAmount = roomTaxAmount;
    return this;
  }

   /**
   * Total tax for the room. 
   * @return roomTaxAmount
  **/
  @ApiModelProperty(value = "Total tax for the room. ")
  public String getRoomTaxAmount() {
    return roomTaxAmount;
  }

  public void setRoomTaxAmount(String roomTaxAmount) {
    this.roomTaxAmount = roomTaxAmount;
  }

  public Ptsv2paymentsTravelInformationLodging adjustmentAmount(String adjustmentAmount) {
    this.adjustmentAmount = adjustmentAmount;
    return this;
  }

   /**
   * Adjusted amount charged in addition to the reservation amount after the stay is complete. 
   * @return adjustmentAmount
  **/
  @ApiModelProperty(value = "Adjusted amount charged in addition to the reservation amount after the stay is complete. ")
  public String getAdjustmentAmount() {
    return adjustmentAmount;
  }

  public void setAdjustmentAmount(String adjustmentAmount) {
    this.adjustmentAmount = adjustmentAmount;
  }

  public Ptsv2paymentsTravelInformationLodging phoneCost(String phoneCost) {
    this.phoneCost = phoneCost;
    return this;
  }

   /**
   * Cost of telephone services. 
   * @return phoneCost
  **/
  @ApiModelProperty(value = "Cost of telephone services. ")
  public String getPhoneCost() {
    return phoneCost;
  }

  public void setPhoneCost(String phoneCost) {
    this.phoneCost = phoneCost;
  }

  public Ptsv2paymentsTravelInformationLodging restaurantCost(String restaurantCost) {
    this.restaurantCost = restaurantCost;
    return this;
  }

   /**
   * Cost of restaurant purchases 
   * @return restaurantCost
  **/
  @ApiModelProperty(value = "Cost of restaurant purchases ")
  public String getRestaurantCost() {
    return restaurantCost;
  }

  public void setRestaurantCost(String restaurantCost) {
    this.restaurantCost = restaurantCost;
  }

  public Ptsv2paymentsTravelInformationLodging roomServiceCost(String roomServiceCost) {
    this.roomServiceCost = roomServiceCost;
    return this;
  }

   /**
   * Cost of room service. 
   * @return roomServiceCost
  **/
  @ApiModelProperty(value = "Cost of room service. ")
  public String getRoomServiceCost() {
    return roomServiceCost;
  }

  public void setRoomServiceCost(String roomServiceCost) {
    this.roomServiceCost = roomServiceCost;
  }

  public Ptsv2paymentsTravelInformationLodging miniBarCost(String miniBarCost) {
    this.miniBarCost = miniBarCost;
    return this;
  }

   /**
   * Cost of mini-bar purchases. 
   * @return miniBarCost
  **/
  @ApiModelProperty(value = "Cost of mini-bar purchases. ")
  public String getMiniBarCost() {
    return miniBarCost;
  }

  public void setMiniBarCost(String miniBarCost) {
    this.miniBarCost = miniBarCost;
  }

  public Ptsv2paymentsTravelInformationLodging laundryCost(String laundryCost) {
    this.laundryCost = laundryCost;
    return this;
  }

   /**
   * Cost of laundry services. 
   * @return laundryCost
  **/
  @ApiModelProperty(value = "Cost of laundry services. ")
  public String getLaundryCost() {
    return laundryCost;
  }

  public void setLaundryCost(String laundryCost) {
    this.laundryCost = laundryCost;
  }

  public Ptsv2paymentsTravelInformationLodging miscellaneousCost(String miscellaneousCost) {
    this.miscellaneousCost = miscellaneousCost;
    return this;
  }

   /**
   * Miscellaneous costs. 
   * @return miscellaneousCost
  **/
  @ApiModelProperty(value = "Miscellaneous costs. ")
  public String getMiscellaneousCost() {
    return miscellaneousCost;
  }

  public void setMiscellaneousCost(String miscellaneousCost) {
    this.miscellaneousCost = miscellaneousCost;
  }

  public Ptsv2paymentsTravelInformationLodging giftShopCost(String giftShopCost) {
    this.giftShopCost = giftShopCost;
    return this;
  }

   /**
   * Cost of gift shop purchases. 
   * @return giftShopCost
  **/
  @ApiModelProperty(value = "Cost of gift shop purchases. ")
  public String getGiftShopCost() {
    return giftShopCost;
  }

  public void setGiftShopCost(String giftShopCost) {
    this.giftShopCost = giftShopCost;
  }

  public Ptsv2paymentsTravelInformationLodging movieCost(String movieCost) {
    this.movieCost = movieCost;
    return this;
  }

   /**
   * Cost of movies. 
   * @return movieCost
  **/
  @ApiModelProperty(value = "Cost of movies. ")
  public String getMovieCost() {
    return movieCost;
  }

  public void setMovieCost(String movieCost) {
    this.movieCost = movieCost;
  }

  public Ptsv2paymentsTravelInformationLodging healthClubCost(String healthClubCost) {
    this.healthClubCost = healthClubCost;
    return this;
  }

   /**
   * Cost of health club services. 
   * @return healthClubCost
  **/
  @ApiModelProperty(value = "Cost of health club services. ")
  public String getHealthClubCost() {
    return healthClubCost;
  }

  public void setHealthClubCost(String healthClubCost) {
    this.healthClubCost = healthClubCost;
  }

  public Ptsv2paymentsTravelInformationLodging valetParkingCost(String valetParkingCost) {
    this.valetParkingCost = valetParkingCost;
    return this;
  }

   /**
   * Cost of valet parking services. 
   * @return valetParkingCost
  **/
  @ApiModelProperty(value = "Cost of valet parking services. ")
  public String getValetParkingCost() {
    return valetParkingCost;
  }

  public void setValetParkingCost(String valetParkingCost) {
    this.valetParkingCost = valetParkingCost;
  }

  public Ptsv2paymentsTravelInformationLodging cashDisbursementCost(String cashDisbursementCost) {
    this.cashDisbursementCost = cashDisbursementCost;
    return this;
  }

   /**
   * Cost of the cash that was disbursed plus any associated service fees 
   * @return cashDisbursementCost
  **/
  @ApiModelProperty(value = "Cost of the cash that was disbursed plus any associated service fees ")
  public String getCashDisbursementCost() {
    return cashDisbursementCost;
  }

  public void setCashDisbursementCost(String cashDisbursementCost) {
    this.cashDisbursementCost = cashDisbursementCost;
  }

  public Ptsv2paymentsTravelInformationLodging nonRoomCost(String nonRoomCost) {
    this.nonRoomCost = nonRoomCost;
    return this;
  }

   /**
   * Cost of non-room purchases, such as meals and gifts. 
   * @return nonRoomCost
  **/
  @ApiModelProperty(value = "Cost of non-room purchases, such as meals and gifts. ")
  public String getNonRoomCost() {
    return nonRoomCost;
  }

  public void setNonRoomCost(String nonRoomCost) {
    this.nonRoomCost = nonRoomCost;
  }

  public Ptsv2paymentsTravelInformationLodging businessCenterCost(String businessCenterCost) {
    this.businessCenterCost = businessCenterCost;
    return this;
  }

   /**
   * Cost of business center services. 
   * @return businessCenterCost
  **/
  @ApiModelProperty(value = "Cost of business center services. ")
  public String getBusinessCenterCost() {
    return businessCenterCost;
  }

  public void setBusinessCenterCost(String businessCenterCost) {
    this.businessCenterCost = businessCenterCost;
  }

  public Ptsv2paymentsTravelInformationLodging loungeBarCost(String loungeBarCost) {
    this.loungeBarCost = loungeBarCost;
    return this;
  }

   /**
   * Cost of lounge and bar purchases. 
   * @return loungeBarCost
  **/
  @ApiModelProperty(value = "Cost of lounge and bar purchases. ")
  public String getLoungeBarCost() {
    return loungeBarCost;
  }

  public void setLoungeBarCost(String loungeBarCost) {
    this.loungeBarCost = loungeBarCost;
  }

  public Ptsv2paymentsTravelInformationLodging transportationCost(String transportationCost) {
    this.transportationCost = transportationCost;
    return this;
  }

   /**
   * Cost of transportation services. 
   * @return transportationCost
  **/
  @ApiModelProperty(value = "Cost of transportation services. ")
  public String getTransportationCost() {
    return transportationCost;
  }

  public void setTransportationCost(String transportationCost) {
    this.transportationCost = transportationCost;
  }

  public Ptsv2paymentsTravelInformationLodging gratuityAmount(String gratuityAmount) {
    this.gratuityAmount = gratuityAmount;
    return this;
  }

   /**
   * Gratuity. 
   * @return gratuityAmount
  **/
  @ApiModelProperty(value = "Gratuity. ")
  public String getGratuityAmount() {
    return gratuityAmount;
  }

  public void setGratuityAmount(String gratuityAmount) {
    this.gratuityAmount = gratuityAmount;
  }

  public Ptsv2paymentsTravelInformationLodging conferenceRoomCost(String conferenceRoomCost) {
    this.conferenceRoomCost = conferenceRoomCost;
    return this;
  }

   /**
   * Cost of conference room services. 
   * @return conferenceRoomCost
  **/
  @ApiModelProperty(value = "Cost of conference room services. ")
  public String getConferenceRoomCost() {
    return conferenceRoomCost;
  }

  public void setConferenceRoomCost(String conferenceRoomCost) {
    this.conferenceRoomCost = conferenceRoomCost;
  }

  public Ptsv2paymentsTravelInformationLodging audioVisualCost(String audioVisualCost) {
    this.audioVisualCost = audioVisualCost;
    return this;
  }

   /**
   * Cost of audio visual services. 
   * @return audioVisualCost
  **/
  @ApiModelProperty(value = "Cost of audio visual services. ")
  public String getAudioVisualCost() {
    return audioVisualCost;
  }

  public void setAudioVisualCost(String audioVisualCost) {
    this.audioVisualCost = audioVisualCost;
  }

  public Ptsv2paymentsTravelInformationLodging banquestCost(String banquestCost) {
    this.banquestCost = banquestCost;
    return this;
  }

   /**
   * Cost of banquet services. 
   * @return banquestCost
  **/
  @ApiModelProperty(value = "Cost of banquet services. ")
  public String getBanquestCost() {
    return banquestCost;
  }

  public void setBanquestCost(String banquestCost) {
    this.banquestCost = banquestCost;
  }

  public Ptsv2paymentsTravelInformationLodging nonRoomTaxAmount(String nonRoomTaxAmount) {
    this.nonRoomTaxAmount = nonRoomTaxAmount;
    return this;
  }

   /**
   * Tax on non-room purchases. 
   * @return nonRoomTaxAmount
  **/
  @ApiModelProperty(value = "Tax on non-room purchases. ")
  public String getNonRoomTaxAmount() {
    return nonRoomTaxAmount;
  }

  public void setNonRoomTaxAmount(String nonRoomTaxAmount) {
    this.nonRoomTaxAmount = nonRoomTaxAmount;
  }

  public Ptsv2paymentsTravelInformationLodging earlyCheckOutCost(String earlyCheckOutCost) {
    this.earlyCheckOutCost = earlyCheckOutCost;
    return this;
  }

   /**
   * Service fee for early departure. 
   * @return earlyCheckOutCost
  **/
  @ApiModelProperty(value = "Service fee for early departure. ")
  public String getEarlyCheckOutCost() {
    return earlyCheckOutCost;
  }

  public void setEarlyCheckOutCost(String earlyCheckOutCost) {
    this.earlyCheckOutCost = earlyCheckOutCost;
  }

  public Ptsv2paymentsTravelInformationLodging internetAccessCost(String internetAccessCost) {
    this.internetAccessCost = internetAccessCost;
    return this;
  }

   /**
   * Cost of Internet access. 
   * @return internetAccessCost
  **/
  @ApiModelProperty(value = "Cost of Internet access. ")
  public String getInternetAccessCost() {
    return internetAccessCost;
  }

  public void setInternetAccessCost(String internetAccessCost) {
    this.internetAccessCost = internetAccessCost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTravelInformationLodging ptsv2paymentsTravelInformationLodging = (Ptsv2paymentsTravelInformationLodging) o;
    return Objects.equals(this.checkInDate, ptsv2paymentsTravelInformationLodging.checkInDate) &&
        Objects.equals(this.checkOutDate, ptsv2paymentsTravelInformationLodging.checkOutDate) &&
        Objects.equals(this.room, ptsv2paymentsTravelInformationLodging.room) &&
        Objects.equals(this.smokingPreference, ptsv2paymentsTravelInformationLodging.smokingPreference) &&
        Objects.equals(this.numberOfRooms, ptsv2paymentsTravelInformationLodging.numberOfRooms) &&
        Objects.equals(this.numberOfGuests, ptsv2paymentsTravelInformationLodging.numberOfGuests) &&
        Objects.equals(this.roomBedType, ptsv2paymentsTravelInformationLodging.roomBedType) &&
        Objects.equals(this.roomTaxType, ptsv2paymentsTravelInformationLodging.roomTaxType) &&
        Objects.equals(this.roomRateType, ptsv2paymentsTravelInformationLodging.roomRateType) &&
        Objects.equals(this.guestName, ptsv2paymentsTravelInformationLodging.guestName) &&
        Objects.equals(this.customerServicePhoneNumber, ptsv2paymentsTravelInformationLodging.customerServicePhoneNumber) &&
        Objects.equals(this.corporateClientCode, ptsv2paymentsTravelInformationLodging.corporateClientCode) &&
        Objects.equals(this.additionalDiscountAmount, ptsv2paymentsTravelInformationLodging.additionalDiscountAmount) &&
        Objects.equals(this.roomLocation, ptsv2paymentsTravelInformationLodging.roomLocation) &&
        Objects.equals(this.specialProgramCode, ptsv2paymentsTravelInformationLodging.specialProgramCode) &&
        Objects.equals(this.totalTaxAmount, ptsv2paymentsTravelInformationLodging.totalTaxAmount) &&
        Objects.equals(this.prepaidCost, ptsv2paymentsTravelInformationLodging.prepaidCost) &&
        Objects.equals(this.foodAndBeverageCost, ptsv2paymentsTravelInformationLodging.foodAndBeverageCost) &&
        Objects.equals(this.roomTaxAmount, ptsv2paymentsTravelInformationLodging.roomTaxAmount) &&
        Objects.equals(this.adjustmentAmount, ptsv2paymentsTravelInformationLodging.adjustmentAmount) &&
        Objects.equals(this.phoneCost, ptsv2paymentsTravelInformationLodging.phoneCost) &&
        Objects.equals(this.restaurantCost, ptsv2paymentsTravelInformationLodging.restaurantCost) &&
        Objects.equals(this.roomServiceCost, ptsv2paymentsTravelInformationLodging.roomServiceCost) &&
        Objects.equals(this.miniBarCost, ptsv2paymentsTravelInformationLodging.miniBarCost) &&
        Objects.equals(this.laundryCost, ptsv2paymentsTravelInformationLodging.laundryCost) &&
        Objects.equals(this.miscellaneousCost, ptsv2paymentsTravelInformationLodging.miscellaneousCost) &&
        Objects.equals(this.giftShopCost, ptsv2paymentsTravelInformationLodging.giftShopCost) &&
        Objects.equals(this.movieCost, ptsv2paymentsTravelInformationLodging.movieCost) &&
        Objects.equals(this.healthClubCost, ptsv2paymentsTravelInformationLodging.healthClubCost) &&
        Objects.equals(this.valetParkingCost, ptsv2paymentsTravelInformationLodging.valetParkingCost) &&
        Objects.equals(this.cashDisbursementCost, ptsv2paymentsTravelInformationLodging.cashDisbursementCost) &&
        Objects.equals(this.nonRoomCost, ptsv2paymentsTravelInformationLodging.nonRoomCost) &&
        Objects.equals(this.businessCenterCost, ptsv2paymentsTravelInformationLodging.businessCenterCost) &&
        Objects.equals(this.loungeBarCost, ptsv2paymentsTravelInformationLodging.loungeBarCost) &&
        Objects.equals(this.transportationCost, ptsv2paymentsTravelInformationLodging.transportationCost) &&
        Objects.equals(this.gratuityAmount, ptsv2paymentsTravelInformationLodging.gratuityAmount) &&
        Objects.equals(this.conferenceRoomCost, ptsv2paymentsTravelInformationLodging.conferenceRoomCost) &&
        Objects.equals(this.audioVisualCost, ptsv2paymentsTravelInformationLodging.audioVisualCost) &&
        Objects.equals(this.banquestCost, ptsv2paymentsTravelInformationLodging.banquestCost) &&
        Objects.equals(this.nonRoomTaxAmount, ptsv2paymentsTravelInformationLodging.nonRoomTaxAmount) &&
        Objects.equals(this.earlyCheckOutCost, ptsv2paymentsTravelInformationLodging.earlyCheckOutCost) &&
        Objects.equals(this.internetAccessCost, ptsv2paymentsTravelInformationLodging.internetAccessCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkInDate, checkOutDate, room, smokingPreference, numberOfRooms, numberOfGuests, roomBedType, roomTaxType, roomRateType, guestName, customerServicePhoneNumber, corporateClientCode, additionalDiscountAmount, roomLocation, specialProgramCode, totalTaxAmount, prepaidCost, foodAndBeverageCost, roomTaxAmount, adjustmentAmount, phoneCost, restaurantCost, roomServiceCost, miniBarCost, laundryCost, miscellaneousCost, giftShopCost, movieCost, healthClubCost, valetParkingCost, cashDisbursementCost, nonRoomCost, businessCenterCost, loungeBarCost, transportationCost, gratuityAmount, conferenceRoomCost, audioVisualCost, banquestCost, nonRoomTaxAmount, earlyCheckOutCost, internetAccessCost);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTravelInformationLodging {\n");
    
    sb.append("    checkInDate: ").append(toIndentedString(checkInDate)).append("\n");
    sb.append("    checkOutDate: ").append(toIndentedString(checkOutDate)).append("\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    smokingPreference: ").append(toIndentedString(smokingPreference)).append("\n");
    sb.append("    numberOfRooms: ").append(toIndentedString(numberOfRooms)).append("\n");
    sb.append("    numberOfGuests: ").append(toIndentedString(numberOfGuests)).append("\n");
    sb.append("    roomBedType: ").append(toIndentedString(roomBedType)).append("\n");
    sb.append("    roomTaxType: ").append(toIndentedString(roomTaxType)).append("\n");
    sb.append("    roomRateType: ").append(toIndentedString(roomRateType)).append("\n");
    sb.append("    guestName: ").append(toIndentedString(guestName)).append("\n");
    sb.append("    customerServicePhoneNumber: ").append(toIndentedString(customerServicePhoneNumber)).append("\n");
    sb.append("    corporateClientCode: ").append(toIndentedString(corporateClientCode)).append("\n");
    sb.append("    additionalDiscountAmount: ").append(toIndentedString(additionalDiscountAmount)).append("\n");
    sb.append("    roomLocation: ").append(toIndentedString(roomLocation)).append("\n");
    sb.append("    specialProgramCode: ").append(toIndentedString(specialProgramCode)).append("\n");
    sb.append("    totalTaxAmount: ").append(toIndentedString(totalTaxAmount)).append("\n");
    sb.append("    prepaidCost: ").append(toIndentedString(prepaidCost)).append("\n");
    sb.append("    foodAndBeverageCost: ").append(toIndentedString(foodAndBeverageCost)).append("\n");
    sb.append("    roomTaxAmount: ").append(toIndentedString(roomTaxAmount)).append("\n");
    sb.append("    adjustmentAmount: ").append(toIndentedString(adjustmentAmount)).append("\n");
    sb.append("    phoneCost: ").append(toIndentedString(phoneCost)).append("\n");
    sb.append("    restaurantCost: ").append(toIndentedString(restaurantCost)).append("\n");
    sb.append("    roomServiceCost: ").append(toIndentedString(roomServiceCost)).append("\n");
    sb.append("    miniBarCost: ").append(toIndentedString(miniBarCost)).append("\n");
    sb.append("    laundryCost: ").append(toIndentedString(laundryCost)).append("\n");
    sb.append("    miscellaneousCost: ").append(toIndentedString(miscellaneousCost)).append("\n");
    sb.append("    giftShopCost: ").append(toIndentedString(giftShopCost)).append("\n");
    sb.append("    movieCost: ").append(toIndentedString(movieCost)).append("\n");
    sb.append("    healthClubCost: ").append(toIndentedString(healthClubCost)).append("\n");
    sb.append("    valetParkingCost: ").append(toIndentedString(valetParkingCost)).append("\n");
    sb.append("    cashDisbursementCost: ").append(toIndentedString(cashDisbursementCost)).append("\n");
    sb.append("    nonRoomCost: ").append(toIndentedString(nonRoomCost)).append("\n");
    sb.append("    businessCenterCost: ").append(toIndentedString(businessCenterCost)).append("\n");
    sb.append("    loungeBarCost: ").append(toIndentedString(loungeBarCost)).append("\n");
    sb.append("    transportationCost: ").append(toIndentedString(transportationCost)).append("\n");
    sb.append("    gratuityAmount: ").append(toIndentedString(gratuityAmount)).append("\n");
    sb.append("    conferenceRoomCost: ").append(toIndentedString(conferenceRoomCost)).append("\n");
    sb.append("    audioVisualCost: ").append(toIndentedString(audioVisualCost)).append("\n");
    sb.append("    banquestCost: ").append(toIndentedString(banquestCost)).append("\n");
    sb.append("    nonRoomTaxAmount: ").append(toIndentedString(nonRoomTaxAmount)).append("\n");
    sb.append("    earlyCheckOutCost: ").append(toIndentedString(earlyCheckOutCost)).append("\n");
    sb.append("    internetAccessCost: ").append(toIndentedString(internetAccessCost)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

