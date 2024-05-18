# ModScormLaunchScoRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scoid** | **int** | SCO id (empty for launching the first SCO) | [optional] [default to 0]
**scormid** | **int** | SCORM instance id | 

## Example

```python
from openapi_client.models.mod_scorm_launch_sco_request import ModScormLaunchScoRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormLaunchScoRequest from a JSON string
mod_scorm_launch_sco_request_instance = ModScormLaunchScoRequest.from_json(json)
# print the JSON string representation of the object
print(ModScormLaunchScoRequest.to_json())

# convert the object into a dict
mod_scorm_launch_sco_request_dict = mod_scorm_launch_sco_request_instance.to_dict()
# create an instance of ModScormLaunchScoRequest from a dict
mod_scorm_launch_sco_request_from_dict = ModScormLaunchScoRequest.from_dict(mod_scorm_launch_sco_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


