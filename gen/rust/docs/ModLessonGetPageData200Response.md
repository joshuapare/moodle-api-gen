# ModLessonGetPageData200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answers** | [**Vec<models::ModLessonGetPageData200ResponseAnswersInner>**](mod_lesson_get_page_data_200_response_answers_inner.md) |  | 
**contentfiles** | [**Vec<models::CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>**](core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.md) |  | 
**displaymenu** | **bool** | Whether we should display the menu or not in this page. | [default to null]
**messages** | [**Vec<models::ModLessonGetPageData200ResponseMessagesInner>**](mod_lesson_get_page_data_200_response_messages_inner.md) |  | 
**newpageid** | **i32** | New page id (if a jump was made) | [default to null]
**ongoingscore** | **String** | The ongoing score message | [default to null]
**page** | Option<[**models::ModLessonGetPageData200ResponsePage**](mod_lesson_get_page_data_200_response_page.md)> |  | [optional]
**pagecontent** | Option<**String**> | Page html content | [optional][default to null]
**progress** | **i32** | Progress percentage in the lesson | [default to null]
**warnings** | Option<[**Vec<models::AuthEmailSignupUser200ResponseWarningsInner>**](auth_email_signup_user_200_response_warnings_inner.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


