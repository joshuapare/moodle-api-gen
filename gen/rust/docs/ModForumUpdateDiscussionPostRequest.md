# ModForumUpdateDiscussionPostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | Option<**String**> | Updated post message (HTML assumed if messageformat is not provided) | [optional][default to ]
**messageformat** | Option<**i32**> | message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 1]
**options** | Option<[**Vec<models::ModForumUpdateDiscussionPostRequestOptionsInner>**](mod_forum_update_discussion_post_request_options_inner.md)> |  | [optional]
**postid** | **i32** | Post to be updated. It can be a discussion topic post. | [default to null]
**subject** | Option<**String**> | Updated post subject | [optional][default to ]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


