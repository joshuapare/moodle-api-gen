# ModScormGetScormAccessInformationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scormid** | **int** | scorm instance id. | [default to null]

## Example

```python
from openapi_client.models.mod_scorm_get_scorm_access_information_request import ModScormGetScormAccessInformationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormGetScormAccessInformationRequest from a JSON string
mod_scorm_get_scorm_access_information_request_instance = ModScormGetScormAccessInformationRequest.from_json(json)
# print the JSON string representation of the object
print(ModScormGetScormAccessInformationRequest.to_json())

# convert the object into a dict
mod_scorm_get_scorm_access_information_request_dict = mod_scorm_get_scorm_access_information_request_instance.to_dict()
# create an instance of ModScormGetScormAccessInformationRequest from a dict
mod_scorm_get_scorm_access_information_request_from_dict = ModScormGetScormAccessInformationRequest.from_dict(mod_scorm_get_scorm_access_information_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


