# ModFeedbackGetNonRespondentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | Option<**i32**> | Course where user completes the feedback (for site feedbacks only). | [optional][default to 0]
**feedbackid** | **i32** | Feedback instance id | 
**groupid** | Option<**i32**> | Group id, 0 means that the function will determine the user group. | [optional][default to 0]
**page** | Option<**i32**> | The page of records to return. | [optional][default to 0]
**perpage** | Option<**i32**> | The number of records to return per page. | [optional][default to 0]
**sort** | Option<**String**> | Sort param, must be firstname, lastname or lastaccess (default). | [optional][default to lastaccess]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


