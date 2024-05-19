# GradereportUserGetGradesTable200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tables** | [**List[GradereportUserGetGradesTable200ResponseTablesInner]**](GradereportUserGetGradesTable200ResponseTablesInner.md) |  | 
**warnings** | [**List[AuthEmailSignupUser200ResponseWarningsInner]**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Example

```python
from openapi_client.models.gradereport_user_get_grades_table200_response import GradereportUserGetGradesTable200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GradereportUserGetGradesTable200Response from a JSON string
gradereport_user_get_grades_table200_response_instance = GradereportUserGetGradesTable200Response.from_json(json)
# print the JSON string representation of the object
print(GradereportUserGetGradesTable200Response.to_json())

# convert the object into a dict
gradereport_user_get_grades_table200_response_dict = gradereport_user_get_grades_table200_response_instance.to_dict()
# create an instance of GradereportUserGetGradesTable200Response from a dict
gradereport_user_get_grades_table200_response_from_dict = GradereportUserGetGradesTable200Response.from_dict(gradereport_user_get_grades_table200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


