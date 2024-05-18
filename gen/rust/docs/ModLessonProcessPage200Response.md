# ModLessonProcessPage200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptsremaining** | **i32** | Number of attempts remaining. | [default to null]
**correctanswer** | **bool** | Whether the answer is correct. | [default to null]
**displaymenu** | **bool** | Whether we should display the menu or not in this page. | 
**feedback** | **String** | The response feedback. | [default to null]
**inmediatejump** | **bool** | Whether the page processing redirect directly to anoter page. | [default to null]
**isessayquestion** | **bool** | Whether is a essay question. | [default to null]
**maxattemptsreached** | **bool** | Whether we reachered the max number of attempts. | [default to null]
**messages** | [**Vec<models::ModLessonGetPageData200ResponseMessagesInner>**](mod_lesson_get_page_data_200_response_messages_inner.md) |  | 
**newpageid** | **i32** | New page id (if a jump was made). | [default to null]
**noanswer** | **bool** | Whether there aren't answers. | [default to null]
**nodefaultresponse** | **bool** | Whether there is not a default response. | [default to null]
**ongoingscore** | **String** | The ongoing message. | [default to null]
**progress** | **i32** | Progress percentage in the lesson. | [default to null]
**response** | **String** | The response. | [default to null]
**reviewmode** | **bool** | Whether the user is reviewing. | [default to null]
**studentanswer** | **String** | The student answer. | [default to null]
**userresponse** | **String** | The user response. | [default to null]
**warnings** | Option<[**Vec<models::AuthEmailSignupUser200ResponseWarningsInner>**](auth_email_signup_user_200_response_warnings_inner.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


