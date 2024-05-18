# ModForumCanAddDiscussion200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancreateattachment** | **bool** | True if the user can add attachments, false otherwise. | [optional] [default to False]
**canpindiscussions** | **bool** | True if the user can pin discussions, false otherwise. | [optional] [default to False]
**status** | **bool** | True if the user can add discussions, false otherwise. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_can_add_discussion200_response import ModForumCanAddDiscussion200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumCanAddDiscussion200Response from a JSON string
mod_forum_can_add_discussion200_response_instance = ModForumCanAddDiscussion200Response.from_json(json)
# print the JSON string representation of the object
print(ModForumCanAddDiscussion200Response.to_json())

# convert the object into a dict
mod_forum_can_add_discussion200_response_dict = mod_forum_can_add_discussion200_response_instance.to_dict()
# create an instance of ModForumCanAddDiscussion200Response from a dict
mod_forum_can_add_discussion200_response_from_dict = ModForumCanAddDiscussion200Response.from_dict(mod_forum_can_add_discussion200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


