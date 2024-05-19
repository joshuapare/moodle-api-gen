# GradereportUserGetGradesTable200ResponseTablesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**courseid** | **int** | course id | [optional] 
**maxdepth** | **int** | table max depth (needed for printing it) | [optional] 
**tabledata** | [**List[GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner]**](GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.md) |  | [optional] 
**userfullname** | **str** | user fullname | [optional] 
**userid** | **int** | user id | [optional] 

## Example

```python
from openapi_client.models.gradereport_user_get_grades_table200_response_tables_inner import GradereportUserGetGradesTable200ResponseTablesInner

# TODO update the JSON string below
json = "{}"
# create an instance of GradereportUserGetGradesTable200ResponseTablesInner from a JSON string
gradereport_user_get_grades_table200_response_tables_inner_instance = GradereportUserGetGradesTable200ResponseTablesInner.from_json(json)
# print the JSON string representation of the object
print(GradereportUserGetGradesTable200ResponseTablesInner.to_json())

# convert the object into a dict
gradereport_user_get_grades_table200_response_tables_inner_dict = gradereport_user_get_grades_table200_response_tables_inner_instance.to_dict()
# create an instance of GradereportUserGetGradesTable200ResponseTablesInner from a dict
gradereport_user_get_grades_table200_response_tables_inner_from_dict = GradereportUserGetGradesTable200ResponseTablesInner.from_dict(gradereport_user_get_grades_table200_response_tables_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


