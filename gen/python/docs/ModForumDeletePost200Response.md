# ModForumDeletePost200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | True if the post/discussion was deleted, false otherwise. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_delete_post200_response import ModForumDeletePost200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumDeletePost200Response from a JSON string
mod_forum_delete_post200_response_instance = ModForumDeletePost200Response.from_json(json)
# print the JSON string representation of the object
print(ModForumDeletePost200Response.to_json())

# convert the object into a dict
mod_forum_delete_post200_response_dict = mod_forum_delete_post200_response_instance.to_dict()
# create an instance of ModForumDeletePost200Response from a dict
mod_forum_delete_post200_response_from_dict = ModForumDeletePost200Response.from_dict(mod_forum_delete_post200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


