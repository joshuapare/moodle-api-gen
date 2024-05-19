# GradereportOverviewGetCourseGrades200ResponseGradesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | Course id | [optional] 
**grade** | **str** | Grade formatted | [optional] [default to 'null']
**rank** | **int** | Your rank in the course | [optional] [default to null]
**rawgrade** | **str** | Raw grade, not formatted | [optional] [default to 'null']

## Example

```python
from openapi_client.models.gradereport_overview_get_course_grades200_response_grades_inner import GradereportOverviewGetCourseGrades200ResponseGradesInner

# TODO update the JSON string below
json = "{}"
# create an instance of GradereportOverviewGetCourseGrades200ResponseGradesInner from a JSON string
gradereport_overview_get_course_grades200_response_grades_inner_instance = GradereportOverviewGetCourseGrades200ResponseGradesInner.from_json(json)
# print the JSON string representation of the object
print(GradereportOverviewGetCourseGrades200ResponseGradesInner.to_json())

# convert the object into a dict
gradereport_overview_get_course_grades200_response_grades_inner_dict = gradereport_overview_get_course_grades200_response_grades_inner_instance.to_dict()
# create an instance of GradereportOverviewGetCourseGrades200ResponseGradesInner from a dict
gradereport_overview_get_course_grades200_response_grades_inner_from_dict = GradereportOverviewGetCourseGrades200ResponseGradesInner.from_dict(gradereport_overview_get_course_grades200_response_grades_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


