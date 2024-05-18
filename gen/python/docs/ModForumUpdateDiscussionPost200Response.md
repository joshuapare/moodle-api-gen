# ModForumUpdateDiscussionPost200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | True if the post/discussion was updated, false otherwise. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_update_discussion_post200_response import ModForumUpdateDiscussionPost200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumUpdateDiscussionPost200Response from a JSON string
mod_forum_update_discussion_post200_response_instance = ModForumUpdateDiscussionPost200Response.from_json(json)
# print the JSON string representation of the object
print(ModForumUpdateDiscussionPost200Response.to_json())

# convert the object into a dict
mod_forum_update_discussion_post200_response_dict = mod_forum_update_discussion_post200_response_instance.to_dict()
# create an instance of ModForumUpdateDiscussionPost200Response from a dict
mod_forum_update_discussion_post200_response_from_dict = ModForumUpdateDiscussionPost200Response.from_dict(mod_forum_update_discussion_post200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


