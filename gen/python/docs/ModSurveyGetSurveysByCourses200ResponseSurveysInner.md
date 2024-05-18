# ModSurveyGetSurveysByCourses200ResponseSurveysInner

Surveys

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**course** | **int** | Course id | [optional] 
**coursemodule** | **int** | Course module id | [optional] 
**days** | **int** | Days | [optional] [default to null]
**groupingid** | **int** | Group id | [optional] 
**groupmode** | **int** | Group mode | [optional] 
**id** | **int** | Activity instance id | [optional] 
**intro** | **str** | Activity introduction | [optional] 
**introfiles** | [**List[CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner]**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**introformat** | **int** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**lang** | **str** | Forced activity language | [optional] 
**name** | **str** | Activity name | [optional] 
**questions** | **str** | Question ids | [optional] [default to 'null']
**section** | **int** | Course section id | [optional] 
**surveydone** | **int** | Did I finish the survey? | [optional] [default to null]
**template** | **int** | Survey type | [optional] [default to null]
**timecreated** | **int** | Time of creation | [optional] 
**timemodified** | **int** | Time of last modification | [optional] 
**visible** | **bool** | Visible | [optional] 

## Example

```python
from openapi_client.models.mod_survey_get_surveys_by_courses200_response_surveys_inner import ModSurveyGetSurveysByCourses200ResponseSurveysInner

# TODO update the JSON string below
json = "{}"
# create an instance of ModSurveyGetSurveysByCourses200ResponseSurveysInner from a JSON string
mod_survey_get_surveys_by_courses200_response_surveys_inner_instance = ModSurveyGetSurveysByCourses200ResponseSurveysInner.from_json(json)
# print the JSON string representation of the object
print(ModSurveyGetSurveysByCourses200ResponseSurveysInner.to_json())

# convert the object into a dict
mod_survey_get_surveys_by_courses200_response_surveys_inner_dict = mod_survey_get_surveys_by_courses200_response_surveys_inner_instance.to_dict()
# create an instance of ModSurveyGetSurveysByCourses200ResponseSurveysInner from a dict
mod_survey_get_surveys_by_courses200_response_surveys_inner_from_dict = ModSurveyGetSurveysByCourses200ResponseSurveysInner.from_dict(mod_survey_get_surveys_by_courses200_response_surveys_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


