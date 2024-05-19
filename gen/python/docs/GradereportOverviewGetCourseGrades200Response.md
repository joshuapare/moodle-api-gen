# GradereportOverviewGetCourseGrades200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grades** | [**List[GradereportOverviewGetCourseGrades200ResponseGradesInner]**](GradereportOverviewGetCourseGrades200ResponseGradesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.gradereport_overview_get_course_grades200_response import GradereportOverviewGetCourseGrades200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GradereportOverviewGetCourseGrades200Response from a JSON string
gradereport_overview_get_course_grades200_response_instance = GradereportOverviewGetCourseGrades200Response.from_json(json)
# print the JSON string representation of the object
print(GradereportOverviewGetCourseGrades200Response.to_json())

# convert the object into a dict
gradereport_overview_get_course_grades200_response_dict = gradereport_overview_get_course_grades200_response_instance.to_dict()
# create an instance of GradereportOverviewGetCourseGrades200Response from a dict
gradereport_overview_get_course_grades200_response_from_dict = GradereportOverviewGetCourseGrades200Response.from_dict(gradereport_overview_get_course_grades200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


