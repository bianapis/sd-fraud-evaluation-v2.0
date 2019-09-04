package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQModelsRetrieveOutputModelModelsInstanceAnalysis
 */
public class BQModelsRetrieveOutputModelModelsInstanceAnalysis   {
  private Object modelsInstanceAnalysisRecord = null;

  private String modelsInstanceAnalysisReportType = null;

  private String modelsInstanceAnalysisParameters = null;

  private Object modelsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return modelsInstanceAnalysisRecord
  **/

  public Object getModelsInstanceAnalysisRecord() {
    return modelsInstanceAnalysisRecord;
  }

  public void setModelsInstanceAnalysisRecord(Object modelsInstanceAnalysisRecord) {
    this.modelsInstanceAnalysisRecord = modelsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return modelsInstanceAnalysisReportType
  **/

  public String getModelsInstanceAnalysisReportType() {
    return modelsInstanceAnalysisReportType;
  }

  public void setModelsInstanceAnalysisReportType(String modelsInstanceAnalysisReportType) {
    this.modelsInstanceAnalysisReportType = modelsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return modelsInstanceAnalysisParameters
  **/

  public String getModelsInstanceAnalysisParameters() {
    return modelsInstanceAnalysisParameters;
  }

  public void setModelsInstanceAnalysisParameters(String modelsInstanceAnalysisParameters) {
    this.modelsInstanceAnalysisParameters = modelsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return modelsInstanceAnalysisReport
  **/

  public Object getModelsInstanceAnalysisReport() {
    return modelsInstanceAnalysisReport;
  }

  public void setModelsInstanceAnalysisReport(Object modelsInstanceAnalysisReport) {
    this.modelsInstanceAnalysisReport = modelsInstanceAnalysisReport;
  }


}

