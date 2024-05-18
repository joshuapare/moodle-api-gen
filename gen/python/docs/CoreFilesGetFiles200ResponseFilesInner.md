# CoreFilesGetFiles200ResponseFilesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | **str** | File owner | [optional] [default to 'null']
**component** | **str** |  | [optional] [default to 'null']
**contextid** | **int** |  | [optional] [default to null]
**filearea** | **str** |  | [optional] 
**filename** | **str** |  | [optional] 
**filepath** | **str** |  | [optional] 
**filesize** | **int** | File size | [optional] [default to null]
**isdir** | **bool** |  | [optional] [default to False]
**itemid** | **int** |  | [optional] 
**license** | **str** | File license | [optional] [default to 'null']
**timecreated** | **int** | Time created | [optional] [default to null]
**timemodified** | **int** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.core_files_get_files200_response_files_inner import CoreFilesGetFiles200ResponseFilesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreFilesGetFiles200ResponseFilesInner from a JSON string
core_files_get_files200_response_files_inner_instance = CoreFilesGetFiles200ResponseFilesInner.from_json(json)
# print the JSON string representation of the object
print(CoreFilesGetFiles200ResponseFilesInner.to_json())

# convert the object into a dict
core_files_get_files200_response_files_inner_dict = core_files_get_files200_response_files_inner_instance.to_dict()
# create an instance of CoreFilesGetFiles200ResponseFilesInner from a dict
core_files_get_files200_response_files_inner_from_dict = CoreFilesGetFiles200ResponseFilesInner.from_dict(core_files_get_files200_response_files_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


