# CoreGradingGetGradingformInstances200ResponseInstancesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedback** | **str** | feedback | [optional] [default to 'null']
**feedbackformat** | **int** | feedback format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**guide** | [**CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide**](CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide.md) |  | [optional] 
**id** | **int** | instance id | [optional] 
**itemid** | **int** | item id | [optional] 
**raterid** | **int** | rater id | [optional] [default to null]
**rawgrade** | **str** | raw grade | [optional] [default to 'null']
**rubric** | [**CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric**](CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric.md) |  | [optional] 
**status** | **int** | status | [optional] 
**timemodified** | **int** | modified time | [optional] [default to null]

## Example

```python
from openapi_client.models.core_grading_get_gradingform_instances200_response_instances_inner import CoreGradingGetGradingformInstances200ResponseInstancesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradingGetGradingformInstances200ResponseInstancesInner from a JSON string
core_grading_get_gradingform_instances200_response_instances_inner_instance = CoreGradingGetGradingformInstances200ResponseInstancesInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradingGetGradingformInstances200ResponseInstancesInner.to_json())

# convert the object into a dict
core_grading_get_gradingform_instances200_response_instances_inner_dict = core_grading_get_gradingform_instances200_response_instances_inner_instance.to_dict()
# create an instance of CoreGradingGetGradingformInstances200ResponseInstancesInner from a dict
core_grading_get_gradingform_instances200_response_instances_inner_from_dict = CoreGradingGetGradingformInstances200ResponseInstancesInner.from_dict(core_grading_get_gradingform_instances200_response_instances_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


