# ModWorkshopUpdateSubmission200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | True if the submission was updated false otherwise. | [default to False]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_update_submission200_response import ModWorkshopUpdateSubmission200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopUpdateSubmission200Response from a JSON string
mod_workshop_update_submission200_response_instance = ModWorkshopUpdateSubmission200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopUpdateSubmission200Response.to_json())

# convert the object into a dict
mod_workshop_update_submission200_response_dict = mod_workshop_update_submission200_response_instance.to_dict()
# create an instance of ModWorkshopUpdateSubmission200Response from a dict
mod_workshop_update_submission200_response_from_dict = ModWorkshopUpdateSubmission200Response.from_dict(mod_workshop_update_submission200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


