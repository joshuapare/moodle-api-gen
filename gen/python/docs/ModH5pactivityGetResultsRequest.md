# ModH5pactivityGetResultsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attemptids** | **List[object]** |  | [optional] 
**h5pactivityid** | **int** | h5p activity instance id | 

## Example

```python
from openapi_client.models.mod_h5pactivity_get_results_request import ModH5pactivityGetResultsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModH5pactivityGetResultsRequest from a JSON string
mod_h5pactivity_get_results_request_instance = ModH5pactivityGetResultsRequest.from_json(json)
# print the JSON string representation of the object
print(ModH5pactivityGetResultsRequest.to_json())

# convert the object into a dict
mod_h5pactivity_get_results_request_dict = mod_h5pactivity_get_results_request_instance.to_dict()
# create an instance of ModH5pactivityGetResultsRequest from a dict
mod_h5pactivity_get_results_request_from_dict = ModH5pactivityGetResultsRequest.from_dict(mod_h5pactivity_get_results_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


