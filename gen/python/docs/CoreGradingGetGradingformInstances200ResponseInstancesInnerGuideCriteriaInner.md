# CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criterionid** | **int** | criterion id | [optional] 
**id** | **int** | filling id | [optional] [default to null]
**levelid** | **int** | level id | [optional] 
**remark** | **str** | remark | [optional] [default to 'null']
**remarkformat** | **int** | remark format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**score** | **float** | maximum score | [optional] 

## Example

```python
from openapi_client.models.core_grading_get_gradingform_instances200_response_instances_inner_guide_criteria_inner import CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner from a JSON string
core_grading_get_gradingform_instances200_response_instances_inner_guide_criteria_inner_instance = CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.to_json())

# convert the object into a dict
core_grading_get_gradingform_instances200_response_instances_inner_guide_criteria_inner_dict = core_grading_get_gradingform_instances200_response_instances_inner_guide_criteria_inner_instance.to_dict()
# create an instance of CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner from a dict
core_grading_get_gradingform_instances200_response_instances_inner_guide_criteria_inner_from_dict = CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.from_dict(core_grading_get_gradingform_instances200_response_instances_inner_guide_criteria_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


