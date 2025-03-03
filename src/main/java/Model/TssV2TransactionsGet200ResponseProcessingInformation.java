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
import Model.TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions;
import Model.TssV2TransactionsGet200ResponseProcessingInformationBankTransferOptions;
import Model.TssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsGet200ResponseProcessingInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class TssV2TransactionsGet200ResponseProcessingInformation {
  @SerializedName("industryDataType")
  private String industryDataType = null;

  @SerializedName("paymentSolution")
  private String paymentSolution = null;

  @SerializedName("commerceIndicator")
  private String commerceIndicator = null;

  @SerializedName("businessApplicationId")
  private String businessApplicationId = null;

  @SerializedName("authorizationOptions")
  private TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions authorizationOptions = null;

  @SerializedName("bankTransferOptions")
  private TssV2TransactionsGet200ResponseProcessingInformationBankTransferOptions bankTransferOptions = null;

  @SerializedName("japanPaymentOptions")
  private TssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions japanPaymentOptions = null;

  public TssV2TransactionsGet200ResponseProcessingInformation industryDataType(String industryDataType) {
    this.industryDataType = industryDataType;
    return this;
  }

   /**
   * Indicates that the transaction includes industry-specific data.  Possible Values: - &#x60;airline&#x60; - &#x60;restaurant&#x60; - &#x60;lodging&#x60; - &#x60;auto_rental&#x60; - &#x60;transit&#x60; - &#x60;healthcare_medical&#x60; - &#x60;healthcare_transit&#x60; - &#x60;transit&#x60;  #### Card Present, Airlines and Auto Rental You must set this field to &#x60;airline&#x60; in order for airline data to be sent to the processor. For example, if this field is not set to &#x60;airline&#x60; or is not included in the request, no airline data is sent to the processor.  You must set this field to &#x60;restaurant&#x60; in order for restaurant data to be sent to the processor. When this field is not set to &#x60;restaurant&#x60; or is not included in the request, no restaurant data is sent to the processor.  You must set this field to &#x60;auto_rental&#x60; in order for auto rental data to be sent to the processor. For example, if this field is not set to &#x60;auto_rental&#x60; or is not included in the request, no auto rental data is sent to the processor.  Restaurant data is supported only on CyberSource through VisaNet. 
   * @return industryDataType
  **/
  @ApiModelProperty(value = "Indicates that the transaction includes industry-specific data.  Possible Values: - `airline` - `restaurant` - `lodging` - `auto_rental` - `transit` - `healthcare_medical` - `healthcare_transit` - `transit`  #### Card Present, Airlines and Auto Rental You must set this field to `airline` in order for airline data to be sent to the processor. For example, if this field is not set to `airline` or is not included in the request, no airline data is sent to the processor.  You must set this field to `restaurant` in order for restaurant data to be sent to the processor. When this field is not set to `restaurant` or is not included in the request, no restaurant data is sent to the processor.  You must set this field to `auto_rental` in order for auto rental data to be sent to the processor. For example, if this field is not set to `auto_rental` or is not included in the request, no auto rental data is sent to the processor.  Restaurant data is supported only on CyberSource through VisaNet. ")
  public String getIndustryDataType() {
    return industryDataType;
  }

  public void setIndustryDataType(String industryDataType) {
    this.industryDataType = industryDataType;
  }

  public TssV2TransactionsGet200ResponseProcessingInformation paymentSolution(String paymentSolution) {
    this.paymentSolution = paymentSolution;
    return this;
  }

   /**
   * Type of digital payment solution for the transaction.  
   * @return paymentSolution
  **/
  @ApiModelProperty(value = "Type of digital payment solution for the transaction.  ")
  public String getPaymentSolution() {
    return paymentSolution;
  }

  public void setPaymentSolution(String paymentSolution) {
    this.paymentSolution = paymentSolution;
  }

  public TssV2TransactionsGet200ResponseProcessingInformation commerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
    return this;
  }

   /**
   * Type of transaction. Some payment card companies use this information when determining discount rates.  #### Used by **Authorization** Required payer authentication transactions; otherwise, optional. **Credit** Required for standalone credits on Chase Paymentech solutions; otherwise, optional. Only &#x60;internet&#x60;, &#x60;moto&#x60;, &#x60;install&#x60;, &#x60;recurring&#x60;, and &#x60;recurring_internet&#x60; are valid values.  #### Ingenico ePayments When you omit this field for Ingenico ePayments, the processor uses the default transaction type they have on file for you instead of the default value (listed in Appendix I, \&quot;Commerce Indicators,\&quot; on page 441.)  #### Payer Authentication Transactions For the possible values and requirements, see \&quot;Payer Authentication,\&quot; page 195.  #### Other Types of Transactions See Appendix I, \&quot;Commerce Indicators,\&quot; on page 441.  #### Card Present You must set this field to &#x60;retail&#x60;. This field is required for a card-present transaction. Note that this should ONLY be used when the cardholder and card are present at the time of the transaction. For all keyed transactions originated from a POS terminal where the cardholder and card are not present, commerceIndicator should be submitted as “moto\&quot; 
   * @return commerceIndicator
  **/
  @ApiModelProperty(value = "Type of transaction. Some payment card companies use this information when determining discount rates.  #### Used by **Authorization** Required payer authentication transactions; otherwise, optional. **Credit** Required for standalone credits on Chase Paymentech solutions; otherwise, optional. Only `internet`, `moto`, `install`, `recurring`, and `recurring_internet` are valid values.  #### Ingenico ePayments When you omit this field for Ingenico ePayments, the processor uses the default transaction type they have on file for you instead of the default value (listed in Appendix I, \"Commerce Indicators,\" on page 441.)  #### Payer Authentication Transactions For the possible values and requirements, see \"Payer Authentication,\" page 195.  #### Other Types of Transactions See Appendix I, \"Commerce Indicators,\" on page 441.  #### Card Present You must set this field to `retail`. This field is required for a card-present transaction. Note that this should ONLY be used when the cardholder and card are present at the time of the transaction. For all keyed transactions originated from a POS terminal where the cardholder and card are not present, commerceIndicator should be submitted as “moto\" ")
  public String getCommerceIndicator() {
    return commerceIndicator;
  }

  public void setCommerceIndicator(String commerceIndicator) {
    this.commerceIndicator = commerceIndicator;
  }

  public TssV2TransactionsGet200ResponseProcessingInformation businessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
    return this;
  }

   /**
   * Payouts transaction type. Required for OCT transactions. This field is a pass-through, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor. **Note** When the request includes this field, this value overrides the information in your CyberSource account.  For valid values, see the &#x60;invoiceHeader_businessApplicationID&#x60; field description in [Payouts Using the Simple Order API.](http://apps.cybersource.com/library/documentation/dev_guides/payouts_SO/Payouts_SO_API.pdf) 
   * @return businessApplicationId
  **/
  @ApiModelProperty(value = "Payouts transaction type. Required for OCT transactions. This field is a pass-through, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor. **Note** When the request includes this field, this value overrides the information in your CyberSource account.  For valid values, see the `invoiceHeader_businessApplicationID` field description in [Payouts Using the Simple Order API.](http://apps.cybersource.com/library/documentation/dev_guides/payouts_SO/Payouts_SO_API.pdf) ")
  public String getBusinessApplicationId() {
    return businessApplicationId;
  }

  public void setBusinessApplicationId(String businessApplicationId) {
    this.businessApplicationId = businessApplicationId;
  }

  public TssV2TransactionsGet200ResponseProcessingInformation authorizationOptions(TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions authorizationOptions) {
    this.authorizationOptions = authorizationOptions;
    return this;
  }

   /**
   * Get authorizationOptions
   * @return authorizationOptions
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions getAuthorizationOptions() {
    return authorizationOptions;
  }

  public void setAuthorizationOptions(TssV2TransactionsGet200ResponseProcessingInformationAuthorizationOptions authorizationOptions) {
    this.authorizationOptions = authorizationOptions;
  }

  public TssV2TransactionsGet200ResponseProcessingInformation bankTransferOptions(TssV2TransactionsGet200ResponseProcessingInformationBankTransferOptions bankTransferOptions) {
    this.bankTransferOptions = bankTransferOptions;
    return this;
  }

   /**
   * Get bankTransferOptions
   * @return bankTransferOptions
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseProcessingInformationBankTransferOptions getBankTransferOptions() {
    return bankTransferOptions;
  }

  public void setBankTransferOptions(TssV2TransactionsGet200ResponseProcessingInformationBankTransferOptions bankTransferOptions) {
    this.bankTransferOptions = bankTransferOptions;
  }

  public TssV2TransactionsGet200ResponseProcessingInformation japanPaymentOptions(TssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions japanPaymentOptions) {
    this.japanPaymentOptions = japanPaymentOptions;
    return this;
  }

   /**
   * Get japanPaymentOptions
   * @return japanPaymentOptions
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions getJapanPaymentOptions() {
    return japanPaymentOptions;
  }

  public void setJapanPaymentOptions(TssV2TransactionsGet200ResponseProcessingInformationJapanPaymentOptions japanPaymentOptions) {
    this.japanPaymentOptions = japanPaymentOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponseProcessingInformation tssV2TransactionsGet200ResponseProcessingInformation = (TssV2TransactionsGet200ResponseProcessingInformation) o;
    return Objects.equals(this.industryDataType, tssV2TransactionsGet200ResponseProcessingInformation.industryDataType) &&
        Objects.equals(this.paymentSolution, tssV2TransactionsGet200ResponseProcessingInformation.paymentSolution) &&
        Objects.equals(this.commerceIndicator, tssV2TransactionsGet200ResponseProcessingInformation.commerceIndicator) &&
        Objects.equals(this.businessApplicationId, tssV2TransactionsGet200ResponseProcessingInformation.businessApplicationId) &&
        Objects.equals(this.authorizationOptions, tssV2TransactionsGet200ResponseProcessingInformation.authorizationOptions) &&
        Objects.equals(this.bankTransferOptions, tssV2TransactionsGet200ResponseProcessingInformation.bankTransferOptions) &&
        Objects.equals(this.japanPaymentOptions, tssV2TransactionsGet200ResponseProcessingInformation.japanPaymentOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(industryDataType, paymentSolution, commerceIndicator, businessApplicationId, authorizationOptions, bankTransferOptions, japanPaymentOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponseProcessingInformation {\n");
    
    sb.append("    industryDataType: ").append(toIndentedString(industryDataType)).append("\n");
    sb.append("    paymentSolution: ").append(toIndentedString(paymentSolution)).append("\n");
    sb.append("    commerceIndicator: ").append(toIndentedString(commerceIndicator)).append("\n");
    sb.append("    businessApplicationId: ").append(toIndentedString(businessApplicationId)).append("\n");
    sb.append("    authorizationOptions: ").append(toIndentedString(authorizationOptions)).append("\n");
    sb.append("    bankTransferOptions: ").append(toIndentedString(bankTransferOptions)).append("\n");
    sb.append("    japanPaymentOptions: ").append(toIndentedString(japanPaymentOptions)).append("\n");
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

