# ModScormGetScormScoesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organization** | **str** | organization id | [optional] [default to '']
**scormid** | **int** | scorm instance id | [default to null]

## Example

```python
from openapi_client.models.mod_scorm_get_scorm_scoes_request import ModScormGetScormScoesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModScormGetScormScoesRequest from a JSON string
mod_scorm_get_scorm_scoes_request_instance = ModScormGetScormScoesRequest.from_json(json)
# print the JSON string representation of the object
print(ModScormGetScormScoesRequest.to_json())

# convert the object into a dict
mod_scorm_get_scorm_scoes_request_dict = mod_scorm_get_scorm_scoes_request_instance.to_dict()
# create an instance of ModScormGetScormScoesRequest from a dict
mod_scorm_get_scorm_scoes_request_from_dict = ModScormGetScormScoesRequest.from_dict(mod_scorm_get_scorm_scoes_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


