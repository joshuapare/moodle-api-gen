# CoreCompetencyGradeCompetency200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **int** | action | [default to null]
**actionuser** | [**CoreCompetencyGradeCompetency200ResponseActionuser**](CoreCompetencyGradeCompetency200ResponseActionuser.md) |  | [optional] 
**actionuserid** | **int** | actionuserid | [default to null]
**candelete** | **bool** | candelete | 
**contextid** | **int** | contextid | 
**desca** | **str** | desca | [default to 'null']
**desccomponent** | **str** | desccomponent | [default to 'null']
**descidentifier** | **str** | descidentifier | [default to 'null']
**description** | **str** | description | 
**grade** | **int** | grade | [default to null]
**gradename** | **str** | gradename | [default to 'null']
**id** | **int** | id | [default to 0]
**note** | **str** | note | [default to 'null']
**timecreated** | **int** | timecreated | [default to 0]
**timemodified** | **int** | timemodified | [default to 0]
**url** | **str** | url | [default to 'null']
**usercompetencyid** | **int** | usercompetencyid | [default to null]
**userdate** | **str** | userdate | [default to 'null']
**usermodified** | **int** | usermodified | [default to 0]

## Example

```python
from openapi_client.models.core_competency_grade_competency200_response import CoreCompetencyGradeCompetency200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyGradeCompetency200Response from a JSON string
core_competency_grade_competency200_response_instance = CoreCompetencyGradeCompetency200Response.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyGradeCompetency200Response.to_json())

# convert the object into a dict
core_competency_grade_competency200_response_dict = core_competency_grade_competency200_response_instance.to_dict()
# create an instance of CoreCompetencyGradeCompetency200Response from a dict
core_competency_grade_competency200_response_from_dict = CoreCompetencyGradeCompetency200Response.from_dict(core_competency_grade_competency200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


