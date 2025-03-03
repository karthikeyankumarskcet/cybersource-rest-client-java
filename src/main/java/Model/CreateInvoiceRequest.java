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
import Model.Invoicingv2invoicesCustomerInformation;
import Model.Invoicingv2invoicesInvoiceInformation;
import Model.Invoicingv2invoicesOrderInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateInvoiceRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class CreateInvoiceRequest {
  @SerializedName("customerInformation")
  private Invoicingv2invoicesCustomerInformation customerInformation = null;

  @SerializedName("invoiceInformation")
  private Invoicingv2invoicesInvoiceInformation invoiceInformation = null;

  @SerializedName("orderInformation")
  private Invoicingv2invoicesOrderInformation orderInformation = null;

  public CreateInvoiceRequest customerInformation(Invoicingv2invoicesCustomerInformation customerInformation) {
    this.customerInformation = customerInformation;
    return this;
  }

   /**
   * Get customerInformation
   * @return customerInformation
  **/
  @ApiModelProperty(value = "")
  public Invoicingv2invoicesCustomerInformation getCustomerInformation() {
    return customerInformation;
  }

  public void setCustomerInformation(Invoicingv2invoicesCustomerInformation customerInformation) {
    this.customerInformation = customerInformation;
  }

  public CreateInvoiceRequest invoiceInformation(Invoicingv2invoicesInvoiceInformation invoiceInformation) {
    this.invoiceInformation = invoiceInformation;
    return this;
  }

   /**
   * Get invoiceInformation
   * @return invoiceInformation
  **/
  @ApiModelProperty(value = "")
  public Invoicingv2invoicesInvoiceInformation getInvoiceInformation() {
    return invoiceInformation;
  }

  public void setInvoiceInformation(Invoicingv2invoicesInvoiceInformation invoiceInformation) {
    this.invoiceInformation = invoiceInformation;
  }

  public CreateInvoiceRequest orderInformation(Invoicingv2invoicesOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public Invoicingv2invoicesOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(Invoicingv2invoicesOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInvoiceRequest createInvoiceRequest = (CreateInvoiceRequest) o;
    return Objects.equals(this.customerInformation, createInvoiceRequest.customerInformation) &&
        Objects.equals(this.invoiceInformation, createInvoiceRequest.invoiceInformation) &&
        Objects.equals(this.orderInformation, createInvoiceRequest.orderInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerInformation, invoiceInformation, orderInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInvoiceRequest {\n");
    
    sb.append("    customerInformation: ").append(toIndentedString(customerInformation)).append("\n");
    sb.append("    invoiceInformation: ").append(toIndentedString(invoiceInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
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

