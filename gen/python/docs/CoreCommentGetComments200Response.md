# CoreCommentGetComments200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canpost** | **bool** | Whether the user can post in this comment area. | [optional] [default to False]
**comments** | [**List[CoreCommentGetComments200ResponseCommentsInner]**](CoreCommentGetComments200ResponseCommentsInner.md) |  | 
**count** | **int** | Total number of comments. | [optional] [default to null]
**perpage** | **int** | Number of comments per page. | [optional] [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_comment_get_comments200_response import CoreCommentGetComments200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCommentGetComments200Response from a JSON string
core_comment_get_comments200_response_instance = CoreCommentGetComments200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCommentGetComments200Response.to_json())

# convert the object into a dict
core_comment_get_comments200_response_dict = core_comment_get_comments200_response_instance.to_dict()
# create an instance of CoreCommentGetComments200Response from a dict
core_comment_get_comments200_response_from_dict = CoreCommentGetComments200Response.from_dict(core_comment_get_comments200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


