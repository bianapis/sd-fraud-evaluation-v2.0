package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRuleSetsandDecisionTreesRetrieveOutputModelBQRuleSetsAndDecisionTreesInstanceRecord
 */
public class BQRuleSetsandDecisionTreesRetrieveOutputModelBQRuleSetsAndDecisionTreesInstanceRecord   {
  private String ruleSetsAndDecisionTreesTestResult = null;

  private String ruleSetsAndDecisionTreesTestWorkProduct = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The production transaction assessment test results, including reference to any potential fraud transactions - note this can be a real-time dataset 
   * @return ruleSetsAndDecisionTreesTestResult
  **/

  public String getRuleSetsAndDecisionTreesTestResult() {
    return ruleSetsAndDecisionTreesTestResult;
  }

  public void setRuleSetsAndDecisionTreesTestResult(String ruleSetsAndDecisionTreesTestResult) {
    this.ruleSetsAndDecisionTreesTestResult = ruleSetsAndDecisionTreesTestResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the assessment task 
   * @return ruleSetsAndDecisionTreesTestWorkProduct
  **/

  public String getRuleSetsAndDecisionTreesTestWorkProduct() {
    return ruleSetsAndDecisionTreesTestWorkProduct;
  }

  public void setRuleSetsAndDecisionTreesTestWorkProduct(String ruleSetsAndDecisionTreesTestWorkProduct) {
    this.ruleSetsAndDecisionTreesTestWorkProduct = ruleSetsAndDecisionTreesTestWorkProduct;
  }


}

