package com.ibm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.model.RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure;

import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Output: ReCR Retrieve details about a payment execution instruction
 */

@Schema(name = "RetrievePaymentExecutionProcedureResponse", description = "Output: ReCR Retrieve details about a payment execution instruction")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-22T13:00:04.063178682Z[GMT]")
public class RetrievePaymentExecutionProcedureResponse {

  private RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure;

  public RetrievePaymentExecutionProcedureResponse paymentExecutionProcedure(RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
    return this;
  }

  /**
   * Get paymentExecutionProcedure
   * @return paymentExecutionProcedure
  */
  @Valid 
  @Schema(name = "PaymentExecutionProcedure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentExecutionProcedure")
  public RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure getPaymentExecutionProcedure() {
    return paymentExecutionProcedure;
  }

  public void setPaymentExecutionProcedure(RetrievePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievePaymentExecutionProcedureResponse retrievePaymentExecutionProcedureResponse = (RetrievePaymentExecutionProcedureResponse) o;
    return Objects.equals(this.paymentExecutionProcedure, retrievePaymentExecutionProcedureResponse.paymentExecutionProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievePaymentExecutionProcedureResponse {\n");
    sb.append("    paymentExecutionProcedure: ").append(toIndentedString(paymentExecutionProcedure)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

