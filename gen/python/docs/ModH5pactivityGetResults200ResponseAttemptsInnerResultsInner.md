# ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner

A single result statement tracking information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answerlabel** | **str** | Label used for user answers | [optional] [default to 'null']
**attemptid** | **int** | ID of the H5P attempt | [optional] [default to null]
**completion** | **int** | Result completion | [optional] [default to null]
**content** | **str** | Result extra content | [optional] [default to 'null']
**correctlabel** | **str** | Label used for correct answers | [optional] [default to 'null']
**description** | **str** | Result description | [optional] [default to 'null']
**duration** | **int** | Result duration in seconds | [optional] [default to 0]
**id** | **int** | ID of the context | [optional] 
**interactiontype** | **str** | Interaction type | [optional] [default to 'null']
**maxscore** | **int** | Result max score | [optional] [default to null]
**options** | [**List[ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner]**](ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner.md) |  | [optional] 
**optionslabel** | **str** | Label used for result options | [optional] [default to 'null']
**rawscore** | **int** | Result score value | [optional] [default to null]
**subcontent** | **str** | Subcontent identifier | [optional] [default to 'null']
**success** | **int** | Result success | [optional] [default to null]
**timecreated** | **int** | Result creation | [optional] [default to null]
**track** | **bool** | If the result has valid track information | [optional] [default to False]

## Example

```python
from openapi_client.models.mod_h5pactivity_get_results200_response_attempts_inner_results_inner import ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner from a JSON string
mod_h5pactivity_get_results200_response_attempts_inner_results_inner_instance = ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner.from_json(json)
# print the JSON string representation of the object
print(ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner.to_json())

# convert the object into a dict
mod_h5pactivity_get_results200_response_attempts_inner_results_inner_dict = mod_h5pactivity_get_results200_response_attempts_inner_results_inner_instance.to_dict()
# create an instance of ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner from a dict
mod_h5pactivity_get_results200_response_attempts_inner_results_inner_from_dict = ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner.from_dict(mod_h5pactivity_get_results200_response_attempts_inner_results_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


