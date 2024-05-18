# CoreCommentAddCommentsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | [**List[CoreCommentAddCommentsRequestCommentsInner]**](CoreCommentAddCommentsRequestCommentsInner.md) |  | 

## Example

```python
from openapi_client.models.core_comment_add_comments_request import CoreCommentAddCommentsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCommentAddCommentsRequest from a JSON string
core_comment_add_comments_request_instance = CoreCommentAddCommentsRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCommentAddCommentsRequest.to_json())

# convert the object into a dict
core_comment_add_comments_request_dict = core_comment_add_comments_request_instance.to_dict()
# create an instance of CoreCommentAddCommentsRequest from a dict
core_comment_add_comments_request_from_dict = CoreCommentAddCommentsRequest.from_dict(core_comment_add_comments_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


