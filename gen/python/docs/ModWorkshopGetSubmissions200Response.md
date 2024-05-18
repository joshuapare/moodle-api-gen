# ModWorkshopGetSubmissions200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**submissions** | [**List[ModWorkshopGetSubmissions200ResponseSubmissionsInner]**](ModWorkshopGetSubmissions200ResponseSubmissionsInner.md) |  | 
**totalcount** | **int** | Total count of submissions. | [default to null]
**totalfilesize** | **int** | Total size (bytes) of the files attached to all the                     submissions (even the ones not returned due to pagination). | [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_get_submissions200_response import ModWorkshopGetSubmissions200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetSubmissions200Response from a JSON string
mod_workshop_get_submissions200_response_instance = ModWorkshopGetSubmissions200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetSubmissions200Response.to_json())

# convert the object into a dict
mod_workshop_get_submissions200_response_dict = mod_workshop_get_submissions200_response_instance.to_dict()
# create an instance of ModWorkshopGetSubmissions200Response from a dict
mod_workshop_get_submissions200_response_from_dict = ModWorkshopGetSubmissions200Response.from_dict(mod_workshop_get_submissions200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


