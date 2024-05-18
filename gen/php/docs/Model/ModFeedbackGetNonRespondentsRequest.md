# # ModFeedbackGetNonRespondentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course where user completes the feedback (for site feedbacks only). | [optional] [default to 0]
**feedbackid** | **int** | Feedback instance id |
**groupid** | **int** | Group id, 0 means that the function will determine the user group. | [optional] [default to 0]
**page** | **int** | The page of records to return. | [optional] [default to 0]
**perpage** | **int** | The number of records to return per page. | [optional] [default to 0]
**sort** | **string** | Sort param, must be firstname, lastname or lastaccess (default). | [optional] [default to 'lastaccess']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
