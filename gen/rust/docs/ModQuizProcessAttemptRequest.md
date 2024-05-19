# ModQuizProcessAttemptRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptid** | **i32** | attempt id | 
**data** | Option<[**Vec<models::ModQuizGetAttemptDataRequestPreflightdataInner>**](mod_quiz_get_attempt_data_request_preflightdata_inner.md)> |  | [optional]
**finishattempt** | Option<**bool**> | whether to finish or not the attempt | [optional][default to false]
**preflightdata** | Option<[**Vec<models::ModQuizGetAttemptDataRequestPreflightdataInner>**](mod_quiz_get_attempt_data_request_preflightdata_inner.md)> |  | [optional]
**timeup** | Option<**bool**> | whether the WS was called by a timer when the time is up | [optional][default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


