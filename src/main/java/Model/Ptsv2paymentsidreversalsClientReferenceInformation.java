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
import Model.Ptsv2paymentsidreversalsClientReferenceInformationPartner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsidreversalsClientReferenceInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class Ptsv2paymentsidreversalsClientReferenceInformation {
  @SerializedName("code")
  private String code = null;

  @SerializedName("pausedRequestId")
  private String pausedRequestId = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("partner")
  private Ptsv2paymentsidreversalsClientReferenceInformationPartner partner = null;

  @SerializedName("applicationName")
  private String applicationName = null;

  @SerializedName("applicationVersion")
  private String applicationVersion = null;

  @SerializedName("applicationUser")
  private String applicationUser = null;

  public Ptsv2paymentsidreversalsClientReferenceInformation code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Merchant-generated order reference or tracking number. It is recommended that you send a unique value for each transaction so that you can perform meaningful searches for the transaction.  #### Used by **Authorization** Required field.  #### PIN Debit Requests for PIN debit reversals need to use the same merchant reference number that was used in the transaction that is being reversed.  Required field for all PIN Debit requests (purchase, credit, and reversal).  #### FDC Nashville Global Certain circumstances can cause the processor to truncate this value to 15 or 17 characters for Level II and Level III processing, which can cause a discrepancy between the value you submit and the value included in some processor reports. 
   * @return code
  **/
  @ApiModelProperty(value = "Merchant-generated order reference or tracking number. It is recommended that you send a unique value for each transaction so that you can perform meaningful searches for the transaction.  #### Used by **Authorization** Required field.  #### PIN Debit Requests for PIN debit reversals need to use the same merchant reference number that was used in the transaction that is being reversed.  Required field for all PIN Debit requests (purchase, credit, and reversal).  #### FDC Nashville Global Certain circumstances can cause the processor to truncate this value to 15 or 17 characters for Level II and Level III processing, which can cause a discrepancy between the value you submit and the value included in some processor reports. ")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Ptsv2paymentsidreversalsClientReferenceInformation pausedRequestId(String pausedRequestId) {
    this.pausedRequestId = pausedRequestId;
    return this;
  }

   /**
   * Used to resume a transaction that was paused for an order modification rule to allow for payer authentication to complete. To resume and continue with the authorization/decision service flow, call the services and include the request id from the prior decision call. 
   * @return pausedRequestId
  **/
  @ApiModelProperty(value = "Used to resume a transaction that was paused for an order modification rule to allow for payer authentication to complete. To resume and continue with the authorization/decision service flow, call the services and include the request id from the prior decision call. ")
  public String getPausedRequestId() {
    return pausedRequestId;
  }

  public void setPausedRequestId(String pausedRequestId) {
    this.pausedRequestId = pausedRequestId;
  }

  public Ptsv2paymentsidreversalsClientReferenceInformation comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Comments
   * @return comments
  **/
  @ApiModelProperty(value = "Comments")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public Ptsv2paymentsidreversalsClientReferenceInformation partner(Ptsv2paymentsidreversalsClientReferenceInformationPartner partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsClientReferenceInformationPartner getPartner() {
    return partner;
  }

  public void setPartner(Ptsv2paymentsidreversalsClientReferenceInformationPartner partner) {
    this.partner = partner;
  }

  public Ptsv2paymentsidreversalsClientReferenceInformation applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * The name of the Connection Method client (such as Virtual Terminal or SOAP Toolkit API) that the merchant uses to send a transaction request to CyberSource. 
   * @return applicationName
  **/
  @ApiModelProperty(value = "The name of the Connection Method client (such as Virtual Terminal or SOAP Toolkit API) that the merchant uses to send a transaction request to CyberSource. ")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public Ptsv2paymentsidreversalsClientReferenceInformation applicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
    return this;
  }

   /**
   * Version of the CyberSource application or integration used for a transaction. 
   * @return applicationVersion
  **/
  @ApiModelProperty(value = "Version of the CyberSource application or integration used for a transaction. ")
  public String getApplicationVersion() {
    return applicationVersion;
  }

  public void setApplicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

  public Ptsv2paymentsidreversalsClientReferenceInformation applicationUser(String applicationUser) {
    this.applicationUser = applicationUser;
    return this;
  }

   /**
   * The entity that is responsible for running the transaction and submitting the processing request to CyberSource. This could be a person, a system, or a connection method. 
   * @return applicationUser
  **/
  @ApiModelProperty(value = "The entity that is responsible for running the transaction and submitting the processing request to CyberSource. This could be a person, a system, or a connection method. ")
  public String getApplicationUser() {
    return applicationUser;
  }

  public void setApplicationUser(String applicationUser) {
    this.applicationUser = applicationUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsidreversalsClientReferenceInformation ptsv2paymentsidreversalsClientReferenceInformation = (Ptsv2paymentsidreversalsClientReferenceInformation) o;
    return Objects.equals(this.code, ptsv2paymentsidreversalsClientReferenceInformation.code) &&
        Objects.equals(this.pausedRequestId, ptsv2paymentsidreversalsClientReferenceInformation.pausedRequestId) &&
        Objects.equals(this.comments, ptsv2paymentsidreversalsClientReferenceInformation.comments) &&
        Objects.equals(this.partner, ptsv2paymentsidreversalsClientReferenceInformation.partner) &&
        Objects.equals(this.applicationName, ptsv2paymentsidreversalsClientReferenceInformation.applicationName) &&
        Objects.equals(this.applicationVersion, ptsv2paymentsidreversalsClientReferenceInformation.applicationVersion) &&
        Objects.equals(this.applicationUser, ptsv2paymentsidreversalsClientReferenceInformation.applicationUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, pausedRequestId, comments, partner, applicationName, applicationVersion, applicationUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsidreversalsClientReferenceInformation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    pausedRequestId: ").append(toIndentedString(pausedRequestId)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    applicationUser: ").append(toIndentedString(applicationUser)).append("\n");
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

