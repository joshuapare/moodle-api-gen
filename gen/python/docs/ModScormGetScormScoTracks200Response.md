# ModScormGetScormScoTracks200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**ModScormGetScormScoTracks200ResponseData**](ModScormGetScormScoTracks200ResponseData.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.mod_scorm_get_scorm_sco_tracks200_response import ModScormGetScormScoTracks200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormGetScormScoTracks200Response from a JSON string
mod_scorm_get_scorm_sco_tracks200_response_instance = ModScormGetScormScoTracks200Response.from_json(json)
# print the JSON string representation of the object
print(ModScormGetScormScoTracks200Response.to_json())

# convert the object into a dict
mod_scorm_get_scorm_sco_tracks200_response_dict = mod_scorm_get_scorm_sco_tracks200_response_instance.to_dict()
# create an instance of ModScormGetScormScoTracks200Response from a dict
mod_scorm_get_scorm_sco_tracks200_response_from_dict = ModScormGetScormScoTracks200Response.from_dict(mod_scorm_get_scorm_sco_tracks200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


