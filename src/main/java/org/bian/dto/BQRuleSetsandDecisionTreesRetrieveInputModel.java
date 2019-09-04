package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRuleSetsandDecisionTreesRetrieveInputModelRuleSetsandDecisionTreesInstanceAnalysis;
import org.bian.dto.BQRuleSetsandDecisionTreesRetrieveInputModelRuleSetsandDecisionTreesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRuleSetsandDecisionTreesRetrieveInputModel
 */
public class BQRuleSetsandDecisionTreesRetrieveInputModel   {
  private Object ruleSetsandDecisionTreesRetrieveActionTaskRecord = null;

  private String ruleSetsandDecisionTreesRetrieveActionRequest = null;

  private BQRuleSetsandDecisionTreesRetrieveInputModelRuleSetsandDecisionTreesInstanceReport ruleSetsandDecisionTreesInstanceReport = null;

  private BQRuleSetsandDecisionTreesRetrieveInputModelRuleSetsandDecisionTreesInstanceAnalysis ruleSetsandDecisionTreesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return ruleSetsandDecisionTreesRetrieveActionTaskRecord
  **/

  public Object getRuleSetsandDecisionTreesRetrieveActionTaskRecord() {
    return ruleSetsandDecisionTreesRetrieveActionTaskRecord;
  }

  public void setRuleSetsandDecisionTreesRetrieveActionTaskRecord(Object ruleSetsandDecisionTreesRetrieveActionTaskRecord) {
    this.ruleSetsandDecisionTreesRetrieveActionTaskRecord = ruleSetsandDecisionTreesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return ruleSetsandDecisionTreesRetrieveActionRequest
  **/

  public String getRuleSetsandDecisionTreesRetrieveActionRequest() {
    return ruleSetsandDecisionTreesRetrieveActionRequest;
  }

  public void setRuleSetsandDecisionTreesRetrieveActionRequest(String ruleSetsandDecisionTreesRetrieveActionRequest) {
    this.ruleSetsandDecisionTreesRetrieveActionRequest = ruleSetsandDecisionTreesRetrieveActionRequest;
  }


  /**
   * Get ruleSetsandDecisionTreesInstanceReport
   * @return ruleSetsandDecisionTreesInstanceReport
  **/

  public BQRuleSetsandDecisionTreesRetrieveInputModelRuleSetsandDecisionTreesInstanceReport getRuleSetsandDecisionTreesInstanceReport() {
    return ruleSetsandDecisionTreesInstanceReport;
  }

  public void setRuleSetsandDecisionTreesInstanceReport(BQRuleSetsandDecisionTreesRetrieveInputModelRuleSetsandDecisionTreesInstanceReport ruleSetsandDecisionTreesInstanceReport) {
    this.ruleSetsandDecisionTreesInstanceReport = ruleSetsandDecisionTreesInstanceReport;
  }


  /**
   * Get ruleSetsandDecisionTreesInstanceAnalysis
   * @return ruleSetsandDecisionTreesInstanceAnalysis
  **/

  public BQRuleSetsandDecisionTreesRetrieveInputModelRuleSetsandDecisionTreesInstanceAnalysis getRuleSetsandDecisionTreesInstanceAnalysis() {
    return ruleSetsandDecisionTreesInstanceAnalysis;
  }

  public void setRuleSetsandDecisionTreesInstanceAnalysis(BQRuleSetsandDecisionTreesRetrieveInputModelRuleSetsandDecisionTreesInstanceAnalysis ruleSetsandDecisionTreesInstanceAnalysis) {
    this.ruleSetsandDecisionTreesInstanceAnalysis = ruleSetsandDecisionTreesInstanceAnalysis;
  }


}

