package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentRetrieveInputModelFraudEvaluationAssessmentInstanceReportRecord
 */
public class CRFraudEvaluationAssessmentRetrieveInputModelFraudEvaluationAssessmentInstanceReportRecord   {
  private String fraudEvaluationAssessmentInstanceReportReference = null;

  private String fraudEvaluationAssessmentInstanceReportType = null;

  private String fraudEvaluationAssessmentInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fraudEvaluationAssessmentInstanceReportReference
  **/

  public String getFraudEvaluationAssessmentInstanceReportReference() {
    return fraudEvaluationAssessmentInstanceReportReference;
  }

  public void setFraudEvaluationAssessmentInstanceReportReference(String fraudEvaluationAssessmentInstanceReportReference) {
    this.fraudEvaluationAssessmentInstanceReportReference = fraudEvaluationAssessmentInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fraudEvaluationAssessmentInstanceReportType
  **/

  public String getFraudEvaluationAssessmentInstanceReportType() {
    return fraudEvaluationAssessmentInstanceReportType;
  }

  public void setFraudEvaluationAssessmentInstanceReportType(String fraudEvaluationAssessmentInstanceReportType) {
    this.fraudEvaluationAssessmentInstanceReportType = fraudEvaluationAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fraudEvaluationAssessmentInstanceReportParameters
  **/

  public String getFraudEvaluationAssessmentInstanceReportParameters() {
    return fraudEvaluationAssessmentInstanceReportParameters;
  }

  public void setFraudEvaluationAssessmentInstanceReportParameters(String fraudEvaluationAssessmentInstanceReportParameters) {
    this.fraudEvaluationAssessmentInstanceReportParameters = fraudEvaluationAssessmentInstanceReportParameters;
  }


}

