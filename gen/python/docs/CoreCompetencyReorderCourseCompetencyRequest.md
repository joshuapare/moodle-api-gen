# CoreCompetencyReorderCourseCompetencyRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyidfrom** | **int** | The competency id we are moving | [default to null]
**competencyidto** | **int** | The competency id we are moving to | [default to null]
**courseid** | **int** | The course id | 

## Example

```python
from openapi_client.models.core_competency_reorder_course_competency_request import CoreCompetencyReorderCourseCompetencyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyReorderCourseCompetencyRequest from a JSON string
core_competency_reorder_course_competency_request_instance = CoreCompetencyReorderCourseCompetencyRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyReorderCourseCompetencyRequest.to_json())

# convert the object into a dict
core_competency_reorder_course_competency_request_dict = core_competency_reorder_course_competency_request_instance.to_dict()
# create an instance of CoreCompetencyReorderCourseCompetencyRequest from a dict
core_competency_reorder_course_competency_request_from_dict = CoreCompetencyReorderCourseCompetencyRequest.from_dict(core_competency_reorder_course_competency_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


