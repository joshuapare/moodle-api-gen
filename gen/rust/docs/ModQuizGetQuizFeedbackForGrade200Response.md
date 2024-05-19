# ModQuizGetQuizFeedbackForGrade200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedbackinlinefiles** | Option<[**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md)> |  | [optional]
**feedbacktext** | **String** | the comment that corresponds to this grade (empty for none) | [default to null]
**feedbacktextformat** | Option<**i32**> | feedbacktext format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to null]
**warnings** | Option<[**Vec<models::AuthEmailSignupUser200ResponseWarningsInner>**](auth_email_signup_user_200_response_warnings_inner.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


