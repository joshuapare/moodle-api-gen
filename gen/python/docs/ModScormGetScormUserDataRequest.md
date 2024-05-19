# ModScormGetScormUserDataRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempt** | **int** | attempt number | 
**scormid** | **int** | scorm instance id | 

## Example

```python
from openapi_client.models.mod_scorm_get_scorm_user_data_request import ModScormGetScormUserDataRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormGetScormUserDataRequest from a JSON string
mod_scorm_get_scorm_user_data_request_instance = ModScormGetScormUserDataRequest.from_json(json)
# print the JSON string representation of the object
print(ModScormGetScormUserDataRequest.to_json())

# convert the object into a dict
mod_scorm_get_scorm_user_data_request_dict = mod_scorm_get_scorm_user_data_request_instance.to_dict()
# create an instance of ModScormGetScormUserDataRequest from a dict
mod_scorm_get_scorm_user_data_request_from_dict = ModScormGetScormUserDataRequest.from_dict(mod_scorm_get_scorm_user_data_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


