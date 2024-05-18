# ModDataGetMappingInformation200ResponseData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldstocreate** | **str** | List of field names to create | [default to 'null']
**fieldstoremove** | **str** | List of field names to remove | [default to 'null']
**needsmapping** | **bool** | Whether the importing needs mapping or not | [default to False]
**presetname** | **str** | Name of the applied preset | [default to 'null']

## Example

```python
from openapi_client.models.mod_data_get_mapping_information200_response_data import ModDataGetMappingInformation200ResponseData

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetMappingInformation200ResponseData from a JSON string
mod_data_get_mapping_information200_response_data_instance = ModDataGetMappingInformation200ResponseData.from_json(json)
# print the JSON string representation of the object
print(ModDataGetMappingInformation200ResponseData.to_json())

# convert the object into a dict
mod_data_get_mapping_information200_response_data_dict = mod_data_get_mapping_information200_response_data_instance.to_dict()
# create an instance of ModDataGetMappingInformation200ResponseData from a dict
mod_data_get_mapping_information200_response_data_from_dict = ModDataGetMappingInformation200ResponseData.from_dict(mod_data_get_mapping_information200_response_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


