# MoodleClient.Model.ModForumUpdateDiscussionPostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **string** | Updated post message (HTML assumed if messageformat is not provided) | [optional] [default to ""]
**Messageformat** | **int** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Options** | [**List&lt;ModForumUpdateDiscussionPostRequestOptionsInner&gt;**](ModForumUpdateDiscussionPostRequestOptionsInner.md) |  | [optional] 
**Postid** | **int** | Post to be updated. It can be a discussion topic post. | [default to null]
**Subject** | **string** | Updated post subject | [optional] [default to ""]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

