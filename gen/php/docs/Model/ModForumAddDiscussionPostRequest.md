# # ModForumAddDiscussionPostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **string** | new post message (html assumed if messageformat is not provided) | [default to 'null']
**messageformat** | **int** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**options** | [**\OpenAPI\Client\Model\ModForumAddDiscussionPostRequestOptionsInner[]**](ModForumAddDiscussionPostRequestOptionsInner.md) |  | [optional]
**postid** | **int** | the post id we are going to reply to                                                 (can be the initial discussion post | [default to null]
**subject** | **string** | new post subject | [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
