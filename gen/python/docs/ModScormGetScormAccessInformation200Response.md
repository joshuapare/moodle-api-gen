# ModScormGetScormAccessInformation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canaddinstance** | **bool** | Whether the user has the capability mod/scorm:addinstance allowed. | [optional] [default to False]
**candeleteownresponses** | **bool** | Whether the user has the capability mod/scorm:deleteownresponses allowed. | [optional] [default to False]
**candeleteresponses** | **bool** | Whether the user has the capability mod/scorm:deleteresponses allowed. | [optional] [default to False]
**cansavetrack** | **bool** | Whether the user has the capability mod/scorm:savetrack allowed. | [optional] [default to False]
**canskipview** | **bool** | Whether the user has the capability mod/scorm:skipview allowed. | [optional] [default to False]
**canviewreport** | **bool** | Whether the user has the capability mod/scorm:viewreport allowed. | [optional] [default to False]
**canviewscores** | **bool** | Whether the user has the capability mod/scorm:viewscores allowed. | [optional] [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_scorm_get_scorm_access_information200_response import ModScormGetScormAccessInformation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormGetScormAccessInformation200Response from a JSON string
mod_scorm_get_scorm_access_information200_response_instance = ModScormGetScormAccessInformation200Response.from_json(json)
# print the JSON string representation of the object
print(ModScormGetScormAccessInformation200Response.to_json())

# convert the object into a dict
mod_scorm_get_scorm_access_information200_response_dict = mod_scorm_get_scorm_access_information200_response_instance.to_dict()
# create an instance of ModScormGetScormAccessInformation200Response from a dict
mod_scorm_get_scorm_access_information200_response_from_dict = ModScormGetScormAccessInformation200Response.from_dict(mod_scorm_get_scorm_access_information200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


