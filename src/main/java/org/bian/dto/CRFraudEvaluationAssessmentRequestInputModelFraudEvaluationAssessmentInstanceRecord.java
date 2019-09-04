package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentRequestInputModelFraudEvaluationAssessmentInstanceRecord
 */
public class CRFraudEvaluationAssessmentRequestInputModelFraudEvaluationAssessmentInstanceRecord   {
  private String productProductionSessionReference = null;

  private String fraudEvaluationTestProfile = null;

  private String fraudEvaluationEnsembleTechniqueType = null;

  private String fraudEvaluationEnsembleTechniqueDefinition = null;

  private Object fraudEvaluationTransactionConsolidationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the product fulfillment production session for which on-line fraud evaluation is performed 
   * @return productProductionSessionReference
  **/

  public String getProductProductionSessionReference() {
    return productProductionSessionReference;
  }

  public void setProductProductionSessionReference(String productProductionSessionReference) {
    this.productProductionSessionReference = productProductionSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the types of fraud evaluation tests applied 
   * @return fraudEvaluationTestProfile
  **/

  public String getFraudEvaluationTestProfile() {
    return fraudEvaluationTestProfile;
  }

  public void setFraudEvaluationTestProfile(String fraudEvaluationTestProfile) {
    this.fraudEvaluationTestProfile = fraudEvaluationTestProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of technique use to combine results of the different tests used to detect out of pattern behavior 
   * @return fraudEvaluationEnsembleTechniqueType
  **/

  public String getFraudEvaluationEnsembleTechniqueType() {
    return fraudEvaluationEnsembleTechniqueType;
  }

  public void setFraudEvaluationEnsembleTechniqueType(String fraudEvaluationEnsembleTechniqueType) {
    this.fraudEvaluationEnsembleTechniqueType = fraudEvaluationEnsembleTechniqueType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of how the constituent rule set/decision tree and model test are combined to compete the assessment 
   * @return fraudEvaluationEnsembleTechniqueDefinition
  **/

  public String getFraudEvaluationEnsembleTechniqueDefinition() {
    return fraudEvaluationEnsembleTechniqueDefinition;
  }

  public void setFraudEvaluationEnsembleTechniqueDefinition(String fraudEvaluationEnsembleTechniqueDefinition) {
    this.fraudEvaluationEnsembleTechniqueDefinition = fraudEvaluationEnsembleTechniqueDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The production transaction details that are submitted for fraud evaluation - note this will typically be a real-time dataset 
   * @return fraudEvaluationTransactionConsolidationRecord
  **/

  public Object getFraudEvaluationTransactionConsolidationRecord() {
    return fraudEvaluationTransactionConsolidationRecord;
  }

  public void setFraudEvaluationTransactionConsolidationRecord(Object fraudEvaluationTransactionConsolidationRecord) {
    this.fraudEvaluationTransactionConsolidationRecord = fraudEvaluationTransactionConsolidationRecord;
  }


}

