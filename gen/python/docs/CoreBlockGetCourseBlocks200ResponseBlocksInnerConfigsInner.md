# CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name. | [optional] [default to 'null']
**type** | **str** | Type (instance or plugin). | [optional] [default to 'null']
**value** | **str** | JSON encoded representation of the config value. | [optional] [default to 'null']

## Example

```python
from openapi_client.models.core_block_get_course_blocks200_response_blocks_inner_configs_inner import CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner from a JSON string
core_block_get_course_blocks200_response_blocks_inner_configs_inner_instance = CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner.from_json(json)
# print the JSON string representation of the object
print(CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner.to_json())

# convert the object into a dict
core_block_get_course_blocks200_response_blocks_inner_configs_inner_dict = core_block_get_course_blocks200_response_blocks_inner_configs_inner_instance.to_dict()
# create an instance of CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner from a dict
core_block_get_course_blocks200_response_blocks_inner_configs_inner_from_dict = CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner.from_dict(core_block_get_course_blocks200_response_blocks_inner_configs_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


