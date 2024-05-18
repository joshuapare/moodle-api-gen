# ModWorkshopAddSubmission200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **bool** | True if the submission was created false otherwise. | [default to False]
**submissionid** | **int** | New workshop submission id. | [optional] [default to null]
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_workshop_add_submission200_response import ModWorkshopAddSubmission200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModWorkshopAddSubmission200Response from a JSON string
mod_workshop_add_submission200_response_instance = ModWorkshopAddSubmission200Response.from_json(json)
# print the JSON string representation of the object
print(ModWorkshopAddSubmission200Response.to_json())

# convert the object into a dict
mod_workshop_add_submission200_response_dict = mod_workshop_add_submission200_response_instance.to_dict()
# create an instance of ModWorkshopAddSubmission200Response from a dict
mod_workshop_add_submission200_response_from_dict = ModWorkshopAddSubmission200Response.from_dict(mod_workshop_add_submission200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

