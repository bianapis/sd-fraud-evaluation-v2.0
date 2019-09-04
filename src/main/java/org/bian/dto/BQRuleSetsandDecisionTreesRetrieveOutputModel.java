package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRuleSetsandDecisionTreesRetrieveOutputModelBQRuleSetsAndDecisionTreesInstanceRecord;
import org.bian.dto.BQRuleSetsandDecisionTreesRetrieveOutputModelFraudEvaluationAssessmentInstanceRecord;
import org.bian.dto.BQRuleSetsandDecisionTreesRetrieveOutputModelRuleSetsandDecisionTreesInstanceAnalysis;
import org.bian.dto.BQRuleSetsandDecisionTreesRetrieveOutputModelRuleSetsandDecisionTreesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRuleSetsandDecisionTreesRetrieveOutputModel
 */
public class BQRuleSetsandDecisionTreesRetrieveOutputModel   {
  private BQRuleSetsandDecisionTreesRetrieveOutputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord = null;

  private BQRuleSetsandDecisionTreesRetrieveOutputModelBQRuleSetsAndDecisionTreesInstanceRecord bQRuleSetsAndDecisionTreesInstanceRecord = null;

  private String ruleSetsandDecisionTreesRetrieveActionTaskReference = null;

  private Object ruleSetsandDecisionTreesRetrieveActionTaskRecord = null;

  private String ruleSetsandDecisionTreesRetrieveActionResponse = null;

  private BQRuleSetsandDecisionTreesRetrieveOutputModelRuleSetsandDecisionTreesInstanceReport ruleSetsandDecisionTreesInstanceReport = null;

  private BQRuleSetsandDecisionTreesRetrieveOutputModelRuleSetsandDecisionTreesInstanceAnalysis ruleSetsandDecisionTreesInstanceAnalysis = null;


  /**
   * Get fraudEvaluationAssessmentInstanceRecord
   * @return fraudEvaluationAssessmentInstanceRecord
  **/

  public BQRuleSetsandDecisionTreesRetrieveOutputModelFraudEvaluationAssessmentInstanceRecord getFraudEvaluationAssessmentInstanceRecord() {
    return fraudEvaluationAssessmentInstanceRecord;
  }

  public void setFraudEvaluationAssessmentInstanceRecord(BQRuleSetsandDecisionTreesRetrieveOutputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord) {
    this.fraudEvaluationAssessmentInstanceRecord = fraudEvaluationAssessmentInstanceRecord;
  }


  /**
   * Get bQRuleSetsAndDecisionTreesInstanceRecord
   * @return bQRuleSetsAndDecisionTreesInstanceRecord
  **/

  public BQRuleSetsandDecisionTreesRetrieveOutputModelBQRuleSetsAndDecisionTreesInstanceRecord getBQRuleSetsAndDecisionTreesInstanceRecord() {
    return bQRuleSetsAndDecisionTreesInstanceRecord;
  }
  @JsonProperty("bQRuleSetsAndDecisionTreesInstanceRecord")
  public void setBQRuleSetsAndDecisionTreesInstanceRecord(BQRuleSetsandDecisionTreesRetrieveOutputModelBQRuleSetsAndDecisionTreesInstanceRecord bQRuleSetsAndDecisionTreesInstanceRecord) {
    this.bQRuleSetsAndDecisionTreesInstanceRecord = bQRuleSetsAndDecisionTreesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Rule Sets and Decision Trees instance retrieve service call 
   * @return ruleSetsandDecisionTreesRetrieveActionTaskReference
  **/

  public String getRuleSetsandDecisionTreesRetrieveActionTaskReference() {
    return ruleSetsandDecisionTreesRetrieveActionTaskReference;
  }

  public void setRuleSetsandDecisionTreesRetrieveActionTaskReference(String ruleSetsandDecisionTreesRetrieveActionTaskReference) {
    this.ruleSetsandDecisionTreesRetrieveActionTaskReference = ruleSetsandDecisionTreesRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return ruleSetsandDecisionTreesRetrieveActionResponse
  **/

  public String getRuleSetsandDecisionTreesRetrieveActionResponse() {
    return ruleSetsandDecisionTreesRetrieveActionResponse;
  }
  
  @JsonProperty("ruleSetsandDecisionTreesRetrieveActionResponse")
  public void setRuleSetsandDecisionTreesRetrieveActionResponse(String ruleSetsandDecisionTreesRetrieveActionResponse) {
    this.ruleSetsandDecisionTreesRetrieveActionResponse = ruleSetsandDecisionTreesRetrieveActionResponse;
  }


  /**
   * Get ruleSetsandDecisionTreesInstanceReport
   * @return ruleSetsandDecisionTreesInstanceReport
  **/

  public BQRuleSetsandDecisionTreesRetrieveOutputModelRuleSetsandDecisionTreesInstanceReport getRuleSetsandDecisionTreesInstanceReport() {
    return ruleSetsandDecisionTreesInstanceReport;
  }

  public void setRuleSetsandDecisionTreesInstanceReport(BQRuleSetsandDecisionTreesRetrieveOutputModelRuleSetsandDecisionTreesInstanceReport ruleSetsandDecisionTreesInstanceReport) {
    this.ruleSetsandDecisionTreesInstanceReport = ruleSetsandDecisionTreesInstanceReport;
  }


  /**
   * Get ruleSetsandDecisionTreesInstanceAnalysis
   * @return ruleSetsandDecisionTreesInstanceAnalysis
  **/

  public BQRuleSetsandDecisionTreesRetrieveOutputModelRuleSetsandDecisionTreesInstanceAnalysis getRuleSetsandDecisionTreesInstanceAnalysis() {
    return ruleSetsandDecisionTreesInstanceAnalysis;
  }

  public void setRuleSetsandDecisionTreesInstanceAnalysis(BQRuleSetsandDecisionTreesRetrieveOutputModelRuleSetsandDecisionTreesInstanceAnalysis ruleSetsandDecisionTreesInstanceAnalysis) {
    this.ruleSetsandDecisionTreesInstanceAnalysis = ruleSetsandDecisionTreesInstanceAnalysis;
  }


}

