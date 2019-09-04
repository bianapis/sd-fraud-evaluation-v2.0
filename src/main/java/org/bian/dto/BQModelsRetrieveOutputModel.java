package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQModelsRetrieveOutputModelBQModelsInstanceRecord;
import org.bian.dto.BQModelsRetrieveOutputModelFraudEvaluationAssessmentInstanceRecord;
import org.bian.dto.BQModelsRetrieveOutputModelModelsInstanceAnalysis;
import org.bian.dto.BQModelsRetrieveOutputModelModelsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQModelsRetrieveOutputModel
 */
public class BQModelsRetrieveOutputModel   {
  private BQModelsRetrieveOutputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord = null;

  private BQModelsRetrieveOutputModelBQModelsInstanceRecord bQModelsInstanceRecord = null;

  private String modelsRetrieveActionTaskReference = null;

  private Object modelsRetrieveActionTaskRecord = null;

  private String modelsRetrieveActionResponse = null;

  private BQModelsRetrieveOutputModelModelsInstanceReport modelsInstanceReport = null;

  private BQModelsRetrieveOutputModelModelsInstanceAnalysis modelsInstanceAnalysis = null;


  /**
   * Get fraudEvaluationAssessmentInstanceRecord
   * @return fraudEvaluationAssessmentInstanceRecord
  **/

  public BQModelsRetrieveOutputModelFraudEvaluationAssessmentInstanceRecord getFraudEvaluationAssessmentInstanceRecord() {
    return fraudEvaluationAssessmentInstanceRecord;
  }

  public void setFraudEvaluationAssessmentInstanceRecord(BQModelsRetrieveOutputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord) {
    this.fraudEvaluationAssessmentInstanceRecord = fraudEvaluationAssessmentInstanceRecord;
  }


  /**
   * Get bQModelsInstanceRecord
   * @return bQModelsInstanceRecord
  **/

  public BQModelsRetrieveOutputModelBQModelsInstanceRecord getBQModelsInstanceRecord() {
    return bQModelsInstanceRecord;
  }
   
  @JsonProperty("bQModelsInstanceRecord")
  public void setBQModelsInstanceRecord(BQModelsRetrieveOutputModelBQModelsInstanceRecord bQModelsInstanceRecord) {
    this.bQModelsInstanceRecord = bQModelsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Models instance retrieve service call 
   * @return modelsRetrieveActionTaskReference
  **/

  public String getModelsRetrieveActionTaskReference() {
    return modelsRetrieveActionTaskReference;
  }

  public void setModelsRetrieveActionTaskReference(String modelsRetrieveActionTaskReference) {
    this.modelsRetrieveActionTaskReference = modelsRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return modelsRetrieveActionResponse
  **/

  public String getModelsRetrieveActionResponse() {
    return modelsRetrieveActionResponse;
  }

  public void setModelsRetrieveActionResponse(String modelsRetrieveActionResponse) {
    this.modelsRetrieveActionResponse = modelsRetrieveActionResponse;
  }


  /**
   * Get modelsInstanceReport
   * @return modelsInstanceReport
  **/

  public BQModelsRetrieveOutputModelModelsInstanceReport getModelsInstanceReport() {
    return modelsInstanceReport;
  }

  public void setModelsInstanceReport(BQModelsRetrieveOutputModelModelsInstanceReport modelsInstanceReport) {
    this.modelsInstanceReport = modelsInstanceReport;
  }


  /**
   * Get modelsInstanceAnalysis
   * @return modelsInstanceAnalysis
  **/

  public BQModelsRetrieveOutputModelModelsInstanceAnalysis getModelsInstanceAnalysis() {
    return modelsInstanceAnalysis;
  }

  public void setModelsInstanceAnalysis(BQModelsRetrieveOutputModelModelsInstanceAnalysis modelsInstanceAnalysis) {
    this.modelsInstanceAnalysis = modelsInstanceAnalysis;
  }


}

