# ModH5pactivityGetResults200ResponseAttemptsInner

The attempt general information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attempt** | **int** | Attempt number | [optional] 
**completion** | **int** | Attempt completion | [optional] 
**duration** | **int** | Attempt duration in seconds | [optional] 
**h5pactivityid** | **int** | ID of the H5P activity | [optional] 
**id** | **int** | ID of the context | [optional] 
**maxscore** | **int** | Attempt max score | [optional] 
**rawscore** | **int** | Attempt score value | [optional] 
**results** | [**List[ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner]**](ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner.md) |  | [optional] 
**scaled** | **float** | Attempt scaled | [optional] 
**success** | **int** | Attempt success | [optional] 
**timecreated** | **int** | Attempt creation | [optional] 
**timemodified** | **int** | Attempt modified | [optional] 
**userid** | **int** | ID of the user | [optional] 

## Example

```python
from openapi_client.models.mod_h5pactivity_get_results200_response_attempts_inner import ModH5pactivityGetResults200ResponseAttemptsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModH5pactivityGetResults200ResponseAttemptsInner from a JSON string
mod_h5pactivity_get_results200_response_attempts_inner_instance = ModH5pactivityGetResults200ResponseAttemptsInner.from_json(json)
# print the JSON string representation of the object
print(ModH5pactivityGetResults200ResponseAttemptsInner.to_json())

# convert the object into a dict
mod_h5pactivity_get_results200_response_attempts_inner_dict = mod_h5pactivity_get_results200_response_attempts_inner_instance.to_dict()
# create an instance of ModH5pactivityGetResults200ResponseAttemptsInner from a dict
mod_h5pactivity_get_results200_response_attempts_inner_from_dict = ModH5pactivityGetResults200ResponseAttemptsInner.from_dict(mod_h5pactivity_get_results200_response_attempts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


