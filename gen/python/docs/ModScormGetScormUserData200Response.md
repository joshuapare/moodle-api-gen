# ModScormGetScormUserData200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[ModScormGetScormUserData200ResponseDataInner]**](ModScormGetScormUserData200ResponseDataInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_scorm_get_scorm_user_data200_response import ModScormGetScormUserData200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormGetScormUserData200Response from a JSON string
mod_scorm_get_scorm_user_data200_response_instance = ModScormGetScormUserData200Response.from_json(json)
# print the JSON string representation of the object
print(ModScormGetScormUserData200Response.to_json())

# convert the object into a dict
mod_scorm_get_scorm_user_data200_response_dict = mod_scorm_get_scorm_user_data200_response_instance.to_dict()
# create an instance of ModScormGetScormUserData200Response from a dict
mod_scorm_get_scorm_user_data200_response_from_dict = ModScormGetScormUserData200Response.from_dict(mod_scorm_get_scorm_user_data200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


