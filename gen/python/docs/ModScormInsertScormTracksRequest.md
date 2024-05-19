# ModScormInsertScormTracksRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempt** | **int** | attempt number | 
**scoid** | **int** | SCO id | [default to null]
**tracks** | [**List[ModScormGetScormUserData200ResponseDataInnerDefaultdataInner]**](ModScormGetScormUserData200ResponseDataInnerDefaultdataInner.md) |  | 

## Example

```python
from openapi_client.models.mod_scorm_insert_scorm_tracks_request import ModScormInsertScormTracksRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormInsertScormTracksRequest from a JSON string
mod_scorm_insert_scorm_tracks_request_instance = ModScormInsertScormTracksRequest.from_json(json)
# print the JSON string representation of the object
print(ModScormInsertScormTracksRequest.to_json())

# convert the object into a dict
mod_scorm_insert_scorm_tracks_request_dict = mod_scorm_insert_scorm_tracks_request_instance.to_dict()
# create an instance of ModScormInsertScormTracksRequest from a dict
mod_scorm_insert_scorm_tracks_request_from_dict = ModScormInsertScormTracksRequest.from_dict(mod_scorm_insert_scorm_tracks_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


