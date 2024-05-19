# CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criterionid** | **int** | criterion id | [optional] 
**id** | **int** | filling id | [optional] 
**levelid** | **int** | level id | [optional] 
**remark** | **str** | remark | [optional] 
**remarkformat** | **int** | remark format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 

## Example

```python
from openapi_client.models.core_grading_get_gradingform_instances200_response_instances_inner_rubric_criteria_inner import CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner

# TODO update the JSON string below
json = "{}"
# create an instance of CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner from a JSON string
core_grading_get_gradingform_instances200_response_instances_inner_rubric_criteria_inner_instance = CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner.from_json(json)
# print the JSON string representation of the object
print(CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner.to_json())

# convert the object into a dict
core_grading_get_gradingform_instances200_response_instances_inner_rubric_criteria_inner_dict = core_grading_get_gradingform_instances200_response_instances_inner_rubric_criteria_inner_instance.to_dict()
# create an instance of CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner from a dict
core_grading_get_gradingform_instances200_response_instances_inner_rubric_criteria_inner_from_dict = CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner.from_dict(core_grading_get_gradingform_instances200_response_instances_inner_rubric_criteria_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


