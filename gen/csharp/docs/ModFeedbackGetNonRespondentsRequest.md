# Org.OpenAPITools.Model.ModFeedbackGetNonRespondentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**Feedbackid** | **int** | Feedback instance id | 
**Groupid** | **int** | Group id, 0 means that the function will determine the user group. | [optional] [default to 0]
**Page** | **int** | The page of records to return. | [optional] [default to 0]
**Perpage** | **int** | The number of records to return per page. | [optional] [default to 0]
**Sort** | **string** | Sort param, must be firstname, lastname or lastaccess (default). | [optional] [default to "lastaccess"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

