# ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backdrop** | **bool** | Whether a backdrop should be used | [optional] [default to False]
**content** | **str** | Step Content | [optional] [default to 'null']
**delay** | **int** | Delay before showing the step (ms) | [optional] [default to null]
**element** | **str** | Step Target | [optional] [default to 'null']
**orphan** | **bool** | Whether to display the step even if it could not be found | [optional] [default to False]
**placement** | **str** | Step Placement | [optional] [default to 'null']
**reflex** | **bool** | Whether to move to the next step when the target element is clicked | [optional] [default to False]
**stepid** | **int** | The actual ID of the step | [optional] [default to null]
**title** | **str** | Step Title | [optional] [default to 'null']

## Example

```python
from openapi_client.models.tool_usertours_fetch_and_start_tour200_response_tourconfig_steps_inner import ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner from a JSON string
tool_usertours_fetch_and_start_tour200_response_tourconfig_steps_inner_instance = ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner.from_json(json)
# print the JSON string representation of the object
print(ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner.to_json())

# convert the object into a dict
tool_usertours_fetch_and_start_tour200_response_tourconfig_steps_inner_dict = tool_usertours_fetch_and_start_tour200_response_tourconfig_steps_inner_instance.to_dict()
# create an instance of ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner from a dict
tool_usertours_fetch_and_start_tour200_response_tourconfig_steps_inner_from_dict = ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner.from_dict(tool_usertours_fetch_and_start_tour200_response_tourconfig_steps_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


