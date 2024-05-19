# CoreBlockGetCourseBlocks200ResponseBlocksInner

Block information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collapsible** | **bool** | Whether the block is collapsible. | [optional] [default to False]
**configs** | [**List[CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner]**](CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner.md) |  | [optional] 
**contents** | [**CoreBlockGetCourseBlocks200ResponseBlocksInnerContents**](CoreBlockGetCourseBlocks200ResponseBlocksInnerContents.md) |  | [optional] 
**dockable** | **bool** | Whether the block is dockable. | [optional] [default to False]
**instanceid** | **int** | Block instance id. | [optional] [default to null]
**name** | **str** | Block name. | [optional] [default to 'null']
**positionid** | **int** | Position id. | [optional] [default to null]
**region** | **str** | Block region. | [optional] [default to 'null']
**visible** | **bool** | Whether the block is visible. | [optional] [default to False]
**weight** | **int** | Used to order blocks within a region. | [optional] [default to null]

## Example

```python
from openapi_client.models.core_block_get_course_blocks200_response_blocks_inner import CoreBlockGetCourseBlocks200ResponseBlocksInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlockGetCourseBlocks200ResponseBlocksInner from a JSON string
core_block_get_course_blocks200_response_blocks_inner_instance = CoreBlockGetCourseBlocks200ResponseBlocksInner.from_json(json)
# print the JSON string representation of the object
print(CoreBlockGetCourseBlocks200ResponseBlocksInner.to_json())

# convert the object into a dict
core_block_get_course_blocks200_response_blocks_inner_dict = core_block_get_course_blocks200_response_blocks_inner_instance.to_dict()
# create an instance of CoreBlockGetCourseBlocks200ResponseBlocksInner from a dict
core_block_get_course_blocks200_response_blocks_inner_from_dict = CoreBlockGetCourseBlocks200ResponseBlocksInner.from_dict(core_block_get_course_blocks200_response_blocks_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


