# ModH5pactivityGetAttemptsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**h5pactivityid** | **int** | h5p activity instance id | [default to null]
**userids** | **List[object]** |  | [optional] 

## Example

```python
from openapi_client.models.mod_h5pactivity_get_attempts_request import ModH5pactivityGetAttemptsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModH5pactivityGetAttemptsRequest from a JSON string
mod_h5pactivity_get_attempts_request_instance = ModH5pactivityGetAttemptsRequest.from_json(json)
# print the JSON string representation of the object
print(ModH5pactivityGetAttemptsRequest.to_json())

# convert the object into a dict
mod_h5pactivity_get_attempts_request_dict = mod_h5pactivity_get_attempts_request_instance.to_dict()
# create an instance of ModH5pactivityGetAttemptsRequest from a dict
mod_h5pactivity_get_attempts_request_from_dict = ModH5pactivityGetAttemptsRequest.from_dict(mod_h5pactivity_get_attempts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


