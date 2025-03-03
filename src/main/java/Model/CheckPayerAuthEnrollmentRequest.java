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
import Model.Ptsv2paymentsAcquirerInformation;
import Model.Ptsv2paymentsRecurringPaymentInformation;
import Model.Riskv1authenticationsBuyerInformation;
import Model.Riskv1authenticationsDeviceInformation;
import Model.Riskv1authenticationsOrderInformation;
import Model.Riskv1authenticationsPaymentInformation;
import Model.Riskv1authenticationsRiskInformation;
import Model.Riskv1authenticationsTravelInformation;
import Model.Riskv1authenticationsetupsProcessingInformation;
import Model.Riskv1authenticationsetupsTokenInformation;
import Model.Riskv1decisionsClientReferenceInformation;
import Model.Riskv1decisionsConsumerAuthenticationInformation;
import Model.Riskv1decisionsMerchantDefinedInformation;
import Model.Riskv1decisionsMerchantInformation;
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
 * CheckPayerAuthEnrollmentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class CheckPayerAuthEnrollmentRequest {
  @SerializedName("clientReferenceInformation")
  private Riskv1decisionsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("orderInformation")
  private Riskv1authenticationsOrderInformation orderInformation = null;

  @SerializedName("paymentInformation")
  private Riskv1authenticationsPaymentInformation paymentInformation = null;

  @SerializedName("processingInformation")
  private Riskv1authenticationsetupsProcessingInformation processingInformation = null;

  @SerializedName("tokenInformation")
  private Riskv1authenticationsetupsTokenInformation tokenInformation = null;

  @SerializedName("buyerInformation")
  private Riskv1authenticationsBuyerInformation buyerInformation = null;

  @SerializedName("deviceInformation")
  private Riskv1authenticationsDeviceInformation deviceInformation = null;

  @SerializedName("merchantInformation")
  private Riskv1decisionsMerchantInformation merchantInformation = null;

  @SerializedName("acquirerInformation")
  private Ptsv2paymentsAcquirerInformation acquirerInformation = null;

  @SerializedName("recurringPaymentInformation")
  private Ptsv2paymentsRecurringPaymentInformation recurringPaymentInformation = null;

  @SerializedName("consumerAuthenticationInformation")
  private Riskv1decisionsConsumerAuthenticationInformation consumerAuthenticationInformation = null;

  @SerializedName("riskInformation")
  private Riskv1authenticationsRiskInformation riskInformation = null;

  @SerializedName("travelInformation")
  private Riskv1authenticationsTravelInformation travelInformation = null;

  @SerializedName("merchantDefinedInformation")
  private List<Riskv1decisionsMerchantDefinedInformation> merchantDefinedInformation = null;

  public CheckPayerAuthEnrollmentRequest clientReferenceInformation(Riskv1decisionsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(Riskv1decisionsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public CheckPayerAuthEnrollmentRequest orderInformation(Riskv1authenticationsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Riskv1authenticationsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public CheckPayerAuthEnrollmentRequest paymentInformation(Riskv1authenticationsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(Riskv1authenticationsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public CheckPayerAuthEnrollmentRequest processingInformation(Riskv1authenticationsetupsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsetupsProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Riskv1authenticationsetupsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public CheckPayerAuthEnrollmentRequest tokenInformation(Riskv1authenticationsetupsTokenInformation tokenInformation) {
    this.tokenInformation = tokenInformation;
    return this;
  }

   /**
   * Get tokenInformation
   * @return tokenInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsetupsTokenInformation getTokenInformation() {
    return tokenInformation;
  }

  public void setTokenInformation(Riskv1authenticationsetupsTokenInformation tokenInformation) {
    this.tokenInformation = tokenInformation;
  }

  public CheckPayerAuthEnrollmentRequest buyerInformation(Riskv1authenticationsBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(Riskv1authenticationsBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public CheckPayerAuthEnrollmentRequest deviceInformation(Riskv1authenticationsDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
    return this;
  }

   /**
   * Get deviceInformation
   * @return deviceInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsDeviceInformation getDeviceInformation() {
    return deviceInformation;
  }

  public void setDeviceInformation(Riskv1authenticationsDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
  }

  public CheckPayerAuthEnrollmentRequest merchantInformation(Riskv1decisionsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(Riskv1decisionsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public CheckPayerAuthEnrollmentRequest acquirerInformation(Ptsv2paymentsAcquirerInformation acquirerInformation) {
    this.acquirerInformation = acquirerInformation;
    return this;
  }

   /**
   * Get acquirerInformation
   * @return acquirerInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsAcquirerInformation getAcquirerInformation() {
    return acquirerInformation;
  }

  public void setAcquirerInformation(Ptsv2paymentsAcquirerInformation acquirerInformation) {
    this.acquirerInformation = acquirerInformation;
  }

  public CheckPayerAuthEnrollmentRequest recurringPaymentInformation(Ptsv2paymentsRecurringPaymentInformation recurringPaymentInformation) {
    this.recurringPaymentInformation = recurringPaymentInformation;
    return this;
  }

   /**
   * Get recurringPaymentInformation
   * @return recurringPaymentInformation
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsRecurringPaymentInformation getRecurringPaymentInformation() {
    return recurringPaymentInformation;
  }

  public void setRecurringPaymentInformation(Ptsv2paymentsRecurringPaymentInformation recurringPaymentInformation) {
    this.recurringPaymentInformation = recurringPaymentInformation;
  }

  public CheckPayerAuthEnrollmentRequest consumerAuthenticationInformation(Riskv1decisionsConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
    return this;
  }

   /**
   * Get consumerAuthenticationInformation
   * @return consumerAuthenticationInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1decisionsConsumerAuthenticationInformation getConsumerAuthenticationInformation() {
    return consumerAuthenticationInformation;
  }

  public void setConsumerAuthenticationInformation(Riskv1decisionsConsumerAuthenticationInformation consumerAuthenticationInformation) {
    this.consumerAuthenticationInformation = consumerAuthenticationInformation;
  }

  public CheckPayerAuthEnrollmentRequest riskInformation(Riskv1authenticationsRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
    return this;
  }

   /**
   * Get riskInformation
   * @return riskInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsRiskInformation getRiskInformation() {
    return riskInformation;
  }

  public void setRiskInformation(Riskv1authenticationsRiskInformation riskInformation) {
    this.riskInformation = riskInformation;
  }

  public CheckPayerAuthEnrollmentRequest travelInformation(Riskv1authenticationsTravelInformation travelInformation) {
    this.travelInformation = travelInformation;
    return this;
  }

   /**
   * Get travelInformation
   * @return travelInformation
  **/
  @ApiModelProperty(value = "")
  public Riskv1authenticationsTravelInformation getTravelInformation() {
    return travelInformation;
  }

  public void setTravelInformation(Riskv1authenticationsTravelInformation travelInformation) {
    this.travelInformation = travelInformation;
  }

  public CheckPayerAuthEnrollmentRequest merchantDefinedInformation(List<Riskv1decisionsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
    return this;
  }

  public CheckPayerAuthEnrollmentRequest addMerchantDefinedInformationItem(Riskv1decisionsMerchantDefinedInformation merchantDefinedInformationItem) {
    if (this.merchantDefinedInformation == null) {
      this.merchantDefinedInformation = new ArrayList<Riskv1decisionsMerchantDefinedInformation>();
    }
    this.merchantDefinedInformation.add(merchantDefinedInformationItem);
    return this;
  }

   /**
   * Get merchantDefinedInformation
   * @return merchantDefinedInformation
  **/
  @ApiModelProperty(value = "")
  public List<Riskv1decisionsMerchantDefinedInformation> getMerchantDefinedInformation() {
    return merchantDefinedInformation;
  }

  public void setMerchantDefinedInformation(List<Riskv1decisionsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckPayerAuthEnrollmentRequest checkPayerAuthEnrollmentRequest = (CheckPayerAuthEnrollmentRequest) o;
    return Objects.equals(this.clientReferenceInformation, checkPayerAuthEnrollmentRequest.clientReferenceInformation) &&
        Objects.equals(this.orderInformation, checkPayerAuthEnrollmentRequest.orderInformation) &&
        Objects.equals(this.paymentInformation, checkPayerAuthEnrollmentRequest.paymentInformation) &&
        Objects.equals(this.processingInformation, checkPayerAuthEnrollmentRequest.processingInformation) &&
        Objects.equals(this.tokenInformation, checkPayerAuthEnrollmentRequest.tokenInformation) &&
        Objects.equals(this.buyerInformation, checkPayerAuthEnrollmentRequest.buyerInformation) &&
        Objects.equals(this.deviceInformation, checkPayerAuthEnrollmentRequest.deviceInformation) &&
        Objects.equals(this.merchantInformation, checkPayerAuthEnrollmentRequest.merchantInformation) &&
        Objects.equals(this.acquirerInformation, checkPayerAuthEnrollmentRequest.acquirerInformation) &&
        Objects.equals(this.recurringPaymentInformation, checkPayerAuthEnrollmentRequest.recurringPaymentInformation) &&
        Objects.equals(this.consumerAuthenticationInformation, checkPayerAuthEnrollmentRequest.consumerAuthenticationInformation) &&
        Objects.equals(this.riskInformation, checkPayerAuthEnrollmentRequest.riskInformation) &&
        Objects.equals(this.travelInformation, checkPayerAuthEnrollmentRequest.travelInformation) &&
        Objects.equals(this.merchantDefinedInformation, checkPayerAuthEnrollmentRequest.merchantDefinedInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, orderInformation, paymentInformation, processingInformation, tokenInformation, buyerInformation, deviceInformation, merchantInformation, acquirerInformation, recurringPaymentInformation, consumerAuthenticationInformation, riskInformation, travelInformation, merchantDefinedInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckPayerAuthEnrollmentRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    tokenInformation: ").append(toIndentedString(tokenInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    sb.append("    deviceInformation: ").append(toIndentedString(deviceInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    acquirerInformation: ").append(toIndentedString(acquirerInformation)).append("\n");
    sb.append("    recurringPaymentInformation: ").append(toIndentedString(recurringPaymentInformation)).append("\n");
    sb.append("    consumerAuthenticationInformation: ").append(toIndentedString(consumerAuthenticationInformation)).append("\n");
    sb.append("    riskInformation: ").append(toIndentedString(riskInformation)).append("\n");
    sb.append("    travelInformation: ").append(toIndentedString(travelInformation)).append("\n");
    sb.append("    merchantDefinedInformation: ").append(toIndentedString(merchantDefinedInformation)).append("\n");
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

