# CoreCompetencyRemoveCompetencyFromCourseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | The competency id | 
**courseid** | **int** | The course id | 

## Example

```python
from openapi_client.models.core_competency_remove_competency_from_course_request import CoreCompetencyRemoveCompetencyFromCourseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyRemoveCompetencyFromCourseRequest from a JSON string
core_competency_remove_competency_from_course_request_instance = CoreCompetencyRemoveCompetencyFromCourseRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyRemoveCompetencyFromCourseRequest.to_json())

# convert the object into a dict
core_competency_remove_competency_from_course_request_dict = core_competency_remove_competency_from_course_request_instance.to_dict()
# create an instance of CoreCompetencyRemoveCompetencyFromCourseRequest from a dict
core_competency_remove_competency_from_course_request_from_dict = CoreCompetencyRemoveCompetencyFromCourseRequest.from_dict(core_competency_remove_competency_from_course_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


