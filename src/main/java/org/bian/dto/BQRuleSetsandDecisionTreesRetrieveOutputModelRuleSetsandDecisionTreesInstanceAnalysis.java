package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRuleSetsandDecisionTreesRetrieveOutputModelRuleSetsandDecisionTreesInstanceAnalysis
 */
public class BQRuleSetsandDecisionTreesRetrieveOutputModelRuleSetsandDecisionTreesInstanceAnalysis   {
  private Object ruleSetsandDecisionTreesInstanceAnalysisRecord = null;

  private String ruleSetsandDecisionTreesInstanceAnalysisReportType = null;

  private String ruleSetsandDecisionTreesInstanceAnalysisParameters = null;

  private Object ruleSetsandDecisionTreesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return ruleSetsandDecisionTreesInstanceAnalysisRecord
  **/

  public Object getRuleSetsandDecisionTreesInstanceAnalysisRecord() {
    return ruleSetsandDecisionTreesInstanceAnalysisRecord;
  }

  public void setRuleSetsandDecisionTreesInstanceAnalysisRecord(Object ruleSetsandDecisionTreesInstanceAnalysisRecord) {
    this.ruleSetsandDecisionTreesInstanceAnalysisRecord = ruleSetsandDecisionTreesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return ruleSetsandDecisionTreesInstanceAnalysisReportType
  **/

  public String getRuleSetsandDecisionTreesInstanceAnalysisReportType() {
    return ruleSetsandDecisionTreesInstanceAnalysisReportType;
  }

  public void setRuleSetsandDecisionTreesInstanceAnalysisReportType(String ruleSetsandDecisionTreesInstanceAnalysisReportType) {
    this.ruleSetsandDecisionTreesInstanceAnalysisReportType = ruleSetsandDecisionTreesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return ruleSetsandDecisionTreesInstanceAnalysisParameters
  **/

  public String getRuleSetsandDecisionTreesInstanceAnalysisParameters() {
    return ruleSetsandDecisionTreesInstanceAnalysisParameters;
  }

  public void setRuleSetsandDecisionTreesInstanceAnalysisParameters(String ruleSetsandDecisionTreesInstanceAnalysisParameters) {
    this.ruleSetsandDecisionTreesInstanceAnalysisParameters = ruleSetsandDecisionTreesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return ruleSetsandDecisionTreesInstanceAnalysisReport
  **/

  public Object getRuleSetsandDecisionTreesInstanceAnalysisReport() {
    return ruleSetsandDecisionTreesInstanceAnalysisReport;
  }

  public void setRuleSetsandDecisionTreesInstanceAnalysisReport(Object ruleSetsandDecisionTreesInstanceAnalysisReport) {
    this.ruleSetsandDecisionTreesInstanceAnalysisReport = ruleSetsandDecisionTreesInstanceAnalysisReport;
  }


}

