# CoreBlockGetCourseBlocks200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blocks** | [**List[CoreBlockGetCourseBlocks200ResponseBlocksInner]**](CoreBlockGetCourseBlocks200ResponseBlocksInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.core_block_get_course_blocks200_response import CoreBlockGetCourseBlocks200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlockGetCourseBlocks200Response from a JSON string
core_block_get_course_blocks200_response_instance = CoreBlockGetCourseBlocks200Response.from_json(json)
# print the JSON string representation of the object
print(CoreBlockGetCourseBlocks200Response.to_json())

# convert the object into a dict
core_block_get_course_blocks200_response_dict = core_block_get_course_blocks200_response_instance.to_dict()
# create an instance of CoreBlockGetCourseBlocks200Response from a dict
core_block_get_course_blocks200_response_from_dict = CoreBlockGetCourseBlocks200Response.from_dict(core_block_get_course_blocks200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


