package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRuleSetsandDecisionTreesRetrieveOutputModelRuleSetsandDecisionTreesInstanceReport
 */
public class BQRuleSetsandDecisionTreesRetrieveOutputModelRuleSetsandDecisionTreesInstanceReport   {
  private Object ruleSetsandDecisionTreesInstanceReportRecord = null;

  private String ruleSetsandDecisionTreesInstanceReportType = null;

  private String ruleSetsandDecisionTreesInstanceReportParameters = null;

  private Object ruleSetsandDecisionTreesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return ruleSetsandDecisionTreesInstanceReportRecord
  **/

  public Object getRuleSetsandDecisionTreesInstanceReportRecord() {
    return ruleSetsandDecisionTreesInstanceReportRecord;
  }

  public void setRuleSetsandDecisionTreesInstanceReportRecord(Object ruleSetsandDecisionTreesInstanceReportRecord) {
    this.ruleSetsandDecisionTreesInstanceReportRecord = ruleSetsandDecisionTreesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return ruleSetsandDecisionTreesInstanceReportType
  **/

  public String getRuleSetsandDecisionTreesInstanceReportType() {
    return ruleSetsandDecisionTreesInstanceReportType;
  }

  public void setRuleSetsandDecisionTreesInstanceReportType(String ruleSetsandDecisionTreesInstanceReportType) {
    this.ruleSetsandDecisionTreesInstanceReportType = ruleSetsandDecisionTreesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return ruleSetsandDecisionTreesInstanceReportParameters
  **/

  public String getRuleSetsandDecisionTreesInstanceReportParameters() {
    return ruleSetsandDecisionTreesInstanceReportParameters;
  }

  public void setRuleSetsandDecisionTreesInstanceReportParameters(String ruleSetsandDecisionTreesInstanceReportParameters) {
    this.ruleSetsandDecisionTreesInstanceReportParameters = ruleSetsandDecisionTreesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return ruleSetsandDecisionTreesInstanceReport
  **/

  public Object getRuleSetsandDecisionTreesInstanceReport() {
    return ruleSetsandDecisionTreesInstanceReport;
  }

  public void setRuleSetsandDecisionTreesInstanceReport(Object ruleSetsandDecisionTreesInstanceReport) {
    this.ruleSetsandDecisionTreesInstanceReport = ruleSetsandDecisionTreesInstanceReport;
  }


}

