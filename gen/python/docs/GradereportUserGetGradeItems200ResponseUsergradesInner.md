# GradereportUserGetGradeItems200ResponseUsergradesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | course id | [optional] 
**courseidnumber** | **str** | course idnumber | [optional] [default to 'null']
**gradeitems** | [**List[GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner]**](GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner.md) |  | [optional] 
**maxdepth** | **int** | table max depth (needed for printing it) | [optional] [default to null]
**userfullname** | **str** | user fullname | [optional] 
**userid** | **int** | user id | [optional] 
**useridnumber** | **str** | user idnumber | [optional] [default to 'null']

## Example

```python
from openapi_client.models.gradereport_user_get_grade_items200_response_usergrades_inner import GradereportUserGetGradeItems200ResponseUsergradesInner

# TODO update the JSON string below
json = "{}"
# create an instance of GradereportUserGetGradeItems200ResponseUsergradesInner from a JSON string
gradereport_user_get_grade_items200_response_usergrades_inner_instance = GradereportUserGetGradeItems200ResponseUsergradesInner.from_json(json)
# print the JSON string representation of the object
print(GradereportUserGetGradeItems200ResponseUsergradesInner.to_json())

# convert the object into a dict
gradereport_user_get_grade_items200_response_usergrades_inner_dict = gradereport_user_get_grade_items200_response_usergrades_inner_instance.to_dict()
# create an instance of GradereportUserGetGradeItems200ResponseUsergradesInner from a dict
gradereport_user_get_grade_items200_response_usergrades_inner_from_dict = GradereportUserGetGradeItems200ResponseUsergradesInner.from_dict(gradereport_user_get_grade_items200_response_usergrades_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


