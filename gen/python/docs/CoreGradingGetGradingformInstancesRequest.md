# CoreGradingGetGradingformInstancesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**definitionid** | **int** | definition id | 
**since** | **int** | submitted since | [optional] [default to 0]

## Example

```python
from openapi_client.models.core_grading_get_gradingform_instances_request import CoreGradingGetGradingformInstancesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradingGetGradingformInstancesRequest from a JSON string
core_grading_get_gradingform_instances_request_instance = CoreGradingGetGradingformInstancesRequest.from_json(json)
# print the JSON string representation of the object
print(CoreGradingGetGradingformInstancesRequest.to_json())

# convert the object into a dict
core_grading_get_gradingform_instances_request_dict = core_grading_get_gradingform_instances_request_instance.to_dict()
# create an instance of CoreGradingGetGradingformInstancesRequest from a dict
core_grading_get_gradingform_instances_request_from_dict = CoreGradingGetGradingformInstancesRequest.from_dict(core_grading_get_gradingform_instances_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


