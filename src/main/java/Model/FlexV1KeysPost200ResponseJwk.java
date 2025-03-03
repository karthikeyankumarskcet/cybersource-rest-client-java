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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The public key in JSON Web Key (JWK) format. This format is useful for client side encryption in JavaScript based implementations.
 */
@ApiModel(description = "The public key in JSON Web Key (JWK) format. This format is useful for client side encryption in JavaScript based implementations.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class FlexV1KeysPost200ResponseJwk {
  @SerializedName("kty")
  private String kty = null;

  @SerializedName("use")
  private String use = null;

  @SerializedName("kid")
  private String kid = null;

  @SerializedName("n")
  private String n = null;

  @SerializedName("e")
  private String e = null;

  public FlexV1KeysPost200ResponseJwk kty(String kty) {
    this.kty = kty;
    return this;
  }

   /**
   * Algorithm used to encrypt the public key.
   * @return kty
  **/
  @ApiModelProperty(value = "Algorithm used to encrypt the public key.")
  public String getKty() {
    return kty;
  }

  public void setKty(String kty) {
    this.kty = kty;
  }

  public FlexV1KeysPost200ResponseJwk use(String use) {
    this.use = use;
    return this;
  }

   /**
   * Defines whether to use the key for encryption (enc) or verifying a signature (sig). Always returned as enc.
   * @return use
  **/
  @ApiModelProperty(value = "Defines whether to use the key for encryption (enc) or verifying a signature (sig). Always returned as enc.")
  public String getUse() {
    return use;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public FlexV1KeysPost200ResponseJwk kid(String kid) {
    this.kid = kid;
    return this;
  }

   /**
   * The key ID in JWK format.
   * @return kid
  **/
  @ApiModelProperty(value = "The key ID in JWK format.")
  public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }

  public FlexV1KeysPost200ResponseJwk n(String n) {
    this.n = n;
    return this;
  }

   /**
   * JWK RSA Modulus
   * @return n
  **/
  @ApiModelProperty(value = "JWK RSA Modulus")
  public String getN() {
    return n;
  }

  public void setN(String n) {
    this.n = n;
  }

  public FlexV1KeysPost200ResponseJwk e(String e) {
    this.e = e;
    return this;
  }

   /**
   * JWK RSA Exponent
   * @return e
  **/
  @ApiModelProperty(value = "JWK RSA Exponent")
  public String getE() {
    return e;
  }

  public void setE(String e) {
    this.e = e;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlexV1KeysPost200ResponseJwk flexV1KeysPost200ResponseJwk = (FlexV1KeysPost200ResponseJwk) o;
    return Objects.equals(this.kty, flexV1KeysPost200ResponseJwk.kty) &&
        Objects.equals(this.use, flexV1KeysPost200ResponseJwk.use) &&
        Objects.equals(this.kid, flexV1KeysPost200ResponseJwk.kid) &&
        Objects.equals(this.n, flexV1KeysPost200ResponseJwk.n) &&
        Objects.equals(this.e, flexV1KeysPost200ResponseJwk.e);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kty, use, kid, n, e);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlexV1KeysPost200ResponseJwk {\n");
    
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
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

