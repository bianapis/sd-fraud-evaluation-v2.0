/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FraudEvaluationApiService {

	SDFraudEvaluationActivateOutputModel activate(SDFraudEvaluationActivateInputModel request);
	
	SDFraudEvaluationConfigureOutputModel configure(String sdReferenceId, SDFraudEvaluationConfigureInputModel request);
	
	CRFraudEvaluationAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRFraudEvaluationAssessmentEvaluateInputModel request);
	
	CRFraudEvaluationAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRFraudEvaluationAssessmentExchangeInputModel request);
	
	CRFraudEvaluationAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRFraudEvaluationAssessmentExecuteInputModel request);
	
	SDFraudEvaluationFeedbackOutputModel feedback(String sdReferenceId, SDFraudEvaluationFeedbackInputModel request);
	
	CRFraudEvaluationAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRFraudEvaluationAssessmentGrantInputModel request);
	
	CRFraudEvaluationAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFraudEvaluationAssessmentRequestInputModel request);
	
	CRFraudEvaluationAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	BQModelsRetrieveOutputModel retrieveModels(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRuleSetsandDecisionTreesRetrieveOutputModel retrieveRulesetsanddecisiontrees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDFraudEvaluationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
}
