# ModFeedbackProcessPageRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | Option<**i32**> | Course where user completes the feedback (for site feedbacks only). | [optional][default to 0]
**feedbackid** | **i32** | Feedback instance id. | 
**goprevious** | Option<**bool**> | Whether we want to jump to previous page. | [optional][default to false]
**page** | **i32** | The page being processed. | [default to null]
**responses** | Option<[**Vec<models::ModFeedbackProcessPageRequestResponsesInner>**](mod_feedback_process_page_request_responses_inner.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


