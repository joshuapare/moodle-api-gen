# ModForumGetForumDiscussionsPaginated200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discussions** | [**List[ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner]**](ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_forum_get_forum_discussions_paginated200_response import ModForumGetForumDiscussionsPaginated200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetForumDiscussionsPaginated200Response from a JSON string
mod_forum_get_forum_discussions_paginated200_response_instance = ModForumGetForumDiscussionsPaginated200Response.from_json(json)
# print the JSON string representation of the object
print(ModForumGetForumDiscussionsPaginated200Response.to_json())

# convert the object into a dict
mod_forum_get_forum_discussions_paginated200_response_dict = mod_forum_get_forum_discussions_paginated200_response_instance.to_dict()
# create an instance of ModForumGetForumDiscussionsPaginated200Response from a dict
mod_forum_get_forum_discussions_paginated200_response_from_dict = ModForumGetForumDiscussionsPaginated200Response.from_dict(mod_forum_get_forum_discussions_paginated200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


