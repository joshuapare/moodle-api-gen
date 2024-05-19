# CoreCommentGetComments200ResponseCommentsInner

comment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar** | **str** | HTML user picture | [optional] [default to 'null']
**content** | **str** | The content text formatted | [optional] [default to 'null']
**delete** | **bool** | Permission to delete&#x3D;true/false | [optional] [default to False]
**format** | **int** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**fullname** | **str** | fullname | [optional] [default to 'null']
**id** | **int** | Comment ID | [optional] [default to null]
**profileurl** | **str** | URL profile | [optional] [default to 'null']
**strftimeformat** | **str** | Time format | [optional] [default to 'null']
**time** | **str** | Time in human format | [optional] [default to 'null']
**timecreated** | **int** | Time created (timestamp) | [optional] [default to null]
**userid** | **int** | User ID | [optional] 

## Example

```python
from openapi_client.models.core_comment_get_comments200_response_comments_inner import CoreCommentGetComments200ResponseCommentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCommentGetComments200ResponseCommentsInner from a JSON string
core_comment_get_comments200_response_comments_inner_instance = CoreCommentGetComments200ResponseCommentsInner.from_json(json)
# print the JSON string representation of the object
print(CoreCommentGetComments200ResponseCommentsInner.to_json())

# convert the object into a dict
core_comment_get_comments200_response_comments_inner_dict = core_comment_get_comments200_response_comments_inner_instance.to_dict()
# create an instance of CoreCommentGetComments200ResponseCommentsInner from a dict
core_comment_get_comments200_response_comments_inner_from_dict = CoreCommentGetComments200ResponseCommentsInner.from_dict(core_comment_get_comments200_response_comments_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


