# ModScormGetScormUserData200ResponseDataInner

SCO data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultdata** | [**List[ModScormGetScormUserData200ResponseDataInnerDefaultdataInner]**](ModScormGetScormUserData200ResponseDataInnerDefaultdataInner.md) |  | [optional] 
**scoid** | **int** | sco id | [optional] 
**userdata** | [**List[ModScormGetScormUserData200ResponseDataInnerDefaultdataInner]**](ModScormGetScormUserData200ResponseDataInnerDefaultdataInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_scorm_get_scorm_user_data200_response_data_inner import ModScormGetScormUserData200ResponseDataInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormGetScormUserData200ResponseDataInner from a JSON string
mod_scorm_get_scorm_user_data200_response_data_inner_instance = ModScormGetScormUserData200ResponseDataInner.from_json(json)
# print the JSON string representation of the object
print(ModScormGetScormUserData200ResponseDataInner.to_json())

# convert the object into a dict
mod_scorm_get_scorm_user_data200_response_data_inner_dict = mod_scorm_get_scorm_user_data200_response_data_inner_instance.to_dict()
# create an instance of ModScormGetScormUserData200ResponseDataInner from a dict
mod_scorm_get_scorm_user_data200_response_data_inner_from_dict = ModScormGetScormUserData200ResponseDataInner.from_dict(mod_scorm_get_scorm_user_data200_response_data_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


