package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQModelsRetrieveOutputModelBQModelsInstanceRecord
 */
public class BQModelsRetrieveOutputModelBQModelsInstanceRecord   {
  private String modelsTestResult = null;

  private String modelsTestWorkProduct = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The production transaction assessment test results, including reference to any potential fraud transactions - note this can be a real-time dataset 
   * @return modelsTestResult
  **/

  public String getModelsTestResult() {
    return modelsTestResult;
  }

  public void setModelsTestResult(String modelsTestResult) {
    this.modelsTestResult = modelsTestResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the assessment task 
   * @return modelsTestWorkProduct
  **/

  public String getModelsTestWorkProduct() {
    return modelsTestWorkProduct;
  }

  public void setModelsTestWorkProduct(String modelsTestWorkProduct) {
    this.modelsTestWorkProduct = modelsTestWorkProduct;
  }


}

