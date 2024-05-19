# ModDataGetDataAccessInformationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**databaseid** | **int** | Database instance id. | [default to null]
**groupid** | **int** | Group id, 0 means that the function will determine the user group. | [optional] [default to 0]

## Example

```python
from openapi_client.models.mod_data_get_data_access_information_request import ModDataGetDataAccessInformationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModDataGetDataAccessInformationRequest from a JSON string
mod_data_get_data_access_information_request_instance = ModDataGetDataAccessInformationRequest.from_json(json)
# print the JSON string representation of the object
print(ModDataGetDataAccessInformationRequest.to_json())

# convert the object into a dict
mod_data_get_data_access_information_request_dict = mod_data_get_data_access_information_request_instance.to_dict()
# create an instance of ModDataGetDataAccessInformationRequest from a dict
mod_data_get_data_access_information_request_from_dict = ModDataGetDataAccessInformationRequest.from_dict(mod_data_get_data_access_information_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


