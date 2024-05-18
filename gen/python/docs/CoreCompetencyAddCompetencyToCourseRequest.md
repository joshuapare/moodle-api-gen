# CoreCompetencyAddCompetencyToCourseRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**competencyid** | **int** | The competency id | [default to null]
**courseid** | **int** | The course id | [default to null]

## Example

```python
from openapi_client.models.core_competency_add_competency_to_course_request import CoreCompetencyAddCompetencyToCourseRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CoreCompetencyAddCompetencyToCourseRequest from a JSON string
core_competency_add_competency_to_course_request_instance = CoreCompetencyAddCompetencyToCourseRequest.from_json(json)
# print the JSON string representation of the object
print(CoreCompetencyAddCompetencyToCourseRequest.to_json())

# convert the object into a dict
core_competency_add_competency_to_course_request_dict = core_competency_add_competency_to_course_request_instance.to_dict()
# create an instance of CoreCompetencyAddCompetencyToCourseRequest from a dict
core_competency_add_competency_to_course_request_from_dict = CoreCompetencyAddCompetencyToCourseRequest.from_dict(core_competency_add_competency_to_course_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


