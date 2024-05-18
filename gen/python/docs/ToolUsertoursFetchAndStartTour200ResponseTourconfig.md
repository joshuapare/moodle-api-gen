# ToolUsertoursFetchAndStartTour200ResponseTourconfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displaystepnumbers** | **bool** | display step number | [default to False]
**endtourlabel** | **str** | Label of the end tour button | [default to 'null']
**name** | **str** | Tour Name | [default to 'null']
**steps** | [**List[ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner]**](ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner.md) |  | 

## Example

```python
from openapi_client.models.tool_usertours_fetch_and_start_tour200_response_tourconfig import ToolUsertoursFetchAndStartTour200ResponseTourconfig

# TODO update the JSON string below
json = "{}"
# create an instance of ToolUsertoursFetchAndStartTour200ResponseTourconfig from a JSON string
tool_usertours_fetch_and_start_tour200_response_tourconfig_instance = ToolUsertoursFetchAndStartTour200ResponseTourconfig.from_json(json)
# print the JSON string representation of the object
print(ToolUsertoursFetchAndStartTour200ResponseTourconfig.to_json())

# convert the object into a dict
tool_usertours_fetch_and_start_tour200_response_tourconfig_dict = tool_usertours_fetch_and_start_tour200_response_tourconfig_instance.to_dict()
# create an instance of ToolUsertoursFetchAndStartTour200ResponseTourconfig from a dict
tool_usertours_fetch_and_start_tour200_response_tourconfig_from_dict = ToolUsertoursFetchAndStartTour200ResponseTourconfig.from_dict(tool_usertours_fetch_and_start_tour200_response_tourconfig_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


