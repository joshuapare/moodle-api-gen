# ModWorkshopGetSubmission200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**submission** | [**ModWorkshopGetSubmission200ResponseSubmission**](ModWorkshopGetSubmission200ResponseSubmission.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_get_submission200_response import ModWorkshopGetSubmission200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopGetSubmission200Response from a JSON string
mod_workshop_get_submission200_response_instance = ModWorkshopGetSubmission200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopGetSubmission200Response.to_json())

# convert the object into a dict
mod_workshop_get_submission200_response_dict = mod_workshop_get_submission200_response_instance.to_dict()
# create an instance of ModWorkshopGetSubmission200Response from a dict
mod_workshop_get_submission200_response_from_dict = ModWorkshopGetSubmission200Response.from_dict(mod_workshop_get_submission200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


