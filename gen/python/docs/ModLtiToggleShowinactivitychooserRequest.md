# ModLtiToggleShowinactivitychooserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course ID | 
**showinactivitychooser** | **bool** | Show in activity chooser | [default to False]
**tooltypeid** | **int** | Tool type ID | 

## Example

```python
from openapi_client.models.mod_lti_toggle_showinactivitychooser_request import ModLtiToggleShowinactivitychooserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModLtiToggleShowinactivitychooserRequest from a JSON string
mod_lti_toggle_showinactivitychooser_request_instance = ModLtiToggleShowinactivitychooserRequest.from_json(json)
# print the JSON string representation of the object
print(ModLtiToggleShowinactivitychooserRequest.to_json())

# convert the object into a dict
mod_lti_toggle_showinactivitychooser_request_dict = mod_lti_toggle_showinactivitychooser_request_instance.to_dict()
# create an instance of ModLtiToggleShowinactivitychooserRequest from a dict
mod_lti_toggle_showinactivitychooser_request_from_dict = ModLtiToggleShowinactivitychooserRequest.from_dict(mod_lti_toggle_showinactivitychooser_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


