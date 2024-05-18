# ModScormGetScormScoTracks200ResponseData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempt** | **int** | Attempt number | 
**tracks** | [**List[ModScormGetScormScoTracks200ResponseDataTracksInner]**](ModScormGetScormScoTracks200ResponseDataTracksInner.md) |  | 

## Example

```python
from openapi_client.models.mod_scorm_get_scorm_sco_tracks200_response_data import ModScormGetScormScoTracks200ResponseData

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormGetScormScoTracks200ResponseData from a JSON string
mod_scorm_get_scorm_sco_tracks200_response_data_instance = ModScormGetScormScoTracks200ResponseData.from_json(json)
# print the JSON string representation of the object
print(ModScormGetScormScoTracks200ResponseData.to_json())

# convert the object into a dict
mod_scorm_get_scorm_sco_tracks200_response_data_dict = mod_scorm_get_scorm_sco_tracks200_response_data_instance.to_dict()
# create an instance of ModScormGetScormScoTracks200ResponseData from a dict
mod_scorm_get_scorm_sco_tracks200_response_data_from_dict = ModScormGetScormScoTracks200ResponseData.from_dict(mod_scorm_get_scorm_sco_tracks200_response_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


