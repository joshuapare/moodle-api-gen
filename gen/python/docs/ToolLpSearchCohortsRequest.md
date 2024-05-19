# ToolLpSearchCohortsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**CoreCohortSearchCohortsRequestContext**](CoreCohortSearchCohortsRequestContext.md) |  | 
**includes** | **str** | What other contexts to fetch the frameworks from. (all, parents, self) | [optional] [default to 'parents']
**limitfrom** | **int** | limitfrom we are fetching the records from | [optional] [default to 0]
**limitnum** | **int** | Number of records to fetch | [optional] [default to 25]
**query** | **str** | Query string | 

## Example

```python
from openapi_client.models.tool_lp_search_cohorts_request import ToolLpSearchCohortsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ToolLpSearchCohortsRequest from a JSON string
tool_lp_search_cohorts_request_instance = ToolLpSearchCohortsRequest.from_json(json)
# print the JSON string representation of the object
print(ToolLpSearchCohortsRequest.to_json())

# convert the object into a dict
tool_lp_search_cohorts_request_dict = tool_lp_search_cohorts_request_instance.to_dict()
# create an instance of ToolLpSearchCohortsRequest from a dict
tool_lp_search_cohorts_request_from_dict = ToolLpSearchCohortsRequest.from_dict(tool_lp_search_cohorts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


