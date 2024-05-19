# Org.OpenAPITools.Model.ModForumAddDiscussionPostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **string** | new post message (html assumed if messageformat is not provided) | [default to "null"]
**Messageformat** | **int** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Options** | [**List&lt;ModForumAddDiscussionPostRequestOptionsInner&gt;**](ModForumAddDiscussionPostRequestOptionsInner.md) |  | [optional] 
**Postid** | **int** | the post id we are going to reply to                                                 (can be the initial discussion post | [default to null]
**Subject** | **string** | new post subject | [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

