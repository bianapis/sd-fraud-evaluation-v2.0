package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRuleSetsandDecisionTreesRetrieveInputModelRuleSetsandDecisionTreesInstanceAnalysis
 */
public class BQRuleSetsandDecisionTreesRetrieveInputModelRuleSetsandDecisionTreesInstanceAnalysis   {
  private String ruleSetsandDecisionTreesInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return ruleSetsandDecisionTreesInstanceAnalysisReference
  **/

  public String getRuleSetsandDecisionTreesInstanceAnalysisReference() {
    return ruleSetsandDecisionTreesInstanceAnalysisReference;
  }

  public void setRuleSetsandDecisionTreesInstanceAnalysisReference(String ruleSetsandDecisionTreesInstanceAnalysisReference) {
    this.ruleSetsandDecisionTreesInstanceAnalysisReference = ruleSetsandDecisionTreesInstanceAnalysisReference;
  }


}

