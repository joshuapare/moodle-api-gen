# ModForumAddDiscussionPostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** | new post message (html assumed if messageformat is not provided) | [default to null]
**messageformat** | Option<**i32**> | message format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 1]
**options** | Option<[**Vec<models::ModForumAddDiscussionPostRequestOptionsInner>**](mod_forum_add_discussion_post_request_options_inner.md)> |  | [optional]
**postid** | **i32** | the post id we are going to reply to                                                 (can be the initial discussion post | [default to null]
**subject** | **String** | new post subject | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


