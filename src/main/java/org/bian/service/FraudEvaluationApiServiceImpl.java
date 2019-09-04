/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class FraudEvaluationApiServiceImpl implements FraudEvaluationApiService {

	public SDFraudEvaluationActivateOutputModel activate(SDFraudEvaluationActivateInputModel request){
		return JsonReader.read("activate-SDFraudEvaluationActivateOutputModel.json",new TypeReference<SDFraudEvaluationActivateOutputModel>(){});
	}
	
	public SDFraudEvaluationConfigureOutputModel configure(String sdReferenceId, SDFraudEvaluationConfigureInputModel request){
		return JsonReader.read("configure-SDFraudEvaluationConfigureOutputModel.json",new TypeReference<SDFraudEvaluationConfigureOutputModel>(){});
	}
	
	public CRFraudEvaluationAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRFraudEvaluationAssessmentEvaluateInputModel request){
		return JsonReader.read("evaluate-CRFraudEvaluationAssessmentEvaluateOutputModel.json",new TypeReference<CRFraudEvaluationAssessmentEvaluateOutputModel>(){});
	}
	
	public CRFraudEvaluationAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRFraudEvaluationAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRFraudEvaluationAssessmentExchangeOutputModel.json",new TypeReference<CRFraudEvaluationAssessmentExchangeOutputModel>(){});
	}
	
	public CRFraudEvaluationAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRFraudEvaluationAssessmentExecuteInputModel request){
		return JsonReader.read("execute-CRFraudEvaluationAssessmentExecuteOutputModel.json",new TypeReference<CRFraudEvaluationAssessmentExecuteOutputModel>(){});
	}
	
	public SDFraudEvaluationFeedbackOutputModel feedback(String sdReferenceId, SDFraudEvaluationFeedbackInputModel request){
		return JsonReader.read("feedback-SDFraudEvaluationFeedbackOutputModel.json",new TypeReference<SDFraudEvaluationFeedbackOutputModel>(){});
	}
	
	public CRFraudEvaluationAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRFraudEvaluationAssessmentGrantInputModel request){
		return JsonReader.read("grant-CRFraudEvaluationAssessmentGrantOutputModel.json",new TypeReference<CRFraudEvaluationAssessmentGrantOutputModel>(){});
	}
	
	public CRFraudEvaluationAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRFraudEvaluationAssessmentRequestInputModel request){
		return JsonReader.read("request-CRFraudEvaluationAssessmentRequestOutputModel.json",new TypeReference<CRFraudEvaluationAssessmentRequestOutputModel>(){});
	}
	
	public CRFraudEvaluationAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRFraudEvaluationAssessmentRetrieveOutputModel.json",new TypeReference<CRFraudEvaluationAssessmentRetrieveOutputModel>(){});
	}
	
	public BQModelsRetrieveOutputModel retrieveModels(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQModelsRetrieveOutputModel.json",new TypeReference<BQModelsRetrieveOutputModel>(){});
	}
	
	public BQRuleSetsandDecisionTreesRetrieveOutputModel retrieveRulesetsanddecisiontrees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRuleSetsandDecisionTreesRetrieveOutputModel.json",new TypeReference<BQRuleSetsandDecisionTreesRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDFraudEvaluationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDFraudEvaluationRetrieveOutputModel.json",new TypeReference<SDFraudEvaluationRetrieveOutputModel>(){});
	}
	
}
