# ModDataGetMappingInformationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cmid** | **int** | Id of the data activity | 
**importedpreset** | **str** | Preset to be imported | [default to 'null']

## Example

```python
from openapi_client.models.mod_data_get_mapping_information_request import ModDataGetMappingInformationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetMappingInformationRequest from a JSON string
mod_data_get_mapping_information_request_instance = ModDataGetMappingInformationRequest.from_json(json)
# print the JSON string representation of the object
print(ModDataGetMappingInformationRequest.to_json())

# convert the object into a dict
mod_data_get_mapping_information_request_dict = mod_data_get_mapping_information_request_instance.to_dict()
# create an instance of ModDataGetMappingInformationRequest from a dict
mod_data_get_mapping_information_request_from_dict = ModDataGetMappingInformationRequest.from_dict(mod_data_get_mapping_information_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


