# ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**criterionid** | **int** | criterion id | [optional] 
**levelid** | **int** | level id | [optional] 
**remark** | **str** | remark | [optional] 
**remarkformat** | **int** | remark format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**score** | **float** | maximum score | [optional] 

## Example

```python
from openapi_client.models.mod_assign_save_grade_request_advancedgradingdata_guide_criteria_inner_fillings_inner import ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner from a JSON string
mod_assign_save_grade_request_advancedgradingdata_guide_criteria_inner_fillings_inner_instance = ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.from_json(json)
# print the JSON string representation of the object
print(ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.to_json())

# convert the object into a dict
mod_assign_save_grade_request_advancedgradingdata_guide_criteria_inner_fillings_inner_dict = mod_assign_save_grade_request_advancedgradingdata_guide_criteria_inner_fillings_inner_instance.to_dict()
# create an instance of ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner from a dict
mod_assign_save_grade_request_advancedgradingdata_guide_criteria_inner_fillings_inner_from_dict = ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.from_dict(mod_assign_save_grade_request_advancedgradingdata_guide_criteria_inner_fillings_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


