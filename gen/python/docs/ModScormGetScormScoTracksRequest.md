# ModScormGetScormScoTracksRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempt** | **int** | attempt number (0 for last attempt) | [optional] [default to 0]
**scoid** | **int** | sco id | [default to null]
**userid** | **int** | user id | 

## Example

```python
from openapi_client.models.mod_scorm_get_scorm_sco_tracks_request import ModScormGetScormScoTracksRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormGetScormScoTracksRequest from a JSON string
mod_scorm_get_scorm_sco_tracks_request_instance = ModScormGetScormScoTracksRequest.from_json(json)
# print the JSON string representation of the object
print(ModScormGetScormScoTracksRequest.to_json())

# convert the object into a dict
mod_scorm_get_scorm_sco_tracks_request_dict = mod_scorm_get_scorm_sco_tracks_request_instance.to_dict()
# create an instance of ModScormGetScormScoTracksRequest from a dict
mod_scorm_get_scorm_sco_tracks_request_from_dict = ModScormGetScormScoTracksRequest.from_dict(mod_scorm_get_scorm_sco_tracks_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


