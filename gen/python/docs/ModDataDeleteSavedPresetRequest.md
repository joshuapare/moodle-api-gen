# ModDataDeleteSavedPresetRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataid** | **int** | Id of the data activity | [default to null]
**presetnames** | **List[object]** |  | 

## Example

```python
from openapi_client.models.mod_data_delete_saved_preset_request import ModDataDeleteSavedPresetRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataDeleteSavedPresetRequest from a JSON string
mod_data_delete_saved_preset_request_instance = ModDataDeleteSavedPresetRequest.from_json(json)
# print the JSON string representation of the object
print(ModDataDeleteSavedPresetRequest.to_json())

# convert the object into a dict
mod_data_delete_saved_preset_request_dict = mod_data_delete_saved_preset_request_instance.to_dict()
# create an instance of ModDataDeleteSavedPresetRequest from a dict
mod_data_delete_saved_preset_request_from_dict = ModDataDeleteSavedPresetRequest.from_dict(mod_data_delete_saved_preset_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


