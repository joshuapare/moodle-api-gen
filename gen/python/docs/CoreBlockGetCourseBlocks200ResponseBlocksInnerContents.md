# CoreBlockGetCourseBlocks200ResponseBlocksInnerContents


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | Block contents. | [default to 'null']
**contentformat** | **int** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [default to null]
**files** | [**List[CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | 
**footer** | **str** | Block footer. | [default to 'null']
**title** | **str** | Block title. | [default to 'null']

## Example

```python
from openapi_client.models.core_block_get_course_blocks200_response_blocks_inner_contents import CoreBlockGetCourseBlocks200ResponseBlocksInnerContents

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlockGetCourseBlocks200ResponseBlocksInnerContents from a JSON string
core_block_get_course_blocks200_response_blocks_inner_contents_instance = CoreBlockGetCourseBlocks200ResponseBlocksInnerContents.from_json(json)
# print the JSON string representation of the object
print(CoreBlockGetCourseBlocks200ResponseBlocksInnerContents.to_json())

# convert the object into a dict
core_block_get_course_blocks200_response_blocks_inner_contents_dict = core_block_get_course_blocks200_response_blocks_inner_contents_instance.to_dict()
# create an instance of CoreBlockGetCourseBlocks200ResponseBlocksInnerContents from a dict
core_block_get_course_blocks200_response_blocks_inner_contents_from_dict = CoreBlockGetCourseBlocks200ResponseBlocksInnerContents.from_dict(core_block_get_course_blocks200_response_blocks_inner_contents_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


