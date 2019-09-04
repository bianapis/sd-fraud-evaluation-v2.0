package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRuleSetsandDecisionTreesRetrieveInputModelRuleSetsandDecisionTreesInstanceReport
 */
public class BQRuleSetsandDecisionTreesRetrieveInputModelRuleSetsandDecisionTreesInstanceReport   {
  private String ruleSetsandDecisionTreesInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return ruleSetsandDecisionTreesInstanceReportReference
  **/

  public String getRuleSetsandDecisionTreesInstanceReportReference() {
    return ruleSetsandDecisionTreesInstanceReportReference;
  }

  public void setRuleSetsandDecisionTreesInstanceReportReference(String ruleSetsandDecisionTreesInstanceReportReference) {
    this.ruleSetsandDecisionTreesInstanceReportReference = ruleSetsandDecisionTreesInstanceReportReference;
  }


}

