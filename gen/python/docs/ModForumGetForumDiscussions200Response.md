# ModForumGetForumDiscussions200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discussions** | [**List[ModForumGetForumDiscussions200ResponseDiscussionsInner]**](ModForumGetForumDiscussions200ResponseDiscussionsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_forum_discussions200_response import ModForumGetForumDiscussions200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetForumDiscussions200Response from a JSON string
mod_forum_get_forum_discussions200_response_instance = ModForumGetForumDiscussions200Response.from_json(json)
# print the JSON string representation of the object
print(ModForumGetForumDiscussions200Response.to_json())

# convert the object into a dict
mod_forum_get_forum_discussions200_response_dict = mod_forum_get_forum_discussions200_response_instance.to_dict()
# create an instance of ModForumGetForumDiscussions200Response from a dict
mod_forum_get_forum_discussions200_response_from_dict = ModForumGetForumDiscussions200Response.from_dict(mod_forum_get_forum_discussions200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


