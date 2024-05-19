# # ModForumUpdateDiscussionPostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **string** | Updated post message (HTML assumed if messageformat is not provided) | [optional] [default to '']
**messageformat** | **int** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**options** | [**\OpenAPI\Client\Model\ModForumUpdateDiscussionPostRequestOptionsInner[]**](ModForumUpdateDiscussionPostRequestOptionsInner.md) |  | [optional]
**postid** | **int** | Post to be updated. It can be a discussion topic post. | [default to null]
**subject** | **string** | Updated post subject | [optional] [default to '']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
