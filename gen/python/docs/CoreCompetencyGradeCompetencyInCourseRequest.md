# CoreCompetencyGradeCompetencyInCourseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | Competency id | [default to null]
**courseid** | **int** | Course id | 
**grade** | **int** | New grade | 
**note** | **str** | A note to attach to the evidence | [optional] 
**userid** | **int** | User id | [default to null]

## Example

```python
from openapi_client.models.core_competency_grade_competency_in_course_request import CoreCompetencyGradeCompetencyInCourseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyGradeCompetencyInCourseRequest from a JSON string
core_competency_grade_competency_in_course_request_instance = CoreCompetencyGradeCompetencyInCourseRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyGradeCompetencyInCourseRequest.to_json())

# convert the object into a dict
core_competency_grade_competency_in_course_request_dict = core_competency_grade_competency_in_course_request_instance.to_dict()
# create an instance of CoreCompetencyGradeCompetencyInCourseRequest from a dict
core_competency_grade_competency_in_course_request_from_dict = CoreCompetencyGradeCompetencyInCourseRequest.from_dict(core_competency_grade_competency_in_course_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


