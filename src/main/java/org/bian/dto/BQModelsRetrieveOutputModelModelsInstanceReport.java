package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQModelsRetrieveOutputModelModelsInstanceReport
 */
public class BQModelsRetrieveOutputModelModelsInstanceReport   {
  private Object modelsInstanceReportRecord = null;

  private String modelsInstanceReportType = null;

  private String modelsInstanceReportParameters = null;

  private Object modelsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return modelsInstanceReportRecord
  **/

  public Object getModelsInstanceReportRecord() {
    return modelsInstanceReportRecord;
  }

  public void setModelsInstanceReportRecord(Object modelsInstanceReportRecord) {
    this.modelsInstanceReportRecord = modelsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return modelsInstanceReportType
  **/

  public String getModelsInstanceReportType() {
    return modelsInstanceReportType;
  }

  public void setModelsInstanceReportType(String modelsInstanceReportType) {
    this.modelsInstanceReportType = modelsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return modelsInstanceReportParameters
  **/

  public String getModelsInstanceReportParameters() {
    return modelsInstanceReportParameters;
  }

  public void setModelsInstanceReportParameters(String modelsInstanceReportParameters) {
    this.modelsInstanceReportParameters = modelsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return modelsInstanceReport
  **/

  public Object getModelsInstanceReport() {
    return modelsInstanceReport;
  }

  public void setModelsInstanceReport(Object modelsInstanceReport) {
    this.modelsInstanceReport = modelsInstanceReport;
  }


}

