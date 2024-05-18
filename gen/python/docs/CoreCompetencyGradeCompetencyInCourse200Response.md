# CoreCompetencyGradeCompetencyInCourse200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **int** | action | 
**actionuser** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | [optional] 
**actionuserid** | **int** | actionuserid | 
**candelete** | **bool** | candelete | 
**contextid** | **int** | contextid | 
**desca** | **str** | desca | 
**desccomponent** | **str** | desccomponent | 
**descidentifier** | **str** | descidentifier | 
**description** | **str** | description | 
**grade** | **int** | grade | 
**gradename** | **str** | gradename | 
**id** | **int** | id | [default to 0]
**note** | **str** | note | 
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**url** | **str** | url | 
**usercompetencyid** | **int** | usercompetencyid | 
**userdate** | **str** | userdate | 
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.core_competency_grade_competency_in_course200_response import CoreCompetencyGradeCompetencyInCourse200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyGradeCompetencyInCourse200Response from a JSON string
core_competency_grade_competency_in_course200_response_instance = CoreCompetencyGradeCompetencyInCourse200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyGradeCompetencyInCourse200Response.to_json())

# convert the object into a dict
core_competency_grade_competency_in_course200_response_dict = core_competency_grade_competency_in_course200_response_instance.to_dict()
# create an instance of CoreCompetencyGradeCompetencyInCourse200Response from a dict
core_competency_grade_competency_in_course200_response_from_dict = CoreCompetencyGradeCompetencyInCourse200Response.from_dict(core_competency_grade_competency_in_course200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


