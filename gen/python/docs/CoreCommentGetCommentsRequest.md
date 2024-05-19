# CoreCommentGetCommentsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area** | **str** | string comment area | [optional] [default to '']
**component** | **str** | component | 
**contextlevel** | **str** | contextlevel system, course, user... | 
**instanceid** | **int** | the Instance id of item associated with the context level | [default to null]
**itemid** | **int** | associated id | 
**page** | **int** | page number (0 based) | [optional] [default to 0]
**sortdirection** | **str** | Sort direction: ASC or DESC | [optional] [default to 'DESC']

## Example

```python
from openapi_client.models.core_comment_get_comments_request import CoreCommentGetCommentsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCommentGetCommentsRequest from a JSON string
core_comment_get_comments_request_instance = CoreCommentGetCommentsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCommentGetCommentsRequest.to_json())

# convert the object into a dict
core_comment_get_comments_request_dict = core_comment_get_comments_request_instance.to_dict()
# create an instance of CoreCommentGetCommentsRequest from a dict
core_comment_get_comments_request_from_dict = CoreCommentGetCommentsRequest.from_dict(core_comment_get_comments_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


