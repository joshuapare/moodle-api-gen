

# ModForumUpdateDiscussionPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | Updated post message (HTML assumed if messageformat is not provided) |  [optional] |
|**messageformat** | **Integer** | message format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**options** | [**List&lt;ModForumUpdateDiscussionPostRequestOptionsInner&gt;**](ModForumUpdateDiscussionPostRequestOptionsInner.md) |  |  [optional] |
|**postid** | **Integer** | Post to be updated. It can be a discussion topic post. |  |
|**subject** | **String** | Updated post subject |  [optional] |



