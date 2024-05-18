# CoreBlockGetCourseBlocksRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | course id | [default to null]
**returncontents** | **bool** | Whether to return the block contents. | [optional] [default to False]

## Example

```python
from openapi_client.models.core_block_get_course_blocks_request import CoreBlockGetCourseBlocksRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlockGetCourseBlocksRequest from a JSON string
core_block_get_course_blocks_request_instance = CoreBlockGetCourseBlocksRequest.from_json(json)
# print the JSON string representation of the object
print(CoreBlockGetCourseBlocksRequest.to_json())

# convert the object into a dict
core_block_get_course_blocks_request_dict = core_block_get_course_blocks_request_instance.to_dict()
# create an instance of CoreBlockGetCourseBlocksRequest from a dict
core_block_get_course_blocks_request_from_dict = CoreBlockGetCourseBlocksRequest.from_dict(core_block_get_course_blocks_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


