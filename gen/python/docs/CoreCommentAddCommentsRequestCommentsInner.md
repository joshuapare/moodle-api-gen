# CoreCommentAddCommentsRequestCommentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**area** | **str** | string comment area | [optional] [default to '']
**component** | **str** | component | [optional] 
**content** | **str** | component | [optional] 
**contextlevel** | **str** | contextlevel system, course, user... | [optional] [default to 'null']
**instanceid** | **int** | the id of item associated with the contextlevel | [optional] [default to null]
**itemid** | **int** | associated id | [optional] [default to null]

## Example

```python
from openapi_client.models.core_comment_add_comments_request_comments_inner import CoreCommentAddCommentsRequestCommentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCommentAddCommentsRequestCommentsInner from a JSON string
core_comment_add_comments_request_comments_inner_instance = CoreCommentAddCommentsRequestCommentsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCommentAddCommentsRequestCommentsInner.to_json())

# convert the object into a dict
core_comment_add_comments_request_comments_inner_dict = core_comment_add_comments_request_comments_inner_instance.to_dict()
# create an instance of CoreCommentAddCommentsRequestCommentsInner from a dict
core_comment_add_comments_request_comments_inner_from_dict = CoreCommentAddCommentsRequestCommentsInner.from_dict(core_comment_add_comments_request_comments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


