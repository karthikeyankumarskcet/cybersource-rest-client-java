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
import Model.PtsV1TransactionBatchesIdGet200ResponseLinks;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV1TransactionBatchesIdGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class PtsV1TransactionBatchesIdGet200Response {
  @SerializedName("id")
  private String id = null;

  @SerializedName("uploadDate")
  private String uploadDate = null;

  @SerializedName("completionDate")
  private String completionDate = null;

  @SerializedName("transactionCount")
  private Integer transactionCount = null;

  @SerializedName("acceptedTransactionCount")
  private Integer acceptedTransactionCount = null;

  @SerializedName("rejectedTransactionCount")
  private String rejectedTransactionCount = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("_links")
  private PtsV1TransactionBatchesIdGet200ResponseLinks links = null;

  public PtsV1TransactionBatchesIdGet200Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier assigned to the batch file.
   * @return id
  **/
  @ApiModelProperty(example = "psy8s1d", value = "Unique identifier assigned to the batch file.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PtsV1TransactionBatchesIdGet200Response uploadDate(String uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

   /**
   * Date when the batch template was update.
   * @return uploadDate
  **/
  @ApiModelProperty(example = "2018-01-01", value = "Date when the batch template was update.")
  public String getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(String uploadDate) {
    this.uploadDate = uploadDate;
  }

  public PtsV1TransactionBatchesIdGet200Response completionDate(String completionDate) {
    this.completionDate = completionDate;
    return this;
  }

   /**
   * The date when the batch template processing completed.
   * @return completionDate
  **/
  @ApiModelProperty(example = "2018-01-01", value = "The date when the batch template processing completed.")
  public String getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(String completionDate) {
    this.completionDate = completionDate;
  }

  public PtsV1TransactionBatchesIdGet200Response transactionCount(Integer transactionCount) {
    this.transactionCount = transactionCount;
    return this;
  }

   /**
   * Number of transactions in the transaction.
   * @return transactionCount
  **/
  @ApiModelProperty(example = "7534", value = "Number of transactions in the transaction.")
  public Integer getTransactionCount() {
    return transactionCount;
  }

  public void setTransactionCount(Integer transactionCount) {
    this.transactionCount = transactionCount;
  }

  public PtsV1TransactionBatchesIdGet200Response acceptedTransactionCount(Integer acceptedTransactionCount) {
    this.acceptedTransactionCount = acceptedTransactionCount;
    return this;
  }

   /**
   * Number of transactions accepted.
   * @return acceptedTransactionCount
  **/
  @ApiModelProperty(example = "50013", value = "Number of transactions accepted.")
  public Integer getAcceptedTransactionCount() {
    return acceptedTransactionCount;
  }

  public void setAcceptedTransactionCount(Integer acceptedTransactionCount) {
    this.acceptedTransactionCount = acceptedTransactionCount;
  }

  public PtsV1TransactionBatchesIdGet200Response rejectedTransactionCount(String rejectedTransactionCount) {
    this.rejectedTransactionCount = rejectedTransactionCount;
    return this;
  }

   /**
   * Number of transactions rejected.
   * @return rejectedTransactionCount
  **/
  @ApiModelProperty(example = "2508", value = "Number of transactions rejected.")
  public String getRejectedTransactionCount() {
    return rejectedTransactionCount;
  }

  public void setRejectedTransactionCount(String rejectedTransactionCount) {
    this.rejectedTransactionCount = rejectedTransactionCount;
  }

  public PtsV1TransactionBatchesIdGet200Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of you batch template processing.
   * @return status
  **/
  @ApiModelProperty(example = "Completed", value = "The status of you batch template processing.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PtsV1TransactionBatchesIdGet200Response links(PtsV1TransactionBatchesIdGet200ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public PtsV1TransactionBatchesIdGet200ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PtsV1TransactionBatchesIdGet200ResponseLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV1TransactionBatchesIdGet200Response ptsV1TransactionBatchesIdGet200Response = (PtsV1TransactionBatchesIdGet200Response) o;
    return Objects.equals(this.id, ptsV1TransactionBatchesIdGet200Response.id) &&
        Objects.equals(this.uploadDate, ptsV1TransactionBatchesIdGet200Response.uploadDate) &&
        Objects.equals(this.completionDate, ptsV1TransactionBatchesIdGet200Response.completionDate) &&
        Objects.equals(this.transactionCount, ptsV1TransactionBatchesIdGet200Response.transactionCount) &&
        Objects.equals(this.acceptedTransactionCount, ptsV1TransactionBatchesIdGet200Response.acceptedTransactionCount) &&
        Objects.equals(this.rejectedTransactionCount, ptsV1TransactionBatchesIdGet200Response.rejectedTransactionCount) &&
        Objects.equals(this.status, ptsV1TransactionBatchesIdGet200Response.status) &&
        Objects.equals(this.links, ptsV1TransactionBatchesIdGet200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uploadDate, completionDate, transactionCount, acceptedTransactionCount, rejectedTransactionCount, status, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV1TransactionBatchesIdGet200Response {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uploadDate: ").append(toIndentedString(uploadDate)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    transactionCount: ").append(toIndentedString(transactionCount)).append("\n");
    sb.append("    acceptedTransactionCount: ").append(toIndentedString(acceptedTransactionCount)).append("\n");
    sb.append("    rejectedTransactionCount: ").append(toIndentedString(rejectedTransactionCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

