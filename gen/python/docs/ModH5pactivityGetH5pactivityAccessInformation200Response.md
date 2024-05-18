# ModH5pactivityGetH5pactivityAccessInformation200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canaddinstance** | **bool** | Whether the user has the capability mod/h5pactivity:addinstance allowed. | [optional] [default to False]
**canreviewattempts** | **bool** | Whether the user has the capability mod/h5pactivity:reviewattempts allowed. | [optional] [default to False]
**cansubmit** | **bool** | Whether the user has the capability mod/h5pactivity:submit allowed. | [optional] [default to False]
**canview** | **bool** | Whether the user has the capability mod/h5pactivity:view allowed. | [optional] [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_h5pactivity_get_h5pactivity_access_information200_response import ModH5pactivityGetH5pactivityAccessInformation200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModH5pactivityGetH5pactivityAccessInformation200Response from a JSON string
mod_h5pactivity_get_h5pactivity_access_information200_response_instance = ModH5pactivityGetH5pactivityAccessInformation200Response.from_json(json)
# print the JSON string representation of the object
print(ModH5pactivityGetH5pactivityAccessInformation200Response.to_json())

# convert the object into a dict
mod_h5pactivity_get_h5pactivity_access_information200_response_dict = mod_h5pactivity_get_h5pactivity_access_information200_response_instance.to_dict()
# create an instance of ModH5pactivityGetH5pactivityAccessInformation200Response from a dict
mod_h5pactivity_get_h5pactivity_access_information200_response_from_dict = ModH5pactivityGetH5pactivityAccessInformation200Response.from_dict(mod_h5pactivity_get_h5pactivity_access_information200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


