# # ModLessonProcessPage200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptsremaining** | **int** | Number of attempts remaining. | [default to null]
**correctanswer** | **bool** | Whether the answer is correct. | [default to null]
**displaymenu** | **bool** | Whether we should display the menu or not in this page. |
**feedback** | **string** | The response feedback. | [default to 'null']
**inmediatejump** | **bool** | Whether the page processing redirect directly to anoter page. | [default to null]
**isessayquestion** | **bool** | Whether is a essay question. | [default to null]
**maxattemptsreached** | **bool** | Whether we reachered the max number of attempts. | [default to null]
**messages** | [**\OpenAPI\Client\Model\ModLessonGetPageData200ResponseMessagesInner[]**](ModLessonGetPageData200ResponseMessagesInner.md) |  |
**newpageid** | **int** | New page id (if a jump was made). | [default to null]
**noanswer** | **bool** | Whether there aren&#39;t answers. | [default to null]
**nodefaultresponse** | **bool** | Whether there is not a default response. | [default to null]
**ongoingscore** | **string** | The ongoing message. | [default to 'null']
**progress** | **int** | Progress percentage in the lesson. | [default to null]
**response** | **string** | The response. | [default to 'null']
**reviewmode** | **bool** | Whether the user is reviewing. | [default to null]
**studentanswer** | **string** | The student answer. | [default to 'null']
**userresponse** | **string** | The user response. | [default to 'null']
**warnings** | [**\OpenAPI\Client\Model\AuthEmailSignupUser200ResponseWarningsInner[]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
