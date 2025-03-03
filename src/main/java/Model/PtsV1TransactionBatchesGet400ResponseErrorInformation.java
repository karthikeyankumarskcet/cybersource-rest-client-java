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
import Model.PtsV1TransactionBatchesGet400ResponseErrorInformationDetails;
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
 * PtsV1TransactionBatchesGet400ResponseErrorInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class PtsV1TransactionBatchesGet400ResponseErrorInformation {
  @SerializedName("reason")
  private String reason = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private List<PtsV1TransactionBatchesGet400ResponseErrorInformationDetails> details = null;

  public PtsV1TransactionBatchesGet400ResponseErrorInformation reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PtsV1TransactionBatchesGet400ResponseErrorInformation message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public PtsV1TransactionBatchesGet400ResponseErrorInformation details(List<PtsV1TransactionBatchesGet400ResponseErrorInformationDetails> details) {
    this.details = details;
    return this;
  }

  public PtsV1TransactionBatchesGet400ResponseErrorInformation addDetailsItem(PtsV1TransactionBatchesGet400ResponseErrorInformationDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<PtsV1TransactionBatchesGet400ResponseErrorInformationDetails>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<PtsV1TransactionBatchesGet400ResponseErrorInformationDetails> getDetails() {
    return details;
  }

  public void setDetails(List<PtsV1TransactionBatchesGet400ResponseErrorInformationDetails> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV1TransactionBatchesGet400ResponseErrorInformation ptsV1TransactionBatchesGet400ResponseErrorInformation = (PtsV1TransactionBatchesGet400ResponseErrorInformation) o;
    return Objects.equals(this.reason, ptsV1TransactionBatchesGet400ResponseErrorInformation.reason) &&
        Objects.equals(this.message, ptsV1TransactionBatchesGet400ResponseErrorInformation.message) &&
        Objects.equals(this.details, ptsV1TransactionBatchesGet400ResponseErrorInformation.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV1TransactionBatchesGet400ResponseErrorInformation {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

