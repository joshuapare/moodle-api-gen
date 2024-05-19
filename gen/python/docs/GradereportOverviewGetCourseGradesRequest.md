# GradereportOverviewGetCourseGradesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userid** | **int** | Get grades for this user (optional, default current) | [optional] [default to 0]

## Example

```python
from openapi_client.models.gradereport_overview_get_course_grades_request import GradereportOverviewGetCourseGradesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GradereportOverviewGetCourseGradesRequest from a JSON string
gradereport_overview_get_course_grades_request_instance = GradereportOverviewGetCourseGradesRequest.from_json(json)
# print the JSON string representation of the object
print(GradereportOverviewGetCourseGradesRequest.to_json())

# convert the object into a dict
gradereport_overview_get_course_grades_request_dict = gradereport_overview_get_course_grades_request_instance.to_dict()
# create an instance of GradereportOverviewGetCourseGradesRequest from a dict
gradereport_overview_get_course_grades_request_from_dict = GradereportOverviewGetCourseGradesRequest.from_dict(gradereport_overview_get_course_grades_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


