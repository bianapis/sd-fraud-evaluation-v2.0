package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQModelsRetrieveInputModelModelsInstanceAnalysis;
import org.bian.dto.BQModelsRetrieveInputModelModelsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQModelsRetrieveInputModel
 */
public class BQModelsRetrieveInputModel   {
  private Object modelsRetrieveActionTaskRecord = null;

  private String modelsRetrieveActionRequest = null;

  private BQModelsRetrieveInputModelModelsInstanceReport modelsInstanceReport = null;

  private BQModelsRetrieveInputModelModelsInstanceAnalysis modelsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return modelsRetrieveActionTaskRecord
  **/

  public Object getModelsRetrieveActionTaskRecord() {
    return modelsRetrieveActionTaskRecord;
  }

  public void setModelsRetrieveActionTaskRecord(Object modelsRetrieveActionTaskRecord) {
    this.modelsRetrieveActionTaskRecord = modelsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return modelsRetrieveActionRequest
  **/

  public String getModelsRetrieveActionRequest() {
    return modelsRetrieveActionRequest;
  }

  public void setModelsRetrieveActionRequest(String modelsRetrieveActionRequest) {
    this.modelsRetrieveActionRequest = modelsRetrieveActionRequest;
  }


  /**
   * Get modelsInstanceReport
   * @return modelsInstanceReport
  **/

  public BQModelsRetrieveInputModelModelsInstanceReport getModelsInstanceReport() {
    return modelsInstanceReport;
  }

  public void setModelsInstanceReport(BQModelsRetrieveInputModelModelsInstanceReport modelsInstanceReport) {
    this.modelsInstanceReport = modelsInstanceReport;
  }


  /**
   * Get modelsInstanceAnalysis
   * @return modelsInstanceAnalysis
  **/

  public BQModelsRetrieveInputModelModelsInstanceAnalysis getModelsInstanceAnalysis() {
    return modelsInstanceAnalysis;
  }

  public void setModelsInstanceAnalysis(BQModelsRetrieveInputModelModelsInstanceAnalysis modelsInstanceAnalysis) {
    this.modelsInstanceAnalysis = modelsInstanceAnalysis;
  }


}

