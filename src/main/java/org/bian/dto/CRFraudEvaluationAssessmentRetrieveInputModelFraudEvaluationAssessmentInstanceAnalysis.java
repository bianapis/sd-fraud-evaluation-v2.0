package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentRetrieveInputModelFraudEvaluationAssessmentInstanceAnalysis
 */
public class CRFraudEvaluationAssessmentRetrieveInputModelFraudEvaluationAssessmentInstanceAnalysis   {
  private String fraudEvaluationAssessmentInstanceAnalysisReference = null;

  private String fraudEvaluationAssessmentInstanceAnalysisReportType = null;

  private String fraudEvaluationAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return fraudEvaluationAssessmentInstanceAnalysisReference
  **/

  public String getFraudEvaluationAssessmentInstanceAnalysisReference() {
    return fraudEvaluationAssessmentInstanceAnalysisReference;
  }

  public void setFraudEvaluationAssessmentInstanceAnalysisReference(String fraudEvaluationAssessmentInstanceAnalysisReference) {
    this.fraudEvaluationAssessmentInstanceAnalysisReference = fraudEvaluationAssessmentInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fraudEvaluationAssessmentInstanceAnalysisReportType
  **/

  public String getFraudEvaluationAssessmentInstanceAnalysisReportType() {
    return fraudEvaluationAssessmentInstanceAnalysisReportType;
  }

  public void setFraudEvaluationAssessmentInstanceAnalysisReportType(String fraudEvaluationAssessmentInstanceAnalysisReportType) {
    this.fraudEvaluationAssessmentInstanceAnalysisReportType = fraudEvaluationAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fraudEvaluationAssessmentInstanceAnalysisParameters
  **/

  public String getFraudEvaluationAssessmentInstanceAnalysisParameters() {
    return fraudEvaluationAssessmentInstanceAnalysisParameters;
  }

  public void setFraudEvaluationAssessmentInstanceAnalysisParameters(String fraudEvaluationAssessmentInstanceAnalysisParameters) {
    this.fraudEvaluationAssessmentInstanceAnalysisParameters = fraudEvaluationAssessmentInstanceAnalysisParameters;
  }


}

