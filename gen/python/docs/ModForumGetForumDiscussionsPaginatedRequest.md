# ModForumGetForumDiscussionsPaginatedRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**forumid** | **int** | forum instance id | 
**page** | **int** | current page | [optional] [default to -1]
**perpage** | **int** | items per page | [optional] [default to 0]
**sortby** | **str** | sort by this element: id, timemodified, timestart or timeend | [optional] [default to 'timemodified']
**sortdirection** | **str** | sort direction: ASC or DESC | [optional] [default to 'DESC']

## Example

```python
from openapi_client.models.mod_forum_get_forum_discussions_paginated_request import ModForumGetForumDiscussionsPaginatedRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModForumGetForumDiscussionsPaginatedRequest from a JSON string
mod_forum_get_forum_discussions_paginated_request_instance = ModForumGetForumDiscussionsPaginatedRequest.from_json(json)
# print the JSON string representation of the object
print(ModForumGetForumDiscussionsPaginatedRequest.to_json())

# convert the object into a dict
mod_forum_get_forum_discussions_paginated_request_dict = mod_forum_get_forum_discussions_paginated_request_instance.to_dict()
# create an instance of ModForumGetForumDiscussionsPaginatedRequest from a dict
mod_forum_get_forum_discussions_paginated_request_from_dict = ModForumGetForumDiscussionsPaginatedRequest.from_dict(mod_forum_get_forum_discussions_paginated_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


