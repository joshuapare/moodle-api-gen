# CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner

File.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **str** | File name. | [optional] [default to 'null']
**filepath** | **str** | File path. | [optional] [default to 'null']
**filesize** | **int** | File size. | [optional] [default to null]
**fileurl** | **str** | Downloadable file url. | [optional] [default to 'null']
**isexternalfile** | **bool** | Whether is an external file. | [optional] [default to False]
**mimetype** | **str** | File mime type. | [optional] [default to 'null']
**repositorytype** | **str** | The repository type for external files. | [optional] [default to 'null']
**timemodified** | **int** | Time modified. | [optional] [default to null]

## Example

```python
from openapi_client.models.core_block_get_course_blocks200_response_blocks_inner_contents_files_inner import CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner from a JSON string
core_block_get_course_blocks200_response_blocks_inner_contents_files_inner_instance = CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner.from_json(json)
# print the JSON string representation of the object
print(CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner.to_json())

# convert the object into a dict
core_block_get_course_blocks200_response_blocks_inner_contents_files_inner_dict = core_block_get_course_blocks200_response_blocks_inner_contents_files_inner_instance.to_dict()
# create an instance of CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner from a dict
core_block_get_course_blocks200_response_blocks_inner_contents_files_inner_from_dict = CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner.from_dict(core_block_get_course_blocks200_response_blocks_inner_contents_files_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


